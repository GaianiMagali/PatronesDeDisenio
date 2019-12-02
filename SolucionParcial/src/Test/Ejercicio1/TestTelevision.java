package Test.Ejercicio1;

import com.Java.Ejercicio4.Estados.Apagado;
import com.Java.Ejercicio4.Estados.Encendido;
import com.Java.Ejercicio4.Television;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTelevision {
    Television television;
    Apagado estadoIncial;


    @BeforeTest
    public void setUp() {
        television = new Television();
        estadoIncial = new Apagado(television);
    }

    @Test
    public void testEstadoInicial() {
        System.out.println(television.getEstado());
    }

    @Test
    public void testEncender() {
        television.encender();
        System.out.println(television.getEstado());
    }

    @Test
    public void testApagar() {
        television.encender();
        television.apagar();
        System.out.println(television.getEstado());
    }

    @Test
    public void testsubirVolumen() {
        //Estado inicial apagado
        television.subirVolumen(20);

        System.out.println("_______________________________________________________");

        //Encender television
        television.encender();
        television.subirVolumen(20);
        television.subirVolumen(10);
        System.out.println(television.getNivelVolumen());
        System.out.println(television.getEstado());

    }

    @Test
    public void testbajarVolumen() {
        television.bajarVolumen(20);
        System.out.println(television.getEstado());

        System.out.println("_______________________________________________________");

        television.encender();
        television.bajarVolumen(10);
        System.out.println(television.getNivelVolumen());
        System.out.println(television.getEstado());
    }

    @Test
    public void testSilenciar() {
        television.silenciar();

        System.out.println("_______________________________________________________");

        television.encender();
        television.activarSonido();
        System.out.println(television.getEstado());

    }
}
