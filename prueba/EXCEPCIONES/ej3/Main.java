package ej3;

import ej1.MiError;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola");
		try {
			pruebaMiError();
		}catch (NullPointerException n) {
			
		} catch (MiError e) {
			System.out.println("Entra en catch");
			e.printStackTrace();
		}
	}

	public static void pruebaMiError() throws MiError {
		System.out.println("Entra en el metodo");
		MiError error = new MiError("Throw en metodo");
		throw error;
	}
}
