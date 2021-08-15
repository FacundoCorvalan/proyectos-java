package polimorfismo;

public class VehiculoTurismo extends Vehiculo{
	private int nroPuertas;
	
	public VehiculoTurismo(int nroPuertas,String matricula, String marca,String modelo) {
		super(matricula, marca, modelo);
		this.nroPuertas= nroPuertas;
	}

	public int getNroPuertas() {
		return nroPuertas;
	}
	
	
	@Override
	public String mostrarDatos() {
		return "La matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nEl nro de puertas es: "+nroPuertas;
	}
}
