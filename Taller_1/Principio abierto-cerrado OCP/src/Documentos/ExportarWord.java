/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Documentos;

/**
 *
 * @author Lenovo
 */
public class ExportarWord implements TipoExportacion{
    
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word: " + contenido);
    }
    
}
