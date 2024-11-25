/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema_Autenticacion;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioAutenticacion authLocal = new AutenticacionLocal();
        ServicioAutenticacion authOAuth = new AutenticacionOAuth();

        GestorAutenticacion gestor = new GestorAutenticacion(authLocal);
        gestor.autenticar("usuario1", "password1");

        gestor = new GestorAutenticacion(authOAuth);
        gestor.autenticar("usuario2", "password2");
        
    }
    
}
