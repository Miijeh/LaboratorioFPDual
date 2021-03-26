package ej6;

public class Error2 extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	public Error2() {
		super("Ha surgido un segundo error");
	}
	public Error2(String palabra) {
		super("Ha surgido un segundo error con : " + palabra);
	}
}
