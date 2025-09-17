package exercicio1agreg;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		l1.setTitulo("livro generico 123");
		l1.setAutor("fulano silva");
		l1.setAnoPublicacao(1456);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("genrica");
		b1.setLivro(l1);
		
		System.out.println(b1.getLivro().getTitulo());
	}
	
}
