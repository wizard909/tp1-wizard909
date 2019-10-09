package ar.edu.unahur.obj2;

public class DemonioDeSombra extends Demonio{

    public DemonioDeSombra(int nivelDeMaldad) {
        super(nivelDeMaldad);
    }

    //Setters
    @Override
    protected void casiAtrapa(Alma alma) {alma.setValor(alma.getValor() / 2);}

    //Getters
    @Override
    protected boolean otraCondicion(Alma alma) {return alma.getValor() <= 50;}
}