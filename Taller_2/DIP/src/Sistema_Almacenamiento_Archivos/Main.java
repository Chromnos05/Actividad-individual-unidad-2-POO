/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema_Almacenamiento_Archivos;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Almacenamiento local = new AlmacenamientoLocal();
        Almacenamiento nube = new AlmacenamientoNube();

        GestorArchivos gestor = new GestorArchivos(local);
        gestor.procesarArchivos("documento.txt");

        gestor = new GestorArchivos(nube);
        gestor.procesarArchivos("imagen.jpg");
        
    }
    
}
