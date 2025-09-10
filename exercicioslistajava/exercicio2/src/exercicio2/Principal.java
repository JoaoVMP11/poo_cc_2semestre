package exercicio2;

import java.util.ArrayList;
import java.util.List;



public class Principal {
	public static int elementosunicos(List<Integer> numeros) {

	return numeros.size();
	
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numerosunico= new ArrayList<Integer>();
		numerosunico.add(1);
		numerosunico.add(2);
		numerosunico.add(2);
		
		System.out.println(elementosunicos(numerosunico));
		
		
		
	
	}
}
