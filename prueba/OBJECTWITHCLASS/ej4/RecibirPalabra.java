package ej4;

public class RecibirPalabra {

	private String palabra;

	public RecibirPalabra(String palabra) {
		super();
		this.palabra = palabra;
	}
	
	public String imprimirSaludo() {
		return "Hola "+ this.palabra + ", ¿Como va el dia?";
	}

	@Override
	public String toString() {
		return "RecibirPalabra [palabra=" + palabra + "]";
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
}
