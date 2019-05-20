package com.iesvirgendelcarmen.teoria.packageD;

import com.iesvirgendelcarmen.teoria.packageA.A;

public class D {
	
	private void metodo() {
		System.out.println("en la clase D");
	}

	public static void main(String[] args) {
		A a = new A();
		//	System.out.println(a.valorPackage);
		//	System.out.println(a.valorProtected);
		System.out.println(a.valorPublico);
		//	a.valorPrivado; No accesible
		D d = new D();
		d.metodo();

	}

}
