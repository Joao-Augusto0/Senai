package modelo;

public class Veiculo {

	public String placa;
	public String marca;
	public String modelo;
	public  int anoModelo;
	public int anoFabricacao;
	public String cor;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, String marca,String modelo,int anoModelo,int anoFabricao,String cor) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}
	
	public String paraString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoModelo=" + anoModelo
				+ ", anoFabricacao=" + anoFabricacao + ", cor=" + cor + "]";	}
	
}
