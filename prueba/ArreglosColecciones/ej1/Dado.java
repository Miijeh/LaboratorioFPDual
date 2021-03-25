package ej1;

public class Dado {
	
	private int[] carasDado = new int[6];

	public int[] getCarasDado() {
		return carasDado;
	}

	public Dado(int[] carasDado) {
		super();
		this.carasDado = carasDado;
	}
	
	public boolean tiene6EnPrimeraOUltima(){
		
		
		return (this.carasDado[0]==6 || this.carasDado[5]==6);
		
	}
	
}
