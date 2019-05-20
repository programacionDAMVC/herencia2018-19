package com.iesvirgendelcarmen.teoria.figurasGeometricas;

public class FiguraGeometricaRegular {
	
	private int numeroLados;
	private int longitudLado;
	private String nombre;
	
	public FiguraGeometricaRegular(int numeroLados, int longitudLado, String nombre) {
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
		this.nombre = nombre;
	}
	
	
	
	public int getLongitudLado() {
		return longitudLado;
	}



	protected int calcularPerimetro() {
		return numeroLados * longitudLado;
	}

	@Override
	public String toString() {
		return String.format("%S, de longitudLado %d, y perímero %d", 
							nombre,	longitudLado, calcularPerimetro() );
	}
	
	
	
}
