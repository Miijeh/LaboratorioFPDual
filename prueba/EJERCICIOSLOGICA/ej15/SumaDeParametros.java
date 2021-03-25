package ej15;

import java.util.Scanner;

public class SumaDeParametros {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Anyadiendo parametros (numeros)");
		
		
		System.out.println(sumarParametros(scan.nextInt(),scan.nextInt()));

	}

	public static int sumarParametros(int... num) {
		int total = 0;
		for (int sumar : num) {
			total += sumar;
		}
		return total;
		
	}
}
