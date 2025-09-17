package exercicio4;

import java.util.ArrayList;

public class Principal {
	
	public static int indiceMenor (ArrayList<Integer> numeros) {
		int menorValor= Integer.MAX_VALUE;
		int menorIndice= 0;
		
		for (int i = 0; i<numeros.size(); i++) {
			if (numeros.get(i)<menorValor) {
				menorValor= numeros.get(i);
				menorIndice= i;
			}
		}
		return menorIndice;
		
	}
	
	public static void main(String[] args) {
	
		ArrayList<Integer> menor = new ArrayList<Integer>();
		menor.add(1);
		menor.add(3);
		menor.add(-6);
		menor.add(-7);
		
		System.out.println(indiceMenor(menor));
	}

}
