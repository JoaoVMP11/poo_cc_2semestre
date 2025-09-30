package exercicio3agregcomp;

import java.util.ArrayList;

public class Principal {

	
	
	public static void main(String[] args) {
	
		Professor p1 = new Professor();
		p1.setCpf("3948948439583");
		p1.setNome("luis filipe");
		p1.setEspecializacao("T.I");
		
		Professor p2 = new Professor();
		p2.setCpf("24737274828");
		p2.setNome("Carlito");
		p2.setEspecializacao("biblioteconomia");
		
		Departamento d1 = new Departamento();
		d1.setNome("fatecs");
		d1.addProfessor(p1);
		
		Departamento d2 = new Departamento();
		d2.setNome("bibliotecagens");
		d2.addProfessor(p2);
		d2.addProfessor(p1);
		
		ArrayList<Departamento> departamentosU1 = new ArrayList<Departamento>();
		departamentosU1.add(d1);
		
		Universidade u1 = new Universidade("unfg", 1929, departamentosU1);
		
		u1.addDepartamento(d2);
		
		System.out.println(u1.getNome()+" "+ u1.getDepartamentos().get(0).getNome()+" "+ u1.getDepartamentos().get(0).getProfessor().get(0).getNome()+" "
		+ u1.getDepartamentos().get(1).getProfessor().get(0).getEspecializacao());
		
	}

}
