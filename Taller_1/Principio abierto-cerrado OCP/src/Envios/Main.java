/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Envios;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TipoEnvio envioCorreo = new EnvioCorreo();
        TipoEnvio envioSMS = new EnvioSMS();
        TipoEnvio envioPush = new EnvioPush();

        String mensaje = "Hola, este es un mensaje importante.";

        envioCorreo.enviarMensaje(mensaje);
        envioSMS.enviarMensaje(mensaje);
        envioPush.enviarMensaje(mensaje);
        
    }
    
}
