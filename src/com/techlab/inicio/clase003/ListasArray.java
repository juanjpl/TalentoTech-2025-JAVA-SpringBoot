package com.techlab.inicio.clase003;

import java.util.ArrayList;

public class ListasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] productos = new String[3]; 
		productos[0] = "Café Premium Molido"; 
		productos[1] = "Té Verde Orgánico"; 
		productos[2] = "Chocolate Amargo 80%"; 
		
		
		ArrayList<String> listaProductos = new ArrayList<>(); 
		listaProductos.add("Café Premium Molido"); 
		listaProductos.add("Té Verde Orgánico"); 
		listaProductos.add("Chocolate Amargo 80%");
		
		
		ArrayList<String> listaProductos2 = new ArrayList<>(); 
		listaProductos2.add("Café Premium Molido"); 
		listaProductos2.add("Té Verde Orgánico"); 
		listaProductos2.add("Chocolate Amargo 80%"); 
		// Agregar nuevo producto 
		listaProductos2.add("Café Descafeinado"); 
		// Eliminar Chocolate Amargo 
		listaProductos2.remove("Chocolate Amargo 80%"); 
		// Verificar si existe Té Verde Orgánico 
		if (listaProductos2.contains("Té Verde Orgánico")) { 
		   System.out.println("El catálogo contiene Té Verde Orgánico"); 
		} else { 
		   System.out.println("No se encuentra ese producto."); 
		} 

	}

}
