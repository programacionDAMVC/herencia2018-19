package com.iesvirgendelcarmen.teoria.figurasGeometricas;

public class TrianguloRectangulo extends FiguraGeometricaRegular {

	public TrianguloRectangulo(int longitudLado) {
		super(3, longitudLado, "triángulo rectángulo");
		// TODO Auto-generated constructor stub
		
	}
	public double calcularArea() {
		return ( Math.sqrt(3.0) * getLongitudLado()) / 2.0;
	}

	@Override
	public String toString() {
		return String.format( super.toString() + ", de área %.2f",
				calcularArea());
	}
	
	public static void main(String[] args) {
		FiguraGeometricaRegular triangulo = new TrianguloRectangulo(3);
		System.out.println(triangulo);
	}


}
