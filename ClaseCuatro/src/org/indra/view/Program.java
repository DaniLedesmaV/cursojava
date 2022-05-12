package org.indra.view;
import org.indra.model.*;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Agregados
		FyleSystemWatcher observer = new FyleSystemWatcher();
		EntidadSistemaFicheros.registrarQuienMeMira(observer);
		
		//EntidadSistemaFicheros carpetaRaiz = new Carpeta("root"); 
		//System.out.println("Creando carpeta root");
		Carpeta carpetaRaiz = new Carpeta("root");
		//System.out.println("Creando carpeta temp");
		Carpeta temp = new Carpeta("temp");
		//System.out.println("Creando carpeta trash");
		Carpeta trash = new Carpeta("trash");
		//System.out.println("Creando archivo autoexec");
		Archivo autoexec = new Archivo("autoexec.bat", 100);
		//System.out.println("Creando archivo imagen");
		Archivo imagen = new Archivo("imagen.jpg");
		//System.out.println("Cambiando el tam del archivo imagen a 350");
		imagen.setTam(350);
		
		//System.out.println("Agregando archivo autoexec a carpeta temp");
		temp.Add(autoexec);
		//System.out.println("Agregando archivo imagen a carpeta trash");
		trash.Add(imagen);
		//System.out.println("Agregando carpeta trash a carpeta temp");
		temp.Add(trash);
		//System.out.println("Agregando carpeta temp a carpeta raiz");
		carpetaRaiz.Add(temp);
		
		EntidadSistemaFicheros root = carpetaRaiz;
		System.out.println("El tam del sistema es: " + root.calcularTam());
	}

}
