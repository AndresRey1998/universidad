package controlador;

import modelo.Mundo;
import vista.Interfaz;

public class Controlador {
	
	private Mundo m;
	private Interfaz gui;
	
	public Controlador()  {
		
		m = new Mundo();
		gui = new Interfaz();
		m.getProp().setPropiedades();
		m.getProp().getPropiedades();
		m.getSem().crearEstudiantes1();
		m.getSem().setNumeroSesion(gui.obtenerSesion());
		m.getArc().EscribirArchivoGrupo(m.getSem().getGrupoa(),m.getSem().getNumeroSesion());
		m.getArc().EscribirArchivoGrupo(m.getSem().getGrupob(),m.getSem().getNumeroSesion());
		m.getArc().EscribirArchivoGrupo(m.getSem().getGrupoc(),m.getSem().getNumeroSesion());
		gui.mostrarResultados(m.getSem().mostarArreglos(m.getSem().getGrupoa()), m.getSem().getNumeroSesion());
		gui.mostrarResultados(m.getSem().mostarArreglos(m.getSem().getGrupob()), m.getSem().getNumeroSesion());
		gui.mostrarResultados(m.getSem().mostarArreglos(m.getSem().getGrupoc()), m.getSem().getNumeroSesion());
		
	}
	
}
