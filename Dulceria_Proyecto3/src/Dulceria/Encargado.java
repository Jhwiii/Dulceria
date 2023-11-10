package Dulceria;

public class Encargado {

	private String nombre;
	private int edad;
	private double sueldo;
	private String usuario_login;
	private String contraseña_login;
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
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getUsuario_login() {
		return usuario_login;
	}
	public void setUsuario_login(String usuario_login) {
		this.usuario_login = usuario_login;
	}
	public String getContraseña_login() {
		return contraseña_login;
	}
	public void setContraseña_login(String contraseña_login) {
		this.contraseña_login = contraseña_login;
	}
	
	
	public Encargado(String nombre, int edad, double sueldo, String usuario_login, String contraseña_login) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
		this.usuario_login = usuario_login;
		this.contraseña_login = contraseña_login;
	}
	
	
	
	
	
}
