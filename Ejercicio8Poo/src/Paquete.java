
public class Paquete {
	private int nroPaquete;
	private String dni;
	private double peso;
	private int prioridad;
	
	
	public Paquete(int nroPaquete, String dni, double peso, int prioridad) {
		this.nroPaquete = nroPaquete;
		this.dni = dni;
		this.peso = peso;
		this.prioridad = prioridad;
	}


	public int getNroPaquete() {
		return nroPaquete;
	}


	public String getDni() {
		return dni;
	}


	public double getPeso() {
		return peso;
	}


	public int getPrioridad() {
		return prioridad;
	}
	

	public String mostrarDatosPaquete() {
		return "Numero paquete: "+nroPaquete+"\nDni: "+dni+"\nPeso: "+peso+"\nPrioridad: "+prioridad;
	}
}
