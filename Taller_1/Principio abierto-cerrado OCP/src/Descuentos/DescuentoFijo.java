/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Descuentos;

/**
 *
 * @author Lenovo
 */
public class DescuentoFijo implements EstrategiaDescuento{
    
    private double descuentoFijo;
    
    public DescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - descuentoFijo;
    }
    
}
