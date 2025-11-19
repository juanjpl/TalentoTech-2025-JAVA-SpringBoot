package com.techlab.inicio.clase007;

public abstract class ProductoBase { 
	   private String nombre; 
	 
	   public ProductoBase(String nombre) { 
	       this.nombre = nombre; 
	   } 
	   public abstract double calcularPrecioFinal(); 
	} 
