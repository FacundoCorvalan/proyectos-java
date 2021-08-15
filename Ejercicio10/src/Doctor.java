
public class Doctor extends Persona{
	private String titulo;
	private int añosExp;
	public Doctor(String nombre, String apellido, int edad, String titulo, int añosExp) {
		super(nombre, apellido, edad);
		this.titulo = titulo;
		this.añosExp = añosExp;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getAñosExp() {
		return añosExp;
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
