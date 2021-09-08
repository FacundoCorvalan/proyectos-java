/*
 * 2 Electrodomésticos
	Crear una clase Electrodoméstico con las siguientes características:
	Atributos son nombre, precio base, color, consumo energético y peso.
	Valores por defecto:
		● El color por defecto es gris plata.
		● El consumo energético 10 Kw.
		● Precio base 100 pesos.
		● El peso es 2 kg.
	Implementar todos los constructores.
	La funcionalidad de la clase es la siguiente:
		● Todos los métodos get y set.
		● Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw)
		● Calcular el balance, el mismo es el resultado de dividir el costo por el peso
		● Indicar si un producto es de alta gama, el balance es mayor que 3
		*/


package ejercicio2;

public class Principal {
	public static void main (String []args) {
		Electrodomestico heladera = new Electrodomestico("Heladera");
		
		heladera.mostrarConsumo();
		heladera.mostrarGama();
		
		
		System.out.println("-------------------------------");
		Electrodomestico microondas = new Electrodomestico("Microondas", 9000, "Negro", 500, 6);
		microondas.mostrarConsumo();
		microondas.mostrarGama();
		
	}
}
