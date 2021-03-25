package ej1;

public class Empleado {

	private int codigoEmpleado;
	private double salario;
	private String nombre;

	public Empleado(int codigoEmpleado, double salario, String nombre) {
		super();
		this.codigoEmpleado = codigoEmpleado;
		this.salario = salario;
		this.nombre = nombre;
	}

	public Empleado() {
		super();

	}
	
	public String mostrarDatos() {
		return "Empleado " + this.nombre + " con codigo " + this.codigoEmpleado+ " cobra " + this.salario;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
