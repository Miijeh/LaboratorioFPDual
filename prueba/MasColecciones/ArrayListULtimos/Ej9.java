package ArrayListULtimos;

import java.util.ArrayList;

public class Ej9 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();
		ArrayList<String> colores2 = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		System.out.println(colores2);
		colores2 = (ArrayList<String>) colores.clone();
		System.out.println(colores2);
	}

}
