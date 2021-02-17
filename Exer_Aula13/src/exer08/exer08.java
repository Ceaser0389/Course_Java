package exer08;

import java.util.Locale;
import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

		double vHora,horaTrab,salMes;
		
		System.out.println("entre com o total de horas trabalhadas");
		horaTrab =sc.nextDouble();
		System.out.println("entre com o valor que voce ganha por(hora)");
		vHora =sc.nextDouble();
		
		
		salMes =horaTrab*vHora;
		
		System.out.println("O seu salário mensal é:"+ salMes);
		
		
	}

}
