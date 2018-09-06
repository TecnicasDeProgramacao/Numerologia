package com.bcopstein.Numerologia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaParam {

	@Test
	void test() {
		Formatador f = new Formatador();
		String ret = f.formataPalavra("teste");
		assertEquals(ret, "TESTE");
	}

}
