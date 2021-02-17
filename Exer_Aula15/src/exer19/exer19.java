package exer19;

import java.util.Locale;
import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

	System.out.println("Entre com um numero:");
	int num1 = sc.nextInt();
	System.out.println("Entre com outro um numero:");
	int num2 = sc.nextInt();
	
	System.out.println("Entre com a operação: (+ - * /)");
	String operacao = sc.next();
	
	double resultado =0;
	boolean valida = true;
	
	 switch(operacao) {
		  case "+" : resultado = num1 + num2; break;
		  case "-" : resultado = num1 - num2; break;
		  case "*" : resultado = num1 * num2; break;
		  case "/" : resultado = num1 / num2; break;
		  default: System.out.println("oção inválida:"); 
		  valida = false;
	  }
	  
	  if(valida) {
	  System.out.println("Resultado :" + resultado);
		  
		  if(resultado >=0) {
			  System.out.println("Resultado Positivo:");
		  }else {
			  System.out.println("Resultado Positivo:");
		   }
	  
	     if (resultado % 2==0) {
	    	 System.out.println("Resultado  par:");
	     }
	  }
	  
	
	
	}

}
