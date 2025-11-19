package com.techlab.inicio.clase002;

public class EstructurasDeControlWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int productosPendientes = 5;
		int contador = 1;
		
		 while(contador <= productosPendientes) {
			 System.out.println("Revisando producto numero: "+ contador);
			 contador++;
		 }
		 
		 
		 for(int i =1; i <=productosPendientes; i++) {
			 System.out.println("Revisando producto numero: " +i);
		 }
		 
		 
	}

}
