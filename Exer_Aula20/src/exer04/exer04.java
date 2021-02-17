package exer04;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	    String [][] compromissos = new String [31][24];
		
	    boolean sair = false;
	    byte opcao;
	    
	    while(!sair) {
	    	
	    	System.out.println("Digite  1 para adicionar compromisso.");
	    	System.out.println("Digite  2 para verificar compromisso.");
	    	System.out.println("Digite  0 para sair compromisso.");
	    	
	    	opcao = sc.nextByte();
	    	
	    	if(opcao ==1) {
	    		boolean  diaValido = false;
	    		int dia =0;
	    		while(!diaValido){
	    		System.out.println("Entre com  o dia do Mês");
	    		 dia =sc.nextInt();
	    		 if(dia > 0 && dia<= 31){
	    			 diaValido =true;
	    		 }else {
	    			 System.out.println("Dia inválido , digite novamente ");
	    		  }
	    		}
	    		
	    		boolean  horaValida = false;
	    		int hora =0;
	    		while(!horaValida){
	    		System.out.println("Entre com a hora do compromisso");
	    		 hora =sc.nextInt();
	    		 if(hora >= 0 && hora<= 24){
	    			 horaValida =true;
	    		 }else {
	    			 System.out.println("Hora inválida , digite novamente ");
	    		   }
	    		}
	    		
	    	
	    		System.out.println("Digite o compromisso");
	    		compromissos[dia][hora] = sc.next();
	    
	    	}else if (opcao==2) {
		    	
	    		boolean  diaValido = false;
	    		int dia =0;
	    		while(!diaValido){
	    		System.out.println("Entre com  o dia do Mês");
	    		 dia =sc.nextInt();
	    		 if(dia > 0 && dia<= 31){
	    			 diaValido =true;
	    		 }else {
	    			 System.out.println("Dia inválido , digite novamente ");
	    		  }
	    		}
	    		
	    		boolean  horaValida = false;
	    		int hora =0;
	    		while(!horaValida){
	    		System.out.println("Entre com a hora do compromisso");
	    		 hora =sc.nextInt();
	    		 if(hora >= 0 && hora<= 24){
	    			 horaValida =true;
	    		 }else {
	    			 System.out.println("Hora inválida , digite novamente ");
	    		   }
	    		}
	    		
	            System.out.println(" O compromisso agendado  e´:");
	    		System.out.println(compromissos[dia] [hora]);
	    		compromissos[dia] [hora] = sc.next();
	    	    
	    		
		    		
	    	}
	    	else if (opcao ==0) {
	    			
	    	}else {
	    		System.out.println("Opção inválida digite novamente");
	    	}
	    }
	    		
	    		
	    		
	    		
	 
	    

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
