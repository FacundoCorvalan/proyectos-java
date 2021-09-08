/*
 * Implementar la clase Rectángulo.
	Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
	trabajará con Rectángulos cuyos lados estén paralelos a los ejes.
	Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
	los atributos de la clase.
	La funcionalidad que debe proveer un rectángulo es la siguiente
		● Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
		Y.
		● Calcular el Área del rectángulo.
		● Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
		iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
		del mismo es mayor que la del otro.
		● Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
		propiedades para que sea un cuadrado.
		● Determinar el largo del lado superior.
		● Determinar si está acostado o parado (si el alto es más que el ancho).*/

package ejercicio3;

public class Rectangulo {
	private int base;
	private int altura;
	private int otraBase;
	private int otraAltura;
	
	public Rectangulo() {
		this.base = getBase();
		this.altura = getAltura();
	}
	public Rectangulo(int x,int y) {
		this.base= x;
		this.altura = y;
	}
	
	
	
	public int getBase() {
		return base;
	}



	public void setBase(int base) {
		this.base = base;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public void moverRectangulo(int nuevoPuntoX, int nuevoPuntoY) {
		int nuevaBase =+ nuevoPuntoX;
		int nuevaAltura =+ nuevoPuntoY;
	}
	
	
	public int getArea() {
		int area = (getBase()*getAltura());
		return area;
	}
	
	
}
