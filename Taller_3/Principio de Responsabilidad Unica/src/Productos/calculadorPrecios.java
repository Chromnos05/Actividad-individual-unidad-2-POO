/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

/**
 *
 * @author cscam
 */
public class calculadorPrecios {
    
    public static double calcularPrecioFinal(Producto producto, double descuento, double impuesto) {
        double precioConDescuento = producto.getPrecioBase() * (1 - descuento);
        return precioConDescuento * (1 + impuesto);
    }
    
}
