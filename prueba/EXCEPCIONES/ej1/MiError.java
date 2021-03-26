package ej1;

public class MiError extends Exception{


	public MiError(String palabra) {
		super("Ha surgido un error con : " + palabra);
	}

}
