package exer35;

import java.util.Locale;
import java.util.Scanner;

public class exer35 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);
	Locale.setDefault(Locale.US);	
		
	System.out.println("Digite o valor de n :");
	int n = sc.nextInt();
	double soma =0;
	for(int i=1 ,j=1; i<=n ; i++ , j+=2) {
		
		System.out.println(i + "/" + j + " + ");
		
		soma+= i/j;
		
		

	}
 }
}
