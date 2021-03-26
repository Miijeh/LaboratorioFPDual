package ej1;

import java.util.ArrayList;
import java.util.List;

public class Envios {

	private String medios;
	private static int contadorProductos;
	private static int contadorRefrigerados;
	private static int contadorCongelados;
	private static int contadorFrescos;
	List<Producto> listaProductosGeneral = new ArrayList<Producto>();
	List<ProductoFresco> listaProductosFrescos = new ArrayList<ProductoFresco>();
	List<ProductoRefrigerado> listaProductosRefrigerado = new ArrayList<ProductoRefrigerado>();
	List<ProductoCongelado> listaProductosCongelados = new ArrayList<ProductoCongelado>();

	public Envios(String medios) {
		super();
		this.medios = medios;
		this.contadorProductos = 0;
	}

	@Override
	public String toString() {
		return "Envios [medios=" + medios + ", listaProductosGeneral=" + listaProductosGeneral
				+ ", listaProductosFrescos=" + listaProductosFrescos + ", listaProductosRefrigerado="
				+ listaProductosRefrigerado + ", listaProductosCongelados=" + listaProductosCongelados + "]";
	}

	public void anyadirRefrigerado(ProductoRefrigerado producto) {

		this.listaProductosGeneral.add(producto);
		this.listaProductosRefrigerado.add(producto);
		contadorRefrigerados++;
		contadorProductos++;
		System.out.println("General " + this.listaProductosGeneral);
		System.out.println("Refrigerado " + this.listaProductosRefrigerado);
	}

	public void anyadirCongelado(ProductoCongelado producto) {

		this.listaProductosGeneral.add(producto);
		this.listaProductosCongelados.add(producto);
		contadorCongelados++;
		contadorProductos++;
		System.out.println("General " + this.listaProductosGeneral);
		System.out.println("Congelado " + this.listaProductosCongelados);
	}

	public void anyadirFresco(ProductoFresco producto) {

		this.listaProductosGeneral.add(producto);
		this.listaProductosFrescos.add(producto);
		contadorFrescos++;
		contadorProductos++;
		System.out.println("General " + this.listaProductosGeneral);
		System.out.println("Fresco " + this.listaProductosFrescos);
	}

	public void verContadores() {
		System.out.println("Contador general : " + contadorProductos);
		System.out.println("Contador refrigerados : " + contadorRefrigerados);
		System.out.println("Contador frescos : " + contadorFrescos);
		System.out.println("Contador congelados : " + contadorCongelados);
	}
}
