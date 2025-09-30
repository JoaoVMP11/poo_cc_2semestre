package exercicio1agreg;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.setTitulo("livro generico 123");
		l1.setAutor("fulano silva");
		l1.setAnoPublicacao(1456);
		
		Livro l2 = new Livro();
		l2.setTitulo("hahahha");
		l2.setAutor("roger");
		l2.setAnoPublicacao(1999);
		
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("genrica");
		b1.adicionarLivro(l1);
		b1.adicionarLivro(l2);
		
		String autor = "";
		for (Livro livro : b1.getLivro() ) {
			autor = livro.getAutor();
			System.out.println(autor);
			
		}
		
		
	}
	
}
