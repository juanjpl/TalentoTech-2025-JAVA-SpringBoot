package com.techlab.inicio.clase005;

import java.util.ArrayList;

import com.techlab.inicio.clientes.Cliente;

public class Ejercicio005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Producto> listaProductos = new ArrayList<>();
		ArrayList<Cliente> listaClientes = new ArrayList<>();

		Producto cafe1 = new Producto("Café 001", 100, 1000);
		listaProductos.add(cafe1);
		Producto cafe2 = new Producto("Café 002", 150, 1000);
		listaProductos.add(cafe2);
		Producto cafe3 = new Producto("Café 003", 200, 1000);
		listaProductos.add(cafe3);
		Producto cafe4 = new Producto("Café 004", 250, 1000);
		listaProductos.add(cafe4);

		for (Producto product : listaProductos) {

			product.mostrarInformacion();
			System.out.println("================ FIN ================");

		}

		for (Producto product : listaProductos) {

			product.descuentoGeneral(product.precio, 10);
			System.out.println("================ FIN ================");

		}
		
		Cliente primero = new Cliente("Juan Pascual","juan_jpl@hotamil.com");
		
		listaClientes.add(primero);
		

	}

}
