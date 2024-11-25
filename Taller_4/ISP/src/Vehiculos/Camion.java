/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Oscar Mercado
 */
public class Camion implements Conduccion, TransporteMercancia{

    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión...");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión...");
    }
    
}
