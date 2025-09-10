package exercicio1;


import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<String>();
		
		elementos.add("roda");
		elementos.add("carburador");
		elementos.add("cabecote");
		
		System.out.println(elementos.size());
		System.out.println(elementos.contains("cabecote"));
	}

}
