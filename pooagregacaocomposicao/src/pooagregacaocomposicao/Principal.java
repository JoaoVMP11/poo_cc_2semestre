package pooagregacaocomposicao;

public class Principal {
	
	public static void main(String[] args) {
		
		String a1Nome = "Jose Castro";
		String a1RA= "6161627";
		
		
		Endereco end1 = new Endereco();
		end1.setLogradouro("quadra 101 lote 3");
		end1.setCep("10380942");
		end1.setNumero(3);
	
		
		
		Aluno a1 = new Aluno(a1Nome, a1RA, end1);

		

		

		
		System.out.println(a1.getNome() + " - " + a1.getRa()+ " - " + a1.getEndereco().getLogradouro());
	}

}
