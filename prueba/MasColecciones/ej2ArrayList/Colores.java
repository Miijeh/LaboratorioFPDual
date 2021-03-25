package ej2ArrayList;

import java.util.ArrayList;

public class Colores {

	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<>();
		
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Verde");
		
		for (String color : colores) {
			System.out.println(color);
		}

	}

}
