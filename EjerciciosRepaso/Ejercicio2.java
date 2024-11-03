/*
 * Crea un programa que convierta una temperatura dada en grados Celsius a Fahrenheit.
 * La fórmula es: F = (C * 9/5) + 32.
 */
package Ejercicios;

import java.util.Scanner;

/**
 * @author Álvaro Olmedo Fernández
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Creamos el objeto scanner par leer lo que se ponga el teclado.
        Scanner sc = new Scanner(System.in);
        
        //Pedimos la temperatura en Cº y lo almacenamos en una varible.
        System.out.println("Dime el la temperatura en Cº:");
        int temperatura = sc.nextInt();
        
        //Pasamos la temperatura a Fahrenheit multiplicando por (9/5) + 32.
        temperatura = (temperatura * 9/5) + 32;
        
        //Imprimimos el resultado final de la temperatura pasada a Fahrenheit.
        System.out.println("La temperatura en Fahrenheit es: " + temperatura);
    }
}
