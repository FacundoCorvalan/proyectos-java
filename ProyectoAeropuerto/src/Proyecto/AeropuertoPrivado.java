package Proyecto;

public class AeropuertoPrivado  extends Aeropuerto{
	private String ListaEmpresas[] = new String[10]; 
	private int nroEmpresa;
	
	
	public AeropuertoPrivado(String nombre, String ciudad, String pais) {
		super(nombre, ciudad, pais);
	}


	public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c,String e[]) {
		super(nombre, ciudad, pais, c);
		this.ListaEmpresas = e;
		nroEmpresa = e.length;
		
	}
	
	public void insertarEmpresas(String e[]) {
		this.ListaEmpresas = e;
		this.nroEmpresa = e.length;
	}
	
	public void insertarEmpresa(String e) {
		ListaEmpresas[nroEmpresa]= e;
		nroEmpresa++;
	}


	public String[] getListaEmpresas() {
		return ListaEmpresas;
	}


	public int getNroEmpresa() {
		return nroEmpresa;
	}
	
	
	
	
}
