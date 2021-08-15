package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
	private int cilindrada;
	
	public VehiculoDeportivo(int cilindrada, String matricula,String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada=cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String mostrarDatos() {
		return "La matricula es: "+matricula+"\nLa marca es: "+marca+"\nEl modelo es: "+modelo+"\nLa cilindrada es: "+cilindrada;
	}
	
	
}
