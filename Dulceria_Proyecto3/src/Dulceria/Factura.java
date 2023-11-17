package Dulceria;

import java.util.Arrays;

public class Factura {
	
	private int numero_factura; 
	private Objeto_vendido objetos_vendidos[];
	private double impuesto; 
	private double total_factura;
	
	
	
	public int getNumero_factura() {
		return numero_factura;
	}
	public void setNumero_factura(int numero_factura) {
		this.numero_factura = numero_factura;
	}
	
	public  Objeto_vendido[] getObjetos_vendidos() {
		return objetos_vendidos;
	}
	public void setObjetos_vendidos(Objeto_vendido[] objetos_vendidos) {
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
	
	public Factura() {
		numero_factura = 0;
	
		objetos_vendidos = new Objeto_vendido[5];
		for(int a = 0;a<objetos_vendidos.length;a++) {
			objetos_vendidos[a] = new Objeto_vendido();
		}
		
		impuesto = 0;
		total_factura = 0;
	}
	
	public Factura(int numero_factura, Objeto_vendido[] objetos_vendidos, double impuesto, double total_factura) {
		super();
		this.numero_factura = numero_factura;
		objetos_vendidos = new Objeto_vendido[5];
		for(int a = 0;a<objetos_vendidos.length;a++) {
			objetos_vendidos[a] = new Objeto_vendido();
		}
		this.impuesto = impuesto;
		this.total_factura = total_factura;
	}
	@Override
	public String toString() {
		return "Factura [numero_factura=" + numero_factura + ", objetos_vendidos=" + Arrays.toString(objetos_vendidos)
				+ ", impuesto=" + impuesto + ", total_factura=" + total_factura + "]";
	} 
	
	
	

}
