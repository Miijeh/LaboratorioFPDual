package ej6;

public class RecibirParametros {

	private String parametro;

	public RecibirParametros(String... parametro) {
		super();
		this.parametro="";
		for (String p : parametro) {
			this.parametro+=p;
		}
	}
	


	@Override
	public String toString() {
		return "RecibirParametros [parametro=" + parametro + ", getParametro()=" + getParametro() + "]";
	}



	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
}
