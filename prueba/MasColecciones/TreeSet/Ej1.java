package TreeSet;

import java.util.*;

public class Ej1 {

	public static void main(String[] args) {
		
		Set<String> colores = new TreeSet<String>();
		colores.add("Negro");
		colores.add("Gris");
		colores.add("Blanco");
		colores.add("Gris oscuro");
		colores.add("Gris claro");
		
		System.out.println(colores);
	}

}
