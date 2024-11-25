/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libros.Refactor;

/**
 *
 * @author Lenovo
 */
public class PersistenciaLibro {
    
    public void guardar(Libro libro) {
        System.out.println("Guardando en la base de datos: Titulo: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn());
    }
    
}
