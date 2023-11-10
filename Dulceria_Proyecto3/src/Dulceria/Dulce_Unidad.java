package Dulceria;

public class Dulce_Unidad {


	private String nombre;
	private String tipo; //Los dulces pueden ser gomitas, chocolates, bombones o caramelos
	private String descripcion;
	private double precio_compra;
	private double precio_venta;
	
	
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
	
	public Dulce_Unidad() {
		nombre = "";
		tipo = "";
		descripcion = "";
		precio_compra = 0;
		precio_venta = 0;
	}
	
	public Dulce_Unidad(String nombre, String tipo, String descripcion, double precio_compra, double precio_venta) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
	}
	
	@Override
	public String toString() {
		return "\n[nombre=" + nombre + ", tipo=" + tipo + ", descripcion=" + descripcion + "]";
	}
	
	
}
