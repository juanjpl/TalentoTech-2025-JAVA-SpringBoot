package com.techlab.inicio.clase002;

import java.util.Scanner;

public class EntradaSalidaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre: ");
		String nombreCliente = sc.nextLine();
		System.out.println("Bienvenido a nuestra tienda "+nombreCliente);
		
		System.out.println("Cuantos productos queres comprar? : ");
		int cantidadProductos = sc.nextInt();
		System.out.println("Vas a comprar "+cantidadProductos+" productos.");
		
		
	}

}
