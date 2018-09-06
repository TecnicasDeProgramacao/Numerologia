package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

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
	
	
	@Before
	public void setUp() throws Exception {
		when(mockFormat.formataFrase("John Smit")).thenReturn("JOHN SMIT");
		when(mockRedut.reducaoFrase("JOHN SMIT")).thenReturn(5);
	
		calc = new Calculador(mockRedut,mockFormat);
		
		//carrinho.addItem(new Produto("CPU I7",2.0,450), 1);  // 450 + 2 = 452
		//carrinho.addItem(new Produto("Monitor",3.0,120), 1); // 120 + 3 = 123
		//carrinho.addItem(new Produto("Celular",0.67,200), 25); // 5000 + 0 = 5000
	}
	
	

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
