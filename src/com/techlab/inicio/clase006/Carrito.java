package com.techlab.inicio.clase006;

import java.util.ArrayList;

import com.techlab.inicio.clientes.Cliente;
import com.techlab.inicio.productos.ProductoDos;


public class Carrito {
	
	static int cantidadCarritos = 0;
	private ArrayList<ProductoDos> carritoProductos;
	private Cliente clienteCarrito;

	
	
	// Constructor
		public Carrito(Cliente cliente) {
			this.clienteCarrito = cliente;
			this.carritoProductos = new ArrayList<>();
			cantidadCarritos++;
		}
	
	
	
	public Cliente getcliente() {
		return clienteCarrito;
	}

	
	public int getCantidadCarritos() {
		return cantidadCarritos;
	}

	

	public ArrayList<ProductoDos> getCarritoProductos() {
		return carritoProductos;
	}


	public void setCarritoProductos(ProductoDos producto) {
		this.carritoProductos.add(producto);
	}



	@Override
	public String toString() {
		return "Carrito [carritoProductos=" + carritoProductos + "]";
	}
	

	
	
	
}
