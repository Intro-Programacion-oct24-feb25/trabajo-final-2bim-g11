/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author Core i5-Pro
 */
public class Ciclismo {
    public static String registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String tipociCiclismo;
        String marcaBicicleta;
        System.out.print("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el tipo de ciclismo (montaña,ruta,urbano): ");
        String tipoCiclismo = entrada.nextLine();
        System.out.print("Ingrese la ciudad: ");
        String ciudad = entrada.nextLine();
        System.out.print("Ingrese la marca de bicicleta preferida: ");
        marcaBicicleta = entrada.nextLine();
        
        String cadena= "Resumen de registro - Ciclismo:\n" +
               "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Tipo de ciclismo: " + tipoCiclismo + "\n" +
               "Ciudad: " + ciudad + "\n" +
               "Marca de bicicleta preferida: " + marcaBicicleta + "\n";
        mensaje= cadena;

        return mensaje;
    }
}
