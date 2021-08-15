import java.util.Scanner;

/*Ejercicio 8: Una empresa de envio de paquetes tiene varias sucursales en todo el pais. Cada sucursal esta definida por su 
 * nro de sucursal, direccion y ciudad. Para calcular el precio que cuesta enviar cada paquete, las sucursales tienen en cuenta
 * el precio del paquete y la prioridad, sabiendo que se cobra un dolar por kilo, 10 dolares mas si la prioridad es alta
 * y 20 si es express. Cada paquete enviado tendra un nro de referencia y el DNI de la persona que lo envia*/
public class Principal {
	public static int buscarPaquete(Paquete t[],int nroPaquete,int contadorPaquete) {
		int indice=0;
		boolean encontrado=false;
		
		for(int i=0;i<contadorPaquete;i++) {
			if(t[i].getNroPaquete()== nroPaquete) {
				encontrado = true;
				indice = i;
				
			}
			
			if (encontrado==false) {
				indice=-1;
			
			}
		}
		
		return indice;
	}
	
	
	public static int buscarSucursal(Sucursal t[],int nroSucursal,int contadorSucursal) {
		int indice=0;
		boolean encontrado=false;
		
		for(int i=0;i<contadorSucursal;i++) {
			if(t[i].getNroSucursal()== nroSucursal) {
				encontrado = true;
				indice = i;
				
			}
			
			if (encontrado==false) {
				indice=-1;
			
			}
		}
		
		return indice;
	}
	
	
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nroSucursal,opcion,contadorSucursal=0,indiceSucursal=0;
		String direccion,ciudad;
		
		int nroPaquete,prioridad,contadorPaquete=0,indicePaquete=0;
		String dni;
		double peso,precioPaquete;
		
		Sucursal sucursal[] = new Sucursal[50];
		Paquete paquete [] = new Paquete[100];
		
		
		do {
			System.out.println("\t.:MENU:.");
			System.out.println("1.Crear una nueva sucursal");
			System.out.println("2.Enviar Paquete");
			System.out.println("3.Consultar sucursal");
			System.out.println("4.Consultar paquete");
			System.out.println("5.Mostrar todas la sucursales");
			System.out.println("6.Mostrar todos los paquetes");
			System.out.println("7.Salir");
			
			System.out.println("Digite la opcion de menu");
			opcion = entrada.nextInt();
			
			switch (opcion) {
			case 1: System.out.println("Digite el nro de sucursal: ");
					nroSucursal = entrada.nextInt();
					entrada.nextLine();
					System.out.println("Digite la direccion: ");
					direccion = entrada.nextLine();
					
					System.out.println("Digite la ciudad: ");
					ciudad = entrada.nextLine();
					
					sucursal[contadorSucursal] = new Sucursal(nroSucursal, direccion, ciudad);
					contadorSucursal++;
					break;
					
			case 2: System.out.println("Digite el nro de sucursal: ");
					nroSucursal=entrada.nextInt();
					indiceSucursal = buscarSucursal(sucursal, nroSucursal, contadorSucursal);
					
					
					if(indiceSucursal==-1) {
						System.out.println("La sucursal no existe");
					}
					else {
						System.out.println("Digite el nro de paquete: ");
						nroPaquete =entrada.nextInt();
						entrada.nextLine();
						System.out.println("Digite el dni de la persona: ");
						dni=entrada.nextLine();
						
						System.out.println("Digite el peso del paquete: ");
						peso = entrada.nextDouble();
						
						System.out.println("Digite la prioridad (0=Normal, 1=Alta, 2=Express: ");
						prioridad = entrada.nextInt();
						
						paquete[contadorPaquete] = new Paquete(nroPaquete, dni, peso, prioridad);
						
						precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
						System.out.println("\nEl precio del paquete es: $"+precioPaquete);
						
						contadorPaquete++;
					}
					break;
					
			case 3: System.out.println("\nDigite el nro de sucursal: ");
					nroSucursal = entrada.nextInt();
					
					indiceSucursal = buscarSucursal(sucursal, nroSucursal, contadorSucursal);
					
					if(indiceSucursal==-1) {
						System.out.println("La sucursal no existe: ");
					}else {
						System.out.println("Los datos de la sucursal son: ");
						System.out.println(sucursal[indiceSucursal].mostrarDatosSucursal());
					}
					break;
					
			case 4: System.out.println("\nDigite el nro de paquete");
					nroPaquete = entrada.nextInt();
					
					
					indicePaquete = buscarPaquete(paquete, nroPaquete, contadorPaquete);
					
					if(indicePaquete==-1) {
						System.out.println("El paquete no existe: ");
					}else {
						System.out.println("Los datos del paquete son: ");
						System.out.println(paquete[indicePaquete].mostrarDatosPaquete());
					}
					break;
					
			case 5: for(int i=0;i<contadorSucursal;i++) {
				System.out.println("\nLos datos de la sucursal Nº "+(i+1)+": ");
				System.out.println(sucursal[i].mostrarDatosSucursal());
			}
			break;
			
			case 6: for(int i=0;i<contadorPaquete;i++) {
				System.out.println("\nLos datos del paquete Nº :"+(i+1)+": ");
				System.out.println(paquete[i].mostrarDatosPaquete());
			}
			break;
			
			case 7:break;
			default: System.out.println("Opcion de menu incorrecta");
			break;
			}	
			System.out.println("");
		}while(opcion!=7);
	}
}
