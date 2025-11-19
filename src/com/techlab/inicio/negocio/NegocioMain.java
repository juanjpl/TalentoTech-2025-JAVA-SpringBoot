package com.techlab.inicio.negocio;

import java.util.ArrayList;

import com.techlab.inicio.productos.ProductoDos;
import com.techlab.inicio.utilidades.CargaSistema;
import com.techlab.inicio.utilidades.MenuInicio;

public class NegocioMain {

	public static void main(String[] args) {
		//Aquíe 
		ArrayList<ProductoDos> listaProductos = new ArrayList<ProductoDos>();
		
		// 1) Creamos un usuario
		String usuario = CargaSistema.cargaSistema();
		
	
		// 2) Mostramos el menu de opciones
		MenuInicio.imprimirMenuPrincipal(listaProductos);
		

	}

	

	

}
