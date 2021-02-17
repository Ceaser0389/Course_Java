package exer25;

import java.util.Locale;
import java.util.Scanner;

public class exer25 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);	
		//System.out.println("Lojas Tabajara");
				 
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		do {
			System.out.println("Deseja informar uma nova compra ?  S/N ");
			continuarCompra = sc.next();
				
			if (continuarCompra.equalsIgnoreCase("S")) {
					
					output = " Lojas Tabajara\n ";
					
					System.out.println("Digite a quantidade de produtos da compra:");
					qtdProdutos =sc.nextInt();
					
					total =0;
					
					for (int i=1 ; i<=qtdProdutos ; i++) {
						System.out.println(" Informe opreço do produto " + i);
						preco = sc.nextDouble();
					    
						total +=preco;
						output = "Produto" + i + ": R$" + preco + "\n" ;
						
					}
					
					output += "Total: R$" + total;
					
					System.out.println(" Total: R$ " + total);
					
					System.out.println(" Entre com o valor pago: ");
					valorPago = sc.nextDouble();
					
					output += " Dinheiro: R$ " + valorPago + "\n";
					
					troco = total - valorPago;
					
					output = "Troco: R$ " + troco;
					
					System.out.println(output);
					
				}else {
					
					sair = true;
				}	
			
		}while(!sair);

	}

}
