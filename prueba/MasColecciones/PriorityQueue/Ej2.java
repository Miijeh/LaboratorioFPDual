package PriorityQueue;

import java.util.PriorityQueue;

public class Ej2 {

	public static void main(String[] args) {

		PriorityQueue<String> colores = new PriorityQueue<String>();
		colores.add("Celeste");
		colores.add("Cyan");
		colores.add("Aguamarina");
		colores.add("Azul marino");
		for (String color : colores) {
			System.out.println(color);
		}

	}

}
