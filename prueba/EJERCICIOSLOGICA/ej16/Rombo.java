package ej16;

public class Rombo {

	public static void main(String[] args) {
		int filas = 7;
		int columnas = 7;
		for (int i = 0; i < filas; i+=2) {
			for (int u = columnas/2; u > 0; u--) {
				System.out.print(" ");
			}
			for (int e =0;e<=i;e++) {
				System.out.print("*");
			}
			System.out.println("");
			columnas+= -2;
		}
		columnas = 5;
		for (int i = 0; i < filas; i+=2) {
			for (int u = columnas/2; u > 0; u--) {
				System.out.print(" ");
			}
			
			for (int e =i;e<=columnas;e++) {
				System.out.print("*");
			}
			System.out.println("");
			columnas+= -2;
		}
	}

}
