package ej5;

import java.util.ArrayList;
import java.util.List;

public class RetornarNumeros {

	public static void main(String[] args) {
		List<String> listaStrings = new ArrayList<String>();
		listaStrings.add("Hola1");
		listaStrings.add("Comi23");
		listaStrings.add("Quetal");
		listaStrings.add("Dan1");
		listaStrings.add("Cuenta");
		listaStrings.add("Cuent0");
		listaStrings.add("Cuent1");
		listaStrings.add("Cuent2");
		listaStrings.add("Cuent3");
		listaStrings.add("Cuent4");
		listaStrings.add("Cuent5");
		listaStrings.add("Cuent6");
		listaStrings.add("Cuent7");
		listaStrings.add("Cuent8");
		listaStrings.add("Cuent9");
		System.out.println(listaStrings);
		System.out.println(sacarSoloConNumeros(listaStrings));
	}

	public static List<String> sacarSoloConNumeros(List<String> lista) {
		List<String> listaSoloConNumeros = new ArrayList<String>();
		for (String palabra : lista) {

			if (palabra.contains("0") || palabra.contains("1") || palabra.contains("2") || palabra.contains("3")
					|| palabra.contains("4") || palabra.contains("5") || palabra.contains("6") || palabra.contains("7")
					|| palabra.contains("8") || palabra.contains("9")) {
				listaSoloConNumeros.add(palabra);
			}
		}

		return listaSoloConNumeros;

	}
}
