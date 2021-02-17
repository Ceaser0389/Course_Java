package exer04;

import java.util.Locale;
import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double n1,n2,n3,n4,media;
		
		System.out.println("ente com 1 nota:");
		n1 =sc.nextDouble();
		System.out.println("ente com 2 nota:");
		n2 =sc.nextDouble();
		System.out.println("ente com 3 nota:");
		n3 =sc.nextDouble();
		System.out.println("ente com 4 nota:");
		n4 =sc.nextDouble();
		
		media =(n1+n2+n3+n4)/4;
		
		System.out.println("A media da nota dos aluno é:"+ media);
		
		
		
		
	}

}
