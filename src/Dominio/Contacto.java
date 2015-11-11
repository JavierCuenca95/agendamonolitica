package Dominio;

public class Contacto {
	private String nombre;
	private String apellidos;
	private long numero;
	
	public Contacto(String nombre, String apellidos, long numero){
		this.nombre= nombre;
		this.apellidos = apellidos;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "Nombre y apellidos: " + nombre + " " + apellidos + "; Número de teléfono: " + numero;
	}

}
