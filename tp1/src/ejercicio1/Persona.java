package ejercicio1;



public class Persona {
	private String nombre;
	private String apellido;
	private int diaNacimiento;
	private int mesNacimiento;
	private int anioNacimiento;
	private String dni;
	private String sexo;
	private double peso;
	private double altura;
	
	
	public Persona(String dni) {
		nombre= "N";
		apellido = "N";
		diaNacimiento= 01;
		mesNacimiento=01;
		anioNacimiento=2000;

		this.dni = dni;
		sexo = "Femenino";
		peso = 1;
		altura = 1;
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni = dni;
		diaNacimiento= 01;
		mesNacimiento=01;
		anioNacimiento=2000;
		sexo = "Femenino";
		peso = 1;
		altura = 1;
	}

	public Persona(String nombre, String apellido, int diaNac, int mesNac, int anioNac, String dni, String sexo, double peso,
			double altura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.diaNacimiento = diaNac;
		this.mesNacimiento = mesNac;
		this.anioNacimiento = anioNac;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	

	public int getDiaNacimiento() {
		return diaNacimiento;
	}

	public int getMesNacimiento() {
		return mesNacimiento;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public String getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}

	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double obtenerImc(double peso,double altura) {
		double imc = peso/(altura/altura);
		return imc;
	}
	
	public void calculoPeso() {
		
		double indiceMasa = obtenerImc(peso,altura);
		double pesoMin=18.5;
		double pesoMax=25;
		if(indiceMasa < pesoMin) {
			System.out.println("Bajo peso");
		}else if((indiceMasa>=pesoMin)&&(indiceMasa <=pesoMax)) {
			System.out.println("Normal");
		}else {
			System.out.println("SobrePeso");
		}
	}
	
	private boolean esCumpleanios(int diaNac,int mesNac,int anioNac) {
		int diaActual = 1;
		int mesActual = 9;
		int anioActual = 2021;
		
		if((diaActual==diaNac)&&(mesActual==mesNac)&&(anioActual==anioNacimiento)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarCumpleaños() {
		boolean cumple=esCumpleanios(diaNacimiento,mesNacimiento,anioNacimiento);
		if(cumple == true) {
			System.out.println("Es su cumpleaños");
		}else {
			System.out.println("No es su cumpleaños");
		}
	}
	
	private boolean esMayor(int anioNac) {
		int anioActual =2021;
		int edad = (anioActual - anioNac);
		int edadMayor=18;
		if(edad>=edadMayor) {
			return true;
		}
		else {
			return false;
		}
	}
	public void mostrarMayor() {

		
		boolean mayor=esMayor(anioNacimiento);
		if(mayor==true) {
			System.out.println("Es mayor");
		
		}else {
			System.out.println("Es menor");
		}
	}
	
	
	
	private boolean puedeVotar(int anioNac) {
		int anioActual =2021;
		int edad = (anioActual - anioNac);
		int edadVoto=16;
		if(edad>=edadVoto) {
			return true;
		}
		else {
			return false;
		}
	}
	public void mostrarVoto() {
		boolean puedeVotar=puedeVotar(anioNacimiento);
		if(puedeVotar==true) {
			System.out.println("Puede votar!");
		}else {
			System.out.println("No puede Votar");
		}
	}
	public void mostrarDatos() {
		 System.out.println("Nombre: "+getNombre()+"\nApellido: "+getApellido()+"\nDni: "+getDni()+"\nFecha Nacimiento: "+
				getDiaNacimiento()+"/"+getMesNacimiento()+"/"+getAnioNacimiento()+"\nSexo: "+getSexo()+
				"\nPeso: "+getPeso()+"\nAltura: "+getAltura());
	}
}
