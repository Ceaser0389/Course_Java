package exer21;

import java.util.Locale;
import java.util.Scanner;

public class exer21 {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner (System.in);
      Locale.setDefault(Locale.US);
      
      System.out.println("Entre com o numero de turmas:");
      int numTurmas = sc.nextInt();
      
      int numAlunos;
      int soma =0;
      boolean invalido = false;
      
      for ( int i=1 ; i<=numTurmas ; i++ ) {
    	
    	 invalido = true;
    	 do { 
    	  System.out.println("Entre com o numero de alunos da turma: " + i);
    	  numAlunos = sc.nextInt();
    	  
	    	  if (numAlunos <= 40 ) {
	    		 invalido = false; 
	    	  	}else {
	    	  		System.out.println("Numero de alunos inválido digite novamente");
	    	  	}
    	 }while (invalido);
    	 
    	 soma += numAlunos;
    	 
      }
      
      double media  = soma /numTurmas;
      
      System.out.println("Média:" + media);
      
      
      
      
      
      

	}

}
