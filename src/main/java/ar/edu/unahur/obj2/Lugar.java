
package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Lugar {
    private String nombre;
    private List<Alma> almas;

    public Lugar(String nombre) {
        this.nombre = nombre;
        almas = new ArrayList<>();
    }

    //Getters
    public String getNombre() {return nombre;}

    public List<Alma> getAlmas() {return almas;}

    public int cantidadAlmasEnElLugar(){ return almas.size();}

    //Metodos
    public void agregarAlma(Alma alma){ almas.add(alma); }

    public void eliminarAlmas(List<Alma> almas2){getAlmas().removeAll(almas2);}

    public void cazaronUnAlma(Alma alma){almas.remove(alma);}
}