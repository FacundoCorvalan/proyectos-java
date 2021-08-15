import java.util.ArrayList;
import java.util.Scanner;

/*Ejercicio 10: Crear un programa para simular un equipo de futbol (futbolista, entrenador y doctor), para lo cual tendremos
 * lo siguiente:
 * -Una superclase Persona, que tendra los datos: nombre,apellido,edad
 * -La subclase Futbolista, que tendra los datos: dorsal y posicion
 * -La subclase Entrenador, que tendra los datos: estrategia que utiliza
 * -La subclase Doctor, que tendra los datos: titulacion y años de experiencia
 * Hacer un menu donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento, partido de futbol, planificar
 * entrenamiento, entrevista, curar lesion*/
public class Principal {
	
	//Arreglo dinamico
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	
	//A los futbolistas, entrenador y doctor se les realiza un UpCasting para poder usar los metodos de Persona
	static Persona futbolista1 = new Futbolista("Gonzalo", "Higuain", 29, 9, "Delantero");
	
	static Persona futbolista2 = new Futbolista("Paulo", "Dybala", 23, 21, "Delantero");
	
	static Persona entrenador = new Entrenador("Maximiliano", "Allegri", 49, "Defensiva");
	
	static Persona doctor = new Doctor("Alex", "Marroni",55 , "Licenciado en fisioterapia", 20);
	
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String [] args) {
		//Llenar el arreglo
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(doctor);
		
		//Menu
		menu();
	}
	
	public static void menu() {
		int opcion;
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1.Viaje de equipo");
			System.out.println("2.Entrenamiento");
			System.out.println("3.Partido de futbol");
			System.out.println("4.Planificar entrenamiento");
			System.out.println("5.Entrevista");
			System.out.println("6.Curar lesion");
			System.out.println("7.Salir");
			System.out.println("Digite la opcion de menu");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1: System.out.println("");
				viajarEquipo();
				break;
			case 2:System.out.println("");
				entrenarEquipo();
				break;
			case 3:System.out.println("");
				partidoFutbol();
				break;
			case 4:System.out.println("");
			    planificarEntrenamiento();
				break;
			case 5:System.out.println("");
			 	darEntrevista();
				break;
			case 6:System.out.println("");
			 	curarLesion();
				break;
			case 7:break;
			default: System.out.println("Opcion incorrecta");
				break;
			}
			
			System.out.println("");
			
		} while (opcion != 7);
	}
	
	public static void viajarEquipo() {

		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
			equipo.viajar();
		}
	}
	
	public static void entrenarEquipo() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
			equipo.entrenamiento();
		}
	}
	
	public static void partidoFutbol() {
		for(Persona equipo: persona) {
			System.out.print(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
			equipo.partidoFutbol();
		}
	}
	
	//DownCasting a partir de aqui
	public static void planificarEntrenamiento() {
		System.out.print(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
		//Downcasting
		((Entrenador)entrenador).planificarEstrategia();
	}
	
	public static void darEntrevista() {
		System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellido()+" -> ");
		((Futbolista)futbolista1).entrevista();
		System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellido()+" -> ");
		((Futbolista)futbolista2).entrevista();
	} 
	
	public static void curarLesion() {
		System.out.print(doctor.getNombre()+" "+doctor.getApellido()+" -> ");
		((Doctor)doctor).curarLesion();
	}
}
