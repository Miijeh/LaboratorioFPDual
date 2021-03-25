package ej1;

public class ProductoCongelado extends Producto {

	@Override
	public String toString() {
		return "ProductoCongelado [temperaturaCongelacion=" + temperaturaCongelacion + ", tipo=" + tipo + "]";
	}

	private double temperaturaCongelacion;
	private TipoCongelacion tipo;

	public double getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public TipoCongelacion getTipo() {
		return tipo;
	}

	public void setTipo(TipoCongelacion tipo) {
		this.tipo = tipo;
	}

	public void setTemperaturaCongelacion(double temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public ProductoCongelado(int numLote, int caducidad, double temperatura,TipoCongelacion tipo) {
		super(numLote, caducidad);
		this.temperaturaCongelacion = temperatura;
		this.tipo=tipo;

	}

}
