package com.iesvirgendelcarmen.teoria;

public class Motocicleta extends Vehiculo {
	private boolean permiso;

//	public Motocicleta(int numeroRuedas, String modelo,
//			int numeroPasajeros, boolean permiso) {
//		super(numeroRuedas, modelo, numeroPasajeros);
//		this.permiso = permiso;
//	}
	public Motocicleta(String modelo, int numeroPasajeros, boolean permiso) {
		super(2, modelo, numeroPasajeros);
		this.permiso = permiso;
	}
	public boolean isPermiso() {
		return permiso;
	}

	public void setPermiso(boolean permiso) {
		this.permiso = permiso;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Soy una MOTOCICLETA con licencia %B, %s", 
				permiso, super.toString());
	}
}
