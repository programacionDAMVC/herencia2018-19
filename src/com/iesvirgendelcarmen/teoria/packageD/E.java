package com.iesvirgendelcarmen.teoria.packageD;

import com.iesvirgendelcarmen.teoria.packageA.A;

public class E extends A{
	@Override
	protected void metodo() {
		System.out.println("en la clase E");
	}
	public static void main(String[] args) {
		A a = new A(); //se crea una referencia de A (al estar en un paquete diferente, solo veo accesiblidad public
		System.out.println(a.valorPublico); //lo único que vemos
		E e = new E(); // se crea una referencia de E y A. Quedan ligadas, veo public y protected
		System.out.println(e.valorPublico);
		System.out.println(e.valorProtected);
		e.metodo();

	}
}
