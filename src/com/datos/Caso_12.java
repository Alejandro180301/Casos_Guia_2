package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		
		System.out.print("Nivel [1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.print("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		case 1:
			incremento = 0.045f;
			break;
		case 2:
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
			break;
		case 4:
			incremento = 0.11f;
			break;
		}
		float nuevo_sueldo = (sueldo * incremento) + sueldo;
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println("Empleado: " + empleado.toUpperCase());
		System.out.println("Sueldo: " + df.format(sueldo));
		System.out.println("Incremento: " + (incremento * 100) + "%");
		System.out.println("Nuevo sueldo: " + df.format(nuevo_sueldo));
	}
}