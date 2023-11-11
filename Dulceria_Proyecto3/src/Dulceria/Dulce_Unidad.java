package Dulceria;

public class Dulce_Unidad {


	private String nombre;
	private String tipo; //Los dulces pueden ser gomitas, chocolates, bombones o caramelos
	private String descripcion;
	private double precio_compra;
	private double precio_venta;
	private int cantidad_dulces;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	
	public double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	public int getCantidad_dulces() {
		return cantidad_dulces;
	}
	public void setCantidad_dulces(int cantidad_dulces) {
		this.cantidad_dulces = cantidad_dulces;
	}
	
	
	public Dulce_Unidad() {
		nombre = "";
		tipo = "";
		descripcion = "";
		precio_compra = 0;
		precio_venta = 0;
		cantidad_dulces = 0;
	}
	
	public Dulce_Unidad(String nombre, String tipo, String descripcion, double precio_compra, double precio_venta, int cantidad_dulces) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.cantidad_dulces = cantidad_dulces;
	}
	
	@Override
	public String toString() {
		return "\n[nombre= " + nombre + ", tipo= " + tipo + ", descripcion= " + descripcion + ", dulces disponibles= " + cantidad_dulces + "]";
	}
	
	
}
