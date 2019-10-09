package ar.edu.unahur.obj2;

public class LuchaDemoniaca extends Entrenamiento {

    private Alma alma;

   public LuchaDemoniaca(Alma alma) {
        this.alma = alma;
    }

    //Getters
    @Override
    public int getValor() {
        return getAlma().getValor() * 2;
    }

    public Alma getAlma() {
        return alma;
    }
}

