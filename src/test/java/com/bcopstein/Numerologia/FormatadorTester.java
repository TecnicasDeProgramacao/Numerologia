package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
class FormatadorTester {
	
	@Test
	@Parameters({"teste1,TESTE1", "tester23, TESTAR23"})
	public void testFormataPalavra(String p, String format) {
		Formatador f = new Formatador();
		//boolean ver = f.formataPalavra(param);				
		String ret = f.formataPalavra(p);
		assertEquals(ret, format);
		//fail("Not yet implemented");
	}

	@Test
	void testFormataPalavraPlus() {
		fail("Not yet implemented");
	}

	@Test
	void testFormataFrase() {
		fail("Not yet implemented");
	}

}
