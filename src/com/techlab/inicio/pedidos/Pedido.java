package com.techlab.inicio.pedidos;

import java.util.ArrayList;

import com.techlab.inicio.clientes.Cliente;
import com.techlab.inicio.productos.ProductoDos;

public class Pedido {

	static int cantidadPedidos = 0;
	private ArrayList<ProductoDos> productos;
	private Cliente cliente;

	

	public static int getCantidadPedidos() {
		return cantidadPedidos;
	}

	// Constructor
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
		this.productos = new ArrayList<>();
		cantidadPedidos++;
	}

	void agregarProducto(ProductoDos p) {
		productos.add(p);
	}

	public double calcularTotal() {
		double total = 0;
		for (ProductoDos p : productos) {
			total += p.getPrecio() * p.getCantidadEnStock();
		}
		return total;
	}
}
