package linkedList;

import java.util.LinkedList;

public class Ej5 {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();

		colores.add("Amarillo");
		colores.add("Morado");
		colores.add("Dorado");
		colores.add(1,"Cyan");
		System.out.println(colores);

	}

}
