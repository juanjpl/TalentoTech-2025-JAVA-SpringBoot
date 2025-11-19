package com.techlab.inicio.clase006;

import java.util.ArrayList;

import com.techlab.inicio.clientes.Cliente;
import com.techlab.inicio.productos.ProductoDos;

public class EncapsulamientoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente("juan lima", "pepe@hotmail.com");
		listaClientes.add(cliente1);
		Cliente cliente2 = new Cliente("jose lima", "pepe@hotmail.com");
		listaClientes.add(cliente2);
		Cliente cliente3 = new Cliente("miguel lima", "pepe@hotmail.com");
		listaClientes.add(cliente3);

		for (Cliente c : listaClientes) {
			System.out.println(c.toString());
		}

		ArrayList<ProductoDos> listaProductos = new ArrayList<ProductoDos>();

		ProductoDos producto1 = new ProductoDos("Chocolate Blanco", 1100, 1000);
		listaProductos.add(producto1);
		ProductoDos producto2 = new ProductoDos("Chocolate Negro", 2100, 2000);
		listaProductos.add(producto2);
		ProductoDos producto3 = new ProductoDos("Chocolate Amargo", 3100, 3000);
		listaProductos.add(producto3);

		for (ProductoDos p : listaProductos) {
			System.out.println(p.toString());
		}

		Carrito carritoProductos = new Carrito(cliente1);

		carritoProductos.setCarritoProductos(producto1);
		carritoProductos.setCarritoProductos(producto2);
		carritoProductos.setCarritoProductos(producto3);

		System.out.println(carritoProductos.getCantidadCarritos());
		System.out.println(carritoProductos.getcliente());
		System.out.println(carritoProductos.getCarritoProductos());

		Carrito carritoProductos2 = new Carrito(cliente1);

		carritoProductos2.setCarritoProductos(producto1);
		carritoProductos2.setCarritoProductos(producto2);
		carritoProductos2.setCarritoProductos(producto3);

		System.out.println(carritoProductos2.getCantidadCarritos());
		System.out.println(carritoProductos2.getcliente());
		System.out.println(carritoProductos2.getCarritoProductos());

		System.out.println(ProductoDos.getCantidadProductos());
	}

}
