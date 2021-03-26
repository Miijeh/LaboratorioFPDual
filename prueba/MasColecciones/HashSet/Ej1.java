package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ej1 {

	public static void main(String[] args) {
		
		Set<String> colores = new HashSet<>();
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Naranja");

		System.out.println(colores);
	}

}
