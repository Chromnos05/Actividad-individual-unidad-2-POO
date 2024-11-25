/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros.Refactor;

/**
 *
 * @author Lenovo
 */
public class ReporteLibro {
    
    public String generarReporte(Libro libro) {
        return "Reporte del libro: Titulo: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn();
    }
    
}
