package exer13;

import java.util.Locale;
import java.util.Scanner;

public class exer13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

	int diaSemana;
	System.out.println("Entre com um numero:");
	diaSemana=sc.nextInt();
	
	 if(diaSemana ==1) {
		 System.out.println("O dia da semana é Domingo!");
	 	}
	 else if(diaSemana ==2) {
		 System.out.println("O dia da semana é Segunda!");
	 	}
	 else if(diaSemana ==3) {
		 System.out.println("O dia da semana é Terça!");
	 	}
	 else if(diaSemana ==4) {
		 System.out.println("O dia da semana é Quarta!");
	 	}
	 else if(diaSemana ==5) {
		 System.out.println("O dia da semana é quinta!");
	 	}
	 else if(diaSemana ==6) {
		 System.out.println("O dia da semana é Sexta!");
	 	}
	 else if(diaSemana ==7) {
		 System.out.println("O dia da semana é Sabado!");
	 	}
	
	
	
	
	
	}

}
