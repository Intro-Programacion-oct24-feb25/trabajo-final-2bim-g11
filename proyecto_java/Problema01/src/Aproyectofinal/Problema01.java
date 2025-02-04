/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aproyectofinal;

import java.util.Scanner;
import paquete01.Futbol;
import paquete02.Natacion;
import paquete03.Atletismo;
import paquete04.Basquetbol;
import paquete05.Ciclismo;
import paquete06.Tenis;
import paquete07.Yoga;
import paquete08.Reporte;


/**
 *
 * @author Core i5-Pro
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int totalParticipantes = 0;
        int contador;
        String continuar;
        String informacion;
        String reporte;
        int[] participantes = new int[7];
        String[] actividades = {"Fútbol", "Natación", "Atletismo",
            "Basquetbol", "Ciclismo", "Tenis", "Yoga"};
        do {
            System.out.println("Menú:\n");
            for (contador = 0; contador < actividades.length ; contador++) {
                System.out.println((contador+1)+ "." + actividades[contador]);
            }
            System.out.println("Ingrese la actividad en la que desea registrar "
                    + "un nuevo participante");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                Futbol.registrarParticipanteFutbol();
                participantes[0] = participantes[0] + 1;
            } else {
                if (opcion == 2) {
                    Natacion.registrarParticipanteNatacion();
                    participantes[1] = participantes[1] + 1;
                } else {
                    if (opcion == 3) {
                        Atletismo.registrarParticipanteAtletismo();
                        participantes[2] = participantes[2]+ 1;
                    } else {
                        if (opcion == 4) {
                            Basquetbol.registrarParticipanteBasquetbol();
                            participantes[3] = participantes[3]+ 1;
                        } else {
                            if (opcion == 5) {
                                Ciclismo.registrarParticipanteCiclismo();
                                participantes[4] = participantes[4]+ 1;
                            } else {
                                if (opcion == 6) {
                                    Tenis.registrarParticipanteTenis();
                                    participantes[5] = participantes[5]+ 1;
                                } else {
                                    if (opcion == 7) {
                                        Yoga.registrarParticipanteYoga();
                                        participantes[6] = participantes[6]+ 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            entrada.nextLine();
            System.out.println("Desea ingresar otro participante(S/N)");
            continuar = entrada.nextLine().toUpperCase();
            
        }while (continuar.equals("S"));
        for(contador=0;contador<7;contador++){
            totalParticipantes= totalParticipantes+participantes[contador];
        }
        informacion = Reporte.obtenerInformacion(totalParticipantes);
        System.out.println(informacion);
        reporte = Reporte.obtenerReporte(actividades,participantes);
        System.out.println(reporte);
        
        
    }
}
 