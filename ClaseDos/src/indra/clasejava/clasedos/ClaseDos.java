package indra.clasejava.clasedos;

import java.util.*;

import indra.utils.Consola;
import indra.utils.MetodosNumericos;

public class ClaseDos {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Segunda clase");
		
		String nombre = Consola.leerEntrada("Ingrese nombre");
		String edad = Consola.leerEntrada("Ingrese edad");
		if(MetodosNumericos.esNumero(edad)) {
			System.out.println("Bienvenido " + nombre + " de " + edad);
		}
		else {
			System.out.println("Bienvenido " + nombre + ". No entendi tu edad");
		}
		
		System.out.println(Math.floor(Math.random()*10));*/
		
		/*
		boolean encontrado = false;
		int numoportunidades = 6;
		int numazar = MetodosNumericos.valorAlAzar(1, 100);
		
		while(!encontrado && numoportunidades > 0) {
			int num = Consola.leerNumero("Dame un numero");
			if(num > numazar) {
				System.out.println("El numero debe ser menor");
				numoportunidades--;
			}
			else if(num < numazar){
				System.out.println("El numero debe ser mayor");
				numoportunidades--;
			}
			else {
				System.out.println("Felicidades, has acertado");
				encontrado = true;
			}
		}
		if(!encontrado && numoportunidades == 0) {
			System.out.println("Oh no, has perdido");
		}
		*/
		/*
		int primerNumero, segundoNumero, seleccion; 
		primerNumero = Consola.leerNumero("Introduce el primer numero"); 
		segundoNumero = Consola.leerNumero("Introduce el segundo numero");
		seleccion = Consola.leerNumero("Elige una operación: 1. + 2. - 3. * 4. /");
		
		switch (seleccion) {
			case 1 : System.out.println(primerNumero+segundoNumero); break;
			case 2 : System.out.println(primerNumero-segundoNumero); break;
			case 3 : System.out.println(primerNumero*segundoNumero); break;
			case 4 : System.out.println(primerNumero/segundoNumero); break;
			default: System.out.println(primerNumero+segundoNumero); break;
		}*/
	
		/*String[] nombres = new String[] {"Juan", "Alberto", "Luis"};
		for(int i = 0; i < nombres.length; i++) System.out.println(nombres[i]);*/
		int sig;
		int num = Consola.leerNumero("¿Cuantos numeros quieres?");
		int[] numeros = new int[num];
		
		int primernum, max, min, acum; 
		primernum = Consola.leerNumero("Dime el primer numero");
		
		acum = primernum;
		max = primernum;
		min = primernum;
		
		for(int i = 1; i < num; i++) {
			sig = Consola.leerNumero("Dime el siguiente numero");
			acum += sig;
			if(sig > max) max = sig;
			else if(sig < min) min = sig;
		}
		
		System.out.println("Maximo: " + max + " Minimo: " + min + " Promedio: " + acum/num);
	}

}
