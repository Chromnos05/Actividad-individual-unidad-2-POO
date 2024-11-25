/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Descuentos;

/**
 *
 * @author Lenovo
 */
public class Descuento {
    
    private double porcentaje;

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
    
}
