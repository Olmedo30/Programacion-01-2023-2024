package Ejercicios;

import java.util.Scanner;

/**
 * @author Álvaro Olmedo Fernández
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        //Creamos el objeto scanner par leer lo que se ponga el teclado.
        Scanner sc = new Scanner(System.in);
        
        //Pedimos el primer número de la suma.
        System.out.println("Dime el primer número de la suma:");
        int numero1 = sc.nextInt();
        
        //Pedimos el segundo número de la suma.
        System.out.println("Dime el segundo número de la suma:");
        int numero2 = sc.nextInt();
        
        //Realizamos la suma de los dos números.
        int suma = numero1 + numero2;
        
        //Imprimimos la suma del total de los dos números.
        System.out.println("La suma total de los dos números es: " + suma);
    }
}
