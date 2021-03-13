package com.datos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Nombre del alumno: ");
		String nombre = sc.nextLine();
		
		System.out.print("Carrera [DS, RC, DG]: ");
		String carrera = sc.nextLine();
		
		System.out.print("Turno [M, T, N]: ");
		String turno = sc.nextLine();
		
		float monto = 0;
		String nombre_carrera = "Carrera no valida";
		String nombre_turno = "Turno no valido";
		float dscto = 0;
		
		switch (carrera) {
		case "DS":
			monto = 1500;
			nombre_carrera = "Desarrollo de Software";
			break;
		case "RC":
			monto = 1400;
			nombre_carrera = "Redes y conectividad";
			break;
		case "DG":
			monto = 1300;
			nombre_carrera = "Diseño Gráfico";
			break;
		}
		
		switch (turno) {
		case "M":
			dscto = monto * 0.1f;
			nombre_turno = "Mañana";
			break;
		case "T":
			dscto = monto * 0.2f;
			nombre_turno = "Tarde";
			break;
		case "N":
			dscto = monto * 0.15f;
			nombre_turno = "Noche";
			break;
		}
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Alumno: " + nombre.toUpperCase());
		System.out.println("Carrera: " + nombre_carrera);
		System.out.println("Turno: " + nombre_turno);
		System.out.println("Monto: " + monto);
		System.out.println("Descuento: " + dscto);
		System.out.println("Total a pagar: " + "S/ " + (monto - dscto));
		System.out.println("Total a pagar en dolares: " + "$ " + df.format(((monto - dscto) / 3.33)));
	}
}