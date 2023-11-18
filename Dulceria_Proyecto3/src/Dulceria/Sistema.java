package Dulceria;
import java.util.Arrays;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		   

		Scanner sc = new Scanner(System.in);
		Sistema s = new Sistema();
		
		
		Tienda tienda = new Tienda("Ciocolatto ","Cra 4 # 8-71", "Ciocolatto@gmail.com", 320456788);
		
		//System.out.println(Arrays.toString(tienda.getAlmacen_dulces()));
		
		int option1 = 0;
		while(option1!=3) {
			System.out.println("TIPO DE ACCESO---1.Encargado--2.Cliente--3.Salir de la Dulceria");
			option1 = sc.nextInt();
			switch(option1) {
			case 1:{
				 if(s.validar_encargado(tienda)==true) {

					 System.out.println("Eliga la opcion de encargado");
			
			 int option5 = 0;
					 while(option5!=4) {
						 System.out.println("LAS OPCIONES DISPONIBLES EN EL MENU DE ENCARGADO, SON: "
									+ "\n1.Editar productos de la tienda\n2.Editar propiedades de la tienda\n3.Opciones de contabilidad\n4.Salir");
						 option5 = sc.nextInt();
						 switch(option5) {
						 case 1:{
							 s.editar_productos(tienda,s);
							 break;
						 }
						 case 2:{
							 s.editar_propiedades(tienda);
							 break;
						 }
						 case 3:{
							 s.gananciastienda( tienda);
						 }
						 case 4:{
							 System.out.println("SESION DE ENCARGADO CERRADA");
							 break;
						 }
						 default:{
							 System.out.println("Eliga una de las opciones disponibles");
							 break;
						 }
						 }
					 }				 

				 }
				 else{
					 System.out.println("Usuario bloqueado, sesion cerrada");
					 option1 = 3;
				 }
				 break;
			}
			case 2:{
				s.crear_usuario(tienda);
				int num_factura = 0;
				System.out.println("El cliente ha sido creado con los siguientes datos:\n" + tienda.getCliente().toString());
				int option2 = 0;
				while(option2!=8) {
					s.menu_cliente();
					option2 = sc.nextInt();
					switch(option2) {
					case 1:{
						System.out.println("Los dulces disponibles son:" + Arrays.toString(tienda.getAlmacen_dulces()));
						break;
					}
					case 2:{
						System.out.println("Los paquetes de dulces disponibles son:\n" + Arrays.toString(tienda.getAlmacen_paquetes()));
						break;
					}
					case 3:{
						System.out.println("Las bebidas disponibles son:\n" + Arrays.toString(tienda.getAlmacen_bebidas()));
						break;
					}
					case 4:{
						s.menu_compras(tienda,s,num_factura);
						num_factura = num_factura +1 ;
						break;
					}
					case 5: {
						System.out.println(tienda.historial_facturas()); 
						break;
					}
					case 6:{
						System.out.println(tienda.ver_calificaciones());
						break;
					}
					case 7:{
						s.ayuda(tienda);
						break; 
					 }
					case 8:{
						option1 = 3;
						System.out.println("Gracias por visitar nuestra dulceria, antes de abandonarla ayudanos con una encuesta de satisfaccion para mejorar la experiencia");
						s.encuesta(tienda);
						break;
					}
					default:{
						System.out.println("Eliga una de las opciones disponibles");
						break;
					}
				  }
				}
				
				break;
			}
			case 3:{
				System.out.println("Saliendo del programa");
				break;
			}
			}
			
		}

		
		
		
	}
	
	public void encuesta(Tienda tienda) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un comentario su experiencia en la dulceria");
		String comentario = sc.nextLine();
		int calificacion = 0;
		do {
		System.out.println("Entre 0-5, califique su experiencia en la dulceria");
		calificacion = sc.nextInt();
		}while(calificacion<0||calificacion>5);
		tienda.nueva_calificacion(comentario, calificacion);
		
	}
	
	
	public String ordenar_letras(String palabra) {
		//Este metodo se usa ya que si el usuario no digita en la palabra deseada, la primera en mayuscula, no se podra identificar si 
		//el objeto que busca esta disponible
		String resultado = palabra.toUpperCase().charAt(0) + palabra.substring(1, palabra.length()).toLowerCase();
		return resultado;
	}

	
	
	public void menu_compras(Tienda tienda, Sistema s, int num_factura) {
		
		Scanner sc = new Scanner(System.in);
		Scanner ac = new Scanner(System.in);
		tienda.guardar_serial_factura(num_factura);
		int num_objeto_vendido = 0;
		int option3 = 0;
		System.out.println("Solo se puede hacer la compra de 5 productos por factura");
		while(option3 !=4&&num_objeto_vendido<2) {
			System.out.println("LOS OBJETOS DISPONIBLES PARA LA VENTA SON, ELIGA UNO:"
					+ "\n1.Dulces Por Unidad \n2.Dulces Por Paquete \n3.Bebidas \n4.Salir de menu de compras");
			option3 = sc.nextInt();
			switch(option3) {
			case 1:{
				System.out.println("Los dulces disponibles son:" + Arrays.toString(tienda.getAlmacen_dulces()));
				System.out.println("ESCRIBA EL NOMBRE DEL DULCE QUE DESEA COMPRAR");
				String dulce = ac.nextLine();
				dulce = s.ordenar_letras(dulce);
				if(dulce.equals("Feligoma")) {
					if(tienda.mayor_edad()==true) {
						System.out.println("Si cuenta con la edad para comprar esta gomita");
						num_objeto_vendido = s.compra_de_dulces(tienda, dulce, num_objeto_vendido, num_factura);//se crea la venta de los dulces por unidad como un metodo para cuando se necesite hacer la verificacion de mayoria de edad de la gomita alcoholica
					}
					else {
						System.out.println("No tienes la edad para venderte este dulce, no eres mayor de edad");
					}
				}
				else {
					num_objeto_vendido = s.compra_de_dulces(tienda, dulce,num_objeto_vendido, num_factura);
				}
				break;
			}
			case 2 :{
				System.out.println("Los paquetes de dulces disponibles son: \n"+Arrays.toString(tienda.getAlmacen_paquetes()));
				System.out.println("ESCRIBA EL NOMBRE DEL PAQUETE DE DULCES QUE DESEA COMPRAR");
				String paquete = ac.nextLine();
				paquete = s.ordenar_letras(paquete);
				if(tienda.disponibilidad_paquetes(paquete)==true) {
					System.out.println("Escriba la cantidad de paquetes de " + paquete + " que desea comprar");
					int cantidad = sc.nextInt();
					
					int estado_compra = tienda.proceso_compra_paquetes(paquete, cantidad,num_objeto_vendido,num_factura);
					
					if(estado_compra == 0){
						System.out.println("No se cuenta en el inventario con la cantidad de paquetes necesitados, por lo que no se puede completar la venta");
					}
					else if(estado_compra==1) {
						System.out.println("El presupuesto no es suficiente para la compra");
					}
					else {
						System.out.println("Compra realizada");
						num_objeto_vendido = num_objeto_vendido +1; 					
					}
				}
				else {
					System.out.println("El paquete " + paquete + " no esta disponible");
				}
				break;
			}
			case 3:{
				System.out.println("Las bebidas disponibles son:\n " + Arrays.toString(tienda.getAlmacen_bebidas()));
				System.out.println("ESCRIBA EL NOMBRE DE LA BEBIDA QUE DESEA COMPRAR");
				String bebida = ac.nextLine();
				bebida = s.ordenar_letras(bebida);
				if(tienda.disponibilidad_bebidas(bebida)==true) {
					System.out.println("Escriba la cantidad de bebidas de " + bebida+ " que desea comprar");
					int cantidad = sc.nextInt();
					int estado_compra = tienda.proceso_compra_bebidas(bebida, cantidad,num_objeto_vendido, num_factura);
					if(estado_compra == 0) {
						System.out.println("No se cuenta en el inventario con la cantidad de paquetes necesitados, por lo que no se puede completar la venta");
					}
					else if(estado_compra==1){
						System.out.println("El presupuesto no es suficiente para la compra");
					}
					else {
						System.out.println("Compra realizada");
						num_objeto_vendido = num_objeto_vendido +1; 
						
					}
				}
				else {
					System.out.println("El paquete " + bebida + " no esta disponible");
				}
				break;	
			}
			}
		}
		System.out.println(tienda.imprimir_factura(num_factura));
	}
	
	
	public int compra_de_dulces(Tienda tienda, String dulce, int num_objeto_vendido, int num_factura) {
		Scanner sc = new Scanner(System.in);
		if(tienda.disponibilidad_dulces(dulce) == true) {
			System.out.println("Escriba la cantidad de unidades de "+ dulce +" que desea comprar");
			int cantidad = sc.nextInt();
			int estado_compra = tienda.proceso_compra_dulces(cantidad, dulce,num_objeto_vendido,num_factura);
			if(estado_compra==0) {
				System.out.println("No se cuenta en el inventario con la cantidad de dulces necesitados, por lo que no se puede completar la venta");
			}
			else if(estado_compra==1) {
				System.out.println("El presupuesto no es suficiente para la compra");
			}
			else {
				System.out.println("Compra realizada");
				num_objeto_vendido = num_objeto_vendido +1;
				
			}
		}
		else {
			System.out.println("El dulce " + dulce + " no se encuentra en el inventario");
		}
		return num_objeto_vendido;
	}
	
	public void menu_cliente() {
		System.out.println("LAS OPCIONES DISPONIBLES EN NUESTRO MENU, SON:"
				+ "\n1.Gomitas por Unidad disponibles"
				+ "\n2.Paquetes de Gomitas disponibles"
				+ "\n3.Bebidas disponibles"
				+ "\n4.Realizar compra"
				+ "\n5.Ver historial de compras"
				+ "\n6.Ver reseñas"
				+ "\n7.Ayuda"
				+ "\n8.Salir");
	}
	
	public void crear_usuario(Tienda tienda) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido a la dulceria " + tienda.getNombre() + "estamos ubicados en " + tienda.getDirreccion()
		+ "\nGracias por preferirnos, por favor para iniciar su proceso de compra digite los siguiente datos");
		System.out.println("Escriba su nombre");
		String nombre = sc.next();
		System.out.println("Escriba su edad");
		int edad = sc.nextInt();
		System.out.println("EScriba su numero de identificacion");
		int id = sc.nextInt();
		System.out.println("Escriba el presupuesto con el que cuenta");
		int presupuesto = sc.nextInt();
		
		tienda.crear_cliente(nombre, edad, id, presupuesto);	
		
	}
	
	public boolean validar_encargado(Tienda tienda) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Buen dia querido encargado. Ingresar los datos pedidos, recuerde que solo cuenta con 3 intentos" );
		boolean estado = false;
		boolean validacion = false;
		int contador = 0;
		while(contador<3&&validacion!=true) {
			System.out.println("INTENTO "+(contador+1)+" Escriba su usuario");
			String usuario = sc.next();
			if(tienda.login_user(estado, usuario)==true) {
				System.out.println("Escriba su contraseña");
				String contraseña = sc.next();
				if(tienda.login_contraseña(estado, contraseña)==true) {
					System.out.println("Ingresando");
					validacion = true;
				}
				else {
					System.out.println("Contraseña incorrecta");
					contador++;
				}
			}
			else {
				System.out.println("Usuario incorrecto");
				contador++;
			}
			
		}
		return validacion;
	}
	
	public void ayuda(Tienda tienda) {
		Scanner sc = new Scanner(System.in); 
		int opci= 0; 
	
		while (opci != 3) {
			
			System.out.println("\nHola! te has comunicado con el asistente virtual de Ciocolatto");
			System.out.println("\nEn que puedo ayudarte hoy?");
			System.out.println("\n1.Preguntas frecuentes");
			System.out.println("\n2.Comunicarte con un asesor");
			System.out.println("\n3.Salir");
			opci = sc.nextInt(); 
			
			switch (opci) {
			
			case 1: {
				int opcion = 0; 
				 while (opcion != 5) {
					
	            System.out.println("\n1.Como realizar la compra?");
    			System.out.println("\n2.Donde recoger tu pedido?");
    			System.out.println("\n3.Cuanto demora la entrega de tu pedido?");
    			System.out.println("\n4.Donde realizar reclamos?");
    			System.out.println("\n5.Salir");
    			
    			 System.out.println("\nDigita el numero de la pregunta a la que desees acceder");
				 opcion = sc.nextInt();
	    			switch (opcion) {
	    			
	    			case 1: {
	    				System.out.println("Para realizar la comprar dirigete al menu anterior y completa los pasos indicados para obtener tu producto deseado."); 
	    				break;}
	    			case 2: {
	    				System.out.println("Si deseas recoger tu pedido en tienda, visitanos en: Cra 4 # 8-71. ");
	    				break; }
	    			case 3: {
	    				System.out.println("Si tu pedido es dentro de la ciudad, alrededor de 3 horas, si es envio nacional, los tiempos dependen de las transportadoras.");
	    				break;} 
	    			case 4: {
	    				System.out.println("Puedes dirigirte al menu anterior y comunicarte con un asesor. ");
	    				break;} 
	    			default: {
	    				System.out.println("opcion no valida, ingrese un numero correctamente");
	    			break; }
	    			}
	    		}
		 break;
			}
			case 2: {
				System.out.println("Nuestras lineas de atencion son: ");
				System.out.println("\nTelefono: " + tienda.getTelefono());
				System.out.println("\nCorreo: " + tienda.getCorreo());
				break; 
			   }
			default: {
				System.out.println("\nIngrese la opcion correcta ");
			}
		  }
		}
		
	}
	
	public void gananciastienda(Tienda tienda) {
		Scanner sc = new Scanner(System.in); 
		
		int opcion = 0; 
		
	
		while (opcion !=4) {
			
		System.out.println("\nBienvenido al sistema de finanzas de Ciocolattto"
				+ "\nQue desea realizar el dia de hoy?");
		
		System.out.println("\n1.Observar el dinero invertido"
				+ "\n2.Observar dinero resultante de las ventas"
				+ "\n3.Observar las ganancias estimadas"
				+ "\n4.Salir");
		   opcion = sc.nextInt(); 
		   
		   tienda.total_comprabebida(0, 0);
		   tienda.total_compradul(0,0);
		   tienda.total_comprapaq(0,0);
		   tienda.venta_dulces(0, 0);
		   tienda.venta_bebida(0, 0);
		   tienda.venta_paquete(0, 0);
		   tienda.total_dineroinvertido();
		   tienda.total_dineroinvertido();
		   tienda.total_dineroventas();
		   tienda.ganancia();
		   
		   switch (opcion) {
		   case 1:{
			    System.out.println("\nDinero invertido en dulces: " + tienda.getTotal_compradulce() );
			    System.out.println("\nDinero invertido en bebidas: " + tienda.getTotal_comprabebida() );
			    System.out.println("\nDinero invertido en dulces por paquetes: " + tienda.getTotal_comprapaquete());
			    System.out.println("\nDinero invertido en total de inventario: " + tienda.getDinero_invertido());
		   break;}
		   
		   case 2 :{
			   System.out.println("\nDinero en venta de dulces: " + tienda.getTotal_ventadulce());
			   System.out.println("\nDinero en venta de bebidas: " + tienda.getTotal_ventabebida() );
			   System.out.println("\nDinero en venta de dulces por paquete: " + tienda.getTotal_comprapaquete());
			   System.out.println("\nDinero estimado en ventas: " + tienda.getDinero_ventas() );
		   break;}
		   
		   case 3 : {
			   System.out.println("Ganancias estimadas con todo el inventario de la tienda: " + tienda.getGanancia());
		   break; }
		   case 4:{
			   System.out.println("Vamos por mas felicidad para los clientes y ganancias para la tienda");
			   break;
		     }
		   }
		}
	}
	
	public void editar_productos(Tienda tienda,Sistema s) {
		Scanner ac = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int option4 = 0;
		while(option4!=4){
			System.out.println("Este es el menu para editar productos de la tienda, eliga que opcion desea editar"
					+ "\n1.Editar dulces por unidad\n2.Editar dulces por paquete\n3.Editar bebidas\n4.Salir");
			option4 = sc.nextInt();
			switch(option4) {
			case 1:{
				System.out.println("Escriba el nombre del dulce que desea editar ("+tienda.nombres_dulces(0,"")+")");
				String dulce = sc.next();
				dulce = s.ordenar_letras(dulce);
				if(tienda.disponibilidad_dulces(dulce)==true) {
					System.out.println("A continuacion digite lo que quiere editar segun lo pida el sistema, si no quiere editar algun objeto digite 'no'");
					System.out.println("Escriba el nuevo nombre, si no lo quiere editar, digite 'no'");
					String nuevo_nombre_dulce = sc.next();
					System.out.println("Los dulces pueden ser gomitas, chocolates, bombones o caramelos");
					String tipo = sc.next();
					System.out.println("Escriba una nueva descripcion para el producto");
					String descripcion = ac.nextLine();
					System.out.println("A partir de ahora si no quiere editar, escriba 0");
					int nuevo_precio_compra = 0;
					do {
						System.out.println("Escriba nuevo precio de compra");
						nuevo_precio_compra = sc.nextInt();
					}while(nuevo_precio_compra<0);
					int nuevo_precio_venta = 0;
					do {
						System.out.println("Escriba nuevo precio de venta");
						nuevo_precio_venta = sc.nextInt();
					}while(nuevo_precio_venta<0);
					int nueva_cantidad = 0;
					do {
						System.out.println("Escriba la nueva cantidad de gomas disponibles\"");
						nueva_cantidad = sc.nextInt();
					}while(nueva_cantidad<0);
					System.out.println("El dulce modificado es: " + tienda.editar_dulce(dulce, nuevo_nombre_dulce, tipo, descripcion, nuevo_precio_compra, nuevo_precio_venta, nueva_cantidad));

				}
				else {
					System.out.println("El dulce no se encuentra en el inventario");
				}
				break;
			}
			case 2:{
				System.out.println("Escriba el nombre de paquete de dulces que desea editar ("+tienda.nombres_paquetes(0,"")+")");
				String paquete = ac.nextLine();
				paquete = s.ordenar_letras(paquete);
				if(tienda.disponibilidad_paquetes(paquete)==true) {
					System.out.println("A continuacion digite lo que quiere editar segun lo pida el sistema, si no quiere editar algun objeto digite 'no'");
					System.out.println("Escriba el nuevo nombre, si no lo quiere editar, digite 'no'");
					String nuevo_nombre_paquete = ac.nextLine();
					System.out.println("Los paquetes de dulces pueden ser gomitas, chocolates, bombones o caramelos");
					String tipo = sc.next();
					System.out.println("Escriba una nueva descripcion para el producto");
					String descripcion = ac.nextLine();
					System.out.println("A partir de ahora si no quiere editar, escriba 0");
					int nuevo_precio_compra = 0;
					do {
						System.out.println("Escriba nuevo precio de compra");
						nuevo_precio_compra = sc.nextInt();
					}while(nuevo_precio_compra<0);
					int nuevo_precio_venta = 0;
					do {
						System.out.println("Escriba nuevo precio de venta");
						nuevo_precio_venta = sc.nextInt();
					}while(nuevo_precio_venta<0);
					int nueva_cantidad = 0;
					do {
						System.out.println("Escriba la nueva cantidad de paquetes disponibles\"");
						nueva_cantidad = sc.nextInt();
					}while(nueva_cantidad<0);
					System.out.println("El paquete modificado es: " + tienda.editar_paquetes(paquete, nuevo_nombre_paquete, tipo, descripcion, nuevo_precio_compra, nuevo_precio_venta, nueva_cantidad));
				}
				else {
					System.out.println("El paquete "+paquete+"no se encuentra en el inventario");
				}
				break;
			}
			case 3:{
				System.out.println("Escriba el nombre de la bebida que quiere editar \n("+tienda.nombres_bebidas(0,"")+")");
				String bebida = ac.nextLine();
				bebida = s.ordenar_letras(bebida);
				if(tienda.disponibilidad_bebidas(bebida)==true) {
					System.out.println("A continuacion digite lo que quiere editar segun lo pida el sistema, si no quiere editar algun objeto digite 'no'");
					System.out.println("Escriba el nuevo nombre, si no lo quiere editar, digite 'no'");
					String nuevo_nombre_bebida = ac.nextLine();
					System.out.println("Las bebidas pueden ser bebidas azucaradas, jugos o aguas");
					String tipo = ac.nextLine();
					System.out.println("Escriba una nueva descripcion para el producto");
					String descripcion = ac.nextLine();
					System.out.println("A partir de ahora si no quiere editar, escriba 0");
					int nuevo_precio_compra = 0;
					do {
						System.out.println("Escriba nuevo precio de compra");
						nuevo_precio_compra = sc.nextInt();
					}while(nuevo_precio_compra<0);
					int nuevo_precio_venta = 0;
					do {
						System.out.println("Escriba nuevo precio de venta");
						nuevo_precio_venta = sc.nextInt();
					}while(nuevo_precio_venta<0);
					int nueva_cantidad = 0;
					do {
						System.out.println("Escriba la nueva cantidad de bebidas disponibles\"");
						nueva_cantidad = sc.nextInt();
					}while(nueva_cantidad<0);
					System.out.println("La bebida modificada es: " + tienda.editar_bebidas(bebida, nuevo_nombre_bebida, tipo, descripcion, nuevo_precio_compra, nuevo_precio_venta, nueva_cantidad));
				}
				else {
					System.out.println("La bebida "+bebida+" no se encuentra disponible ");
				}
				break;
			}
			}
			
		}
			
	}
	
	public void editar_propiedades(Tienda tienda) {
		Scanner sc = new Scanner(System.in);
		int option6 = 0;
		while(option6 !=5) {
			System.out.println("Elija el numero de la opcion a editar:\n1.Cambiar usuario\n2.Cambiar contraseña\n3.Editar nombre de tienda\n4.Editar dirrecion\n5.Salir");
			option6 = sc.nextInt();
			switch(option6){
			case 1:{
				System.out.println("Escriba el usuario actual");
				String usuario_actual = sc.next();
				System.out.println("Escriba el nuevo usuario");
				String nuevo_usuario = sc.next();
				System.out.println(tienda.editar_usuario(usuario_actual, nuevo_usuario));
				break;
			}
			case 2:{
				System.out.println("Escriba la contraseña actual");
				String contraseña_actual = sc.next();
				System.out.println("Escriba la nueva contraseña");
				String nueva_contraseña1 = sc.next();
				System.out.println("Escriba de nuevo la nueva contraseña");
				String nueva_contraseña2 = sc.next();
				System.out.println(tienda.editar_contraseña(contraseña_actual, nueva_contraseña1, nueva_contraseña2));
				break;
			}
			case 3:{
				System.out.println("Escriba el nuevo nombre de la tienda");
				String nuevo_nombre = sc.next();
				tienda.setNombre(nuevo_nombre);
				System.out.println("Nombre guardado con exito");
				break;
			}
			case 4:{
				System.out.println("Escriba la nueva direccion de la tienda");
				String nueva_dirrecion = sc.next();
				tienda.setDirreccion(nueva_dirrecion);
				System.out.println("Direccion guardada con exito");
				break;
			}
			case 5:{
				System.out.println("Cambios guardados");
				break;
			}
			default:{
				System.out.println("Opcion no disponible");
				break;
			}
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
