package Dulceria;

import java.util.Arrays;

public class Tienda {
	private String nombre;
	private String direccion;
	private int telefono; 
	private String correo; 
	private Bebida almacen_bebidas[];
	private Dulce_Unidad almacen_dulces[];
	private Dulce_Paquete almacen_paquetes[];
	private Calificacion calificaciones[];
	private Encargado trabajador;
	private Cliente cliente;
	private int total_compradulce; 
	private Factura facturas[];
	private int total_comprapaquete; 
	private int total_comprabebida; 
	private int total_ventadulce; 
	private int total_ventapaquete; 
	private int total_ventabebida; 
	private int dinero_invertido; 
	private int dinero_ventas; 
	private int ganancia;
	


	public int getDinero_invertido() {
		return dinero_invertido;
	}
	public void setDinero_invertido(int dinero_invertido) {
		this.dinero_invertido = dinero_invertido;
	}
	public int getDinero_ventas() {
		return dinero_ventas;
	}
	public void setDinero_ventas(int dinero_ventas) {
		this.dinero_ventas = dinero_ventas;
	}
	public int getGanancia() {
		return ganancia;
	}
	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}
	public int getTotal_comprapaquete() {
		return total_comprapaquete;
	}
	public void setTotal_comprapaquete(int total_comprapaquete) {
		this.total_comprapaquete = total_comprapaquete;
	}
	public int getTotal_comprabebida() {
		return total_comprabebida;
	}
	public void setTotal_comprabebida(int total_comprabebida) {
		this.total_comprabebida = total_comprabebida;
	}
	public int getTotal_ventadulce() {
		return total_ventadulce;
	}
	public void setTotal_ventadulce(int total_ventadulce) {
		this.total_ventadulce = total_ventadulce;
	}
	public int getTotal_ventapaquete() {
		return total_ventapaquete;
	}
	public void setTotal_ventapaquete(int total_ventapaquete) {
		this.total_ventapaquete = total_ventapaquete;
	}
	public int getTotal_ventabebida() {
		return total_ventabebida;
	}
	public void setTotal_ventabebida(int total_ventabebida) {
		this.total_ventabebida = total_ventabebida;
	}

	public int getTotal_compradulce() {
		return total_compradulce;
	}
	public void setTotal_compradulce(int total_compradulce) {
		this.total_compradulce = total_compradulce;
	}
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
	
	
	public Factura[] getFacturas() {
		return facturas;
	}
	public void setFacturas(Factura[] facturas) {
		this.facturas = facturas;
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
		
		facturas = new Factura[5];
		for(int i = 0;i<facturas.length;i++) {
			facturas[i] = new Factura();
		}
	}
	
	
	
	public Tienda(String nombre,String direccion, String correo, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correo= correo; 
		this.telefono = telefono; 
		trabajador = new Encargado("Juan Perez",23,12341.9,"elperritojuan","1234masmelo");
		cliente = new Cliente();
		
		
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
		
		facturas = new Factura[5];
		for(int i = 0;i<facturas.length;i++) {
			facturas[i] = new Factura();
		}
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
		calificaciones[0] = new Calificacion("Es una excelente dulceria, todo muy economico",5);
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
	//tambien se mira si el valor de los dulces  se puede pagar con el presupuesto del cliente, se descuentan los dulces y el presupuesto
	//retorna un numero entre 0 y 2, ya que son las tres posibles situaciones que pueden ocurrir
	public int proceso_compra_dulces(int cantidad, String dulce,int num_objeto_vendido, int num_factura) {
		int estado = 0;//si retorna el valor de 0, la cantidad de dulces solicitados es mayor a la de dulces disponibles
		for(int a = 0;a<almacen_dulces.length;a++) {
			if(dulce.equals(almacen_dulces[a].getNombre())) {
				if(cantidad<=getAlmacen_dulces()[a].getCantidad_dulces()) {
					estado = 1;//si retorna 1 el presupuesto del cliente no es sificiente para el pago de los dulces solicitados
					int valor_compra = cantidad*getAlmacen_dulces()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_dulces = getAlmacen_dulces()[a].getCantidad_dulces()-cantidad;
						getAlmacen_dulces()[a].setCantidad_dulces(nueva_cantidad_dulces);
						double nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;//si retorna 2 la compra fue he hecha con exito
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setCantidad(cantidad);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setNombre(dulce);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setValor_venta(valor_compra);
						getFacturas()[num_factura].setTotal_factura(getFacturas()[num_factura].getTotal_factura()+ valor_compra);
						
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
	
	public int proceso_compra_paquetes(String paquete,int cantidad, int num_objeto_vendido, int num_factura) {
		int estado = 0;
		for(int a = 0;a<almacen_paquetes.length;a++) {
			if(paquete.equals(almacen_paquetes[a].getNombre())) {
				if(cantidad<=getAlmacen_paquetes()[a].getCantidad_paquetes()) {
					estado = 1;
					int valor_compra = cantidad*getAlmacen_paquetes()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_paquetes = getAlmacen_paquetes()[a].getCantidad_paquetes()-cantidad;
						getAlmacen_paquetes()[a].setCantidad_paquetes(nueva_cantidad_paquetes);
						double nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setCantidad(cantidad);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setNombre(paquete);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setValor_venta(valor_compra);
						getFacturas()[num_factura].setTotal_factura(getFacturas()[num_factura].getTotal_factura()+ valor_compra);
						
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
	
	
	public int proceso_compra_bebidas(String bebida,int cantidad,int num_objeto_vendido, int num_factura) {
		int estado = 0;
		for(int a = 0;a<almacen_bebidas.length;a++) {
			if(bebida.equals(almacen_bebidas[a].getNombre())) {
				if(cantidad<=getAlmacen_bebidas()[a].getCantidad_bebidas()) {
					estado = 1;
					int valor_compra = cantidad*getAlmacen_bebidas()[a].getPrecio_venta();
					if(valor_compra<cliente.getPresupuesto()) {
						int nueva_cantidad_paquetes = getAlmacen_bebidas()[a].getCantidad_bebidas()-cantidad;
						getAlmacen_bebidas()[a].setCantidad_bebidas(nueva_cantidad_paquetes);
						double nuevo_presupuesto = (getCliente().getPresupuesto())-valor_compra;
						getCliente().setPresupuesto(nuevo_presupuesto);
						estado = 2;
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setCantidad(cantidad);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setNombre(bebida);
						getFacturas()[num_factura].getObjetos_vendidos()[num_objeto_vendido].setValor_venta(valor_compra);
						getFacturas()[num_factura].setTotal_factura(valor_compra);
						
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
	
	public int total_compradul( int i, int total_compradul ) {
	 
		if (i < almacen_dulces.length) {
			
			total_compradul = almacen_dulces[i].getPrecio_compra()* almacen_dulces[i].getCantidad_dulces();
			i++; 
			
			total_compradul = total_compradul(i, total_compradul); 
			
			total_compradulce += total_compradul; 
			
			return total_compradulce;	
		
		} else {
			
			return total_compradul; 
		}
	}
	public int total_comprabebida( int i, int total_comprabebi) {
	
		if (i < almacen_bebidas.length) {
			
			total_comprabebi = almacen_bebidas[i].getPrecio_compra()* almacen_bebidas[i].getCantidad_bebidas(); 
			i++; 
			
			total_comprabebi = total_comprabebida(i, total_comprabebi); 
			
			total_comprabebida += total_comprabebi; 
			
			return total_comprabebida; 	
		
		} else {
			
			return total_comprabebi; 
		}
	}
	
	public int total_comprapaq(int i, int total_comprapaq ) {
	
		if (i < almacen_paquetes.length) {
			
			total_comprapaq = (int) (almacen_paquetes[i].getPrecio_compra() * almacen_paquetes[i].getCantidad_paquetes()) ; 
			i++; 
			
			total_comprapaq = total_comprapaq(i, total_comprapaq); 
			
			total_comprapaquete += total_comprapaq; 
			
			return total_comprapaquete; 	
		
		} else {
			return total_comprapaq; 
		}
	}
	
	public int venta_dulces( int i, int total_ventadul) {
		
    if (i < almacen_dulces.length) {
			
			total_ventadul = almacen_dulces[i].getPrecio_venta()* almacen_dulces[i].getCantidad_dulces();
			i++; 
			
			total_ventadul = venta_dulces(i, total_ventadul ); 
		
			total_ventadulce += total_ventadul; 
			
		return total_ventadulce; 
       
          } else {
        	  
    	   return total_ventadul; 
       }
	}
	public int venta_bebida(int i, int total_ventabebi) {
		
		if  ( i < almacen_bebidas.length) {
			
		 total_ventabebi = almacen_bebidas[i].getPrecio_venta()* almacen_bebidas[i].getCantidad_bebidas(); 
		 i++;
		 
		 total_ventabebi = venta_bebida(i, total_ventabebi); 
		
		total_ventabebida += total_ventabebi; 
		
		return total_ventabebida; 	
		
		} else {
			
			return total_ventabebi; 
		}
	}
	
	public int venta_paquete(int i, int total_ventapaq) {
		
		if (i < almacen_paquetes.length) {
			
			 total_ventapaq = almacen_paquetes[i].getPrecio_venta() * almacen_paquetes[i].getCantidad_paquetes(); 
			 i++;
			 
			 total_ventapaq = venta_paquete( i, total_ventapaq );
			 
			 total_ventapaquete = total_ventapaq; 
			 
			 return total_ventapaquete; 
			
		}else {
			
			return total_ventapaq;
		}
	}
	public int total_dineroinvertido() {
		
		dinero_invertido += total_comprapaquete + total_comprabebida + total_compradulce ;
		
		return dinero_invertido; 
	}
	public int total_dineroventas() {
		
	
		dinero_ventas += total_ventapaquete + total_ventabebida + total_ventadulce ; 
		
		
		return dinero_ventas; 
	}
	public int ganancia () {
		total_dineroinvertido(); 
		total_dineroventas();		
		
		ganancia += dinero_ventas - dinero_invertido; 
					
	    return ganancia; 
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
	
	public String nombres_dulces(int a, String nombre) {
		if(a<almacen_dulces.length) {
			nombre = nombre +"|"+getAlmacen_dulces()[a].getNombre();
			a = a+1;
			nombre = nombres_dulces(a,nombre);
		}
		return nombre;
	}
	public String nombres_paquetes(int a, String nombre) {
		if(a<almacen_paquetes.length) {
			nombre = nombre +"|"+getAlmacen_paquetes()[a].getNombre();
			a = a+1;
			nombre = nombres_paquetes(a,nombre);
		}
		return nombre;
	}
	public String nombres_bebidas(int a,String nombre) {
		if(a<almacen_bebidas.length) {
			nombre = nombre +"|"+getAlmacen_bebidas()[a].getNombre();
			a = a+1;
			nombre=nombres_bebidas(a,nombre);	
		}
		return nombre;
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
	
	public int guardar_serial_factura(int num_factura) {
		int num = (int)(Math.random()*10);
		getFacturas()[num_factura].setNumero_factura(num);
		return num;
	}
	
	public String crear_factura(int num_factura,boolean descuento) {
		System.out.println("ahhahdfsfasd"+ descuento);
		
		String vendidos = "";
		double impuesto = 0;
		if(descuento == true){
			System.out.println("Entro descuento");
			getFacturas()[num_factura].setImpuesto(impuesto);
		}
		else{
			System.out.println("no entro descuento");
			getFacturas()[num_factura].setImpuesto(getFacturas()[num_factura].getTotal_factura()*0.19);
		}
		return "FACTURA CREADA";
	}
	
	public String imprimir_factura(int num_factura) {
		String vendidos = "";
		for(int a = 0;a<getFacturas()[num_factura].getObjetos_vendidos().length;a++) {
			if(!getFacturas()[num_factura].getObjetos_vendidos()[a].getNombre().equals("no")) {
				vendidos = vendidos + "\n" + getFacturas()[num_factura].getObjetos_vendidos()[a].toString();
			}
		}
		return "Serial de factura: " + getFacturas()[num_factura].getNumero_factura() +"\n" + vendidos + "\nTotal sin impuesto: " + getFacturas()[num_factura].getTotal_factura()
				+ "\nImpuesto: " + getFacturas()[num_factura].getImpuesto()  + "\nTotal Final: " + ( getFacturas()[num_factura].getImpuesto() + getFacturas()[num_factura].getTotal_factura()) ;
		
	}
	
	public String historial_facturas() {
		String mensaje = "";
		if(getFacturas()[0].getNumero_factura()==-1) {
			mensaje = "En esta sesion no se han generado facturas";
		}
		else {
			for(int a = 0;a<getFacturas().length;a++) {
				if(getFacturas()[a].getNumero_factura()!=-1) {
					mensaje = mensaje+imprimir_factura(a)+"\n";
				}
			}
		}
		return mensaje;
	}
	

	public String presupesto_disponible() {
		return "El presupuesto disponible es de: " + cliente.getPresupuesto();
	}
	
	
	
}




