/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Tenis {
     public static String registrarParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String manoHabil;
        System.out.print("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el nivel (principiante,intermedio,avanzado)"
                + ": ");
        nivel = entrada.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.print("Ingrese la mano hábil (derecha/izquierda): ");
        manoHabil = entrada.nextLine();
        String cadena= "\nResumen de registro - Tenis:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Nivel: " + nivel + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Mano hábil: " + manoHabil + "\n";
        mensaje= cadena;
        return mensaje;
    }
     
}
