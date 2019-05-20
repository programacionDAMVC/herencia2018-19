package com.iesvirgendelcarmen.teoria;

public class Vehiculo {
	//mantenemos encapsulamiento
	private int numeroRuedas;
	private String modelo;
	private int numeroPasajeros;
	//constructor
	public Vehiculo(int numeroRuedas, String modelo, int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.modelo = modelo;
		this.numeroPasajeros = numeroPasajeros;
	}
	//getters y setters
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Soy un AUTOMÓVIL con nº ruedas %d, marca %S y con un nº de pasajeros %d",
				numeroRuedas, modelo, numeroPasajeros);
	}
	
}
