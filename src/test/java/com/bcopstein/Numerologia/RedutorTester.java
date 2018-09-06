package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
class RedutorTester 
{

	@BeforeEach
	public void inicializa()
	{
		Redutor pit = new Redutor(TipoTabela.PITAGORICA);
		Redutor cha = new Redutor(TipoTabela.CHALDEAN);
	}
	
	@Test
	@Parameters({"ABC"})
	public void reducaoPalavraChaldeanTest() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({"ABC"})
	public void reducaoPalavraPitagoricaTest() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	public void reducaoFraseChaldeanTest() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	public void reducaoFrasePitagoricaTest() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	public void reducaoDataChaldeanTest() 
	{
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	public void reducaoDataPitagoricaTest() 
	{
		fail("Not yet implemented");
	}

}
