package ar.edu.unahur.obj2;

public class DemonioDeFuego extends Demonio {

    public DemonioDeFuego(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    //Setters
    @Override
    protected void casiAtrapa(Alma alma) {alma.setEsFriolenta(false);}

    //Getters
    @Override
    protected boolean otraCondicion(Alma alma) {return !alma.esEsFriolenta();}

}