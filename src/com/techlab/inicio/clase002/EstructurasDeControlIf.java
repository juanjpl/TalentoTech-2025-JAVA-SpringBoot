package com.techlab.inicio.clase002;

public class EstructurasDeControlIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int demanda = 20;
		int stockCafe = 50;
		if(stockCafe >= demanda) {
			System.out.println("Podemos cubrir el pedido de "+demanda+" unidades.");
		}else {
			System.out.println("No hay stock");
		}
	}

}
