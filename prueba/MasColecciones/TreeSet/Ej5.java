package TreeSet;



import java.util.TreeSet;


public class Ej5 {

	public static void main(String[] args) {

		TreeSet<String> colores = new TreeSet<String>();
		
		colores.add("Negro");
		colores.add("Gris");
		colores.add("Blanco");
		colores.add("Gris oscuro");
		colores.add("Gris claro");
		
		System.out.println(colores.first());
		System.out.println(colores.last());
		
		
	}

}
