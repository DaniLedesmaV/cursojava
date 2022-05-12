package org.indra.model;

public abstract class EntidadSistemaFicheros {
	
	private String nombre = null;
	public static IObserver miradoPor = null;
	
	public static void registrarQuienMeMira(IObserver obs) {
		miradoPor = obs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EntidadSistemaFicheros(String nombre) {
		super();
		this.nombre = nombre;
	}

	public abstract int calcularTam();
}
