package Dulceria;

public class Cliente {

	private String nombre;
	private int edad;
	private int identificacion;
	private int presupuesto;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public int getIdentificación() {
		return identificacion;
	}
	public void setIdentificación(int identificación) {
		this.identificacion = identificación;
	}
	
	
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
	public Cliente() {
		nombre = "";
		edad = 0;
		identificacion = 0;
		presupuesto = 0;
	}
	
	
	public Cliente(String nombre, int edad, int identificación, int presupuesto) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificación;
		this.presupuesto = presupuesto;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", identificacion=" + identificacion + ", presupuesto="
				+ presupuesto + "]";
	}
	
	
	
	
}
