package exercicio3;

import java.util.ArrayList;

public class Principal {
	
	public static ArrayList<Integer> exclusivoDuasListas (ArrayList<Integer> lista1, ArrayList<Integer> lista2){
		ArrayList<Integer> exclusivo= new ArrayList<Integer>();
		for (int i=0; i<lista1.size(); i++) {
			for (int j=0; j<lista2.size();j++) {
				if (!(lista1.get(i)==lista2.get(j))) {
					exclusivo.add(lista1.get(i));
				}
			}
			
		}
		
		
		return exclusivo;
		
	}

	public static void main(String[] args) {
	
	ArrayList<Integer> gratio = new ArrayList<Integer>();
	gratio.add(1);
	gratio.add(1);
	gratio.add(2);
	gratio.add(3);
	gratio.add(5);
	gratio.add(8);
	gratio.add(13);
	
	ArrayList<Integer> primos = new ArrayList<Integer>();
	primos.add(2);
	primos.add(3);
	primos.add(5);
	primos.add(7);
	primos.add(11);
	primos.add(13);
	primos.add(17);
	
	System.out.println(exclusivoDuasListas(gratio, primos));
	}
}
