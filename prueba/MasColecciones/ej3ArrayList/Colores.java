package ej3ArrayList;

import java.util.ArrayList;

public class Colores {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();

		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Verde");
		System.out.println(colores);
		colores.add(0, "Negro");

		System.out.println(colores);

	}

}
