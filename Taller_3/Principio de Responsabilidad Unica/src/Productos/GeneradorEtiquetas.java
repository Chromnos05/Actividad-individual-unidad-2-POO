/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 *
 * @author cscam
 */
public class GeneradorEtiquetas {
    
    public static String generarEtiqueta(Producto producto) {
        return "Producto: " + producto.getNombre() + ", Precio: $" + String.format("%.2f", producto.getPrecioBase());
    }
    
}
