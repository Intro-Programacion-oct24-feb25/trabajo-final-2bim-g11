/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Basquetbol {
    public static String registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String posicion;
        String estatura;
        String ciudad;
        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese la posición preferida: ");
        posicion = entrada.nextLine();
        System.out.print("Ingrese la estatura: ");
        estatura = entrada.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        String cadena= "Resumen de registro - Básquetbol:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Posición preferida: " + posicion + "\n" +
               "Estatura: " + estatura + "\n" +
               "Ciudad: " + ciudad + "\n";
        
        mensaje= cadena;

        return mensaje;
    }
}

