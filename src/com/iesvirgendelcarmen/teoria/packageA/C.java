package com.iesvirgendelcarmen.teoria.packageA;

public class C extends A {
	@Override
	protected void metodo() {
		System.out.println("en la clase C");
	}
	
	public static void main(String[] args) {
//		A a = new A();
//		a.metodo();
//		System.out.println(a.valorPackage);
//		System.out.println(a.valorProtected);
//		System.out.println(a.valorPublico);
		//	a.valorPrivado; //No accesible
		A c = new C();
		c.metodo();
		System.out.println(c.valorPackage);
		System.out.println(c.valorProtected);
		System.out.println(c.valorPublico);
	}
}
