package modelo;

import java.io.ObjectInputStream.GetField;

public class Seminario 
{
	private int NumeroSesion;
	String [] grupoa;
	String [] grupob;
	String [] grupoc;



	public Seminario() 
	{
		grupoa = new String[asignarTamañoArreglo()];
		grupob = new String[asignarTamañoArreglo()+ asignarSobrantes2()];
		grupoc = new String[asignarTamañoArreglo()+ asignarSobrantes2()+ asignarSobrantes1()];
		}
	public void crearEstudiantes1() 
	{
		int x = Archivo.ContarArchivo() ;
		String Estudiante;
		for(int i = 0;i<x;i++) {
			boolean guardado= false;
			Estudiante= Archivo.LeerLinea(i+1);
			switch((int) (Math.random()*3)+1)
			{
			case 1:
				for(int m=0;m!=grupoa.length && guardado==false;m++) 
					if(grupoa[m]==null)
				{
					grupoa[m]= Estudiante+"  Contradictor.";
					guardado = true;
				}
					else 
					{
						for(int c=0;c!=grupob.length && guardado==false;c++)  
							if(grupob[c]==null)
						{
							grupob[c]=Estudiante+"  Relator.";
							guardado = true;
						}
							else 
							{
								for(int g=0;g!=grupoc.length && guardado==false;g++)  
									if(grupoc[g]==null) 
									{
										grupoc[g]=Estudiante+"  Protocolante.";
										guardado = true;
									}
								}
						}
				break;
			case 2:
				for(int m=0;m!=grupob.length && guardado==false;m++) 
				if(grupob[m]==null)
			{
				grupob[m]= Estudiante+"  Relator.";
				guardado = true;
			}
				else 
				{
					for(int c=0;c!=grupoa.length && guardado==false;c++)  
						if(grupoa[c]==null)
					{
						grupoa[c]=Estudiante+"  Contradictor.";
						guardado = true;
					}
						else 
						{
							for(int g=0;g!=grupoc.length && guardado==false;g++)  
								if(grupoc[g]==null) 
								{
									grupoc[g]=Estudiante+"  Protocolante.";
									guardado = true;
								}
							}
					}
				
				break;

			case 3:
				for(int m=0;m!=grupoc.length && guardado==false;m++) 
					if(grupoc[m]==null)
				{
					grupoc[m]= Estudiante+"  Protocolante.";
					guardado = true;
				}
					else 
					{
						for(int c=0;c!=grupob.length && guardado==false;c++)  
							if(grupob[c]==null)
						{
							grupob[c]=Estudiante+"  Relator.";
							guardado = true;
						}
							else 
							{
								for(int g=0;g!=grupoa.length && guardado==false;g++)  
									if(grupoa[g]==null) 
									{
										grupoa[g]=Estudiante+"  Contradictor.";
										guardado = true;
									}
								}
						}
						
				break;
				}
			}
		}
	public String mostarArreglos(String[] grupos) {
		String arreglo="";
		
		for(int f= 0;f!=grupos.length;f++) {
			
			arreglo += grupos[f]+"\n";
		
		}
		return arreglo;
	}

	public int asignarTamañoArreglo() 
	{
		int i=Archivo.ContarArchivo()/3;
		return i;
	}
	public int asignarSobrantes1() 
	{
		int i =0;
		if(Archivo.ContarArchivo()%3==1) 
		{
			i =1;
		}	
		return i;
	}
	public int asignarSobrantes2() 
	{
		int i =0;
		if(Archivo.ContarArchivo()%3==2) 
		{
			i =1;
		}	
		return i;
	}
	
	public int getNumeroSesion() {
		return NumeroSesion;
	}
	public int setNumeroSesion(int numeroSesion) {
		return NumeroSesion = numeroSesion;
	}
	public String[] getGrupoa() {
		return grupoa;
	}
	public void setGrupoa(String[] grupoa) {
		this.grupoa = grupoa;
	}
	public String[] getGrupob() {
		return grupob;
	}
	public void setGrupob(String[] grupob) {
		this.grupob = grupob;
	}
	public String[] getGrupoc() {
		return grupoc;
	}
	public void setGrupoc(String[] grupoc) {
		this.grupoc = grupoc;
	}
}



