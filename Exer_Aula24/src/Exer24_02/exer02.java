package Exer24_02;

public class exer02 {

	public static void main(String[] args) {
	
		
	 Livro livro = new Livro ();
	 
	 livro.titulo = "Alice no pais das maravilhas";
	 livro.anoPublicacao = 1965;
	 livro.autor  = "césar";
	 livro.genero = "Aventura";
	 livro.garantiaMes = 2;
	 livro.edicao = "2 eidição atualizada";
	 livro.preco = 29.90;
	 livro.qtd = 100;
	 livro.qtdPaginas = 500;
	 livro.tipos = new String[2];
	 livro.tipos[0] = "Tamanho grande ";
	 livro.tipos[1]  = "Tamanho pequeno";
	 
	 
	 System.out.println(livro.autor);
	 
	 

	}

}
