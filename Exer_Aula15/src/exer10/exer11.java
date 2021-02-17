package exer10;

import java.util.Locale;
import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);
	
	
	System.out.println("Entre com o turno que voê estuda: ");
	String turno = sc.nextLine();
	
		switch(turno) {
		case "m":
		case "M":System.out.println("Bom dia!");break;
		case "v":
		case "V":System.out.println("Boa Tarde!");break;
		case "n":
		case "N":System.out.println("Boa Noite!");break;
		default:System.out.println("valor inválido!"); break;
		
		
		
		}
	
	
	
	
	}

}
