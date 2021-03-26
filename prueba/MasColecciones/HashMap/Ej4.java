package HashMap;

import java.util.HashMap;

public class Ej4 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> colores = new HashMap<>();
		HashMap<Integer,String> colores2 = new HashMap<>();
		
		colores.put(3, "Tres");
		colores.put(2, "Dos");
		colores.put(4, "Cuatro");
		colores.put(7, "Siete");
		
		System.out.println(colores);
		colores.clear();
		System.out.println(colores);
	}

}
