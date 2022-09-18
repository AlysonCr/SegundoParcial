package org.formacion.factorymethod;

public class LavadoraFactory {
	
	public Lavadora createLavadora(String tipoCarga){
		
		if(tipoCarga.equals("frontal")) {
			return new LavadoraCargaFrontal();
			
			
		}else if(tipoCarga.equals("superior")) {
			return new LavadoraCargaSuperior();
			
		}else {
			return null;
		}
	}
}
