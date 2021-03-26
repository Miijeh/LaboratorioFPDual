package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ej4 {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();

		colores.add("Amarillo");
		colores.add("Morado");
		colores.add("Dorado");
		Iterator<String> it = colores.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
