package Dulceria;

public class Dulce_Paquete {

	private String nombre;
	private String tipo; //Los dulces pueden ser gomitas, chocolates, bombones o caramelos
	private String descripcion; //Breve descripcion de el producto, se indica si tiene restricciones o no
	private int cantidad; //Cantidad de dulces que vienen en cada paquete de dulces
	private int cantidad_paquetes;
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
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
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
	
	
	public int getCantidad_paquetes() {
		return cantidad_paquetes;
	}
	public void setCantidad_paquetes(int cantidad_paquetes) {
		this.cantidad_paquetes = cantidad_paquetes;
	}
	
	
	public Dulce_Paquete() {
		nombre = "";
		tipo = "";
		descripcion = "";
		precio_compra = 0;
		precio_venta = 0;
		cantidad_paquetes = 0;
	}
	
	public Dulce_Paquete(String nombre, String tipo, String descripcion, int cantidad, double precio_compra, double precio_venta,int cantidad_paquetes) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.cantidad_paquetes = cantidad_paquetes;
	}
	
	@Override
	public String toString() {
		return "\n[nombre= " + nombre + ", tipo= " + tipo + ", descripcion= " + descripcion + ", cantidad por paquete= "
				+ cantidad + " ,paquetes disponibles= " + cantidad_paquetes + "]";
	}
	
	
	
	
}
