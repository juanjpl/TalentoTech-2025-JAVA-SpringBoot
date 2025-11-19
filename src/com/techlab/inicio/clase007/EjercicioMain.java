package com.techlab.inicio.clase007;

import java.util.ArrayList;

import com.techlab.inicio.productos.ProductoDos;

public class EjercicioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ProductoDos> listaProductos = new ArrayList<ProductoDos>();
		
		Te bebidaUno = new Te("Bebida Te Blanco", 50, 100);
		listaProductos.add(bebidaUno);
		Te bebidaDos = new Te("Bebida Te Negro", 100, 150);
		listaProductos.add(bebidaDos);
		Te bebidaTres = new Te("Bebida Te Naranja", 150, 200);
		listaProductos.add(bebidaTres);
		
		for(ProductoDos p : listaProductos) {
			System.out.println(p);
		}
		
		
		
		
		

	}

}
