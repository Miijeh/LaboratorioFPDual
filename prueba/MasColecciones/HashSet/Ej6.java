package HashSet;

import java.util.*;

public class Ej6 {

	public static void main(String[] args) {

		Set<String> colores = new HashSet<>();
		Set<String> colores2 = new HashSet<>();
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Naranja");
		for (String color : colores) {
			System.out.println(color);

		}
		System.out.println(colores);
		colores2.addAll(colores);
		System.out.println(colores2);
	}

}
