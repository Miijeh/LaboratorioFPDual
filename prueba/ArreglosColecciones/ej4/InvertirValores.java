package ej4;

import java.util.Arrays;

public class InvertirValores {

	public static void main(String[] args) {
		int[] numeros = { 2, 7, 13, 53, 2, 3, 5, 9 };
		System.out.println("Normales= " + Arrays.toString(numeros));
		System.out.println("Invertidos= " + Arrays.toString(invertirNum(numeros)));
		System.out.println("InvertidosNormales= " + Arrays.toString(invertirNum(invertirNum(numeros))));
	}

	public static int[] invertirNum(int[] num) {
		int[] numerosInvertidos = new int[num.length];
		for (int i=0;i<numerosInvertidos.length;i++) {
			numerosInvertidos[i] = num[num.length-1-i];
		}
		return numerosInvertidos;
		
	}
}
