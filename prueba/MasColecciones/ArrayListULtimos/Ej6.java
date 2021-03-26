package ArrayListULtimos;

import java.util.ArrayList;

public class Ej6 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();

		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		System.out.println(colores);
		System.out.println("Cambio " + colores.set(colores.indexOf("Verde"),"Blanco"));
		System.out.println(colores);
		System.out.println(colores.remove(3));
		System.out.println(colores);

	}

}
