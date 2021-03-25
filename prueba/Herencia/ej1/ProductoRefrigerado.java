package ej1;

public class ProductoRefrigerado extends Producto {

	@Override
	public String toString() {
		return "ProductoRefrigerado [temperaturaRefrigeracion=" + temperaturaRefrigeracion + "]";
	}

	private double temperaturaRefrigeracion;

	public double getTemperaturaRefrigeracion() {
		return temperaturaRefrigeracion;
	}

	public void setTemperaturaCongelacion(double temperaturaRefrigeracion) {
		this.temperaturaRefrigeracion = temperaturaRefrigeracion;
	}

	public ProductoRefrigerado(int numLote, int caducidad, double temperatura) {
		super(numLote, caducidad);
		this.temperaturaRefrigeracion = temperatura;

	}

}
