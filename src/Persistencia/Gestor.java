package Persistencia;

import java.util.List;

import Dominio.Contacto;
import Dominio.Usuario;

public class Gestor {
	private List<Usuario> listaUsuarios;
	
	public Gestor(){
		
	}
	
	public Usuario getUsuario(int i){
		return listaUsuarios.get(i);
	}
}
