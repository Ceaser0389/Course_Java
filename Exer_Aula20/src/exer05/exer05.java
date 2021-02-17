package exer05;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
	    String [][][] compromissos = new String [31][25][8];
		
	    boolean sair = false;
	    byte opcao;
	    
	    while(!sair) {
	    	
	    	System.out.println("Digite  1 para adicionar compromisso.");
	    	System.out.println("Digite  2 para verificar compromisso.");
	    	System.out.println("Digite  0 para sair compromisso.");
	    	
	    	opcao = sc.nextByte();
	    	
	    	if(opcao ==1) {
	    		
	    		boolean  mesValido = false;
	    		int mes =0;
	    		while(!mesValido){
	    		System.out.println("Entre com  o  Mês");
	    		 mes =sc.nextInt();
	    		 if(mes > 0 && mes<= 12){
	    			 mesValido =true;
	    		 }else {
	    			 System.out.println("Mês inválido , digite novamente ");
	    		  }
	    		}
	    		
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
	    		 if(hora >= 0 && hora<= 8){
	    			 horaValida =true;
	    		 }else {
	    			 System.out.println("Hora inválida , digite novamente ");
	    		   }
	    		}
	    		mes--;
	    	    dia--;
	    		System.out.println("Digite o compromisso");
	    		compromissos[mes][dia][hora] = sc.next();
	    
	    		
	    	}else if (opcao==2) {
	    		
	    		boolean  mesValido = false;
	    		int mes =0;
	    		while(!mesValido){
	    		System.out.println("Entre com  o  Mês");
	    		 mes =sc.nextInt();
	    		 if(mes > 0 && mes<= 12){
	    			 mesValido =true;
	    		 }else {
	    			 System.out.println("Mês inválido , digite novamente ");
	    		  }
	    		}
	    		
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
	    		 if(hora >= 0 && hora<= 8){
	    			 horaValida =true;
	    		 }else {
	    			 System.out.println("Hora inválida , digite novamente ");
	    		   }
	    		}
	    		mes--;
	    	    dia--;
	            System.out.println(" O compromisso agendado  e´:");
	    		System.out.println(compromissos[mes][dia] [hora]);
	    		compromissos[mes][dia][hora] = sc.next();
	    	    
	    		
		    		
	    	}
	    	else if (opcao ==0) {
	    			
	    	}else {
	    		System.out.println("Opção inválida digite novamente");
	    	}
	    }
	}

}
