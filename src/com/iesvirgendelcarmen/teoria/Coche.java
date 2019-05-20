package com.iesvirgendelcarmen.teoria;

public class Coche extends Vehiculo{
	private int numeroPuertas;
	private boolean diesel;
	
	public Coche(String modelo, int numeroPasajeros, int numeroPuertas, boolean diesel) {
		super(4, modelo, numeroPasajeros);
		this.numeroPuertas = numeroPuertas;
		this.diesel = diesel;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public boolean isDiesel() {
		return diesel;
	}

	public void setDiesel(boolean diesel) {
		this.diesel = diesel;
	}
	
	@Override
	public String toString() {
		return String.format("Soy un COCHE de modelo %S, diesel %B, con nº puertas %d", 
				getModelo(), diesel, numeroPuertas);
	}
	
	
}
