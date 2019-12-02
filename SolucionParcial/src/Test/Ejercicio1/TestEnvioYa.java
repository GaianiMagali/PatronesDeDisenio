package Test.Ejercicio1;

import com.Java.Ejercicio5.EnvioYa;
import com.Java.Ejercicio5.TiposDeEnvios.Normal;
import com.Java.Ejercicio5.TiposDePaquetes.Chico;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestEnvioYa {

    private EnvioYa envioYa;
    private Chico chico;
    private Normal normal;

    @BeforeTest
    public void setup() {
        envioYa = new EnvioYa();

        //Tipo de paquete
        chico = new Chico();

        //tipo de envio
        normal = new Normal(chico);
    }

    @Test
    public void testCalculoCostoEnvio() {
        double costo = envioYa.calculoCostoEnvio(normal,100 );
        assertEquals(costo, 100100.0);
    }
}
