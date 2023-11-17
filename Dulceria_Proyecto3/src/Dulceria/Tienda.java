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
	private String correo; 
	private int telefono; 
	
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
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
	
	
	
	public Tienda(String nombre,String direccion, String correo, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo= correo; 
		this.telefono = telefono; 
		
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
		
		
		trabajador = new Encargado("Juan Perez",23,12341.9,"elperritojuan","1234masmelo");
		cliente = new Cliente();
	}
	


	public void crear_bebidas() {
		almacen_bebidas[0] = new Bebida("Colombiana","Gaseosa","Bebida azucarada, sabor artifical colombiana", 2375,2900,400,(int)(Math.random()*110)); 
		almacen_bebidas[1] = new Bebida("Sprite","Gaseosa","Bebida azucarada, sabor artifical efervescente", 2500,3000,1000,(int)(Math.random()*120)); 
		almacen_bebidas[2] = new Bebida("Coca cola","Gaseosa","Bebida azucarada, sabor artifical cola", 8100,10000,3125,(int)(Math.random()*70)); 
		almacen_bebidas[3] = new Bebida("Leche achocolatada","Leche","Leche con sabor artificial chocolate", 1200,1500,200,(int)(Math.random()*770)); 
		almacen_bebidas[4] = new Bebida("Jugo hit piña naranja","Jugo","Bebida con sabor artificial a Piña Naranja", 2000,2500,500,(int)(Math.random()*60)); 
		almacen_bebidas[5] = new Bebida("Jugo hit mora","Jugo","Bebida con sabor artificial a Mora", 2000,2500,500,(int)(Math.random()*880)); 
		almacen_bebidas[6] = new Bebida("Jugo hit frutos tropicales","Jugo","Bebida con sabor artificial a Frutos Tropicales",2000,2500,500,(int)(Math.random()*30)); 
		almacen_bebidas[7] = new Bebida("Jugo hit mango","Jugo","Bebida con sabor artificial a Mango",2000,2500,500,(int)(Math.random()*90)); 
		almacen_bebidas[8] = new Bebida("Agua con gas manzana","Agua","Agua con gas saborizada a Manzana", 1500,2000,600,(int)(Math.random()*150)); 
		almacen_bebidas[9] = new Bebida("Agua con gas frutos rojos","Agua","Agua con gas saborizada a Frutos Rojos", 1500,2000,600,(int)(Math.random()*56)); 	
	}
	
	public void crear_dulce_unidad() {
		almacen_dulces[0] = new Dulce_Unidad("Gusanitos","Gomita","Pequena goma azucarada de colores con azucar",200,400,(int)(Math.random()*110));
		almacen_dulces[1] = new Dulce_Unidad("Jet","Chocolate","Chocolatina tradicional Colombiana con leche",500,800,(int)(Math.random()*200));
		almacen_dulces[2] = new Dulce_Unidad("Supercoco","Caramelo","Bombon con trozos de coco 100% natural",200,300,(int)(Math.random()*200));
		almacen_dulces[3] = new Dulce_Unidad("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",700,1000,(int)(Math.random()*10));
		almacen_dulces[4] = new Dulce_Unidad("Malvisco","Gomita","Es una gomita de colores masticable suave",400,700,(int)(Math.random()*500));
		almacen_dulces[5] = new Dulce_Unidad("Chocoramo","Torta","Bizcocho de vainilla cubierto de chocolate",2000,3500,(int)(Math.random()*230));
		almacen_dulces[6] = new Dulce_Unidad("Barrilete","Caramelo","Caramelo masticable de colores",600,1000,(int)(Math.random()*145));
		almacen_dulces[7] = new Dulce_Unidad("Cintas","Gomita","Gomitas arcoiris azucaradas",600,1000,(int)(Math.random()*50));
		almacen_dulces[8] = new Dulce_Unidad("Burbuja jet","Chocolate","Esfera de Chocolate con relleno",600,1000,(int)(Math.random()*324));
		almacen_dulces[9] = new Dulce_Unidad("Feligoma","Gomita","Goma artesanal hecha con alcohol",1000,2500,(int)(Math.random()*75));	
	}
	
	public void crear_paquete() {
		almacen_paquetes[0] = new Dulce_Paquete("Gusanitos","gomitas","Pequeña goma azucarada de colores con azucar",50,7000,9000,(int)(Math.random()*45));
		almacen_paquetes[1] = new Dulce_Paquete("Jets","Chocolates","Chocolatina tradicional Colombiana con leche",25,10000,12000,(int)(Math.random()*90));
		almacen_paquetes[2] = new Dulce_Paquete("Supercocos","Caramelo","Bombon con trozos de coco 100% natural",50,6000,8000,(int)(Math.random()*46));
		almacen_paquetes[3] = new Dulce_Paquete("Barriletes","Caramelo","Caramelo masticable de colores",25,5000,7300,(int)(Math.random()*123));
		almacen_paquetes[4] = new Dulce_Paquete("Chupetin","Caramelo","Caramelo duro, con variedad de sabores",25,3000,5400,(int)(Math.random()*39));
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
	
	public void nueva_calificacion(String comentario, int calificacion) {
		getCalificaciones()[4].setComentario(comentario);
		getCalificaciones()[4].setNumero(calificacion);
	}
	
	public String ver_calificaciones() {
		return Arrays.toString(calificaciones);
	}
	
	
	
	
	
	//metodo para saber si el objeto digitado por el cliente esta disponible retornara un valor boolean si es false el objeto no esta disponible 
	//si retorna true el objeto esta disponible
	public boolean disponibilidad_dulces(String dulce) {
		boolean disponibilidad = false;
		for(int a = 0;a<almacen_dulces.length;a++) {
			if(dulce.equals(almacen_dulces[a].getNombre())) {
				disponibilidad = true;
			}
		}
		return disponibilidad;
	}
	
	//metodo donde se inicia como tal la compra, se analiza si la cantidad de dulces que necesita el cliente esta disponible en el almacen
	//tambien se mira si el valor de los dulces es se puede pagar con el presupuesto del cliente, se descuentan los dulces y el presupuesto
	//retorna un numero entre 0 y 2, ya que son las tres posibles situaciones que pueden ocurrir
	public int proceso_compra_dulces(int cantidad, String dulce) {
		int estado = 0;//si retorna el valor de 0, la cantidad de dulces solicitados es mayor a la de dulces disponibles
		for(int a = 0;a<almacen_dulces.length;a++) {
			if(dulce.equals(almacen_dulces[a].getNombre())) {
				if(cantidad<=getAlmacen_dulces()[a].getCantidad_dulces()) {
					estado = 1;//si retorna 1 el presupuesto del cliente no es sificiente para el pago de los dulces solicitados
					int valor_compra = cantidad*getAlmacen_dulces()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_dulces = getAlmacen_dulces()[a].getCantidad_dulces()-cantidad;
						getAlmacen_dulces()[a].setCantidad_dulces(nueva_cantidad_dulces);
						int nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;//si retorna 2 la compra fue he hecha con exito
					}
				}
			}
		}
		return estado;
	}

	
	
	public boolean disponibilidad_paquetes(String paquete) {
		boolean disponibilidad = false;
		for(int a = 0;a<almacen_paquetes.length;a++) {
			if(paquete.equals(almacen_paquetes[a].getNombre())) {
				disponibilidad = true;
			}
		}
		return disponibilidad;
	}
	
	public int proceso_compra_paquetes(String paquete,int cantidad) {
		int estado = 0;
		for(int a = 0;a<almacen_paquetes.length;a++) {
			if(paquete.equals(almacen_paquetes[a].getNombre())) {
				if(cantidad<=getAlmacen_paquetes()[a].getCantidad_paquetes()) {
					estado = 1;
					int valor_compra = cantidad*getAlmacen_paquetes()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_paquetes = getAlmacen_paquetes()[a].getCantidad_paquetes()-cantidad;
						getAlmacen_paquetes()[a].setCantidad_paquetes(nueva_cantidad_paquetes);
						int nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;
					}
				}
			}
		}
		return estado;
	}
	
	
	public boolean disponibilidad_bebidas(String bebida) {
		boolean disponibilidad = false;
		for(int a = 0;a<almacen_bebidas.length;a++) {
			if(bebida.equals(almacen_bebidas[a].getNombre())){
				disponibilidad = true;
			}
		}
		return disponibilidad;
	}
	
	
	public int proceso_compra_bebidas(String bebida,int cantidad) {
		int estado = 0;
		for(int a = 0;a<almacen_bebidas.length;a++) {
			if(bebida.equals(almacen_bebidas[a].getNombre())) {
				if(cantidad<=getAlmacen_bebidas()[a].getCantidad_bebidas()) {
					estado = 1;
					int valor_compra = cantidad*getAlmacen_bebidas()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_paquetes = getAlmacen_bebidas()[a].getCantidad_bebidas()-cantidad;
						getAlmacen_bebidas()[a].setCantidad_bebidas(nueva_cantidad_paquetes);
						int nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;
					}
				}
			}
		}
		return estado;
	}
	
	public boolean mayor_edad() {
		boolean edad = false;
		if(cliente.getEdad()>=18) {
			edad = true;
		}
		return edad;
	}
	public void total_compradulce( Finanza f) {
		int  totalventa_dulce = 0; 
		int totalcompra_dulce = 0; 
		
		for (int i = 0; i < almacen_dulces.length; i ++ ) {
			
			int venta_dulces = almacen_dulces[i].getPrecio_venta() * almacen_dulces[i].getCantidad_dulces(); 	
			
			int compra_dulces = almacen_dulces[i].getPrecio_compra()* almacen_dulces[i].getCantidad_dulces(); 
		 
			totalventa_dulce += venta_dulces;
			totalcompra_dulce += compra_dulces; 
		
		}
		
		f.setVenta_dulce(totalventa_dulce);
		f.setCompra_dulce(totalcompra_dulce);
		
	}
	public void total_comprabebida(Finanza f) {
		
		int  totalventa_bebida = 0; 
		int totalcompra_bebida = 0; 
		
		for (int i = 0; i < almacen_bebidas.length; i ++ ) {
			
			int venta_bebida= almacen_bebidas[i].getPrecio_venta()* almacen_bebidas[i].getCantidad_bebidas();
			int compra_bebida = almacen_bebidas[i].getPrecio_compra()* almacen_bebidas[i].getCantidad_bebidas();
			
			totalventa_bebida += venta_bebida; 
			totalcompra_bebida += compra_bebida; 
		 }
		f.setVenta_bebida(totalventa_bebida);
		f.setCompra_bebida(totalcompra_bebida);
	}
	
	public void total_comprapaq(Finanza f) {
		int  totalventa_paquete = 0; 
		int totalcompra_paquete = 0; 
		
		for (int i = 0; i < almacen_paquetes.length; i ++ ) {
			
			int venta_paquete = almacen_paquetes[i].getPrecio_venta()* almacen_paquetes[i].getCantidad(); 
			int compra_paquete = (int) (almacen_paquetes[i].getPrecio_compra()* almacen_paquetes[i].getCantidad()); 
			
			totalventa_paquete += venta_paquete; 
			totalcompra_paquete += compra_paquete; 
			
		}
		f.setVenta_paquete(totalventa_paquete);
		f.setCompra_paquete(totalcompra_paquete);
	}
	

	
	public String editar_dulce(String buscar_dulce,String nombre, String tipo, String descripcion, int valor_compra, int valor_venta, int cantidad) {
		String dulce_editado = "";
		for(int a = 0; a<almacen_dulces.length ;a++){
			if(buscar_dulce.equals(almacen_dulces[a].getNombre())) {
			if(!nombre.equals("no")) {
				getAlmacen_dulces()[a].setNombre(nombre);
			}
			if(!tipo.equals("no")) {
				getAlmacen_dulces()[a].setTipo(tipo);
			}
			if(!descripcion.equals("no")) {
				getAlmacen_dulces()[a].setDescripcion(descripcion);
			}
			if(valor_compra!=0) {
				getAlmacen_dulces()[a].setPrecio_compra(valor_compra);
			}
			if(valor_venta!=0) {
				getAlmacen_dulces()[a].setPrecio_venta(valor_venta);
			}
			if(cantidad!=0) {
				getAlmacen_dulces()[a].setCantidad_dulces(cantidad);
			}
			dulce_editado = getAlmacen_dulces()[a].toString();
			}
		}
		
		return dulce_editado;
	}
	
	public String editar_paquetes(String buscar_paquete,String nombre, String tipo, String descripcion,int valor_compra,int valor_venta, int cantidad) {
		String paquete_editado = "";
		for(int a = 0; a<almacen_paquetes.length ;a++){
			if(buscar_paquete.equals(almacen_paquetes[a].getNombre())) {
			if(!nombre.equals("no")) {
				getAlmacen_paquetes()[a].setNombre(nombre);
			}
			if(!tipo.equals("no")) {
				getAlmacen_paquetes()[a].setTipo(tipo);
			}
			if(!descripcion.equals("no")) {
				getAlmacen_paquetes()[a].setDescripcion(descripcion);
			}
			if(valor_compra!=0) {
				getAlmacen_paquetes()[a].setPrecio_compra(valor_compra);
			}
			if(valor_venta!=0) {
				getAlmacen_paquetes()[a].setPrecio_venta(valor_venta);
			}
			if(cantidad!=0) {
				getAlmacen_paquetes()[a].setCantidad_paquetes(cantidad);
			}
			paquete_editado = getAlmacen_paquetes()[a].toString();
			}
		}
		return paquete_editado;
	}
	
	public String editar_bebidas(String buscar_bebida,String nombre, String tipo, String descripcion,int valor_compra,int valor_venta, int cantidad) {
		String bebida_editada = "";
		for(int a = 0; a<almacen_bebidas.length ;a++){
			if(buscar_bebida.equals(almacen_bebidas[a].getNombre())) {
			if(!nombre.equals("no")) {
				getAlmacen_bebidas()[a].setNombre(nombre);
			}
			if(!tipo.equals("no")) {
				getAlmacen_bebidas()[a].setTipo(tipo);
			}
			if(!descripcion.equals("no")) {
				getAlmacen_bebidas()[a].setDescripcion(descripcion);
			}
			if(valor_compra!=0) {
				getAlmacen_bebidas()[a].setPrecio_compra(valor_compra);
			}
			if(valor_venta!=0) {
				getAlmacen_bebidas()[a].setPrecio_venta(valor_venta);
			}
			if(cantidad!=0) {
				getAlmacen_bebidas()[a].setCantidad_bebidas(cantidad);
			}
			bebida_editada = getAlmacen_bebidas()[a].toString();
			}
		}
		return bebida_editada;
	}
	
	public String nombres_dulces() {
		String nombre_dulces = "";
		for(int a = 0; a<almacen_dulces.length;a++) {
			nombre_dulces = nombre_dulces + "|" + getAlmacen_dulces()[a].getNombre(); 
		}
		return nombre_dulces;
	}
	public String nombres_paquetes() {
		String nombre_paquetes = "";
		for(int a = 0; a<almacen_paquetes.length;a++) {
			nombre_paquetes = nombre_paquetes + "|" + getAlmacen_paquetes()[a].getNombre();
		}
		return nombre_paquetes;
	}
	public String nombres_bebidas() {
		String nombre_bebidas = "";
		for(int a = 0;a<almacen_bebidas.length;a++) {
			nombre_bebidas = nombre_bebidas + "|" + getAlmacen_bebidas()[a].getNombre();
		}
		return nombre_bebidas;
	}
	
	public String editar_usuario(String usuario_actual, String nuevo_usuario) {
		String mensaje = "";
		System.out.println();
		if(login_user(false, usuario_actual)==true) {
			trabajador.setUsuario_login(nuevo_usuario);
			mensaje = "Usuario actualizado correctamente";
		}
		else {
			mensaje = "El usuario no coincide, usuario no actualizado";
		}
		return mensaje;
	}
	
	
	public String editar_contraseña(String contraseña_actual, String contraseña1,String contraseña2) {
		String mensaje = "";
		if(login_contraseña(false, contraseña_actual)==true) {
			if(contraseña1.equals(contraseña2)) {
				trabajador.setContraseña_login(contraseña1);
				mensaje = "Contraseña actualizada correctamente";
			}
			else {
				mensaje = "La nueva contraseña no coincide";
			}
		}
		else {
			mensaje = "La contraseña actual no coincide";
		}
		return mensaje;
	}
	
	
}




