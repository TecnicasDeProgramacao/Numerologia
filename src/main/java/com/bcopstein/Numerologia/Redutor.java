package com.bcopstein.Numerologia;

import java.util.regex.Pattern;

// Todas as palavras so podem conter letras maiusculas nao acentudas e digitos
// Todas as frases devem ser formadas por palavras separadas por um espaco em branco cada
// As datas devem seguir o formato dd/mm/aaaa
// Qualquer quebra destas regras deve retornar "IllegalArgumentExpression"
//
// Veja os tipos de tabelas na wiki do projeto
public class Redutor implements InterfaceRedutor
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
    	String res = str;
    	int soma = 0;
    	while(res.length() > 1)
    	{
    		soma = 0;
    		for(int i = 0; i < res.length(); i++)
    		{
    			soma += res.charAt(i);
    		}
    		res = Integer.toString(soma);
    	}
    	return res;
    }

    // Define o tipo de tabela da tabela corrente
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.InterfaceRedutor#setTipoTabela(com.bcopstein.Numerologia.TipoTabela)
	 */
    @Override
	public void setTipoTabela(TipoTabela tipo)
    {
        tipoTab = tipo;
    }

    // Calcula a reducao de palavra usando a tabela corrente
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.InterfaceRedutor#reducaoPalavra(java.lang.String)
	 */
    @Override
	public int reducaoPalavra(String palavra)
    {
    	int soma = 0;
    	String reduzido = "";
        for(int i = 0; i < palavra.length(); i++)
        {
        	reduzido += decodChar(palavra.charAt(i));
        }
        reduzido = reducaoSimples(reduzido);
        return Integer.parseInt(reduzido);
    }

    // Calcula a reducao de frase usando a tabela corrente
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.InterfaceRedutor#reducaoFrase(java.lang.String)
	 */
    @Override
	public int reducaoFrase(String frase)
    {
        String[] split = frase.split(" ");
        int soma = 0;
        for(String str: split)
        {
        	soma += this.reducaoPalavra(str);
        }
        String s = Integer.toString(soma);
        s = this.reducaoSimples(s);
        return Integer.parseInt(s);
    }

    // Calcula a reducao de uma data no formato dd/mm/aaaa
    // Se estiver fora do formato lanca IllegalArgumentException
    /* (non-Javadoc)
	 * @see com.bcopstein.Numerologia.InterfaceRedutor#reducaoData(java.lang.String)
	 */
    @Override
	public int reducaoData(String data)
    {
        String[] split = data.split("/");
        String all = "";
        for(String str: split)
        {
        	all += str;
        }
        return Integer.parseInt(this.reducaoSimples(all));
    }
}