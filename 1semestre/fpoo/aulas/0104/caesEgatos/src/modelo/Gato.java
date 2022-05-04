package modelo;

public class Gato extends Animal{

	private int qtdVidas = 7;
	
	public Gato(int qtdVidas,String especie,String nome, float peso,String ra�a) {
		super(especie,nome,peso,ra�a);
		this.qtdVidas=qtdVidas;
	}
	@Override
	public String toString() {
		return "Gato [qtdVidas=" + qtdVidas + super.toString() + super.toString();
	}
	
	
}

