package Dulceria;

public class Finanza {
	
	private int dinero_invertido; 
	private int dinero_ventas; 
	private int ganancia;
	private int venta_dulce; 
	private int compra_dulce;
	private int venta_bebida;
	private int compra_bebida;
	private int venta_paquete;
	private int compra_paquete;
	
	

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



	public int getVenta_dulce() {
		return venta_dulce;
	}



	public void setVenta_dulce(int venta_dulce) {
		this.venta_dulce = venta_dulce;
	}



	public int getCompra_dulce() {
		return compra_dulce;
	}



	public void setCompra_dulce(int compra_dulce) {
		this.compra_dulce = compra_dulce;
	}



	public int getVenta_bebida() {
		return venta_bebida;
	}



	public void setVenta_bebida(int venta_bebida) {
		this.venta_bebida = venta_bebida;
	}



	public int getCompra_bebida() {
		return compra_bebida;
	}



	public void setCompra_bebida(int compra_bebida) {
		this.compra_bebida = compra_bebida;
	}



	public int getVenta_paquete() {
		return venta_paquete;
	}



	public void setVenta_paquete(int venta_paquete) {
		this.venta_paquete = venta_paquete;
	}



	public int getCompra_paquete() {
		return compra_paquete;
	}



	public void setCompra_paquete(int compra_paquete) {
		this.compra_paquete = compra_paquete;
	}



	/*public Finanza(int dinero_invertido, int dinero_ventas, int ganancia, int venta_dulce, int compra_dulce,
			int venta_bebida, int compra_bebida, int venta_paquete, int compra_paquete) {
		super();
		this.dinero_invertido = dinero_invertido;
		this.dinero_ventas = dinero_ventas;
		this.ganancia = ganancia;
		this.venta_dulce = venta_dulce;
		this.compra_dulce = compra_dulce;
		this.venta_bebida = venta_bebida;
		this.compra_bebida = compra_bebida;
		this.venta_paquete = venta_paquete;
		this.compra_paquete = compra_paquete;
	}
*/


	public int invertido_total() {
		
		dinero_invertido = compra_dulce +  compra_bebida + compra_paquete; 
		
		return dinero_invertido;
		
	}
	public int venta_total() {
		
		dinero_ventas = venta_dulce + venta_bebida + venta_paquete; 
		
		return dinero_ventas; 
	}
	 
	public int ganancia_total() {
		
		ganancia = dinero_ventas - dinero_invertido; 
		
		return ganancia; 
	}
	
}
