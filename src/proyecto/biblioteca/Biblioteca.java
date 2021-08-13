package proyecto.biblioteca;

import java.util.ArrayList;

/**
 *
 * @author JUAN CASTAÑEDA
 */
public class Biblioteca {
    public static ArrayList<Libro> libros;
    private String nombre;
    private int cantidadLibros = 0;
    private int secuenciaID=1;

    public Biblioteca() {
        libros = new ArrayList<Libro>();
        Libro libro1 = new Libro(secuenciaID, "La Divina Comedia", "FG45", "Dante",1422);
        libros.add(libro1);
        secuenciaID++;
        cantidadLibros++;
    }
    
    
}
