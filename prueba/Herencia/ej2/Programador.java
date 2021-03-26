package ej2;

public class Programador extends Empleado {

	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, cedula, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public Programador(String nombre, String cedula, int edad, boolean casado, double salario) {
		super(nombre, cedula, edad, casado, salario);
	}
	@Override
	public String toString() {
		return "Programador [nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", casado=" + casado
				+ ", salario=" + salario + ", lineasPorHora="+ lineasDeCodigoPorHora + ", lenguaje=" + lenguajeDominante + "]";
	}
}
