package exer20;

import java.util.Locale;
import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	

    System.out.println("Telefonou para a v�tima?");
	String resp1 =sc.next();
	System.out.println("Esteve no local do crime?");
	String resp2 =sc.next();
	System.out.println("Mora perto da v�tima?");
	String resp3 =sc.next();
	System.out.println("Devia para a v�tima?");
	String resp4 =sc.next();
	System.out.println("J� trabalhou com a v�tima");
	String resp5 =sc.next();
	
	int cont =0;
	
	if(resp1.equalsIgnoreCase("S")){
		cont++;
	}
	if(resp2.equalsIgnoreCase("S")){
		cont++;
	}
	if(resp3.equalsIgnoreCase("S")){
		cont++;
	}
	if(resp4.equalsIgnoreCase("S")){
		cont++;
	}
	if(resp5.equalsIgnoreCase("S")){
		cont++;
	}
	
	if( cont == 2){
		System.out.println("Suspeita");
	}else if(cont ==3 || cont ==4) {
		System.out.println("C�mprice");
	}else if(cont == 5) {
		System.out.println("Assassino !");
	}else if(cont == 0) {
		System.out.println("Inocente!");
	}
	
	
	
	
	
	
	}

}
