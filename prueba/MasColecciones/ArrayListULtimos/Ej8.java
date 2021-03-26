package ArrayListULtimos;

import java.util.ArrayList;

public class Ej8 {

	public static void main(String[] args) {

		ArrayList<String> colores = new ArrayList<>();

		colores.add("Azul");
		colores.add("Rojo");
		colores.add(0, "Negro");
		colores.add(2, "Verde");
		colores.add("Violeta");
		colores.add("Naranja");
		System.out.println(colores);
		colores.sort(new CompararMayorMenor());
		System.out.println(colores);
	}

}
