package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



class CalculadorTests {
	private Calculador calc;
	private FormatadorInterface mockFormat = mock(FormatadorInterface.class);
	private InterfaceRedutor mockRedut = mock(InterfaceRedutor.class);
	
	
	@BeforeEach
	public void setUp() throws Exception {
		when(mockFormat.formataFrase("John Smit")).thenReturn("JOHN SMIT");
		when(mockFormat.formataFrase("Jane Smith")).thenReturn("JANE SMITH");
		
		when(mockRedut.reducaoFrase("JOHN SMIT")).thenReturn(5);
		when(mockRedut.reducaoData("07/22/1995")).thenReturn(6);
		
		when(mockFormat.formataFrase("@J-")).thenThrow(new IllegalArgumentException());
		when(mockRedut.reducaoData("@J-")).thenThrow(new IllegalArgumentException());
	
		calc = new Calculador(mockRedut,mockFormat);
	}
	
	

	@Test
	public void testCalculaNroVida() {
		assertEquals(6, calc.calculaNumeroDaVida("07/22/1995"));
	}
	
	@Test
	public void testCalculaNroVidaComExcecao() {
		assertThrows(IllegalArgumentException.class,() -> calc.calculaNumeroDaVida("@J-"));
	}
	
	@Test
	public void testCalculaNroDestino() {
		assertEquals(5, calc.calculaNumeroDestino("John Smit"));
	}
	
	@Test
	public void testCalculaNroDestinoComExcecao() {
		assertThrows(IllegalArgumentException.class,() -> calc.calculaNumeroDestino("@J-"));
	}
	
	@Test
	public void testCalculaNroDesejosAlma() {
		assertEquals(6, calc.calculaNumeroDesejosDaAlma("Jane Smith"));
	}
	
	@Test
	public void testCalculaNroDesejosAlmaComExcecao() {
		assertThrows(IllegalArgumentException.class,() -> calc.calculaNumeroDesejosDaAlma("@J-"));
	}
	
	
	

}
