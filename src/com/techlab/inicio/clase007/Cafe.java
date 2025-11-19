package com.techlab.inicio.clase007;

import com.techlab.inicio.productos.ProductoDos;

public class Cafe extends ProductoDos implements IDescontable {

	
	public Cafe(String nombre, double precio, int cantidadEnStock) {
		super(nombre, precio, cantidadEnStock);
	}

	
	@Override 
	   public double calcularPrecioFinal() { 
	       // Por ejemplo, las bebidas tienen un descuento del 5% 
	       return getPrecio() * 0.95; 
	   }


	@Override
	public double aplicarDescuento(double porcentaje) {
		// TODO Auto-generated method stub
		return 0;
	}
}
