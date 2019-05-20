package com.iesvirgendelcarmen.teoria;

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Cloneable{
	private String nombre;
	private LocalDate fechaNacimiento;
	private String dni;
	private int id;
	
	public Persona(String nombre, LocalDate fechaNacimiento, String dni, int id) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		return result ;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
//		if (dni == null) {
//			if (other.dni != null)
//				return false;
//		} else if (!dni.equals(other.dni))
//			return false;
//		if (fechaNacimiento == null) {
//			if (other.fechaNacimiento != null)
//				return false;
//		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
//			return false;
//		return true;
		return Objects.equals(this.dni, other.dni)&&
				Objects.equals(this.fechaNacimiento, other.fechaNacimiento) &&
				this.id == other.id;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

	@Override
	public String toString() {
		return String.format("Persona [nombre=%s, id=%s]", nombre, id);
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("juan", 
				LocalDate.of(2000,10,10), "11111111", 2);
		Persona p10 = null;
		try {
			 p10 = (Persona) p1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Persona p11 = p1;
		Persona p2 = new Persona("felipe",
				LocalDate.of(2000,10,10), "11111111", 2);
		System.out.println(p1 == p2); //debe dar false
		System.out.println(p1.equals(p2)); //debe dar true
		System.out.println("p1: " + p1);
		System.out.println("p11 " + p11);
		System.out.println("p10 " + p10);

		p11.setId(4);
		System.out.println("Cambiad el id a 4");
		System.out.println("p1: " + p1);
		System.out.println("p11 " + p11);
		System.out.println("p10 " + p10);
		p1 = null; p2 = null; p10 = null;
		//mas código donde no hace falta p1, p2, p10 y p11
	}
	
	
}
