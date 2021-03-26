package ej5;

public class RepetirPalabra {

	private String palabra;
	private int repetir;

	public RepetirPalabra(String palabra, int repetir) {
		super();
		this.palabra = palabra;
		this.repetir = repetir;
	}
	
	public String repetirXVeces() {
		String devolverRepetida =this.palabra;
		for (int i=0;i<this.repetir;i++) {
			devolverRepetida += " " + this.palabra;
		}
		
		return devolverRepetida;
	}

	@Override
	public String toString() {
		return "RepetirPalabra [palabra=" + palabra + ", repetir=" + repetir + "]";
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public int getRepetir() {
		return repetir;
	}

	public void setRepetir(int repetir) {
		this.repetir = repetir;
	}

}
