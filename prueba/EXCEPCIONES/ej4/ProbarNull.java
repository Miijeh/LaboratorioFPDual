package ej4;

public class ProbarNull {

	public static void main(String[] args) {
		int numero = 8;
		Object objeto = null;
		try {
			numero =numero/(int) objeto;
		}catch (NullPointerException n) {
			System.out.println("Entra en catch");
			System.out.println("Error " + n);
		}
		

	}

}
