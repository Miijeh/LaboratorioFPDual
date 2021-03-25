package ej7;

public class ContarVocales {

	public static void main(String[] args) {

		String texto = "aeiouaeiou";
		System.out.println("Tiene "+contarVocal(texto) + " vocales");

	}

	public static int contarVocal(String t) {

		int contador = 0;

		for (int i = 0; i < t.length(); i++) {
			if (t.substring(i, i + 1).equalsIgnoreCase("a")) {
				contador++;
			} else if (t.substring(i, i + 1).equalsIgnoreCase("e")) {
				contador++;
			} else if (t.substring(i, i + 1).equalsIgnoreCase("i")) {
				contador++;
			} else if (t.substring(i, i + 1).equalsIgnoreCase("o")) {
				contador++;
			} else if (t.substring(i, i + 1).equalsIgnoreCase("u")) {
				contador++;
			}
		}

		return contador;

	}
}
