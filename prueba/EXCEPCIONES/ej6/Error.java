package ej6;

public class Error extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Error() {
		super("Ha surgido un error");
	}
	public Error(String palabra) {
		super("Ha surgido un error con : " + palabra);
	}
}
