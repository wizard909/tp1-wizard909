package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiabloTest {

    Diablo lucifer;

    Demonio demo1;
    Demonio demo2;
    Demonio demo3;

    Alma alma1;
    Alma alma2;
    Alma alma3;


    @BeforeMethod
    public void setUp() {
        lucifer = new Diablo();

        demo1 = new DemonioDeFuego(25);
        demo2 = new DemonioDeSombra(14);
        demo3 = new DemonioDeHielo(23);

        alma1 = new Alma(); alma1.setNivelDeBondad(26); alma1.setValor(29);
        alma2 = new Alma(); alma2.setNivelDeBondad(32); alma2.setValor(23);
        alma3 = new Alma(); alma3.setNivelDeBondad(3); alma3.setValor(27);
    }
    @Test
    public void demonioPuedeCazar(){
        Assert.assertFalse(lucifer.puedeDemonioCazarAlma(demo1, alma1));

        Assert.assertFalse(lucifer.puedeDemonioCazarAlma(demo2, alma2));

        alma3.setEsFriolenta(true);
        Assert.assertTrue(lucifer.puedeDemonioCazarAlma(demo3, alma3));
        alma3.setEsFriolenta(true);
        Assert.assertTrue(lucifer.puedeDemonioCazarAlma(demo3, alma3));
    }

    @Test
    public void atormentarAlma(){
        alma1.setEsFriolenta(true);
        lucifer.demonioAtormentaAlma(demo1, alma1);

        Assert.assertFalse(alma1.esEsFriolenta());
        Assert.assertEquals(alma1.getNivelDeBondad(),21);

        lucifer.demonioAtormentaAlma(demo2, alma2);
        Assert.assertEquals(alma2.getValor(), 11);
        Assert.assertEquals(alma2.getNivelDeBondad(),27);

        alma3.setEsFriolenta(false);
        lucifer.demonioAtormentaAlma(demo3, alma3);
        Assert.assertTrue(alma3.esEsFriolenta());
        Assert.assertEquals(alma3.getNivelDeBondad(),0);
    }

    @Test
    public void entrenarUnaAlma(){
        //No anda, preguntar como hacer para modificar el estado del alma.
        //diablito.entrenarUnaAlma(alma1, TipoEntrenamiento.LuchaDemoniaca);
        //Assert.assertEquals(alma1.getValor(), new Integer(60));

        Alma luchaDemoniaca = lucifer.entrenarUnaAlma(alma1, TipoDeEntrenamiento.LuchaDemoniaca);
        Assert.assertEquals(luchaDemoniaca.getValor(), 58);

        Alma supervivenciaExtrama = lucifer.entrenarUnaAlma(alma2, TipoDeEntrenamiento.SupervivenciaExtrema);
        Assert.assertFalse(supervivenciaExtrama.esEsFriolenta());
        supervivenciaExtrama.setEsFriolenta(true);
        Assert.assertFalse(supervivenciaExtrama.esEsFriolenta());

        Alma cruzRoja = lucifer.entrenarUnaAlma(alma3, TipoDeEntrenamiento.CruzRoja);
        cruzRoja.setNivelDeBondad(13);
        Assert.assertEquals(cruzRoja.getNivelDeBondad(), 100);
        cruzRoja.setNivelDeBondad(130);
        Assert.assertEquals(cruzRoja.getNivelDeBondad(), 130);
    }
}