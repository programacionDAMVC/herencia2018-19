package com.iesvirgendelcarmen.teoria.figurasGeometricas;

public class Cuadrado extends FiguraGeometricaRegular{

	public Cuadrado( int longitudLado) {
		super(4, longitudLado, "cuadrado");
		// TODO Auto-generated constructor stub
	}
	
	public int calcularArea() {
		return getLongitudLado() * getLongitudLado();
	}

	@Override
	public String toString() {
		return String.format( super.toString() + ", de área %d",
				calcularArea());
	}
	
	public static void main(String[] args) {
		FiguraGeometricaRegular cuadrado = new Cuadrado(3);
		System.out.println(cuadrado);
	}

}
