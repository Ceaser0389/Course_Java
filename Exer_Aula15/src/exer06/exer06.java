package exer06;

import java.util.Locale;
import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);

	int n1, n2,n3;
	
	System.out.println("Entre com 1 numero:");
	n1 =sc.nextInt();
	System.out.println("Entre com 2 numero:");
	n2 =sc.nextInt();
	System.out.println("Entre com 3 numero:");
	n3 =sc.nextInt();
	
	if (n1 > n2 && n1 >n3) {
		System.out.println("O numero maior é n1: "+ n1);
	}
	else if(n1<n2 && n2>n3) {
		System.out.println("O numero maior é n2:"+ n2);
	}
	else if(n3>n1 && n3>n2) {
		System.out.println("O numero maior é n3:"+ n3);
	}
	
	
	
	}

}
