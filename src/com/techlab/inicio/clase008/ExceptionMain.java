package com.techlab.inicio.clase008;

import com.techlab.inicio.excepciones.ProductoNoEncontradoException;
import com.techlab.inicio.productos.ProductoDos;

public class ExceptionMain {

	public static void main(String[] args) throws ProductoNoEncontradoException {
		// TODO Auto-generated method stub

		
		try { 
			   ProductoDos p = buscarProductoPorNombre("Café"); 
			   System.out.println("Producto encontrado: " + p.getNombre()); 
			} catch (ProductoNoEncontradoException e) { 
			   System.out.println("No se encontró el producto: " + e.getMessage()); 
			} finally { 
			   System.out.println("Operación de búsqueda finalizada."); 
			} 
	}

	private static ProductoDos buscarProductoPorNombre(String string) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

}


