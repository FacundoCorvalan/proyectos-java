
public class Juego1 {
	private int puntosJugador1;
	private int puntosJugador2;
	private int minimoPuntos;
	private int cantidadCaras;
	public Juego1(){
		//this.puntosJugador1 = 0;
		//this.puntosJugador2 = 0;
		//this.minimoPuntos = 7;
		this(7);//Puedo llamar al constructor Juego(int minimoPuntos) para ahorrar codigo, le paso min 7 puntos
	}
	
	public Juego1(int minimoPuntos) {
		//this.puntosJugador1 = 0;
		//this.puntosJugador2 = 0;
		
		//this.minimoPuntos = minimoPuntos;
		
		this(minimoPuntos,6);//Puedo llamar al constructor Juego(int minimoPuntos, int cantidadCaras) que setee el minPuntos 
							 //pero asigne 6 caras
	}
	
	public Juego1(int minimoPuntos,int cantidadCaras) {
		this.puntosJugador1 = 0;
		this.puntosJugador2 = 0;
		
		this.cantidadCaras = cantidadCaras;
		this.minimoPuntos = minimoPuntos;
	}

	public int getPuntosJugador1() {
		return puntosJugador1;
	}

	public int getPuntosJugador2() {
		return puntosJugador2;
	}


	private int tirarDado() {
		//Random entre [0:1)--->[0:6)--->[0:7) 
		return (int)(Math.random()*6)+1;
	}

	public String ganador() {
		if(puntosJugador1> puntosJugador2) {
			return "Jugador 1";
		}else if(puntosJugador1 < puntosJugador2) {
			return "Jugador 2";
		}else {
			return "Empate";
		}
	}

	public String jugar() {
		int puntos1;
		int puntos2;
		for(int i=0;i<10;i++) {
			puntos1 = this.tirarDado() + this.tirarDado(); 
			puntos2 = this.tirarDado() + this.tirarDado();
			if((puntos1>minimoPuntos)&&(puntos1>puntos2)) {
				puntosJugador1++;
			}else if((puntos2>minimoPuntos)&&(puntos2>puntos1)) {
				puntosJugador2++;
			}

		}
		return this.ganador();
	}

}
