package Dulceria;

public class Finanza {
	
	private double dinero_invertido; 
	private double dinero_total; 
	private double excedente;
	
	public double getDinero_invertido() {
		return dinero_invertido;
	}
	public void setDinero_invertido(double dinero_invertido) {
		this.dinero_invertido = dinero_invertido;
	}
	
	public double getDinero_total() {
		return dinero_total;
	}
	public void setDinero_total(double dinero_total) {
		this.dinero_total = dinero_total;
	}
	
	public double getExcedente() {
		return excedente;
	}
	public void setExcedente(double excedente) {
		this.excedente = excedente;
	}
	public Finanza(double dinero_invertido, double dinero_total, double excedente) {
		super();
		this.dinero_invertido = dinero_invertido;
		this.dinero_total = dinero_total;
		this.excedente = excedente;
	} 
	
	
	
	
	
}
