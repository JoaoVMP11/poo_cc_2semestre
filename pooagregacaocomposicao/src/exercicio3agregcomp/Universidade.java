package exercicio3agregcomp;

import java.util.ArrayList;

public class Universidade {
	
	private String nome;
	private int anoFundacao;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public Universidade (String nome, int anoFundacao, ArrayList<Departamento> departamentos) {
		
		this.nome = nome;
		this.anoFundacao = anoFundacao;
		this.departamentos = departamentos;
	}

	public void addDepartamento(Departamento departamento) {
		this.departamentos.add(departamento);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(ArrayList<Departamento> departamentos) {
		this.departamentos = departamentos;
	}


	
}
