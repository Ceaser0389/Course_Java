package Exer24_05;

public class exer05 {

	public static void main(String[] args) {
		
		
		ContaCorrente conta = new ContaCorrente(); 
		
		conta.nomeTitular = "Cesar";
		conta.numConta = 123456;
		conta.agencia = 123054;
		conta.digito  = 013;
		conta.especial = false;
		conta.limite = 5000.35;
		conta.LimiteEspecial = 0;
		conta.saldo = 6000.00;
		
		System.out.println("Saldo da conta " + conta.numConta + " = " + conta.saldo);
	  

	}

}
