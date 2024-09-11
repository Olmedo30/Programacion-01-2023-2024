package Ejercicios;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		double kilometres = 0;
		double milles = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de milla que quieres pasar a kilómetros: ");
		milles = sc.nextDouble();
		kilometres = ( milles * 1852 ) / 1000;
		System.out.println(kilometres);
	}
	
}
