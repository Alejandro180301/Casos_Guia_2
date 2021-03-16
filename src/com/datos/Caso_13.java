package com.datos;

import java.util.Scanner;

public class Caso_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingrese número 2: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingrese operación [1-6]: ");
		int op = sc.nextInt();
		
		String operacion = "Operación invalida";
		float rpta = 0;
		
		switch (op) {
		case 1:
			rpta = n1 + n2;
			operacion = "Suma";
			break;
		case 2:
			rpta = n1 - n2;
			operacion = "Resta";
			break;
		case 3:
			rpta = n1 * n2;
			operacion = "Multiplicación";
			break;
		case 4:
			if (n2 == 0)
				operacion = "No es posible dividir entre 0";
			else {
				rpta = n1 / n2;
				operacion = "División";
			}
			break;
		case 5:
			if (n2 == 0)
				operacion = "No es posible hallar el resto entero";
			else {
				rpta = n1 % n2;
				operacion = "Resto entero";
			}
			break;
		case 6:
			rpta = (n1 + n2) / 2;
			operacion = "Promedio";
			break;

		}
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Operacion: " + operacion);
		System.out.println("Resultado: " + rpta);
	}
}