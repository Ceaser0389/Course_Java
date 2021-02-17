package Exer27_02;

import javax.sound.midi.Soundbank;

public class exer02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new  ContaCorrente();
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		
		if(saqueEfetuado) {
			System.out.println("Saque efetuado  com sucesso !");
			conta.consultarSaldo();
		}else {
			System.out.println("Não foi possivel realizar saque. saldo insuficiente  ");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		if(saqueEfetuado) {
		System.out.println("Saque efetuado  com sucesso !");
		conta.consultarSaldo();
		}else {
		System.out.println("Não foi possivel realizar saque. saldo insuficiente  ");
	}
		
		System.out.println("Depósito de 500 reias:");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if ( conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial !");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
		
		
		
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if ( conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial !");
		}else {
			System.out.println("Não esta usando cheque especial");
		}
		
		
	}

}
