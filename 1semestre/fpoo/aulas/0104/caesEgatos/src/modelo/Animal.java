package modelo;

public class Animal {

	private String especie;
	private String nome;
	private float peso;
	private String ra?a;
	
	public Animal(String especie, String nome, float peso, String ra?a) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.peso = peso;
		this.ra?a = ra?a;
		
		
	}
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nome=" + nome + ", peso=" + peso + ", ra?a=" + ra?a + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + "]";
	}
	
}
