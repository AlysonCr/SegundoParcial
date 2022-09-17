package org.formacion.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		//implementar factory method
		//Lavadora lavadora = null;
		//lavadora.ponerMandos();
		//lavadora.ponerTambor();
		
		final FactoriaLavadora factoria = new LavadoraCargaFrontal();
		assertNotNull(factoria);
		
		Lavadora lavadora = factoria.creaLavadora();
		assertNotNull(lavadora);

		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	/**
	 * 
	 */
	@Test
	public void test_carga_superior() {
		//implementar factory method
		//Lavadora lavadora = null;
		//lavadora.ponerMandos();
		//lavadora.ponerTambor();
		
		final FactoriaLavadora factoria = new LavadoraCargaSuperiorFactoria();
		assertNotNull(factoria);

		Lavadora lavadora = factoria.creaLavadora();
		assertNotNull(lavadora);

		

		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
