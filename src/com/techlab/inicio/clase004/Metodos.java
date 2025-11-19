package com.techlab.inicio.clase004;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioOriginal = 1000.0;
		double precioConDescuento = aplicarDescuento(precioOriginal, 15.0);
		System.out.println("Precio final: " + precioConDescuento);

	}

	public int sumar(int a, int b) {
		int resultado = a + b;
		return resultado;
	}

	public static double aplicarDescuentos(double precio, double porcentaje) {
		double descuento = precio * (porcentaje / 100.0);
		double precioFinal = precio - descuento;
		return precioFinal;
	}

	public static void imprimirRecibo(String producto, double precioOriginal, double precioFinal) {
		System.out.println("Recibo de Compra");
		System.out.println("Producto: " + producto);
		System.out.println("Precio Original: $" + precioOriginal);
		System.out.println("Precio con Descuento: $" + precioFinal);
	}

	public static double aplicarDescuentoConCantidad(double precio, double porcentajeBase, int cantidad) {
		if (cantidad > 50) {
			porcentajeBase += 5; // Aumentamos el descuento si compra más de 50 unidades
		}
		return aplicarDescuento(precio, porcentajeBase);
	}

	// Versión básica
	public static double aplicarDescuento(double precio, double porcentaje) {
		return precio - (precio * (porcentaje / 100.0));
	}

	// Versión sobrecargada para clientes premium, agregando un bonus
	public static double aplicarDescuento(double precio, double porcentaje, double bonusAdicional) {
		double precioDescontado = aplicarDescuento(precio, porcentaje);
		return aplicarDescuento(precioDescontado, bonusAdicional);
	}
}
