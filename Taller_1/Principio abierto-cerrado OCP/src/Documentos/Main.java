/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Documentos;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TipoExportacion exportacionPDF = new ExportarPDF();
        TipoExportacion exportacionWord = new ExportarWord();
        TipoExportacion exportacionExcel = new ExportarExcel();

        String contenido = "Reporte de Ventas";

        exportacionPDF.exportar(contenido);
        exportacionWord.exportar(contenido);
        exportacionExcel.exportar(contenido);
        
    }
    
}
