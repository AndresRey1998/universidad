package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{
	public Interfaz() {
		
	}

	public int obtenerSesion() 
	{
		int Sesion= 0;
		Sesion = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de sesion: ")));
		return Sesion;
	}
	public void mostrarResultados(String cadena,int c) 
	{
		JOptionPane.showMessageDialog(null,
				cadena,
				"Sesion"+c,
				JOptionPane.INFORMATION_MESSAGE);
	}

}
