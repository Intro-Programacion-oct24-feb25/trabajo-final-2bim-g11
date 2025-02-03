/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Atletismo {
     public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String recordPersonal;
        System.out.print("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese la especialidad (carreras, salto, lanzamiento)"
                + ": ");
        especialidad = entrada.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.print("Ingrese el récord personal: ");
        recordPersonal = entrada.nextLine();
        
        String cadena = "Resumen de registro - Yoga:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Especialidad: " + especialidad + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Record Personal: " + recordPersonal + "\n";
        mensaje= cadena;

        return mensaje;
    }
}
