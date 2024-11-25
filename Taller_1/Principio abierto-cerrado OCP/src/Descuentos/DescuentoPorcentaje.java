/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Descuentos;

/**
 *
 * @author Lenovo
 */
public class DescuentoPorcentaje implements EstrategiaDescuento{
    
    private double porcentaje;
    
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - (precio * (porcentaje / 100));
    }
    
}
