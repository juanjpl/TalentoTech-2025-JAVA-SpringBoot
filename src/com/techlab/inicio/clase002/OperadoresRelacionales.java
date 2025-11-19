package com.techlab.inicio.clase002;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		
		/*
		 * En Java, un operador relacional (o de comparación) es un símbolo que se utiliza para comparar dos valores y, 
		 * como resultado, devuelve un valor booleano: true (verdadero) o false (falso). Se emplean en estructuras de control 
		 * del programa, como sentencias if o bucles, para tomar decisiones en función de si una comparación es verdadera o falsa. 
		 * Los operadores relacionales más comunes en Java son: 
		 * 
		 * 
		 * == (igual a), 
		 * != (distinto de), 
		 * < (menor que), 
		 * > (mayor que), 
		 * <= (menor o igual que) y 
		 * >= (mayor o igual que). 
		 * 
		 * 
			Tipos de operadores relacionales en Java 
			== (Igual a): Comprueba si dos operandos son idénticos.
			!= (Distinto de): Comprueba si dos operandos no son iguales.
			< (Menor que): Devuelve true si el operando de la izquierda es menor que el de la derecha.
			> (Mayor que): Devuelve true si el operando de la izquierda es mayor que el de la derecha.
			<= (Menor o igual que): Comprueba si el operando de la izquierda es menor o igual que el de la derecha.
			>= (Mayor o igual que): Comprueba si el operando de la izquierda es mayor o igual que el de la derecha.
		 * */
		
		
		int a = 10;
	    int b = 5;
	    if (a > b) { // a es mayor que b, devuelve true
	        System.out.println("a es mayor que b");
	        
	        
	        int    i = -3;
	        byte   z = 5;
	        float  f = 1e-10f;
	        double d = 3.14;
	        boolean b1 = i > i;
	        boolean b2 = i < z;
	        boolean b3 = z <= f;
	        boolean b4 = f >= d;
	        boolean b5 = d != 0;
	        boolean b6 = 1 == f;

	        System.out.println("b1: " + i + " > " + i + " = " + b1);
	        System.out.println("b2: " + i + " < " + z + " = " + b2);
	        System.out.println("b3: " + z + " <= " + f + " = " + b3);
	        System.out.println("b4: " + f + " >= " + d + " = " + b4);
	        System.out.println("b5: " + d + " != " + 0 + " = " + b5);
	        System.out.println("b6: " + 1 + " == " + f + " = " + b6);
	        
	        /*
	         * No nos olvidemos de los char, que también participan. Podemos comparar caracteres, pues internamente están almacenados como números.
	         * */
	        
	        char am = 'A';
	        char bm = 'B';
	        boolean x = am > bm;
	    }

	}

}
