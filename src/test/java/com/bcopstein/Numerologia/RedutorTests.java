package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RedutorTests 
{
	private Redutor pit, cha;
	
	@BeforeEach
	public void inicializa()
	{
		pit = new Redutor(TipoTabela.PITAGORICA);
		cha = new Redutor(TipoTabela.CHALDEAN);
	}
	
	@ParameterizedTest
	@CsvSource({"ABC,6","JOAO,7","KIN,8","LUCAS,7","THIAGO,3"})
	public void reducaoPalavraChaldeanTest(String palavra, int reducao) 
	{
		int resp = cha.reducaoPalavra(palavra);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({})
	public void reducaoPalavraPitagoricaTest() 
	{
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@CsvSource({})
	public void reducaoFraseChaldeanTest() 
	{
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@CsvSource({})
	public void reducaoFrasePitagoricaTest() 
	{
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@CsvSource({})
	public void reducaoDataChaldeanTest() 
	{
		fail("Not yet implemented");
	}
	
	@ParameterizedTest
	@CsvSource({})
	public void reducaoDataPitagoricaTest() 
	{
		fail("Not yet implemented");
	}
}
