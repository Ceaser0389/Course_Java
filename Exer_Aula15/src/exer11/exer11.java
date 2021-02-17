package exer11;

import java.util.Locale;
import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double salario,percentual=0;
		
		System.out.println("Informe salário do colaborador:");
		salario = sc.nextDouble();
		
		if(salario <= 280.00) {
			percentual =20;
		}else if(salario > 280.00 && salario <= 700.00) {
			percentual = 15;
		}else if(salario > 700.00 && salario <= 1500.00) {
			percentual = 10;
		}else if(salario >= 1500.00) {
			percentual = 5;
		}
		
       double  aumento = (salario/100)*percentual;
       double salarioAjustado = salario+aumento;
       
       System.out.println("Salario " +salario);
       System.out.println("percentual "+percentual);
       System.out.println("aumento " +aumento);
       System.out.println("Salario Ajustado " +salarioAjustado);
       
	}

}
