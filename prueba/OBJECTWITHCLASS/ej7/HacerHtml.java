package ej7;

public class HacerHtml {

	private String titulo;
	private String etiqueta;

	public HacerHtml(String titulo, String etiqueta) {
		super();
		this.titulo = titulo;
		this.etiqueta = etiqueta;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String crearHTML() {
		return "<"+etiqueta+">" + titulo + "<"+etiqueta+">";
	}
	@Override
	public String toString() {
		return "HacerHtml [titulo=" + titulo + ", etiqueta=" + etiqueta + "]";
	}
}
