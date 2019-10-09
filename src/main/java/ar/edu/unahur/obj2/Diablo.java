package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Diablo {

    List<Demonio> demonios;

    public Diablo() {
        this.demonios = new ArrayList<>();
    }

    //Setters
    public void setDemonios(List<Demonio> demonios) { this.demonios = demonios; }

    //Getters
    public int cantidadDemonios(){ return demonios.size();}

    public boolean puedeDemonioCazarAlma(Demonio demonio, Alma alma){
        return demonio.condicionesParaCazar(alma);
    }

    public List<Alma> almasCazadasPorMisDemonios(){
        return demonios.stream().flatMap(almas ->
                almas.getAlmasAtrapadas().stream())
                .sorted()
                .collect(Collectors.toList());
    }

    //Metodos
    public void demonioAtormentaAlma(Demonio demonio, Alma alma){ demonio.atormentarAlma(alma);}

    public Alma entrenarUnaAlma(Alma alma, TipoDeEntrenamiento entrenamiento){

        switch (entrenamiento){
            case LuchaDemoniaca: alma = new LuchaDemoniaca(alma);break;

            case SupervivenciaExtrema: alma = new SupervivenciaExtrema(alma); break;

            case CruzRoja: alma = new CruzRoja(alma); break;
        }
        return alma;
    }

    //Falta Hacer
    //public Alma almaMasValiente(){

    //public Demonio demonioQueMasCazo(){

}