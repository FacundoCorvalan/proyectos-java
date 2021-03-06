package Proyecto;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compaņia listaCompaņia[] = new Compaņia[10];
	private int nroCompaņia;

	public Aeropuerto(String nombre, String ciudad, String pais) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.nroCompaņia = 0;
	}

	public Aeropuerto(String nombre, String ciudad, String pais, Compaņia c[]) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompaņia = c;
		this.nroCompaņia = c.length;

	}
	
	public void insertarCompaņia(Compaņia compaņia) {
		listaCompaņia[nroCompaņia] = compaņia;
		nroCompaņia++;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getPais() {
		return pais;
	}

	public Compaņia[] getListaCompaņia() {
		return listaCompaņia;
	}

	public int getNroCompaņia() {
		return nroCompaņia;
	}
	
	public Compaņia getCompaņia(int i) {
		return listaCompaņia[i];
	}
	
	public Compaņia getCompaņia(String nombre) {
		boolean encontrado = false;
		int i=0;
		Compaņia c = null;
		while(!encontrado && i < listaCompaņia.length) {
			if(nombre.equals(listaCompaņia[i].getNombre())) {
				encontrado = true;
				c = listaCompaņia[i];
			}
			i++;
		}
		return c;
	}

}
