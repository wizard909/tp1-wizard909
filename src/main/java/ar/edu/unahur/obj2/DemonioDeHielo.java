package ar.edu.unahur.obj2;

public class DemonioDeHielo extends Demonio {

    public DemonioDeHielo(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    //Setters
    @Override
    protected void casiAtrapa(Alma alma) {alma.setEsFriolenta(true);}

    //Getters
    @Override
    protected boolean otraCondicion(Alma alma) {return alma.esEsFriolenta();}
}