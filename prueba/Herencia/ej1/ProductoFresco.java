package ej1;

public class ProductoFresco extends Producto {

	@Override
	public String toString() {
		return "ProductoFresco [temperaturaFresco=" + temperaturaFresco + "]";
	}

	private double temperaturaFresco;

	public double getTemperaturaFresco() {
		return temperaturaFresco;
	}

	public void setTemperaturaCongelacion(double temperaturaFresco) {
		this.temperaturaFresco = temperaturaFresco;
	}

	public ProductoFresco(int numLote, int caducidad, double temperatura) {
		super(numLote, caducidad);
		this.temperaturaFresco = temperatura;

	}

}
