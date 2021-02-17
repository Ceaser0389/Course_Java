package Exer24_04;

import java.sql.Date;

public class exer04 {

	public static void main(String[] args) {
		
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.titulo = "god father";
		livro.anoPublicacao = 1960;
		livro.edicao =2015;
		livro.autor = " mario puzo";
		livro.qtdPaginas = 600;
		livro.conservacaoLivro = "Novo";
		livro.idade = 30;
		livro.conservacaoLivro =" novo";
		livro.rg = 46453892-0;
		livro.emprestado = true;
		livro.dataEntrega = new Date(0);
	    livro.emprestadoA ="Cesar";

	}

}
