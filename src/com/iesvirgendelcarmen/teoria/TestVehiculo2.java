package com.iesvirgendelcarmen.teoria;

public class TestVehiculo2 {
	public static void main(String[] args) {
		Motocicleta motocicleta1 = new Motocicleta("honda", 2, true);
		Coche coche1 = new Coche("seat", 7, 5, false);
		imprimir(motocicleta1);
		imprimir(coche1);
		Vehiculo motocicleta2 = new Motocicleta("yamaha", 2, false);
		Vehiculo coche2 = new Coche("renault", 5, 3, true);
		imprimir(motocicleta2);
		imprimir(coche2);
	}
	
	public static void imprimir(Motocicleta moto) {
		System.out.println("MOSTRANDO DATOS DE MOTOCICLETA");
		System.out.println(moto);
	}
	public static void imprimir(Coche coche) {
		System.out.println("MOSTRANDO DATOS DE COCHE");
		System.out.println(coche);
	}
	public static void imprimir(Vehiculo vehiculo) {
		System.out.println("SOY UN VEHÍCULO");
		System.out.println(vehiculo);
	}
}
