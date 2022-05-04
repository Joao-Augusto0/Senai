package modelo;

public class Pessoas {

	private String nome;
	private int ano;
	
	public Pessoas(String entrada) {
		nome = (entrada.split(";")[0]);
		ano = Integer.parseInt(entrada.split(";")[1]);
	}
	
	public String toString() {
		int idade = 2022 - ano;
		return nome + ";" + idade;
	}
}