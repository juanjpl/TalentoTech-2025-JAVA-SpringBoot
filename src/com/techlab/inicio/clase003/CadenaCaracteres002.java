package com.techlab.inicio.clase003;

public class CadenaCaracteres002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String producto = " Cafe Premium MOLIDO ";

		System.out.println(producto);
		System.out.println(producto.trim());
		System.out.println(producto.toLowerCase().trim());

		String nombre = ("  ADKCJKD laksjdf Ad kdlkjads FFD klkasd KASJDF  kasdfk l. ").trim().toLowerCase();

		// Dividimos en palabras
		String[] palabras = nombre.split("");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < palabras.length; i++) {

			if (!palabras[i].isEmpty()) {
				String primeraLetra = palabras[i].substring(0, 1).toUpperCase();
				String resto = palabras[i].substring(1);
				sb.append(primeraLetra).append(resto);
				if (i < palabras.length - 1) {
					sb.append("");
				}
			}
		}
		System.out.println(sb.toString()); 
	}

}
