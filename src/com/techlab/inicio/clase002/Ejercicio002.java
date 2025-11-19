package com.techlab.inicio.clase002;

import java.util.Scanner;

public class Ejercicio002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int stock;
		float precioUnitario;
		int pedido;
		float cantidadTotal;
		
		System.out.println("Ingrese su nombre por favor: ");
		String nombreCliente = sc.nextLine();
		System.out.println("Bienvenido a nuestra tienda "+nombreCliente+"!");
		
		
		System.out.println("Vamos a calcular juntos el costo final de los productos cargados.");
		
		System.out.println("Ingresa el stock que tienes en el depósito: ");
		stock = sc.nextInt();
		
		System.out.println("Ingresa el valor del producto: ");
		precioUnitario = sc.nextFloat();
		
		System.out.println("Ahora ingresemos la cantidad total de pedidos a calcular: ");
		pedido = sc.nextInt();
		
		if(stock>=pedido) {
			System.out.println("Tenemos stock suficiente para realizar el pedido.");
			cantidadTotal = precioUnitario*pedido;
			
			
			if(pedido>100) {
				System.out.println("Se aplicará un descuento de 10% a pediddos mayores o iguales a 100.");
				System.out.println("El monto final del pedido es: " + cantidadTotal);
			}else {
				System.out.println("El monto final del pedido es: " + cantidadTotal);
			}
		}else {
			System.out.println("No tenemos el stock suficiente para realizar el pedido.");
		}
		
		
		
	}
}
