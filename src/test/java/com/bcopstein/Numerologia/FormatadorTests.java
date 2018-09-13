package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FormatadorTests {
	private Formatador f;
	
	@BeforeEach
	public void initial() {
		f = new Formatador();
	}
	
	@ParameterizedTest
	@CsvSource({"teste1,TESTE1","testar23, TESTAR23", "SemNumero, SEMNUMERO", "15225, 15225", "FoRadeCoNFIg, FORADECONFIG", "1PorNum, 1PORNUM"})
	public void testFormataPalavra(String p, String format) 
	{		
		String ret = f.formataPalavra(p);
		assertEquals(ret, format);
	}
	
	@ParameterizedTest
	@CsvSource({"teste@falso", "!dd", "fINALExepTion#$test"})
	public void testFormataPalavraExeption(String p) 
	{				
		assertThrows(IllegalArgumentException.class,() -> f.formataPalavra(p));
	}

	@ParameterizedTest
	@CsvSource({"teste1,TESTE1","testar23, TESTAR23", "randomteste123, RANDOMTESTE123"})
	public void testFormataPalavraPlus(String p, String format) {
		String ret = f.formataPalavraPlus(p);
		assertEquals(ret, format);
	}
	
	@ParameterizedTest
	@CsvSource({"teste@falso", "!dd", "fINALExepTion#$test", "8FIRSTnUM", "5tartT0S33"})
	public void testFormataPalavraPlusExeption(String p) 
	{				
		assertThrows(IllegalArgumentException.class,() -> f.formataPalavraPlus(p));
	}
	
	
	@ParameterizedTest
	@CsvSource({"teste1,TESTE1", "vou so testar, VOU SO TESTAR", 
		"Tres tigres! comem 3 pratos. De trigo, TRES TIGRES COMEM 3 PRATOS DE TRIGO",
		"dividindo:palavras/com?sinais!de;pontuacao, DIVIDINDO PALAVRAS COM SINAIS DE PONTUACAO"})
	public void testFormataFrase(String p, String format) {
		String ret = f.formataFrase(p);
		assertEquals(ret, format);
	}
	
	@ParameterizedTest
	@CsvSource({"teste@falso", "!dd", "fINALExepTion#$test","dividindo:palavras/com?sinais!de;pontuação",
		})
	public void testFormataFraseExeption(String p) 
	{				
		assertThrows(IllegalArgumentException.class,() -> f.formataFrase(p));
	}
	@ParameterizedTest
	@CsvSource({"teste@falso", "!dd", "fINALExepTion#$test","dividindo:palavras/com?sinais!de;pontuação",
		})
	public void testFraseVazia(String p) 
	{				
		assertThrows(IllegalArgumentException.class,() -> f.formataFrase(new String()));
	}
}
