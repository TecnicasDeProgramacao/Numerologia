package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

// Todas as palavras so podem conter letras maiusculas nao acentudas e digitos
// Todas as frases devem ser formadas por palavras separadas por um espaco em branco cada
// As datas devem seguir o formato dd/mm/aaaa
// Qualquer quebra destas regras deve retornar "IllegalArgumentExpression"
//
// Veja os tipos de tabelas na wiki do projeto
public class Redutor
{
    private TipoTabela tipoTab;

    public Redutor(TipoTabela tipo)
    {
        this.setTipoTabela(tipo);
    }

    // Decodifica um caracter segundo a tabela Pitagorica
    private int tabPitagorica(char c)
    {
        switch(c){
            case 'A':
            case 'J':
            case 'S':
                return(1);
            case 'B':
            case 'K':
            case 'T':
                return(2);
            case 'C':
            case 'L':
            case 'U':
                return(3);
            case 'D':
            case 'M':
            case 'V':
                return(4);
            case 'E':
            case 'N':
            case 'W':
                return(5);
            case 'F':
            case 'O':
            case 'X':
                return(6);
            case 'G':
            case 'P':
            case 'Y':
                return(7);
            case 'H':
            case 'Q':
            case 'Z':
                return(8);
            case 'I':
            case 'R':
                return(9);
            default:
                throw new IllegalArgumentException("Caracter: "+c);
        }
    }

    // Decodifica um caracter segundo a tabela Chaldean
    private int tabChaldean(char c)
    {
        switch(c){
            case 'A':
            case 'I':
            case 'J':
            case 'Q':
            case 'Y':
                return(1);
            case 'B':
            case 'K':
            case 'R':
                return(2);
            case 'C':
            case 'G':
            case 'L':
            case 'S':
                return(3);
            case 'D':
            case 'M':
            case 'T':
                return(4);
            case 'E':
            case 'H':
            case 'N':
            case 'X':
                return(5);
            case 'U':
            case 'V':
            case 'W':
                return(6);
            case 'O':
            case 'Z':
                return(7);
            case 'F':
            case 'P':
                return(8);
            default:
                throw new IllegalArgumentException("Caracter: "+c);
        }
    }

    // Decodifica um caracter segundo a tabela selecionada
    private int decodChar(char c)
    {
    	int code = 0;
    	if(this.tipoTab == TipoTabela.CHALDEAN)
    	{
    		code = this.tabChaldean(c);
    	}
    	else
    	{
    		code = this.tabPitagorica(c);
    	}
        return code;
    }

    private String reducaoSimples(String str)
    {
        //TODO
        return null;
    }

    // Define o tipo de tabela da tabela corrente
    public void setTipoTabela(TipoTabela tipo)
    {
        tipoTab = tipo;
    }

    // Calcula a reducao de palavra usando a tabela corrente
    public int reducaoPalavra(String palavra)
    {
        //TODO
        return 0;
    }

    // Calcula a reducao de frase usando a tabela corrente
    public int reducaoFrase(String frase)
    {
        //TODO
        return 0;
    }

    // Calcula a reducao de uma data no formato dd/mm/aaaa
    // Se estiver fora do formato lanca IllegalArgumentException
    public int reducaoData(String data)
    {
        //TODO
        return 0;
    }
}