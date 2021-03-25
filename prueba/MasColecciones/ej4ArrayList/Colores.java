package ej4ArrayList;

import java.util.ArrayList;

public class Colores {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();

		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		System.out.println(colores);
		System.out.println(colores.get(2));

	}

}
