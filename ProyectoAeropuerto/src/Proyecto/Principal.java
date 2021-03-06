package Proyecto;
/*Dise?ar y codificar una aplicacion informatica para una compa?ia aeroportuaria satisfaciendo los siguientes requisitos:
 * -Para cada aeropuerto es necesario saber:
 * 	a)Todas las compa?ias de vuelos que operan en el.
 * 	b)Nombre del Aeropuerto, la ciudad donde se ubica y el pais al que pertenece.
 * -Cada compa?ia se caracteriza por el nombre y la lista de vuelos que ofrece.
 * -Los vuelos estan definidos por su identificador, la ciudad de origen, la ciudad de destino, el precio del viaje, la lista
 * de pasajeros, el nro maximo de pasajeros permitidos en el vuelo y el nro real de pasajeros que han reservado asiento en el
 * avion.
 * -Los aeropuertos pueden ser privados o publicos.
 * 	a)Los aeropuertos privados tienen una serie de empresas  que los patrocinan y es necesario saber el nombre de cada una de
 * 	  esas empresas.
 * 	b)Para los aeropuertos publicos se requiere saber la cantidad de dinero correspondiente a la subvencion gubernamental
 * -Se necesita gestionar tambien la informacion de los pasajeros.
 * 	a)Para cada pasajero se necesita saber nombre, nro de pasaporte y nacionalidad.
 * 
 * 
 * La aplicacion tendra un menu con las siguientes opciones:
 * 1)Consultar los aeropuertos gestionados, indicando separadamente publicos y los privados. Para cada unos de ellos debera
 * mostrar su nombre, la ciudad de ubicacion, y el pais al que pertenece.
 * 2)Visualizar las empresas que patrocinan un determinado aeropuerto en caso de que sea privado, o la cuantia de la subvencion
 * en caso de que se trate de un aeropuerto publico.
 * 3)Para un determinado aeropuerto, se debe mostrar la lista de compa?ias que vuelan desde ese aeropuerto.
 * 4)Para una determinada compa?ia que opera en un aeropuerto concreto, listar todos los posibles vuelos que dicha compa?ia
 * ofrece, mostrando su identificador, la ciudad de origen y destino y el precio del vuelo.
 * 5)Mostrar todos los posibles vuelos (Identificador) que parten de una ciudad origen a una destino (Indicadas por el usuario)
 * y mostrar su precio*/


import java.util.Scanner;



public class Principal {
	static Scanner entrada = new Scanner(System.in);
	final static int num = 4;//Nro de aeropuertos
	static Aeropuerto aeropuertos[] = new Aeropuerto[num];
	
	public static void main(String[] args) {
		//Insertar datos de los aeropuertos
		insertarDatosAeropuerto(aeropuertos);
		//Menu
		menu();
	}
	
	public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
		aero[0] = new AeropuertoPublico("Jorge Chavez", "Lima", "Peru", 80000000);
		aero[0].insertarCompa?ia(new Compa?ia("AeroPeru"));
		aero[0].insertarCompa?ia(new Compa?ia("LATAM"));
		aero[0].getCompa?ia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
		aero[0].getCompa?ia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
		aero[0].getCompa?ia("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
		aero[0].getCompa?ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20Vghp", "Peruana"));
		aero[0].getCompa?ia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
		aero[0].getCompa?ia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21KL", "Peruana"));
		
		aero[1] = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "Espa?a");
		aero[1].insertarCompa?ia(new Compa?ia("AirEuropa"));
		String empresas[] = {"Cobresol","Anguila34"};
		((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
		aero[1].getCompa?ia("AirEuropa").insertarVuelo(new Vuelo("AE025", "Madrid", "Buenos Aires", 300.00, 250));
		aero[1].getCompa?ia("AirEuropa").getVuelo("AE025").insertarPasajero(new Pasajero("Facundo", "141FC", "Argentino"));
		
		aero[2] = new AeropuertoPublico("Aeropuerto Bogota", "Bogota", "Colombia", 20000000);
		aero[2].insertarCompa?ia(new Compa?ia("AirAmerica"));
		aero[2].insertarCompa?ia(new Compa?ia("VuelaBogota"));
		aero[2].getCompa?ia("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogota", "Lima", 140.20, 120));
		aero[2].getCompa?ia("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogota", "Lima", 200.00, 180));
		aero[2].getCompa?ia("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Dilan", "PKR34", "Colombiana"));
		aero[2].getCompa?ia("AirAmerica").getVuelo("AE031").insertarPasajero(new Pasajero("Oliver", "HI-LO", "Americana"));
		
		aero[3] = new AeropuertoPublico("Aeropuerto Mexico", "Mexico", "Mexico", 40000000);
		aero[3].insertarCompa?ia(new Compa?ia("AeroMexico"));
		aero[3].getCompa?ia("AeroMexico").insertarVuelo(new Vuelo("IB2040", "Mexico", "Nueva Zelanda", 400.00, 200));
		aero[3].getCompa?ia("AeroMexico").insertarVuelo(new Vuelo("IB2042", "Mexico", "Lima", 150.99, 150));
		aero[3].getCompa?ia("AeroMexico").getVuelo("IB2040").insertarPasajero(new Pasajero("Pablo", "P4B10", "Mexicana"));
	}
	
	public static void menu() {
		String nombreAeropuerto,nombreCompa?ia,origen,destino;
		Aeropuerto aeropuerto;
		Compa?ia compa?ia;
		int opcion=0;
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1.Ver aeropuertos gestionados (Publicos o Privados");
			System.out.println("2.Ver Empresas(Privado) o subvencion(Publico)");
			System.out.println("3.Lista de compa?ias de un aeropuerto");
			System.out.println("4.Lista de vuelos por compa?ia");
			System.out.println("5.Listar posibles vuelos de origen a destino");
			System.out.println("6.Salir");
			System.out.println("Opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1 : //Ver aeropuertos gestionados (publicos o privados)
				System.out.println("");
				mostrarDatosAeropuertos(aeropuertos);
				break;
			case 2 : //Ver empresas(privado)subvencion(publico)
				System.out.println("");
				mostrarPatrocinio(aeropuertos);
				break;
			case 3 ://Listar compa?ias
				entrada.nextLine();
				System.out.println("");
				System.out.println("\nDigite el nombre del aeropuerto: ");
				nombreAeropuerto = entrada.nextLine();
				aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
				if(aeropuerto == null) {
					System.out.println("El aeropuerto no existe");
				}else {
					mostrarCompa?ias(aeropuerto);
				}
				break;
			case 4 ://Lista de vuelos
				entrada.nextLine();
				System.out.println("\nDigite el nombre del aeropuerto");
				nombreAeropuerto = entrada.nextLine();
				aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
				if(aeropuerto == null) {
					System.out.println("El aeropuerto no existe");
				}else {
					System.out.println("Digite el nombre de la compa?ia: ");
					nombreCompa?ia = entrada.nextLine();
					compa?ia = aeropuerto.getCompa?ia(nombreCompa?ia);
					mostrarVuelos(compa?ia);
				}
				break;
			case 5 ://Lista vuelos de ciudad origen a destino
				entrada.nextLine();
				System.out.println("\nDigite la ciudad de origen: ");
				origen = entrada.nextLine();
				System.out.println("Digite la ciudad destino");
				destino = entrada.nextLine();
				mostrarVueloOrigenDestino(origen, destino, aeropuertos);
				break;
			case 6 : break;
			default:System.out.println("Se equivoco de opcion");
			break;
			}
			
			System.out.println("");
			
		} while (opcion!=6);
	}

public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
	for(int i=0;i<aeropuertos.length;i++) {
		if(aeropuertos[i] instanceof AeropuertoPrivado) {
			System.out.println("Aeropuerto privado");
			System.out.println("Nombre: "+aeropuertos[i].getNombre());
			System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
			System.out.println("Pais: "+aeropuertos[i].getPais());
		}else {
			System.out.println("Aeropuerto publico");
			System.out.println("Nombre: "+aeropuertos[i].getNombre());
			System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
			System.out.println("Pais: "+aeropuertos[i].getPais());
		}
		
		System.out.println("");
	}
	
}


public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
	String empresas[];
	for(int i=0;i<aeropuertos.length;i++) {
		if(aeropuertos[i] instanceof AeropuertoPrivado) {
			System.out.println("Aeropuerto privado: "+aeropuertos[i].getNombre());
			empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
			System.out.println("Empresas: ");
			for(int j=0;j<empresas.length;j++) {
				System.out.println(empresas[j]);
			}
		}else {
			System.out.println("Aeropuerto publico: "+aeropuertos[i].getNombre());
			System.out.println("Subvencion: "+ ((AeropuertoPublico)aeropuertos[i]).getSubvencion());
		}
		System.out.println("");
	}
}

public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
	boolean encontrado = false;
	int i =0;
	Aeropuerto aero = null; 
	while(!encontrado && i< aeropuertos.length) {
		if(nombre.equals(aeropuertos[i].getNombre())) {
			encontrado = true;
			aero = aeropuertos[i];
		}
		i++;
	}
	return aero;
}


public static void mostrarCompa?ias(Aeropuerto aeropuerto) {
	System.out.println("\nLas compa?ias del aeropuerto "+aeropuerto.getNombre());
	for(int i=0;i<aeropuerto.getNroCompa?ia();i++) {
		System.out.println(aeropuerto.getCompa?ia(i).getNombre());
	}
}


public static void mostrarVuelos(Compa?ia compa?ia) {
	Vuelo vuelo;
	System.out.println("Los vuelos de la compa?ia: "+compa?ia.getNombre());
	for(int i=0;i<compa?ia.getNumVuelo();i++) {
		vuelo = compa?ia.getVuelo(i);
		System.out.println("Identificador: "+vuelo.getIdentificador());
		System.out.println("Ciudad origen: "+vuelo.getCiudadOrigen());
		System.out.println("Ciudad destino: "+vuelo.getCiudadDestino());
		System.out.println("Precio: "+vuelo.getPrecio());
		System.out.println("");
	}
}

public static Vuelo[] buscarVuelosOrigenDestino(String origen,String destino, Aeropuerto aeropuertos[]) {
	Vuelo vuelo;
	int contador=0;
	Vuelo listaVuelos[];
	for(int i=0;i<aeropuertos.length;i++) {//recorre los aeropuertos
		for(int j=0;j<aeropuertos[i].getNroCompa?ia();j++) {//recorre las compa?ias
			for(int k=0;k<aeropuertos[i].getCompa?ia(j).getNumVuelo();k++) {//recorre los vuelos
				vuelo = aeropuertos[i].getCompa?ia(j).getVuelo(k);
				if((origen.equals(vuelo.getCiudadOrigen())&&(destino.equals(vuelo.getCiudadDestino())))) {
					contador++;
				}
			}
		}
	}
	listaVuelos = new Vuelo[contador];
	
	int q =0;
	
	for(int i=0;i<aeropuertos.length;i++) {
		for (int j = 0; j <aeropuertos[i].getNroCompa?ia(); j++) {
			for (int k = 0; k <aeropuertos[i].getCompa?ia(j).getNumVuelo(); k++) {
				vuelo = aeropuertos[i].getCompa?ia(j).getVuelo(k);
				if((origen.equals(vuelo.getCiudadOrigen())&&(destino.equals(vuelo.getCiudadDestino())))) {
					listaVuelos[q]= vuelo;
					q++;
				}
			}
		}
	}
	
	return listaVuelos;
}


public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
	Vuelo vuelos[];
	vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos);
	if(vuelos.length==0) {
		System.out.println("No existen vuelos");
	}else {
		System.out.println("\nVuelos Encontrados: \n");
		for (int i = 0; i < vuelos.length; i++) {
			System.out.println("Identificador: "+vuelos[i].getIdentificador());
			System.out.println("Ciudad origen: "+vuelos[i].getCiudadOrigen());
			System.out.println("Ciudad destino: "+vuelos[i].getCiudadDestino());
			System.out.println("Precio: "+vuelos[i].getPrecio());
			System.out.println("");
		}
	}
		
}


}
