package ar.edu.unahur.obj2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.List;
import java.util.stream.*;

public class Etapa1 {

    Diablo diablito;

    Demonio demo1;Demonio demo2;Demonio demo3;

    Lugar campo;
    Lugar bosque;

    Alma alma1;Alma alma2;Alma alma3;Alma alma4;Alma alma5;Alma alma6;Alma alma7;Alma alma8;Alma alma9;

    @BeforeTest
    public void setUp() {
        diablito = new Diablo();

        demo1 = new DemonioDeFuego(27);
        demo2 = new DemonioDeSombra(11);
        demo3 = new DemonioDeHielo(20);

        diablito.setDemonios(Stream.of(demo1,demo2,demo3).collect(Collectors.toList()));

        alma1 = new Alma(); alma1.setNivelDeBondad(25); alma1.setValor(30);
        alma2 = new Alma(); alma2.setNivelDeBondad(30); alma2.setValor(25);
        alma3 = new Alma(); alma3.setNivelDeBondad(5); alma3.setValor(30);
        alma4 = new Alma(); alma4.setNivelDeBondad(40); alma4.setValor(10);

        alma5 = new Alma(); alma5.setNivelDeBondad(25); alma5.setValor(25);
        alma6 = new Alma(); alma6.setNivelDeBondad(10); alma6.setValor(30);
        alma7 = new Alma(); alma7.setNivelDeBondad(30); alma7.setValor(10);
        alma8 = new Alma(); alma8.setNivelDeBondad(60); alma8.setValor(5);
        alma9 = new Alma(); alma9.setNivelDeBondad(5); alma9.setValor(60);

        campo = new Lugar("Campito");
        campo.agregarAlma(alma1); campo.agregarAlma(alma2) ;
        campo.agregarAlma(alma3); campo.agregarAlma(alma4);
        bosque = new Lugar("Bosquesito");
        bosque.agregarAlma(alma5); bosque.agregarAlma(alma6); bosque.agregarAlma(alma7); bosque.agregarAlma(alma8); bosque.agregarAlma(alma9);
    }
    @Test
    public void almasEnLugar(){
        List<Alma> almas = Stream.of(alma1,alma2,alma3,alma4).collect(Collectors.toList());
        List<Alma> almas2 = Stream.of(alma5,alma6,alma7,alma8,alma9).collect(Collectors.toList());
        Assert.assertEquals(almas, campo.getAlmas());
        Assert.assertEquals(almas2, bosque.getAlmas());
        Assert.assertEquals(4, campo.cantidadAlmasEnElLugar());
        Assert.assertEquals(5, bosque.cantidadAlmasEnElLugar());
    }
    @Test
    public void demo1SaleACazar(){
        demo1.salirDeCaza(campo);
        Assert.assertEquals(2, campo.cantidadAlmasEnElLugar());
        demo1.salirDeCaza(bosque);
        Assert.assertEquals(1, bosque.cantidadAlmasEnElLugar());
        //Almas atrapadas por el demonio
        Assert.assertEquals(6, demo1.cantidadAlmasAtrapadas());
    }
    @Test
    public void demo2SaleACazar(){
        demo2.salirDeCaza(campo);
        Assert.assertEquals(2, campo.cantidadAlmasEnElLugar());
        demo2.salirDeCaza(bosque);
        Assert.assertEquals(1, bosque.cantidadAlmasEnElLugar());
        //Almas atrapadas por el demonio
        Assert.assertEquals(0, demo2.cantidadAlmasAtrapadas());
    }
    @Test
    public void demo3SaleACazar(){
        alma3.setEsFriolenta(true);
        demo3.salirDeCaza(campo);
        Assert.assertEquals(2, campo.cantidadAlmasEnElLugar());
        alma9.setEsFriolenta(true);
        alma6.setEsFriolenta(true);
        demo3.salirDeCaza(bosque);
        Assert.assertEquals(1, bosque.cantidadAlmasEnElLugar());
        //Almas atrapadas por el demonio
        Assert.assertEquals(0, demo3.cantidadAlmasAtrapadas());
    }
    @Test
    public void demonioPuedeCazarAlma(){
        assertTrue(diablito.puedeDemonioCazarAlma(demo1, alma1));
        assertFalse(diablito.puedeDemonioCazarAlma(demo3 ,alma1));
        alma1.setEsFriolenta(true);
        assertFalse(diablito.puedeDemonioCazarAlma(demo1, alma1));
    }
}