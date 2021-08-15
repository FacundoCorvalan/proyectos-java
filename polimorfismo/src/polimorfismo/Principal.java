package polimorfismo;

public class Principal {
	public static void main (String [] args) {
		//UpCasting
		Vehiculo vehiculo = new VehiculoDeportivo(500, "GH89", "Audi", "HI9");
		System.out.println(vehiculo);
		//DownCasting
		VehiculoDeportivo nuevoVehiculo = (VehiculoDeportivo) vehiculo;
		
		System.out.println(nuevoVehiculo);
	}
}
