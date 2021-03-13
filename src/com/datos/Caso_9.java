package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese el nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Ingrese nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Ingrese número de asistencias [1-12]: ");
		float asistencias = sc.nextFloat();
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f;
		float pa = asistencias / 12 * 100;
		
		String estado = "Desaprobado";
		
		if (promedio >= 13 && pa >= 70)
			estado = "Aprobado";
		
		System.out.println("\n--- R E S U L T A D O ---");
		System.out.println("Alumno(a): " + nombre.toUpperCase());
		System.out.println("Promedio: " + df.format(promedio));
		System.out.println("Asistencias: " + df.format(pa) + "%");
		System.out.println("Estado: " + estado);
	}
}