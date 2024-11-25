/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticación_Refactor;

/**
 *
 * @author Lenovo
 */
public class AutenticacionUsuario {
    
    public boolean autenticar(Usuario usuario, String email, String contrasena) {
        return usuario.getEmail().equals(email) && usuario.getContrasena().equals(contrasena);
    }
    
}
