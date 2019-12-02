package Test.Ejercicio1;

import com.Java.Ejercicio2.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;

public class TestAstillero {

   private List<Vela> velas;
   private Astillero astillero;

    @BeforeMethod
    public void setUp() {
        Mayor velaMayor = new Mayor();
        Spinaker velaSpinaker = new Spinaker();
        Genaker velaGenaker = new Genaker();
        Genova genova = new Genova();
        AdapatadorGenova adapatadorGenova = new AdapatadorGenova(genova);
        velas = new ArrayList<>();
        velas.add(velaMayor);
        velas.add(velaSpinaker);
        velas.add(velaGenaker);
        velas.add(adapatadorGenova);
        astillero = new Astillero();
        //velas.add(motorExperimental); NO compila,
    }

    @Test
    public void testProbarEnrollar() {
        velas.forEach(m -> {
            astillero.probarEnrollar(m);
            assertTrue(m.enrrollada());
        });
    }

    @Test
    public void testProbarDesenrrollar() {
        velas.forEach(m -> {
            astillero.probarDesenrrollar(m);
            assertFalse(m.enrrollada());
        });
    }

    @Test
    public void testProbarEnrolladoParcial() {
        velas.forEach(m -> {
            astillero.probarEnrrolladoParcial(m, 100);
            assertEquals(m.superficie(), 100);
        });
    }

    @Test
    public void testProbarFrenado() {
        velas.forEach(m -> {
            astillero.probarDesenrrolladoParcial(m, 100, 50);
            assertEquals(m.superficie(), 50);
        });
    }
}
