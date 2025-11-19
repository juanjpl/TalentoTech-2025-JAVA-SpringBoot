package com.techlab.inicio.clase003;

import java.util.ArrayList;

public class Ejercicio003 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		ArrayList<String> listaProductos2 = new ArrayList<>();
		listaProductos2.add("Café Premium            Molido");
		listaProductos2.add("Té    VERDE OrgániCO");
		listaProductos2.add("CHOcolate      AMARGO 80%");
		listaProductos2.add("ChocoLAte Blanco     80%");
		listaProductos2.add("ChocoLATE   SemiAmARgo 80%");
		
		for(String producto : listaProductos2) {
			System.out.println(producto);
		}
		
		for(int i =0; i < listaProductos2.size();i++) {
			
			listaProductos2.set(i,formatearNombreProducto(listaProductos2.get(i)) );
			
			
		}
		
		
		for(String producto : listaProductos2) {
			System.out.println(producto);
		}
		
		listaProductos2.add(formatearNombreProducto("té CHAi"));
		
		for(String producto : listaProductos2) {
			System.out.println(producto);
		}

	}

	public static String formatearNombreProducto(String nombre) {

		nombre = nombre.trim().toLowerCase();
		// Dividimos en palabras
		String[] palabras = nombre.split(" ");
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < palabras.length; i++) {
			if (!palabras[i].isEmpty()) {
				String primeraLetra = palabras[i].substring(0, 1).toUpperCase();
				String resto = palabras[i].substring(1);
				sb.append(primeraLetra).append(resto);
				if (i < palabras.length - 1) {
					sb.append(" ");
				}
			}
		}
		return sb.toString();
	};

}
