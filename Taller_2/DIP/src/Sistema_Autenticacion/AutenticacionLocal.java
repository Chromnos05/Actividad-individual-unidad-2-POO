/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Autenticacion;

/**
 *
 * @author Oscar Mercado
 */
public class AutenticacionLocal implements ServicioAutenticacion{

    @Override
    public void autenticarUsuario(String usuario, String contraseña) {
        
        System.out.println("Autenticación local exitosa para el usuario: " + usuario);
        
    }
    
}
