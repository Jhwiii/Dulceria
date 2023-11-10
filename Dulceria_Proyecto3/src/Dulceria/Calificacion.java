package Dulceria;

public class Calificacion {

	private String comentario;
	private int numero;
	
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	
	public Calificacion() {
		comentario = "";
		numero = 0;
	}
	
	
	public Calificacion(String comentario, int numero) {
		this.comentario = comentario;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "\n[comentario=" + comentario + ", numero=" + numero + "]";
	}
	
	
	
}
