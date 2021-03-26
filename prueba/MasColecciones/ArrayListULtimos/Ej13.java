package ArrayListULtimos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ej13 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		ArrayList<String> colores2 = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		colores2.add("Verde");
		colores2.add("Violeta");
		colores2.add("Naranja");
		ArrayList<String> coloresAmbos = new ArrayList<>();
		for (String color : colores) {
			if(colores2.contains(color)) {
				coloresAmbos.add(color);
			}
		}
		System.out.println(coloresAmbos);
		
		
	}

}
