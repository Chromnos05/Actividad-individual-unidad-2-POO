/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticación_Refactor;

/**
 *
 * @author Lenovo
 */
public class ValidacionUsuario {
    
    public boolean validarEmail(Usuario usuario) {
        return usuario.getEmail().contains("@");
    }
    
}
