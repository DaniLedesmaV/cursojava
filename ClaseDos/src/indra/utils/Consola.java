package indra.utils;

import java.util.Scanner;

public class Consola {

	public static String leerEntrada(String entrada) {
		Scanner sc = new Scanner(System.in); 
		System.out.println(entrada);
		
		try {
			
			String nombre = sc.nextLine();
			
			if(nombre.isEmpty()){ 
				while(nombre.isEmpty()) { 
					System.out.println("Ingréselo otra vez"); 
					nombre = sc.nextLine(); 
					} 
				}
			return nombre;
		}
		finally {
			//sc.close();
		}
	}
	
	public static int leerNumero(String entrada) {
		Scanner sc = new Scanner(System.in); 
		System.out.println(entrada);
		
		try {
			
			String numero = sc.nextLine();
			
			if(numero.isEmpty() || !MetodosNumericos.esNumero(numero)){ 
				while(numero.isEmpty() || !MetodosNumericos.esNumero(numero)) { 
					System.out.println("Ingréselo otra vez"); 
					numero = sc.nextLine(); 
				} 
			}
			return Integer.parseInt(numero);
		}
		finally {
			//sc.close();
		}
	}
}
