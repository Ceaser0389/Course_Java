package exer03;

import java.util.Locale;
import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	String  nome;
	int idade;
	double salario;
	String sexo,estadoCivil;
	
	boolean infoValida= false;
	
	do {
		System.out.println("Entre com o nome:");
		 nome= sc.next();
		
		if( nome.length() >=3) {
			infoValida =true;
		}else {
			System.out.println("Nome no minimo precisa de 3 caracteres:");
		}
		
	} while(!infoValida);
	
	  infoValida = true;
	 
	  do {
	  System.out.println("Entre com o a idade :");
		 idade= sc.nextInt();
		
			if(  idade > 0 && idade <= 150) {
				infoValida =true;
			}else {
				System.out.println(" A idade precisa  ser entre 0 a 150.");
				} 
	  }while(!infoValida);
	  
	  
	  infoValida = false;
		 
	  do {
	  System.out.println("Entre com o  salário:");
		 salario= sc.nextDouble();
		
			if( salario > 0) {
				infoValida =true;
			}else {
				System.out.println(" A  salário precisa  ser maior que 0.");
				} 
	  }while(!infoValida);
	  
	  do {
		  System.out.println("Entre com o  sexo:");
			 sexo= sc.next();
			
				if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
					infoValida =true;
				}else {
					System.out.println(" sexo precisa ser  'f' ou 'm'.");
					} 
		  }while(!infoValida);
	  
	  do {
		  System.out.println("Entre com o Estado civil :");
			 estadoCivil= sc.next();
			
				if( estadoCivil.equalsIgnoreCase("S") ||  estadoCivil.equalsIgnoreCase("C")
						||estadoCivil.equalsIgnoreCase("V")|| estadoCivil.equalsIgnoreCase("D")) {
					infoValida =true;
				}else {
					System.out.println(" O estado civil precisa ser 'S' , 'C' , 'D' , 'V' ");
					} 
		  }while(!infoValida);
	 
	  System.out.println("As seguintes informações foram coletadas ");
	  System.out.println("Nome " + nome);
	  System.out.println("Idade " + idade);
	  System.out.println("Salario " + salario);
	  System.out.println("Sexo " + sexo);
	  System.out.println("EstadoCivil " + estadoCivil);
	  
	  
	  }
	}


