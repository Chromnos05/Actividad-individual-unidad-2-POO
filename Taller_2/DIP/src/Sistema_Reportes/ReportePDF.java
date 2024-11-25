/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Reportes;

/**
 *
 * @author Oscar Mercado
 */
public class ReportePDF implements GeneradorReporte{
    
    @Override
    public void generarReporte(String datos) {
        System.out.println("Generando reporte en formato PDF: " + datos);
    }
    
}
