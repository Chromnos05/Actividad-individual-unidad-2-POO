/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Almacenamiento_Archivos;

/**
 *
 * @author Oscar Mercado
 */
public class GestorArchivos {
    
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void procesarArchivos(String archivo) {
        almacenamiento.guardarArchivo(archivo);
        System.out.println(almacenamiento.recuperarArchivo(archivo));
    }
    
}
