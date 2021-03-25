package ej8;

public class Diferencia {

	public static void main(String[] args) {
		System.out.println("Recibiendo el entero...");
		System.out.println(hacerDiferencia(15));
		System.out.println(hacerDiferencia(35));
		System.out.println(hacerDiferencia(21));
	}

	public static int hacerDiferencia(int num) {
		
		return num>21 ? num-21 : (num-21)*2;		
	}
}
