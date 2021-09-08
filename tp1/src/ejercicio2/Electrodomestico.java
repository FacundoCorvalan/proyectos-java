package ejercicio2;



public class Electrodomestico {
	private String nombre;
	private double precioBase;
	private String color;
	private int consumoEnergetico;
	private double peso;
	
	public Electrodomestico(String nombre) {
		this.nombre = nombre;
		this.color = "Gris plata";
		this.consumoEnergetico=10;
		this.precioBase = 100;
		this.peso=2;
	}

	public Electrodomestico(String nombre, double precioBase, String color, int consumoEnergetico, double peso) {
		
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public int getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConsumoEnergetico(int consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean esBajoConsumo(int consumoEnergetico) {
		int consumoMin=45;
		if(consumoEnergetico<consumoMin) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void mostrarConsumo() {
		
		if(esBajoConsumo(consumoEnergetico)) {
			System.out.println("Es bajo Consumo: "+getConsumoEnergetico()+" kw");
		}else {
			System.out.println("No es bajo Consumo: "+getConsumoEnergetico()+" kw");
		}
		
	}
	
	public double calcularBalance(double precioBase,double peso) {
		double balance=(precioBase/peso);
		
		return balance;
	}
	
	public void mostrarGama() {
		double balance = calcularBalance(precioBase, peso);
		int minBalance=3;
		if(balance>minBalance) {
			System.out.println("El producto es alta gama");
		}else {
			System.out.println("El producto es baja gama");
		}
		
	}
}
