/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Libros.Refactor;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", "123-456-789");

        // Generar un reporte del libro
        ReporteLibro reporte = new ReporteLibro();
        System.out.println(reporte.generarReporte(libro));

        // Guardar el libro en la base de datos
        PersistenciaLibro persistencia = new PersistenciaLibro();
        persistencia.guardar(libro);
        
    }
    
}
