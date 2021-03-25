package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Ej4 {

	public static void main(String[] args) {
		
		Set<String> colores = new HashSet<>();
		colores.add("Amarillo");
		colores.add("Verde");
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Naranja");
		for (String color : colores) {
			System.out.println(color);

		}
		System.out.println(colores + " "  +colores.size());
		System.out.println(colores.removeAll(colores));
		System.out.println(colores);
	}

}
