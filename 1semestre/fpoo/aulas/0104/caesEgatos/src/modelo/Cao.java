package modelo;

public class Cao extends Animal{

	private int qtdMotoqueirosAtacados;

	public Cao(String especie,String nome, float peso,String ra�a,int qtdMotoqueirosAtacados) {
		super(especie,nome,peso,ra�a);
		this.qtdMotoqueirosAtacados = qtdMotoqueirosAtacados;	
	}
	@Override
	public String toString() {
		return "Cao [qtdMotoqueirosAtacados=" + qtdMotoqueirosAtacados + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
		
	}
	
	

}
