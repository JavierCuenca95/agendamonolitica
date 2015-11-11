package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre_usuario;
	private String contrasenia;
	private List<Contacto> listaContactos;
	
	public Usuario(String nombre, String contrasenia){
		nombre_usuario = nombre;
		this.contrasenia = contrasenia;
		listaContactos = new ArrayList<Contacto>();
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void aniadirContacto(Contacto c){
		listaContactos.add(c);
	}
		
}
