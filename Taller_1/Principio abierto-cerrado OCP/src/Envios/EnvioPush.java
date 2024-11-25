/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

/**
 *
 * @author Lenovo
 */
public class EnvioPush implements TipoEnvio{
    
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificacion push: " + mensaje);
    }
    
}
