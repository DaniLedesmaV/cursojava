package org.indra.model;

public class Archivo extends EntidadSistemaFicheros{

	private int tam;
	
	public Archivo(String nombre, int tam) {
		super(nombre);
		this.tam = tam;
		miradoPor.notificar("Creando archivo " + nombre + " con " + tam + " bytes");
	}

	public Archivo(String nombre) {
		super(nombre);
		this.tam = 0;
		miradoPor.notificar("Creando archivo " + nombre + " vacio");
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	@Override
	public int calcularTam() {
		// TODO Auto-generated method stub
		if(this.tam != 0)
			return tam;
		else return 0;
	}

}
