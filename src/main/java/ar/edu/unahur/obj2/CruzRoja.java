package ar.edu.unahur.obj2;

import java.math.BigDecimal;

public class CruzRoja extends Entrenamiento {

    Alma alma;

    public CruzRoja(Alma alma) {
        this.alma = alma;
    }

    //Setters
    @Override
    public void setNivelDeBondad(int nivelDeBondad) {
        if(nivelDeBondad < 100){super.setNivelDeBondad(100);}

        else{super.setNivelDeBondad(nivelDeBondad);}
    }

    //Getters
    public Alma getAlma() {return alma;}


}