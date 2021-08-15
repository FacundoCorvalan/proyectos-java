package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
	private int carga;
	public VehiculoFurgoneta(int carga,String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	public int getCarga() {
		return carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nLa carga es: "+carga;
	}
	
}
