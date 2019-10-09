package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public abstract class Demonio {

    private List<Alma> almasAtrapadas;
    private int nivelDeMaldad;

    public Demonio(int nivelDeMaldad) {
        almasAtrapadas = new ArrayList<>();
        this.nivelDeMaldad = nivelDeMaldad;
    }
    //Getters
    public int getNivelDeMaldad() {
        return nivelDeMaldad;
    }

    public List<Alma> getAlmasAtrapadas() {
        return almasAtrapadas;
    }

    public int cantidadAlmasAtrapadas(){ return almasAtrapadas.size();}

    protected boolean condicionesParaCazar(Alma alma){return condicionGenerica(alma) && otraCondicion(alma);}

    public boolean condicionGenerica(Alma alma){
        return getNivelDeMaldad() > alma.getNivelDeBondad();
    }

    //Metodos
    public void cazoAlma(Alma alma){
        almasAtrapadas.add(alma);
    }

    public void cazoAlmas(List<Alma> almas){
        almasAtrapadas.addAll(almas);
    }

    public void atormentarAlma(Alma alma){
        alma.esAtormentada();
        casiAtrapa(alma);
    }
    public void salirDeCaza(Lugar lugar){
        List<Alma> almasAgarradas = new ArrayList<>();
        lugar.getAlmas().stream().forEach(alma -> {

            if (condicionesParaCazar(alma)) {
                almasAgarradas.add(alma);
                nivelDeMaldad += 2;

            } else {
                atormentarAlma(alma);
                nivelDeMaldad++;
            }
        });

        cazoAlmas(almasAgarradas);
        lugar.eliminarAlmas(almasAgarradas);
    }

    protected abstract boolean otraCondicion(Alma alma);

    protected abstract void casiAtrapa(Alma alma);


}