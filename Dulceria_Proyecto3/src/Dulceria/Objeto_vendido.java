package Dulceria;

public class Objeto_vendido {
	private String nombre;
	private int cantidad;
	private int valor_venta;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(int valor_venta) {
		this.valor_venta = valor_venta;
	}
	
	
	public Objeto_vendido() {
		nombre = "";
		cantidad = 0;
		valor_venta = 0;
	}
	public Objeto_vendido(String nombre, int cantidad, int valor_venta) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valor_venta = valor_venta;
	}
	
	
}



