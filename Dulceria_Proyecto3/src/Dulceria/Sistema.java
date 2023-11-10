package Dulceria;
import java.util.Arrays;
import java.util.Scanner;


public class Sistema {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		Sistema s = new Sistema();
		
		Tienda tienda = new Tienda("Gomitas donde Jhoe","Abajo del puente");
		
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

				break;
			}
			case 3:{
				System.out.println("Saliendo del programa");
				break;
			}
			}
			
		}

		
		
		
	}
	
	
	public void menu_encargado() {	
		System.out.println("LAS OPCIONES DISPONIBLES EN EL MENU DE ENCARGADO, SON:}"
				+ "\n1.");
		
		
	}
	
	public void menu_cliente() {
		System.out.println("LAS OPCIONES DISPONIBLES EN NUESTRO MENU, SON:"
				+ "\n1.Gomitas por Unidad disponibles"
				+ "\n2.Paquetes de Gomitas disponibles"
				+ "\n3.Bebidas disponibles"
				+ "\n4.Realizar compra"
				+ "\n5.Ver historial de compras"
				+ "\n6.Imprimir factura de compra"
				+ "\n7.Salir");
		
		
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
	
}
