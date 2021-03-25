package PriorityQueue;

import java.util.PriorityQueue;

public class Ej5 {

	public static void main(String[] args) {

		PriorityQueue<String> colores = new PriorityQueue<String>();
		PriorityQueue<String> colores2 = new PriorityQueue<String>();
		
		colores.add("Celeste");
		colores.add("Cyan");
		colores.add("Aguamarina");
		colores.offer("Rojo");
		colores.add("Azul marino");
		colores2.add("Verde");
		colores2.addAll(colores);
		
		System.out.println(colores);
		//System.out.println(colores.removeAll(colores));
		while(!colores.isEmpty()) {
			System.out.println(colores.peek());
			colores.remove();
		}
		System.out.println(colores);

	}

}
