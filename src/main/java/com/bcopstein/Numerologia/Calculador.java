package com.bcopstein.Numerologia;

// Todos os metodos geram IllegalArgumentException em caso de caracter ilegal
public class Calculador{
    private FormatadorInterface formatador;
    private InterfaceRedutor reducao;

    // Recebe o redutor e o formatador a serem usados em todos os calculos
    // por injecao de dependencia
    public Calculador(InterfaceRedutor reducao, FormatadorInterface formatador){
        this.reducao =  reducao;
        this.formatador = formatador;
    }

    public int calculaNumeroDaVida(String data) {
    	return reducao.reducaoData(data);
    
    }

    public int calculaNumeroDestino(String nomeCompleto){
       
       nomeCompleto = formatador.formataFrase(nomeCompleto);
       return reducao.reducaoFrase(nomeCompleto);
        
    }

    public int calculaNumeroDesejosDaAlma(String nomeCompleto){
    	
     	nomeCompleto = formatador.formataFrase(nomeCompleto);
    	int numero = 0;
    	for(int i = 0; i< nomeCompleto.length(); i++) {
    		switch(nomeCompleto.charAt(i)) {
    		case 'A': numero += 1; break;
    		case 'E': numero += 5; break;
    		case 'I': numero += 9; break;
    		case 'O': numero += 6; break;
    		case 'U': numero += 3; break;
    		default: break; 
    		}
    	}
        if(numero % 9 == 0) return 9;
        else return numero % 9;
    }
}