package ej2;

import java.util.ArrayList;
import java.util.List;

public class Contener2o3 {

	public static void main(String[] args) {

		List<Integer> listadoNumeros = new ArrayList<Integer>();
		listadoNumeros.add(8);
		listadoNumeros.add(2);
		listadoNumeros.add(1);
		List<Integer> listadoNumeros2 = new ArrayList<Integer>();
		listadoNumeros.add(8);
		listadoNumeros.add(9);
		listadoNumeros.add(1);
		System.out.println("No contiene el numero 2 o 3...");
		System.out.println(contiene2o3(listadoNumeros));
		System.out.println(contiene2o3(listadoNumeros2));
	}

	public static boolean contiene2o3(List<Integer> numeros) {
		return (numeros.contains(2) || numeros.contains(3)) ? false : true;
	}
}
