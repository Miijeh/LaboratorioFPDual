package linkedList;

import java.util.LinkedList;

public class ej2 {

	public static void main(String[] args) {
		LinkedList<String> colores = new LinkedList<>();

		colores.add("Amarillo");
		colores.add("Morado");
		colores.add("Dorado");
		
		for (String color : colores) {
			System.out.println(color);
		}

	}

}
