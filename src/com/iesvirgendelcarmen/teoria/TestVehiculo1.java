package com.iesvirgendelcarmen.teoria;

public class TestVehiculo1 {

	public static void main(String[] args) {
		
		Motocicleta motocicleta = new Motocicleta("honda", 2, true);
		Coche coche = new Coche("seat", 7, 5, false);
		System.out.println(motocicleta);
		System.out.println(coche);

	}

}
