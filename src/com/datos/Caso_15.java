package com.datos;

import java.util.Scanner;

public class Caso_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cliente: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese producto [TB, LT, MN, IM]: ");
		String producto = sc.nextLine();
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Forma de pago [C1, C2]: ");
		String forma_pago = sc.nextLine();
		
		String nombre_producto = "Producto no valido";
		String nombre_pago = "Forma de pago no valida";
		float precio = 0;
		float dscto = 0;
		String mensaje = "Descuento: " + 0;
		String total = "Total a pagar: " + 0;
		
		switch (producto) {
		case "TB":
			precio = 350;
			nombre_producto = "Tablet";
			break;
		case "LT":
			precio = 2300;
			nombre_producto = "Laptop";
			break;
		case "MN":
			precio = 850;
			nombre_producto = "Monitor";
			break;
		case "IM":
			precio = 680;
			nombre_producto = "Impresora";
			break;
		}
		
		switch (forma_pago) {
		case "C1":
			dscto = (precio * cantidad) * 0.05f;
			nombre_pago = "Contado";
			mensaje = "Descuento: " + dscto;
			total = "Total a pagar: " + ((precio * cantidad) - dscto);
			break;
		case "C2":
			dscto = (precio * cantidad) * 0.12f;
			nombre_pago = "Crédito";
			mensaje = "Incremento: " + dscto;
			total = "Total a pagar: " + ((precio * cantidad) + dscto);
			break;
		}
		
		System.out.println("\n--- R E S U L T A D O S ---");
		System.out.println("Cliente: " + nombre.toUpperCase());
		System.out.println("Producto: " + nombre_producto);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + (precio * cantidad));
		System.out.println("Forma de pago: " + nombre_pago);
		System.out.println(mensaje);
		System.out.println(total);
	}
}