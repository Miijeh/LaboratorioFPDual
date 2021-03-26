package ej1;

public class TirarDado {

	public static void main(String[] args) {

		int[] resultado1 = { 1, 2, 3, 4, 5, 6 };
		int[] resultado2 = { 6, 2, 3, 4, 5, 1 };
		int[] resultado3 = { 1, 2, 3, 4, 5, 1 };

		Dado d1 = new Dado(resultado1);
		Dado d2 = new Dado(resultado2);
		Dado d3 = new Dado(resultado3);

		System.out.println("El resultado1 " + d1.tiene6EnPrimeraOUltima());
		System.out.println("El resultado2 " + d2.tiene6EnPrimeraOUltima());
		System.out.println("El resultado3 " + d3.tiene6EnPrimeraOUltima());
	}

}
