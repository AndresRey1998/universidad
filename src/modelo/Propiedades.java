package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {
	private Properties prop = new Properties();
	private String archivoprop = "Archivos/propiedades.txt";
	public void setPropiedades() {
		try {
		prop.setProperty("grupos", "Archivos/grupos.txt");
		prop.setProperty("archivoProp", "Archivos/propiedades.txt");
		prop.setProperty("nombreCodigo", "ReyMedinaMoyaseminario.java");
		prop.store(new FileOutputStream(archivoprop), null);
		}
		catch (IOException ex) {
		ex.printStackTrace();
		}

}
	public void getPropiedades() {
		try {
		// load a properties file for reading
		prop.load(new FileInputStream(archivoprop));
		// get the properties and print
		prop.list(System.out);
		//Reading each property value
		System.out.println(prop.getProperty("nombres"));
		System.out.println(prop.getProperty("archivoProp"));
		System.out.println(prop.getProperty("nombreCodigo"));
		} catch (IOException ex) {
		ex.printStackTrace();
		}
}
}
