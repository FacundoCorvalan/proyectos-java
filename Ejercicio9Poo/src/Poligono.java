
public abstract class Poligono {
	protected int nroLados;

	public Poligono(int nroLados) {
		
		this.nroLados = nroLados;
	}

	public int getNroLados() {
		return nroLados;
	}

	@Override
	public String toString() {
		return "NroLados=" + nroLados ;
	}
	
	//Declaramos el metodo como abstracto
	public abstract double area();
	
	
}
