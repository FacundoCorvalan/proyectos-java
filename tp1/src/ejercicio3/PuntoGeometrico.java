/*Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
	El valor por defecto de los mismos es (0,0)
	La funcionalidad que posee la clase es la siguiente:
		● Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
		del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
		(cierto desplazamiento en X y cierto desplazamiento en Y).
		● Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
		euclídea con otro punto acorde a la siguiente formula:
		Distancia2 = ( X1 – X2 )^2+ (Y1 – Y2)^2

	La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
	cuadrada.*/

package ejercicio3;

public class PuntoGeometrico {
	private int puntoX;
	private int puntoY;
	
	public PuntoGeometrico() {
		this(0,0);//Valores por defecto = 0
		
	}

	public PuntoGeometrico(int x, int y) {
		
		this.puntoX = x;
		this.puntoY= y;
	}
	
	
	
	public int getPuntoX() {
		return puntoX;
	}

	public int getPuntoY() {
		return puntoY;
	}

	public int avanzarDerechaX(int x) {
		int nuevoPuntoX = getPuntoX()+x;
		return nuevoPuntoX;
	}
	
	public int retrocederIzquierdaX(int x) {
		int nuevoPuntoX = getPuntoX()-x;
		return nuevoPuntoX;
	}
	
	public int incrementarY(int y) {
		int nuevoPuntoY=getPuntoY()+y;
		return nuevoPuntoY;
	}
	
	public int restarY(int y) {
		int nuevoPuntoY=getPuntoY() - y;
		return nuevoPuntoY;
	}
	
	public double calcularDistanciaEuclidea(PuntoGeometrico p) {
		double diferenciaX = puntoX - p.getPuntoX();
		double diferenciaY = puntoY - p.getPuntoY();
		
		return Math.sqrt(Math.pow(diferenciaX, 2)+ Math.pow(diferenciaY, 2));
		
	}
	
	
	
}
