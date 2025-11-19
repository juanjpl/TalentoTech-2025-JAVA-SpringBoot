package com.techlab.inicio.clase005;

public class Producto {

	
	 String nombre; 
	   double precio; 
	   int cantidadEnStock; 
	   
	// Constructor con parámetros 
	   public Producto(String nombre, double precio, int cantidadEnStock) { 
	       this.nombre = nombre; 
	       this.precio = precio; 
	       this.cantidadEnStock = cantidadEnStock; 
	   } 
	   
	   
	   //Metodos Propios
	   public void descontarStock(int cantidad) { 
	       this.cantidadEnStock -= cantidad; 
	   } 
	   
	   public void mostrarInformacion() {
		   System.out.println("El producto: " + nombre);
		   System.out.println("Precio: " + precio);
		   System.out.println("Stock: " + cantidadEnStock);
	   }
	   
	   public  void descuentoGeneral(double precio, double descuento) { 
		   System.out.println(precio*descuento/100);
	       return  ;
	   } 
	   
	 
	   //Metodos Generales
	   public static double calcularImpuesto(double precio) { 
	       return precio * 0.21; // 21% de impuestos 
	   } 
	   
	  
	   
	  
	   
	
	  

}
