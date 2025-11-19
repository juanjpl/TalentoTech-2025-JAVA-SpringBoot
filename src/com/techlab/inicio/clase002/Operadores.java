package com.techlab.inicio.clase002;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores aritmeticos
		
		/*
		 * 
		 * En Java, los operadores aritméticos se utilizan para realizar operaciones 
 			como suma, resta, multiplicación, división y módulo. Estos operadores funcionan con tipos de datos numéricos
 			 (enteros y decimales) y se aplican a dos operandos (operaciones binarias) o a un solo operando (operaciones unarias). 
 			 
 			 Operadores Aritméticos Básicos:
			Suma (+):
			Agrega dos operandos. Ejemplo: int suma = 5 + 3; // suma = 8 
			Resta (-):
			Resta el segundo operando del primero. Ejemplo: int resta = 10 - 4; // resta = 6 
			Multiplicación ():*
			Multiplica dos operandos. Ejemplo: int multiplicacion = 6 * 7; // multiplicacion = 42 
			División (/):
			Divide el primer operando por el segundo. Ejemplo: double division = 15.0 / 4.0; // division = 3.75 
			Módulo (%):
			Devuelve el resto de la división entera. Ejemplo: int modulo = 17 % 5; // modulo = 2 
			Operadores Unarios:
			Positivo (+):
			Indica un valor positivo. En la mayoría de los casos, no es necesario usarlo explícitamente. 
			Negativo (-):
			Invierte el signo del operando. Ejemplo: int negativo = -5; // negativo = -5 
		 * */
		
		
		int num1 = 20;
        int num2 = 8;

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2; // Se hace castea a double para obtener decimales
        int modulo = num1 % num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        
        int precioUnitario = 200;
        int cantidad = 10;
        int costoTotal= precioUnitario*cantidad;
        System.out.println("El costo total del pedido es: $"+ costoTotal);
	}

}
