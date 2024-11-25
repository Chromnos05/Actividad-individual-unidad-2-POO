/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Autenticacion;

/**
 *
 * @author Oscar Mercado
 */
public class GestorAutenticacion {
    
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void autenticar(String usuario, String contraseña) {
        servicio.autenticarUsuario(usuario, contraseña);
    }
    
}
