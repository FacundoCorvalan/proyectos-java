
public class MainJuego1 {

	public static void main(String[] args) {
		Juego1 jj = new Juego1();//Le paso los puntos iniciados en 0 y el minimo de puntos en 7
		
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		
		System.out.println(jj.jugar());
		
		System.out.println(jj.getPuntosJugador1());
		System.out.println(jj.getPuntosJugador2());
		
		
		
		//Otro juego modificando el min de puntos
		System.out.println("-----------------------------------");
		Juego1 jj2 = new Juego1(3);//Le paso los ptos=0, y el minimo de puntos en 3
		
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		
		System.out.println(jj2.jugar());
		
		System.out.println(jj2.getPuntosJugador1());
		System.out.println(jj2.getPuntosJugador2());
		
		//Otro juego modificando el nro de caras
		System.out.println("----------------------------------");
		c
		

	}

}
