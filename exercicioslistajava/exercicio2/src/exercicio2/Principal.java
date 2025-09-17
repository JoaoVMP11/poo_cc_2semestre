package exercicio2;

import java.util.ArrayList;




public class Principal {
	public static int elementosunicos(ArrayList<Integer> numeros) {

		ArrayList<Integer> numerosUnicos= new ArrayList<Integer>();
		
		for (Integer numero : numeros) {
			if(!numerosUnicos.contains(numero)) {
				numerosUnicos.add(numero);
			}
			
			
		}
	return numerosUnicos.size();
	
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(2);
		

			
		
		
		System.out.println(elementosunicos(numeros));
		
		
		
	
	}
}
