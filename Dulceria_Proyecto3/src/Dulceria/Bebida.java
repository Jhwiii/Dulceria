package Dulceria;

public class Bebida {
	
	private String nombre;
	private String tipo;
	private String descripcion;
	private double precio_compra;
	private double precio_venta;
	private double tamaño; //Cantidad de producto que contiene la bebida en ML
	
	
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
	
	
	public double getTamaño() {
		return tamaño;
	}
	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
	
	
	public Bebida() {
		nombre = "";
		tipo = "";
		descripcion = "";
		precio_compra = 0;
		precio_venta = 0;
		tamaño = 0;
	}
	
	
	public Bebida(String nombre, String tipo, String descripcion, double precio_compra, double precio_venta,
			double tamaño) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.tamaño = tamaño;
	}
	@Override
	public String toString() {
		return "\n[nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + ", tamaño=" + tamaño + "]";
	}
	
	

	
}
