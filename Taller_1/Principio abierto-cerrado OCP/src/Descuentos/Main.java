/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Descuentos;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EstrategiaDescuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10%
        EstrategiaDescuento descuentoFijo = new DescuentoFijo(50); // $50

        double precioOriginal = 200;
        System.out.println("Precio con descuento porcentaje: " + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicarDescuento(precioOriginal));
        
    }
    
}
