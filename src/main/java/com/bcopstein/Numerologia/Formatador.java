package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

public class Formatador{
	
	public Formatador() {};
    // Formata uma palavra da lingua inglesa
    // A palavra recebida so pode conter letras ou digitos
    // Se a palavra contiver qualquer outro tipo de simbolo deve retornar IllegalArgumentException
    // Se a palavra estiver vazia tambem retorna a excecao
    // Retorna a palavra em maiusculas 
    public String formataPalavra(String palavra){
        boolean verify = false;
        verify = palavra.matches("[a-zA-Z0-9]*");
        if(!verify) {
        	throw new IllegalArgumentException();  
        }
    	return null;
    }

    // Utiliza o metodo formataPalavra e confere se a primeira letra nao e numerica
    public String formataPalavraPlus(String palavra) {
        //TODO
    	return null;
    }

    // Formata frases compostas por palavras separadas por espacos em branco e/ou simbolos de pontuacao
    // Frases vazias geram IllegalArgumentException
    // As palavras da frase devem ser convertidas pelo metodo formataPalavra
    // Qualquer outro simbolo gera IllegalArgumentException
    // Retorna um array de palavras validas 
    public String formataFrase(String frase){
        //TODO
    	return null;
    }
}
