package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

public class Formatador implements FormatadorInterface{
	
	public Formatador() {};
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.FormatadorInterface#formataPalavra(java.lang.String)
	 */
    @Override
	public String formataPalavra(String palavra){
        boolean verify = false;
        if(palavra.isEmpty()){
        	throw new IllegalArgumentException();
        }
        verify = palavra.matches("[a-zA-Z0-9]*");
        if(!verify) {
        	throw new IllegalArgumentException();  
        }        
        return palavra.toUpperCase();
    	//return null;
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.FormatadorInterface#formataPalavraPlus(java.lang.String)
	 */
    @Override
	public String formataPalavraPlus(String palavra) {
        if(Character.isDigit(palavra.charAt(0))){
        	throw new IllegalArgumentException();
        }
    	return formataPalavra(palavra);
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException    
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.FormatadorInterface#formataFrase(java.lang.String)
	 */
    @Override
	public String formataFrase(String frase){
    	if(frase.isEmpty()){
        	throw new IllegalArgumentException();
        }
    	String[] strArray = frase.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*]+");
    	String ret = new String();
    	for(int i=0; i< strArray.length; i++) 
    	{
    		strArray[i] = formataPalavra(strArray[i]);
    		if((i + 1) < strArray.length) {
    			ret = ret + strArray[i] + " ";
    		}
    		else {
    			ret = ret + strArray[i];
    		}
    	}
    	
    	return ret;
    }
}
