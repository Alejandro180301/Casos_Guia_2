package com.datos;

import java.util.Scanner;

public class Caso_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String estado = "Número impar";
		
		if (n % 2 == 0)
			estado = "Número par";
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println("Estado: " + estado);
	}
}