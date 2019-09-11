package modelo;

import java.io.*;

import java.nio.file.*;
import java.util.stream.Stream;



public class Archivo {
	
	public String EscribirArchivoGrupo(String[] estudiantes,int NumeroSesion)   
	{
		String mensaje = "";
		File f = new File("Archivos/grupos.txt");
		try 
		{
			//test
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			
			for (int i=0;i<estudiantes.length;i++) 
			{
				pw.println(" Sesion:"+NumeroSesion+" "+estudiantes[i]);
			}
			mensaje ="Creado correctamente. ";
			fw.close();
		} 
		catch (IOException e) 
		{
			mensaje = "Error al escribir archivo.";
		}
		return mensaje;
	}
	
	
	public String LeerArchivoEstudiantes() 
	{
		String mensaje ="";
		File f = new File("Archivos/nombres.txt");
		try
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea ;
			while ((linea=br.readLine()) != null) {
				
				mensaje += linea;
			}
			fr.close();
		}
		catch (IOException e) 
		{
			mensaje = "Error al leer archivo. ";
		}
		return mensaje;
	}
	
	public static  int ContarArchivo () 
	{
		File f= new File("archivos/nombres.txt");
		String r ="";
		int i=0;
		try {
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea=br.readLine()) != null) 
			{
				i++;
			}
			br.close();
			}
		catch(IOException e) 
		{
			r="Error al contar archivo";
		}
		
		return i;
	}
	
	public static String LeerLinea (int pLin)  {
		String mensaje ="";
		File f = new File("archivos/nombres.txt");
		try
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea ;
			int i=0;
      while ((linea=br.readLine()) != null) {
				if(i == pLin-1) {
					mensaje = linea+". ";
					break;
				}
				i++;
			}
			fr.close();
		}
		catch (IOException e) 
		{
			mensaje = "Error al leer archivo. ";
		}
		return mensaje;
		
}
	
}
