package aula24092025;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Livro> livros;
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	public void removerLivro(Livro livro){
		this.livros.remove(livro);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Livro> getLivros() {
		return livros;
	}
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
	
}
