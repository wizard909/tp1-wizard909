package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlmaTest {

    Alma alma1;

    @BeforeMethod
    public void setup(){
        alma1 = new CruzRoja(alma1);
        alma1 = new LuchaDemoniaca(alma1);
        alma1 = new SupervivenciaExtrema(alma1);
    }
    @Test
    public void nivelBondad(){
        alma1.setNivelDeBondad(85);
        Assert.assertEquals(85, alma1.getNivelDeBondad());
    }
    @Test
    public void valor(){
        alma1.setValor(47);
        Assert.assertEquals(alma1.getValor(), 47);
    }
    @Test
    public void supervivenciaExtrema(){
        alma1.setEsFriolenta(true);
        Assert.assertFalse(alma1.esEsFriolenta());
    }
}