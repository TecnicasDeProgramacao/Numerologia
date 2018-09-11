package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.intThat;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
//import org.junit.Test;
import org.mockito.ArgumentMatcher;




class CalculadorTester {
	private Calculador calc;
	private FormatadorInterface mockFormat = mock(FormatadorInterface.class);
	private InterfaceRedutor mockRedut = mock(InterfaceRedutor.class);
	
	
	@BeforeEach
	public void setUp() throws Exception {
		when(mockFormat.formataFrase("John Smit")).thenReturn("JOHN SMIT");
		when(mockFormat.formataFrase("Jane Smith")).thenReturn("JANE SMITH");
		
		when(mockRedut.reducaoFrase("JOHN SMIT")).thenReturn(5);
		when(mockRedut.reducaoData("07/22/1995")).thenReturn(6);
	
		calc = new Calculador(mockRedut,mockFormat);
	}
	
	

	@Test
	public void testCalculaNroVida() {
		assertEquals(6, calc.calculaNumeroDaVida("07/22/1995"));
	}
	
	@Test
	public void testCalculaNroDestino() {
		assertEquals(5, calc.calculaNumeroDestino("John Smit"));
	}
	
	@Test
	public void testCalculaNroDesejosAlma() {
		assertEquals(6, calc.calculaNumeroDesejosDaAlma("Jane Smith"));
	}
	
	
	

}
