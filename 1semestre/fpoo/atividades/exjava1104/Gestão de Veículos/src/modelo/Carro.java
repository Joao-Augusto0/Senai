package modelo;

public class Carro extends Veiculo{

	private String tipo;
	private int passageiros;

	public void Carro() {
		return;
	}
	
	public Carro(String tipo,int passageiros,String placa,int anoModelo,int anoFabricacao,String modelo,String marca,double valor) {
		setPlaca(placa);
		setAnoModelo(anoModelo);
		setAnoFabricacao(anoFabricacao);
		setModelo(modelo);
		setMarca(marca);
		setValor(valor);
		
		this.passageiros = passageiros;
		this.tipo = tipo;
	}
	
		public String toString(){
			return "placa: " +getPlaca() + "ano modelo: " + getAnoModelo() + "ano fabricacao: " + getAnoFabricacao() + "modelo: " + getAnoModelo() + "marca: " + getMarca() + "valor: " + getValor() + "passageiros: " + passageiros + "tipo: " + tipo;
	}
	
}
