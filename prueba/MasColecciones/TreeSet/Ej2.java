package TreeSet;

import java.util.*;

public class Ej2 {

	public static void main(String[] args) {

		Set<String> colores = new TreeSet<String>();
		Set<String> colores2 = new TreeSet<String>();
		colores.add("Negro");
		colores.add("Gris");
		colores.add("Blanco");
		colores.add("Gris oscuro");
		colores.add("Gris claro");

		System.out.println(colores);
		System.out.println(colores2.addAll(colores));
		System.out.println(colores2);
	}

}
