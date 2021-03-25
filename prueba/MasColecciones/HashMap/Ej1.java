package HashMap;

import java.util.HashMap;

public class Ej1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> colores = new HashMap<>();
		
		colores.put(3, "Tres");
		colores.put(2, "Dos");
		colores.put(4, "Cuatro");
		colores.put(7, "Siete");
		
		System.out.println(colores);
	}

}
