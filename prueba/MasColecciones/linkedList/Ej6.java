package linkedList;

import java.util.LinkedList;

public class Ej6 {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();

		colores.add("Amarillo");
		colores.add("Morado");
		colores.addFirst("Lila");
		colores.addLast("Dorado");
		colores.addFirst("Lila");

		System.out.println(colores);

	}

}
