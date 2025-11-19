package com.techlab.inicio.clase003;

public class CadenasCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Para manipular caracteres y cadenas en Java se usan principalmente las clases String y Character,
		 *  junto con el operador + o el 
		 *  
		 *  
		 *  método concat() para unir cadenas, y 
		 *  métodos como charAt() 
		 *  para obtener un carácter. 
		 *  
		 *  
		 *  También se pueden usar 
		 *  toUpperCase() y toLowerCase() para cambiar el caso, 
		 *  replace() para sustituir, 
		 *  substring() para extraer partes y 
		 *  format() para dar formato.
		 * 
		 * */
		
		String mensaje = "Ejemplo de manipulación";

        // Obtener el primer carácter
        char primerChar = mensaje.charAt(0); // 'E'
        System.out.println("Primer carácter: " + primerChar);

        // Convertir a mayúsculas
        String mayusculas = mensaje.toUpperCase(); // "EJEMPLO DE MANIPULACIÓN"
        System.out.println("En mayúsculas: " + mayusculas);

        // Reemplazar un carácter
        String reemplazado = mensaje.replace('a', 'x'); // "Ejemplo de mXnipulXción"
        System.out.println("Carácter reemplazado: " + reemplazado);

        // Extraer una subcadena
        String sub = mensaje.substring(8); // "manipulación"
        System.out.println("Subcadena: " + sub);

        // Concatenar cadenas
        String saludo = "Hola";
        String mundo = " Mundo";
        String holaMundo = saludo + mundo; // "Hola Mundo"
        System.out.println("Concatenación: " + holaMundo);
	}

}
