package com.iesvirgendelcarmen.teoria;

public class ClaseExtiendeNormal  extends ClaseNormal{

	public ClaseExtiendeNormal(int valor, String cadena) {
		super(valor, cadena);
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public int retornarDoble() {
//		// TODO Auto-generated method stub
//		return super.retornarDoble() * 2;
//	//	return 2;
//	}
	//No se puede sobrescribir, pero se puede invocar
	public int devolverDoble() {
		return super.retornarDoble() * 2;
	}
	
	
}
