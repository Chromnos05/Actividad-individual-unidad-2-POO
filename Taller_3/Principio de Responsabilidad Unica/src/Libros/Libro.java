/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros;

/**
 *
 * @author Lenovo
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos relacionados con el manejo de información del libro
    public String getDetalles() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }

    // Método para generar un reporte del libro
    public String generarReporte() {
        return "Reporte del libro: " + getDetalles();
    }

    // Método para guardar el libro en una base de datos (simulación)
    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando " + getDetalles() + " en la base de datos...");
    }
    
}
