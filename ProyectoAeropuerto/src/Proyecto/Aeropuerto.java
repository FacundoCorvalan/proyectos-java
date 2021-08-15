package Proyecto;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	private String pais;
	private Compañia listaCompañia[] = new Compañia[10];
	private int nroCompañia;

	public Aeropuerto(String nombre, String ciudad, String pais) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.nroCompañia = 0;
	}

	public Aeropuerto(String nombre, String ciudad, String pais, Compañia c[]) {

		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		listaCompañia = c;
		this.nroCompañia = c.length;

	}
	
	public void insertarCompañia(Compañia compañia) {
		listaCompañia[nroCompañia] = compañia;
		nroCompañia++;
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

	public Compañia[] getListaCompañia() {
		return listaCompañia;
	}

	public int getNroCompañia() {
		return nroCompañia;
	}
	
	public Compañia getCompañia(int i) {
		return listaCompañia[i];
	}
	
	public Compañia getCompañia(String nombre) {
		boolean encontrado = false;
		int i=0;
		Compañia c = null;
		while(!encontrado && i < listaCompañia.length) {
			if(nombre.equals(listaCompañia[i].getNombre())) {
				encontrado = true;
				c = listaCompañia[i];
			}
			i++;
		}
		return c;
	}

}
