package modelo;

public class Mundo {
	private Archivo arc;
	private Propiedades prop;
	private Seminario sem;

	public Mundo() {
		arc = new Archivo();
		sem= new Seminario();
		prop=new Propiedades();
		
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}

	public Archivo getArc() {
		return arc;
	}

	public void setArc(Archivo arc) {
		this.arc = arc;
	}
	public Seminario getSem() {
		return sem;
	}

	public void setSem(Seminario sem) {
		this.sem = sem;
	}
	
	
}
