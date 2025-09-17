package exercicio5;

import java.util.ArrayList;

public class Principal {
	
	public static int numeroOcorrencias(ArrayList<String> lista, String elementoDesejado) {
	int ctOcorrencia=0;
		for (String elemento : lista) {
			if (elemento==elementoDesejado) {
				ctOcorrencia++;
			}
			
		}
		return ctOcorrencia;
	}
	
	public static void main(String[] args) {
		ArrayList<String> ocorrencias = new ArrayList<String>();
		ocorrencias.add("arroz");
		ocorrencias.add("arroz");
		ocorrencias.add("feijao");
		ocorrencias.add("batata");
		ocorrencias.add("batata");
		ocorrencias.add("batata");
		
		System.out.println(numeroOcorrencias(ocorrencias, "batata"));
		System.out.println(numeroOcorrencias(ocorrencias, "arroz"));
		System.out.println(numeroOcorrencias(ocorrencias, "feijao"));
		
	}

}
