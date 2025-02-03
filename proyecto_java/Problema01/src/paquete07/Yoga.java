/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Yoga {
    public static String registrarParticipanteYoga() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estiloYoga;
        System.out.print("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el nivel (principiante, intermedio, avanzado)"
                + ": ");
        nivel = entrada.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.print("Ingrese el estilo de yoga preferido: ");
        estiloYoga = entrada.nextLine();
        String cadena= "\nResumen de registro - Yoga:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Nivel: " + nivel + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Estilo de yoga preferido: " + estiloYoga + "\n";
        mensaje= cadena;
        return mensaje;
    }
}

