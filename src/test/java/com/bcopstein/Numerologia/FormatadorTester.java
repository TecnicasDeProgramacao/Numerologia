package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;

import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
class FormatadorTester {
	
	@Test
	@Parameters({"teste1,true", "teste@@2$!,false",})
	void testFormataPalavra(String param, Boolean ret) {
		Formatador f = new Formatador();
		boolean ver = f.formataPalavra(param);
		assertEquals(ver, ret);		
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
