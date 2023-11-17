package Dulceria;

public class Factura {
	
	private int numero_factura; 
	private int objetos_vendidos;
	private double impuesto; 
	private double total_factura;
	
	
	
	public int getNumero_factura() {
		return numero_factura;
	}
	public void setNumero_factura(int numero_factura) {
		this.numero_factura = numero_factura;
	}
	
	public int getObjetos_vendidos() {
		return objetos_vendidos;
	}
	public void setObjetos_vendidos(int objetos_vendidos) {
		this.objetos_vendidos = objetos_vendidos;
	}
	
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double getTotal_factura() {
		return total_factura;
	}
	public void setTotal_factura(double total_factura) {
		this.total_factura = total_factura;
	}
	public Factura(int numero_factura, int objetos_vendidos, double impuesto, double total_factura) {
		super();
		this.numero_factura = numero_factura;
		this.objetos_vendidos = objetos_vendidos;
		this.impuesto = impuesto;
		this.total_factura = total_factura;
	} 
	
	
	

}
