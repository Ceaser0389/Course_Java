package exer09;

import java.util.Locale;
import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		for(int i=1 ; i<50 ; i++) {
		 
			if (i % 2 != 0) {
			System.out.println(i);	 
			 }
		}
	}

}
