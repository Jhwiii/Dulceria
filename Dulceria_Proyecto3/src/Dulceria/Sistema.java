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
					 System.out.println("Eliga el opcion de encargado");
				 }
				 else{
					 System.out.println("Usuario bloqueado");
					 option1 = 3;
				 }
				 break;
			}
			case 2:{
				s.crear_usuario(tienda);
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
						s.menu_compras(tienda,s);
						break;
					}
					case 5: {
						
					}
					case 6: {
						
					}
					case 7:{
						s.ayuda();
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
	
	public String ordenar_letras(String palabra) {
		//Este metodo se usa ya que si el usuario no digita en la palabra deseada, la primera en mayuscula, no se podra identificar si 
		//el objeto que busca esta disponible
		String resultado = palabra.toUpperCase().charAt(0) + palabra.substring(1, palabra.length()).toLowerCase();
		return resultado;
	}
	
	
	
	public void menu_encargado() {	
		System.out.println("LAS OPCIONES DISPONIBLES EN EL MENU DE ENCARGADO, SON: "
				+ "\n1.");
		
		
	}
	
	public void menu_compras(Tienda tienda, Sistema s) {
		Scanner sc = new Scanner(System.in);
		int option3 = 0;
		while(option3 !=5) {
			System.out.println("LOS OBJETOS DISPONIBLES PARA LA VENTA SON, ELIGA UNO:"
					+ "\n1.Dulces Por Unidad \n2.Dulces Por Paquete \n3.Bebidas \n4.Imprimir factura \n5.Salir de menu de compras");
			option3 = sc.nextInt();
			switch(option3) {
			case 1:{
				System.out.println("Los dulces disponibles son:" + Arrays.toString(tienda.getAlmacen_dulces()));
				System.out.println("ESCRIBA EL NOMBRE DEL DULCE QUE DESEA COMPRAR");
				String dulce = sc.next();
				dulce = s.ordenar_letras(dulce);
				boolean disponibilidad = false;
				for(int a = 0;a<tienda.getAlmacen_dulces().length;a++) {
					if(dulce.equals(tienda.getAlmacen_dulces()[a].getNombre())) {
						disponibilidad = true;
						System.out.println("Cuantas unidades del dulce desea comprar");
						int cantidad = sc.nextInt();
						
					}
				}
				if(disponibilidad == false) {
					System.out.println("El dulce " + dulce + " no se encuentra en el inventario");
				}
				break;
			}
			}
		}
	}
	
	public void compra() {
		
	}
	public void menu_cliente() {
		System.out.println("LAS OPCIONES DISPONIBLES EN NUESTRO MENU, SON:"
				+ "\n1.Gomitas por Unidad disponibles"
				+ "\n2.Paquetes de Gomitas disponibles"
				+ "\n3.Bebidas disponibles"
				+ "\n4.Realizar compra"
				+ "\n5.Ver historial de compras"
				+ "\n6.Imprimir factura de compra"
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
		double presupuesto = sc.nextDouble();
		
		tienda.crear_cliente(nombre, edad, id, id);	
		
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
	
	public void ayuda() {
		Tienda tienda = new Tienda("Ciocolatto ","Cra 4 # 8-71", "Ciocolatto@gmail.com", 320456788); 
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
	
}
