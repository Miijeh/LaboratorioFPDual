package HashMap;

import java.util.HashMap;

public class Ej3 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> colores = new HashMap<>();
		HashMap<Integer,String> colores2 = new HashMap<>();
		
		colores.put(3, "Tres");
		colores.put(2, "Dos");
		colores.put(4, "Cuatro");
		colores.put(7, "Siete");
		
		System.out.println(colores);
		System.out.println(colores2);
		colores2 = (HashMap<Integer, String>) colores.clone();
		System.out.println(colores2);
	}

}
