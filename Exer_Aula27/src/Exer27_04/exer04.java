package Exer27_04;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);	
	
	JogoVelha   velha = new JogoVelha();
	
	 System.out.println("Jogador 1 = X ");
	    System.out.println("Jogador 2 = O ");
	
	    
	    boolean ganhou =false;
	    char  sinal;
	    int linha = 0 , coluna = 0;
		
	    while(!ganhou) {
		
	    	if(velha.vezJogador1()) { 
		    	 System.out.println("Vez do jogador 1. Escolha lina e coluna (1-3");
		    	  sinal  ='X';
		    	}else {
		    	System.out.println("Vez do jogador 2. Escolha lina e coluna (1-3");
		    	  sinal ='O';
		    	}
	    	
	    	linha = valor("Linha" , sc);
	    	coluna =valor("Coluna" , sc);
	    	
	    	velha.validarJogada(linha, coluna, sinal);
	    	
	    	velha.imprimirTabuleiro();
	    	
	    	if(velha.verificarGanhador('X')) {
	    		ganhou = true;
	    		System.out.println("parab�ns, jogador 1 ganhou !");
	    	} else  if(velha.verificarGanhador('O')) {
	    		ganhou = true;
	    		System.out.println("parab�ns, jogador 2 ganhou !");
	    	}else if (velha.jogada > 9) {
	    		ganhou = true;
	    		System.out.println("Ningu�m ganhou essa partida.");
	    	}
	    	 	
	    }   	
	    	
	}

	static int valor(String tipoValor, Scanner sc) {
		int valor = 0;
		boolean valorValido = false;	
    	while(!valorValido) {
    		System.out.println("Entre com a " + tipoValor + " linha (1, 2 ou 3)");
    		 valor = sc.nextInt();
    
    		 if(valor >=1 &&valor <=3) {
    			 valorValido = true;
    		 }else {
    			 System.out.println("Entrada inv�lida , tente novamente");
    		 }
    	}
    	valor--;
    	return valor;
	}
}
