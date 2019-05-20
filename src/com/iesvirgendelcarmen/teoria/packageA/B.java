package com.iesvirgendelcarmen.teoria.packageA;

public class B {
	private void metodo() {
		System.out.println("en la clase B");
	}
	public static void main(String... args) {
		A a = new A();
		a.metodo();
		System.out.println(a.valorPackage);
		System.out.println(a.valorProtected);
		System.out.println(a.valorPublico);
	//	a.valorPrivado; No accesible
		B b = new B();
		b.metodo();
		//B.main(new String[]{"hola"}); recursivo
		//B.main("hola", "hello"); recursivo
	}
	
}
