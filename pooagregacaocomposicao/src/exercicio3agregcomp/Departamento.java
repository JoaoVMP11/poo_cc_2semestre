package exercicio3agregcomp;

import java.util.ArrayList;

public class Departamento {
	private String nome;
	private ArrayList<Professor> professor = new ArrayList<Professor>();
	
	public void addProfessor(Professor professor) {
		this.professor.add(professor);
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Professor> getProfessor() {
		return professor;
	}
	public void setProfessor(ArrayList<Professor> professor) {
		this.professor = professor;
	}

	

}
