/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema_Reportes;

/**
 *
 * @author Oscar Mercado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GeneradorReporte pdf = new ReportePDF();
        GeneradorReporte excel = new ReporteExcel();

        GestorReportes gestor = new GestorReportes(pdf);
        gestor.procesarReporte("Datos del reporte PDF");

        gestor = new GestorReportes(excel);
        gestor.procesarReporte("Datos del reporte Excel");
        
    }
    
}
