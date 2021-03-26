package TreeSet;

import java.util.Iterator;

import java.util.TreeSet;


public class Ej3 {

	public static void main(String[] args) {

		TreeSet<String> colores = new TreeSet<String>();
		
		colores.add("Negro");
		colores.add("Gris");
		colores.add("Blanco");
		colores.add("Gris oscuro");
		colores.add("Gris claro");
		
		Iterator<String> it = colores.descendingIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
		
	}

}
