package org.indra.model;

import java.util.*;

public class Carpeta extends EntidadSistemaFicheros {

	public Carpeta(String nombre) {
		super(nombre);
		miradoPor.notificar("Creando carpeta " + nombre);
	}

	private List<EntidadSistemaFicheros> hijos = new ArrayList<EntidadSistemaFicheros>();
	
	public void Add(EntidadSistemaFicheros hijo) {
		if(!hijos.contains(hijo)) {
			miradoPor.notificar("Agregando " + hijo.getNombre() + " a la carpeta " + this.getNombre());
			this.hijos.add(hijo);
		}
	}
	
	@Override
	public int calcularTam() {
		int tamaño = 0; 
		for (EntidadSistemaFicheros hijo: hijos) { 
			tamaño += hijo.calcularTam();
		} 
		return tamaño;
	}
	
	
}
