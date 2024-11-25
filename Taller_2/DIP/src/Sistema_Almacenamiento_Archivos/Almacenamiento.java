/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Sistema_Almacenamiento_Archivos;

/**
 *
 * @author Oscar Mercado
 */
public interface Almacenamiento {
    
    void guardarArchivo(String archivo);
    String recuperarArchivo(String nombre);
    
}
