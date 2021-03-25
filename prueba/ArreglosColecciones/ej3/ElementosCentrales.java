package ej3;

import java.util.Arrays;

public class ElementosCentrales {

	@Override
	public String toString() {
		return "ElementosCentrales []";
	}

	public static void main(String[] args) {
		int[] listadoLongPar = {0,1,2,3,4,5,6,7};
		if (listadoLongPar.length % 2 == 0) {
			System.out.println("Los valores centrales son...");
			System.out.println(Arrays.toString(valoresCentrales(listadoLongPar)));
		} else {
			System.out.println("Ha introducido una longitud sin 2 valores centrales (no par)");
		}

	}
	
	public static int[] valoresCentrales(int[] lista) {
		int[] valoresCentrados = new int[2];
		valoresCentrados[0]=lista[lista.length/2-1];
		valoresCentrados[1]=lista[lista.length/2];
		return valoresCentrados;
		
	}

}
