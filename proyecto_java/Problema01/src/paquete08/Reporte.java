/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete08;

/**
 *
 * @author Core i5-Pro
 */
public class Reporte {

    public static String obtenerInformacion(int totalparticipantes) {
        String cadena;
        if (totalparticipantes >= 1 & totalparticipantes <= 5) {
            cadena = "Poca participación en el club, hay que mejorar.";
        } else {
            if (totalparticipantes >= 6 & totalparticipantes <= 15) {
                cadena = "Buena participación, sigan así.";
            } else {
                if (totalparticipantes >= 16) {
                    cadena = "Excelente campaña en el club.";
                } else {
                    cadena = "Mala campaña, debemos mejorar.";
                }
            }
        }
        return cadena;
    }
    public static String obtenerReporte(String[] actividades, int[] 
            participantes) {
        String reporte;
        reporte= "Las actividades ingresadas son:\n";
        for(int i=0; i<actividades.length;i++){
            reporte= reporte+(i+1)+ " Numero de participantes " + 
                     actividades[i]+":" + participantes[i]+"\n";
        }
        return reporte;
    }
    
}
