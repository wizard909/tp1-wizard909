package ar.edu.unahur.obj2;

public class SupervivenciaExtrema extends Entrenamiento {

    Alma alma;

    public SupervivenciaExtrema(Alma alma) {
        this.alma = alma;
    }

    //Setters
    @Override
    public void setEsFriolenta(boolean esFriolenta) {
        super.setEsFriolenta(false);
    }

    //Getters
    public Alma getAlma() {
        return alma;
    }
}