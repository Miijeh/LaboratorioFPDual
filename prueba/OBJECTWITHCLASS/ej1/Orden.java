package ej1;

public class Orden {
	
	private int numOrden;
	private String descripcion;
	private String fechaOrden;
	private boolean esPrioritaria;
	private Empleado empleado;
	private Cliente cliente;
	
	public Orden(int numOrden, String descripcion, String fechaOrden, boolean esPrioritaria, Empleado empleado,
			Cliente cliente) {
		super();
		this.numOrden = numOrden;
		this.descripcion = descripcion;
		this.fechaOrden = fechaOrden;
		this.esPrioritaria = esPrioritaria;
		this.empleado = empleado;
		this.cliente = cliente;
	}

	public Orden() {
		super();
	}

	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(String fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public boolean isEsPrioritaria() {
		return esPrioritaria;
	}

	public void setEsPrioritaria(boolean esPrioritaria) {
		this.esPrioritaria = esPrioritaria;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
