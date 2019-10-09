package ar.edu.unahur.obj2;

        import org.testng.Assert;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;

        import java.util.stream.Collectors;
        import java.util.stream.Stream;

public class DiabloTest2 {

    Diablo lucifer;

    Demonio demo1;
    Demonio demo2;
    Demonio demo3;

    Lugar campo;
    Lugar bosque;

    Alma alma1;
    Alma alma2;
    Alma alma3;
    Alma alma4;
    Alma alma5;
    Alma alma6;
    Alma alma7;
    Alma alma8;
    Alma alma9;

    @BeforeMethod
    public void setUp() {
        lucifer = new Diablo();

        demo1 = new DemonioDeFuego(27);
        demo2 = new DemonioDeSombra(11);
        demo3 = new DemonioDeHielo(20);

        lucifer.setDemonios(Stream.of(demo1,demo2,demo3).collect(Collectors.toList()));

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
    public void cantidadDemonios(){
        Assert.assertEquals(3, lucifer.cantidadDemonios());
    }
    /*@Test
    public void almasCazadasPorMisDemonios(){
        demo1.salirDeCaza(campo);
        Assert.assertEquals(lucifer.almasCazadasPorMisDemonios(), Stream.of(alma1,alma3).collect(Collectors.toList()));
        demo1.salirDeCaza(bosque);
        Assert.assertEquals(lucifer.almasCazadasPorMisDemonios(), Stream.of(alma1,alma3,alma5,alma6,alma7,alma9).collect(Collectors.toList()));
    }*/
}
