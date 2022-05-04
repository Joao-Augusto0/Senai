package modelo;

public class Moto extends Veiculo{

	private int cilindradas;
	
	public void Moto() {
		return;
	}
	
	public Moto(int cilindradas,String placa,int anoModelo,int anoFabricacao,String modelo, String marca, double valor) {

		setPlaca(placa);
		setAnoModelo(anoModelo);
		setAnoFabricacao(anoFabricacao);
		setModelo(modelo);
		setMarca(marca);
		setValor(valor);
		
		this.cilindradas = cilindradas;
	}
	
}
