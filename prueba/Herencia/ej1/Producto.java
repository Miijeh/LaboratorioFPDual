package ej1;

public class Producto {

	@Override
	public String toString() {
		return "Producto [numLote=" + numLote + ", caducidad=" + caducidad + "]";
	}

	private int numLote;
	private int caducidad;

	public Producto(int numLote, int caducidad) {
		super();
		this.numLote = numLote;
		this.caducidad = caducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public int getfCaducidad() {
		return caducidad;
	}

	public void setfCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

}
