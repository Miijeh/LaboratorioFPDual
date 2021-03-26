package ArrayListULtimos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ej21 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		ArrayList<String> colores2 = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		
		colores2.add("Violeta");
		colores2.add("Naranja");
		System.out.println(colores + " " + colores.size());
		colores.set(2, "Rosa");
		System.out.println(colores + " " + colores.size());
	}

}
