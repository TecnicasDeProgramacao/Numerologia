package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
class RedutorTester {

	@BeforeEach
	public void inicializa()
	{
		Redutor pit = new Redutor(TipoTabela.PITAGORICA);
		Redutor cha = new Redutor(TipoTabela.CHALDEAN);
	}
	
	@Test
	@Parameters({})
	void reducaoPalavraTest() {
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	void reducaoFraseTest() {
		fail("Not yet implemented");
	}
	
	@Test
	@Parameters({})
	void reducaoDataTest() {
		fail("Not yet implemented");
	}

}
