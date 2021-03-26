package ej2;

public class Empleado {

	protected String nombre;
	protected String cedula;
	protected int edad;
	protected boolean casado;
	protected double salario;

	public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
		super();
		if (edad >= 18 && edad <= 45) {
			this.nombre = nombre;
			this.cedula = cedula;
			this.edad = edad;
			this.casado = casado;
			this.salario = salario;
		} else {
			System.out.println("No se ha creado ya que la edad no esta en el rango");
		}
	}

	public Empleado() {

	}

	public String clasificarPorEdad() {

		if (this.edad <= 21) {
			return "Principiante";
		} else if (this.edad > 35) {
			return "Senior";
		} else {
			return "Intermedio";
		}
	}

	public String mostrarDatos() {
		return "Nombre : " + this.nombre + "\nCedula : " + this.cedula + "\nEdad : " + this.edad + "\nCasado : "
				+ this.casado + "\nSalario : " + this.salario;

	}

	public void aumentarSalario(double porcentaje) {
		this.salario+=this.salario*(porcentaje/100);
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", cedula=" + cedula + ", edad=" + edad + ", casado=" + casado
				+ ", salario=" + salario + "]";
	}

}
