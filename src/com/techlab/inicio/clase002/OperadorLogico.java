package com.techlab.inicio.clase002;

public class OperadorLogico {

	public static void main(String[] args) {
	
		/*
		 * En Java, los operadores lógicos (AND &&, OR ||, y NOT !) permiten combinar expresiones booleanas (true/false) para construir condiciones complejas. El operador && es verdadero solo si todas las condiciones son verdaderas. El operador || es verdadero si al menos una condición es verdadera. El operador ! invierte el valor booleano de una condición, convirtiendo true en false y viceversa. 
			Operadores Lógicos en Java
			
			Los operadores lógicos en Java se utilizan para crear sentencias condicionales complejas al combinar valores booleanos o expresiones que resultan en un valor booleano. 
			AND Lógico (&&)
			Símbolo: && 
			Función: Devuelve true solo si ambas expresiones a su izquierda y derecha son true. Si alguna de las expresiones es false, el resultado es false. 
			Ejemplo: (a > 5) && (b < 10) 
			OR Lógico (||)
			Símbolo: || 
			Función: Devuelve true si al menos una de las expresiones (la de la izquierda o la de la derecha) es true. El resultado es false solo si ambas expresiones son false. 
			Ejemplo: (x == 10) || (y > 20) 
			NOT Lógico (!)
			Símbolo: ! 
			Función: Es un operador unario que niega una condición. Invierte el valor booleano de la expresión que le sigue: si es true, lo convierte en false, y si es false, lo convierte en true. 
			Ejemplo: !(edad < 18) 
		 * */
		
		
		// Ejemplo de uso de operadores lógicos
		int edad = 25;
		boolean estaCasado = false;

		// Usando AND (&&)
		if (edad > 18 && estaCasado == false) {
		    System.out.println("Persona joven y soltera"); // Este se imprimirá
		}

		// Usando OR (||)
		int numero = 5;
		if (numero < 0 || numero > 100) {
		    System.out.println("Número fuera del rango 0-100"); // No se imprimirá
		}

		// Usando NOT (!)
		boolean esMayorDeEdad = true;
		if (!esMayorDeEdad) {
		    System.out.println("Es menor de edad"); // No se imprimirá
		} else {
		    System.out.println("Es mayor de edad"); // Este se imprimirá
		}
		
		int precioUnitario = 200;
		int cantidad = 10;
		int costoTotal = precioUnitario*cantidad;
		
		System.out.println("El costo total del pedido es: $"+ costoTotal);

	}

}
