package Dulceria;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Sistema s = new Sistema();
		
		Tienda tienda = new Tienda("Gomitas donde Jhoe","Abajo del puente");
		
		
	
		
		
		int option1 = 0;
		while(option1!=3) {
			System.out.println("TIPO DE ACCESO---1.Encargado--2.Cliente--3.Salir de la Dulceria");
			option1 = sc.nextInt();
			switch(option1) {
			case 1:{
				 boolean validacion = s.validacion_user(tienda);
				 if(validacion==true) {
					 System.out.println("Eliga el opcion de encargado");
				 }
				 else if(validacion==false) {
					 System.out.println("Usuario bloqueado");
					 option1 = 3;
				 }
				 break;
			}
			case 2:{
				s.crear_usuario(tienda);
				System.out.println("El cliente ha sido creado con los siguientes datos:\n" + tienda.getCliente().toString());

				break;
			}
			case 3:{
				System.out.println("Saliendo del programa");
				break;
			}
			}
			
		}

		
		
		
	}
	
	
	public void menu1() {	
	}
	
	public void menu2() {
		System.out.println("LAS OPCIONES DISPONIBLES EN NUESTRO MENU, SON:"
				+ "\n1.Gomitas por Unidad disponibles"
				+ "\n2.Paquetes de Gomitas disponibles"
				+ "\n3.Bebidas disponibles"
				+ "\n4.Realizar compra"
				+ "\n5.Ver historial de compras"
				+ "\n6.Imprimir factura de compra"
				+ "\n7.Salir");
		
		
	}
	
	public boolean validacion_user(Tienda tienda) {
	//cambio 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Buen dia querido encargado. Ingresar los datos pedidos, recuerde que solo cuenta con 3 intentos" );
		boolean estado = false;
		int contador = 0;
		while(contador<3&&estado!=true) {
			System.out.println("INTENTO "+(contador+1)+" Escriba su usuario");
			String usuario = sc.next();
			if(usuario.equals(tienda.getTrabajador().getUsuario_login())) {
				System.out.println("Escriba su contraseña");
				String contraseña = sc.next();
				if(contraseña.equals(tienda.getTrabajador().getContraseña_login())) {
					System.out.println("Ingresando");
					estado = true;
				}
				else {
					System.out.println("Contraseña incorrecta");
					contador++;
				}
			}
			else {
				System.out.println("Usuario incorrecto");//jvhj
				contador++;
			}
			
		}
		return estado;//devuelve
	}
	
	public void crear_usuario(Tienda tienda) {
		//can¿mbio 2
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
		
		Cliente c1 = new Cliente(nombre,edad,id,presupuesto);	
		tienda.setCliente(c1);
	}
	
	
	
}
