package ArrayListULtimos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ej11 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		System.out.println(colores);
		Collections.reverse(colores);
		System.out.println(colores);
	}

}
