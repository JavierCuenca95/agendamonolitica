package Presentación;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		boolean seguir = true;
		int opcion;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Bienvenido");
		
		while(seguir){
			System.out.println("Introduzca el nº de l opción deseada: ");
			System.out.println("1: Iniciar sesión");
			System.out.println("2: Añadir un contacto");
			System.out.println("3: Borrar un contacto");
			System.out.println("4: Modificar un contacto");
			System.out.println("5: Buscar un contacto");
			System.out.println("6: Cerrar sesión");
			System.out.println("7: Cerrar programa");
			
			opcion = stdin.nextInt();
			
			switch(opcion){
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					seguir = false;
					break;
				default:
					System.out.println("Opción incorrecta");
			}
			

		}
	}
	
}
