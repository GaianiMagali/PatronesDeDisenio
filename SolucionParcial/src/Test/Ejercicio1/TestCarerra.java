package Test.Ejercicio1;

import com.Java.Ejercicio1.Carrera;
import com.Java.Ejercicio1.EstructuraDeDatos;
import com.Java.Ejercicio1.Intro;
import org.testng.annotations.BeforeTest;

public class TestCarerra {

    EstructuraDeDatos estructuraDeDatos;
    Intro intro;
    Carrera carrera;

    @BeforeTest
    public void setUp(){
        estructuraDeDatos = new EstructuraDeDatos(8,true,"Estructura de datos");
        intro = new Intro(8,false,"Introduccion a la programacion");
        carrera = new Carrera("Informatica");

        carrera.agregarMateria(estructuraDeDatos);
        carrera.agregarMateria(intro);
    }

    @org.testng.annotations.Test
    public void testCargahoraria(){
        int cargahoraria = carrera.cargaHoraria();
        System.out.println(cargahoraria);
    }


}
