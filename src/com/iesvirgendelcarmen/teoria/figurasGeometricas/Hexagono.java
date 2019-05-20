package com.iesvirgendelcarmen.teoria.figurasGeometricas;

public class Hexagono extends FiguraGeometricaRegular{

	public Hexagono(int longitudLado) {
		super(6, longitudLado, "hexágono");
		// TODO Auto-generated constructor stub
	}
	public double calcularArea() {
		return 2.6 * Math.pow(getLongitudLado(), 2);
	}

	@Override
	public String toString() {
		return String.format( super.toString() + ", de área %.2f",
				calcularArea());
	}
	
	public static void main(String[] args) {
		FiguraGeometricaRegular hexagono = new Hexagono(3);
		System.out.println(hexagono);
	}

}
