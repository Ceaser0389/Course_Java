package exer02;

import java.util.Locale;
import java.util.Scanner;

public class exer02 {

	//declararar variaveis fora dos loops 

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	String nomeUser;
	String senha;
	boolean infoValidas =false;
	   do {
	
			System.out.println("Entre com o nome do usu�rio");
			nomeUser = sc.next();
			
			System.out.println("Entre com a senha do usu�rio");
		    senha = sc.next();
			
			
			if(nomeUser.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual a usu�rio, digite novamente!");
			} else {
				System.out.println("Senha e usu�rios v�lidos!"); 
				 }
		
	} while(!infoValidas);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
}