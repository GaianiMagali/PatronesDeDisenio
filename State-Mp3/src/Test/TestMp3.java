package Test;

import com.company.Cancion;
import com.company.Mp3;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestMp3 {
    Mp3 mp3;
    Cancion cancion1;


    @BeforeTest
    public void setUp() {
        mp3 = new Mp3();
        cancion1 = new Cancion("my friend");
        mp3.cargarCancion(cancion1);
    }

    @Test
    public void testReproducir() {
       String cancionEsperada =  mp3.reproducir(0);
        assertEquals(mp3.getCancionEnReproduccion(),cancionEsperada);
    }

    @Test
    public void testReproducir1(){
        mp3.reproducir(0);
        String pausa = mp3.pausar();
        Assert.assertEquals("Cancion en pausa",pausa);
    }

    @Test
    public void testReproducir2(){
        mp3.reproducir(0);
        mp3.parar();
        System.out.println(mp3.getModo());
        mp3.seleccionarCancion(0);
        mp3.reproducir(0);
        System.out.println(mp3.getModo());
    }

    @Test
    public void testPausa(){
       String pausa =  mp3.pausar();
        Assert.assertEquals("Todavia no se selecciono cancion a reproducir",pausa);
    }



}