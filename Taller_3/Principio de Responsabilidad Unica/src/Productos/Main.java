/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Productos;

/**
 *
 * @author cscam
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear un producto
        Producto producto = new Producto("Zapatos", 100.0, 10);

        // Generar etiqueta del producto
        String etiqueta = GeneradorEtiquetas.generarEtiqueta(producto);
        System.out.println(etiqueta);

        // Calcular el precio final con 10% de descuento y 15% de impuesto
        double precioFinal = calculadorPrecios.calcularPrecioFinal(producto, 0.10, 0.15);
        System.out.println("Precio final: $" + String.format("%.2f", precioFinal));
        
    }
    
}
