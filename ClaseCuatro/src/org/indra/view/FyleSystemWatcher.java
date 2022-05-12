package org.indra.view;

import org.indra.model.IObserver;

public class FyleSystemWatcher implements IObserver{

	@Override
	public void notificar(Object objeto) {
		System.out.println(objeto);
		
	}

}
