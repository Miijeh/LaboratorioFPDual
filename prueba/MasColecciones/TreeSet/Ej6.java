package TreeSet;



import java.util.TreeSet;


public class Ej6 {

	public static void main(String[] args) {

		TreeSet<String> colores = new TreeSet<String>();
		TreeSet<String> colores2 = new TreeSet<String>();
		colores.add("Negro");
		colores.add("Gris");
		colores.add("Blanco");
		colores.add("Gris oscuro");
		colores.add("Gris claro");
		
		colores2 = (TreeSet) colores.clone();
		
		System.out.println(colores2);
		
		
	}

}
