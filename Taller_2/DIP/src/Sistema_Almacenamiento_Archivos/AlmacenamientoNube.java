/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Almacenamiento_Archivos;

/**
 *
 * @author Oscar Mercado
 */
public class AlmacenamientoNube implements Almacenamiento{
    
    @Override
    public void guardarArchivo(String archivo) {
        System.out.println("Archivo guardado en la nube: " + archivo);
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "Archivo recuperado de la nube: " + nombre;
    }
    
}
