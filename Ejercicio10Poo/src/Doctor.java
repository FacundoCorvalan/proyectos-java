
public class Doctor extends Persona{
	private String titulo;
	private int a�osExp;
	public Doctor(String nombre, String apellido, int edad, String titulo, int a�osExp) {
		super(nombre, apellido, edad);
		this.titulo = titulo;
		this.a�osExp = a�osExp;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getA�osExp() {
		return a�osExp;
	}
	
	@Override
	public void partidoFutbol() {
		System.out.println("Da asistencia en un partido de futbol");
	}
	
	@Override
	public void entrenamiento() {
		System.out.println("Da asistencia en un entrenamiento");
	}
	
	public void curarLesion() {
		System.out.println("Curar lesion");
	}
	
}
