/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Futbol {

    public static String registrarParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipoFavorito;
        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese la posición preferida: ");
        posicion = entrada.nextLine();
        System.out.println("Ingrese la ciudad: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el equipo favorito: ");
        equipoFavorito = entrada.nextLine();
        
        String cadena = "Resumen de registro - Futbol:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "posicion: " + posicion + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Equipo favorito: " + equipoFavorito + "\n";
        mensaje= cadena;

        return mensaje;
    }
    
}
