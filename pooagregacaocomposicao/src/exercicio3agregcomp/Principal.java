package exercicio3agregcomp;

public class Principal {

	public static void main(String[] args) {
	
		Professor p1 = new Professor();
		p1.setCpf("3948948439583");
		p1.setNome("luis filipe");
		p1.setEspecializacao("T.I");
		
		Departamento d1 = new Departamento();
		d1.setNome("fatecs");
		d1.setProfessor(p1);
		
		Universidade u1 = new Universidade("unfg", 1929, d1);
		
		System.out.println(u1.getNome()+" "+ u1.getDepartamento().getNome()+" "+ u1.getDepartamento().getProfessor().getNome()+" "+ u1.getDepartamento().getProfessor().getEspecializacao());
		
	}

}
