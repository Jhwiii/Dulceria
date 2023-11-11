package Dulceria;

import java.util.Arrays;

public class Tienda {
	private String nombre;
	private String direccion;
	private Bebida almacen_bebidas[];
	private Dulce_Unidad almacen_dulces[];
	private Dulce_Paquete almacen_paquetes[];
	private Calificacion calificaciones[];
	private Encargado trabajador;
	private Cliente cliente;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public String getDirreccion() {
		return direccion;
	}
	public void setDirreccion(String dirreccion) {
		this.direccion = dirreccion;
	}

	
	public Bebida[] getAlmacen_bebidas() {
		return almacen_bebidas;
	}
	public void setAlmacen_bebidas(Bebida[] almacen_bebidas) {
		this.almacen_bebidas = almacen_bebidas;
	}
	
	
	public Dulce_Unidad[] getAlmacen_dulces() {
		return almacen_dulces;
	}
	public void setAlmacen_dulces(Dulce_Unidad[] almacen_dulces) {
		this.almacen_dulces = almacen_dulces;
	}

	
	public Dulce_Paquete[] getAlmacen_paquetes() {
		return almacen_paquetes;
	}
	public void setAlmacen_paquetes(Dulce_Paquete[] almacen_paquetes) {
		this.almacen_paquetes = almacen_paquetes;
	}

	
	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}
	
	
	public Encargado getTrabajador() {
		return trabajador;
	}
	public void setTrabajador(Encargado trabajador) {
		this.trabajador = trabajador;
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public Tienda() {
		
		almacen_bebidas = new Bebida[10];
		for(int i = 0; i<almacen_bebidas.length;i++) {
			almacen_bebidas[i] = new Bebida();
		}
		
		almacen_dulces = new Dulce_Unidad[10];
		for(int i = 0;i<almacen_dulces.length;i++) {
			almacen_dulces[i] = new Dulce_Unidad();
		}
		
		almacen_paquetes = new Dulce_Paquete[5];
		for(int i = 0;i<almacen_paquetes.length;i++) {
			almacen_paquetes[i] = new Dulce_Paquete();
		}
		
		calificaciones = new Calificacion[5];
		for(int i = 0;i<calificaciones.length;i++) {
			calificaciones[i] = new Calificacion();
		}
		
	}
	
	
	
	public Tienda(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		
		almacen_bebidas = new Bebida[10];
		for(int i = 0; i<almacen_bebidas.length;i++) {
			almacen_bebidas[i] = new Bebida();
		}
		crear_bebidas();
		
		almacen_dulces = new Dulce_Unidad[10];
		for(int i = 0;i<almacen_dulces.length;i++) {
			almacen_dulces[i] = new Dulce_Unidad();
		}
		crear_dulce_unidad();
		
		almacen_paquetes = new Dulce_Paquete[5];
		for(int i = 0;i<almacen_paquetes.length;i++) {
			almacen_paquetes[i] = new Dulce_Paquete();
		}
		crear_paquete();
		
		calificaciones = new Calificacion[5];
		for(int i = 0;i<calificaciones.length;i++) {
			calificaciones[i] = new Calificacion();
		}
		calificaciones();
		
		trabajador = new Encargado("Jhoeglis Fonseca",23,12341.9,"elperritojuan","1234masmelo");
		cliente = new Cliente();
	}



	public void crear_bebidas() {
		almacen_bebidas[0] = new Bebida("Colombiana","Gaseosa","Bebida azucarada, sabor artifical colombiana", 600,877,9878,32); 
		almacen_bebidas[1] = new Bebida("Sprite","Gaseosa","Bebida azucarada, sabor artifical efervescente", 600,877,9878,43); 
		almacen_bebidas[2] = new Bebida("Coca cola","Gaseosa","Bebida azucarada, sabor artifical cola", 600,877,9878,50); 
		almacen_bebidas[3] = new Bebida("Leche achocolatada","Leche","Leche con sabor artificial chocolate", 600,877,9878,10); 
		almacen_bebidas[4] = new Bebida("Jugo hit piña naranja","Jugo","Bebida con sabor artificial a Piña Naranja", 600,877,9878,56); 
		almacen_bebidas[5] = new Bebida("Jugo hit mora","Jugo","Bebida con sabor artificial a Mora", 600,877,9878,66); 
		almacen_bebidas[6] = new Bebida("Jugo hit frutos tropicales","Jugo","Bebida con sabor artificial a Frutos Tropicales", 600,877,9878,23); 
		almacen_bebidas[7] = new Bebida("Jugo hit mango","Jugo","Bebida con sabor artificial a Mango", 600,877,9878,91); 
		almacen_bebidas[8] = new Bebida("Agua con gas manzana","Agua","Agua con gas saborizada a Manzana", 600,877,9878,30); 
		almacen_bebidas[9] = new Bebida("Agua con gas frutos rojos","Agua","Agua con gas saborizada a Frutos Rojos", 600,877,9878,30); 	
	}
	
	public void crear_dulce_unidad() {
		almacen_dulces[0] = new Dulce_Unidad("Gusanitos","Gomita","Pequeña goma azucarada de colores con azucar",5245,43,(int)(Math.random()*110));
		almacen_dulces[1] = new Dulce_Unidad("Jet","Chocolate","Chocolatina tradicional Colombiana con leche",5245,43,(int)(Math.random()*200));
		almacen_dulces[2] = new Dulce_Unidad("Supercoco","Caramelo","Bombon con trozos de coco 100% natural",5245,43,(int)(Math.random()*200));
		almacen_dulces[3] = new Dulce_Unidad("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",5245,43,(int)(Math.random()*10));
		almacen_dulces[4] = new Dulce_Unidad("Malvisco","Gomita","Es una gomita de colores masticable suave",5245,43,(int)(Math.random()*500));
		almacen_dulces[5] = new Dulce_Unidad("Chocoramo","Torta","Bizcocho de vainilla cubierto de chocolate",5245,43,(int)(Math.random()*230));
		almacen_dulces[6] = new Dulce_Unidad("Barrilete","Caramelo","Caramelo masticable de colores",5245,43,(int)(Math.random()*145));
		almacen_dulces[7] = new Dulce_Unidad("Cintas","Gomita","Gomitas arcoiris azucaradas",5245,43,(int)(Math.random()*50));
		almacen_dulces[8] = new Dulce_Unidad("Burbuja jet","Chocolate","Esfera de Chocolate con relleno",5245,43,(int)(Math.random()*324));
		almacen_dulces[9] = new Dulce_Unidad("Goma feliz","Gomita","Goma artesanal hecha con alcohol",5245,43,(int)(Math.random()*75));	
	}
	
	public void crear_paquete() {
		almacen_paquetes[0] = new Dulce_Paquete("Gusanitos","gomitas","Pequeña goma azucarada de colores con azucar",100,1234,13,10);
		almacen_paquetes[1] = new Dulce_Paquete("Jets","Chocolates","Chocolatina tradicional Colombiana con leche",20,1234,13,5);
		almacen_paquetes[2] = new Dulce_Paquete("Supercocos","Caramelo","Bombon con trozos de coco 100% natural",50,1234,13,8);
		almacen_paquetes[3] = new Dulce_Paquete("Barriletes","Caramelo","Caramelo masticable de colores",25,1234,13,9);
		almacen_paquetes[4] = new Dulce_Paquete("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",25,1234,13,23);
	}
	
	public void calificaciones() {
		calificaciones[0] = new Calificacion("Es una excelente sulceria, todo muy economico",5);
		calificaciones[1] = new Calificacion("Muy agradable lugar, se puede mejorar la velocidad de atencion",3);
		calificaciones[2] = new Calificacion("Los mejores dulces",4);
		calificaciones[3] = new Calificacion("Un amigo tiene mas baratos los dulces",1);
		calificaciones[4] = new Calificacion();
	}

	
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", direccion=" + direccion + "\nALMACEN DE BEBIDAS="
				+ Arrays.toString(almacen_bebidas) + "\nALMACEN DE DULCES=" + Arrays.deepToString(almacen_dulces)
				+ "\nALMACEN DE DULCES POR PAQUETE =" + Arrays.toString(almacen_paquetes) + "\nCALIFICACIONES="
				+ Arrays.toString(calificaciones) + "]";
	}

	
	
	public boolean login_user(boolean estado,String usuario) {
		estado = false;
		if(usuario.equals(trabajador.getUsuario_login())) {
			estado = true;
		}
		return estado;
	}
	public boolean login_contraseña(boolean estado,String contraseña) {
		estado = false;
		if(contraseña.equals(trabajador.getContraseña_login())) {
			estado = true;
		}
		return estado;
	}

	
	public void crear_cliente(String nombre, int edad, int id, int presupuesto) {
		cliente.setNombre(nombre);
		cliente.setEdad(edad);
		cliente.setIdentificación(id);
		cliente.setPresupuesto(presupuesto);
	
	}
}




