package exer01;

import java.util.Locale;
import java.util.Scanner;

public class exer01 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
    Locale.setDefault(Locale.US);
	
     boolean notaValida = true;
    
    
	 System.out.println("entre com uma nota:");
	 double nota = sc.nextDouble();
	
	 if(nota >=0 && nota <=10) {
		  notaValida =true;
		 System.out.println("Voce digitou:" + nota);
	 }else {
		 System.out.println("Nota inválida, digite novamente" + nota);
	 }
	 
	 while(!notaValida);
	 
	 
	}

}
