package com.techlab.inicio.clase005;

import java.util.ArrayList;

public class ProgramacionPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Producto> catalogo = new ArrayList<>(); 
		
		Producto cafe = new Producto(null, 0, 0); 
		cafe.nombre = "Café Premium Molido"; 
		cafe.precio = 250.0; 
		cafe.cantidadEnStock = 100; 
		
		Producto teVerde = new Producto(null, 0, 0); 
		teVerde.nombre = "Té Verde Orgánico"; 
		teVerde.precio = 180.0; 
		teVerde.cantidadEnStock = 50; 
		catalogo.add(teVerde);
	}

}
