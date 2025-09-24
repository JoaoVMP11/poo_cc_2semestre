package exercicio1agreg;

import java.util.ArrayList;

public class Biblioteca {

	private String nome;
	private ArrayList<Livro> livro;
	
	public void adicionarLivro(Livro livro) {
		this.livro.add(livro);
	}
	public void removerLivro(Livro livro){
		this.livro.remove(livro);
	}
	
	public ArrayList<Livro> consultaLivros() {
		return livro;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Livro> getLivro() {
		return livro;
	}
	public void setLivro(ArrayList<Livro> livro) {
		this.livro = livro;
	}

	
	
}
