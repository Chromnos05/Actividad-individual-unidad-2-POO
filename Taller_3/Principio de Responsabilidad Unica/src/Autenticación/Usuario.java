/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autenticación;

/**
 *
 * @author Lenovo
 */
public class Usuario {
    
    private String nombre;
    private String email;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    // Métodos relacionados con los datos
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Métodos relacionados con autenticación
    public boolean autenticar(String email, String contrasena) {
        return this.email.equals(email) && this.contrasena.equals(contrasena);
    }

    // Método para validar formato de email
    public boolean validarEmail() {
        return email.contains("@");
    
    }
    
}
