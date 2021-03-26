package ArrayListULtimos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ej18 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		ArrayList<String> colores2 = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		if(colores.isEmpty()) {
			System.out.println("Esta vacio");
		}else {
			System.out.println("No esta vacio");
		}
		if(colores2.isEmpty()) {
			System.out.println("Esta vacio");
		}else {
			System.out.println("No esta vacio");
		}
		
	}

}
