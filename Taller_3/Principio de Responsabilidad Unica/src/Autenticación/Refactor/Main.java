/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Autenticación_Refactor;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Juan", "juan@example.com", "123456");

        // Validar email
        ValidacionUsuario validacion = new ValidacionUsuario();
        System.out.println("Email valido? " + validacion.validarEmail(usuario));

        // Autenticar usuario
        AutenticacionUsuario autenticacion = new AutenticacionUsuario();
        boolean esAutenticado = autenticacion.autenticar(usuario, "juan@example.com", "123456");
        System.out.println("Autenticado? " + esAutenticado);
        
    }
    
}
