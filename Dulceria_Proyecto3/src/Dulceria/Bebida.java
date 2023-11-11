package Dulceria;

public class Bebida {
	
	private String nombre;
	private String tipo;
	private String descripcion;
	private int precio_compra;
	private int precio_venta;
	private int tamaño; //Cantidad de producto que contiene la bebida en ML
	private int cantidad_bebidas;
	
	
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
	
	
	public int getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}
	
	
	public int getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	
	public int getCantidad_bebidas() {
		return cantidad_bebidas;
	}
	public void setCantidad_bebidas(int cantidad_bebidas) {
		this.cantidad_bebidas = cantidad_bebidas;
	}
	
	
	public Bebida() {
		nombre = "";
		tipo = "";
		descripcion = "";
		precio_compra = 0;
		precio_venta = 0;
		tamaño = 0;
		cantidad_bebidas = 0;
	}
	
	
	public Bebida(String nombre, String tipo, String descripcion, int precio_compra, int precio_venta, int tamaño, int cantidad_bebidas) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.tamaño = tamaño;
		this.cantidad_bebidas = cantidad_bebidas;
	}
	
	@Override
	public String toString() {
		return "\n[Nombre= " + nombre + ", Tipo= " + tipo + ", Descripcion= " + descripcion + ", Tamano= " + tamaño + "ml " +", Precio= "+ precio_venta +", Cantidad disponible= " + cantidad_bebidas + "]";
	}
	
	

	
}
