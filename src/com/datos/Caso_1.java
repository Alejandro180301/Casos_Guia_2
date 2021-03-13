package com.datos;

import java.util.Scanner;

public class Caso_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese edad: ");
		int edad = sc.nextInt();
		
		if (edad >= 18)
			System.out.println("Mayot de edad");
		else
			System.out.println("Menor de edad");
	}
}