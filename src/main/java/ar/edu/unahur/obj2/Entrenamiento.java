package ar.edu.unahur.obj2;

public abstract class Entrenamiento extends Alma {

    //Setters Override
    @Override
    public void setNivelDeBondad(int nivelDeBondad) {
        super.setNivelDeBondad(nivelDeBondad);
    }

    @Override
    public void setEstaAtormenada(boolean estaAtormenada) {
        super.setEstaAtormenada(estaAtormenada);
    }

    @Override
    public void setValor(int valor) {
        super.setValor(valor);
    }

    @Override
    public void setEsFriolenta(boolean esFriolenta) {
        super.setEsFriolenta(esFriolenta);
    }

    //Getters Override
    @Override
    public int getNivelDeBondad() {
        return super.getNivelDeBondad();
    }

    @Override
    public int getValor() {
        return super.getValor();
    }

    @Override
    public boolean esEsFriolenta() {
        return super.esEsFriolenta();
    }

    @Override
    public boolean isEstaAtormenada() {
        return super.isEstaAtormenada();
    }

    @Override
    public void esAtormentada() {
        super.esAtormentada();
    }
}