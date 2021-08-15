
public class Sucursal {
	private int nroSucursal;
	private String direccion;
	private String ciudad;
	public Sucursal(int nroSucursal, String direccion, String ciudad) {
		this.nroSucursal = nroSucursal;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	public int getNroSucursal() {
		return nroSucursal;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	public String mostrarDatosSucursal() {
		return "Nro Sucursal: "+nroSucursal+"\nDireccion: "+direccion+"\nCiudad: "+ciudad;
	}
	
	public double calcularPrecio(Paquete t) {
		double precio;
		precio= t.getPeso();
		if(t.getPrioridad()==1) {
			precio+=10;
		}
		if(t.getPrioridad()==2) {
			precio+=20;
		}
		return precio;
	}
}
