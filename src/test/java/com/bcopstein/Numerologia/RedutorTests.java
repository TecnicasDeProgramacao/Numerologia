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
	@CsvSource({"ABC,6","JOAO,7","KIN,8","LUCAS,7","THIAGO,3","BERNARDO,1"})
	public void reducaoPalavraChaldeanTest(String palavra, int reducao) 
	{
		int resp = cha.reducaoPalavra(palavra);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({"ABC,6","JOAO,5","KIN,7","LUCAS,2","THIAGO,6","BERNARDO,5"})
	public void reducaoPalavraPitagoricaTest(String palavra, int reducao) 
	{
		int resp = pit.reducaoPalavra(palavra);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({"A CASA CAIU,2","EU SOU SEU PAI,6","CUM ON FEEL THE NOIZE,4","WE WILL ROCK YOU,7","YOU REALLY GOT ME,7","BACK IN BLACK,7"})
	public void reducaoFraseChaldeanTest(String frase, int reducao) 
	{
		int resp = cha.reducaoFrase(frase);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({"A CASA CAIU,5","EU SOU SEU PAI,8","CUM ON FEEL THE NOIZE,7","WE WILL ROCK YOU,3","YOU REALLY GOT ME,5","BACK IN BLACK,6"})
	public void reducaoFrasePitagoricaTest(String frase, int reducao) 
	{
		int resp = pit.reducaoFrase(frase);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({"08/09/1998,8","31/10/1961,4","05/11/1965,1","17/11/1979,9","26/10/1985,5","12/11/1955,7"})
	public void reducaoDataTest(String data, int reducao) 
	{
		int resp = cha.reducaoData(data);
		assertEquals(resp, reducao);
	}
	
	@ParameterizedTest
	@CsvSource({"shAHJ", "%$Ha", "ab545A", "8FIRSTnUM", "5tartT0S33", "ks*¨7987aA"})
	public void illegalArgumenteExceptionReducaoPalavraChaldeanTest(String palavra) 
	{				
		assertThrows(IllegalArgumentException.class,() -> cha.reducaoPalavra(palavra));
	}
	
	@ParameterizedTest
	@CsvSource({"shAHJ", "%$Ha", "ab545A", "8FIRSTnUM", "5tartT0S33", "ks*¨7987aA"})
	public void illegalArgumenteExceptionReducaoPalavraPitacoricaTest(String palavra) 
	{				
		assertThrows(IllegalArgumentException.class,() -> pit.reducaoPalavra(palavra));
	}
	
	@ParameterizedTest
	@CsvSource({"shAHJ ASSsrf", "%$Ha *&YHUu (*gh", "ab545A (*&ä s", "8FIRSTnUM )(&ys sa", "5tartT0S33 as1564 -/", "ks*¨7987aA sas (* 45"})
	public void illegalArgumenteExceptionReducaoFraseChaldeanTest(String palavra) 
	{				
		assertThrows(IllegalArgumentException.class,() -> cha.reducaoPalavra(palavra));
	}
	
	@ParameterizedTest
	@CsvSource({"shAHJ ASSsrf", "%$Ha *&YHUu (*gh", "ab545A (*&ä s", "8FIRSTnUM )(&ys sa", "5tartT0S33 as1564 -/", "ks*¨7987aA sas (* 45"})
	public void illegalArgumenteExceptionReducaoFrasePitacoricaTest(String palavra) 
	{				
		assertThrows(IllegalArgumentException.class,() -> pit.reducaoPalavra(palavra));
	}
}
