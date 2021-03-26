package ArrayListULtimos;

import java.util.ArrayList;
import java.util.Collections;

public class Ej10 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		System.out.println(colores);
		Collections.shuffle(colores);
		System.out.println(colores);
	}

}
