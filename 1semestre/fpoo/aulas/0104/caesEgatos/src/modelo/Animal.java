package modelo;

public class Animal {

	private String especie;
	private String nome;
	private float peso;
	private String raça;
	
	public Animal(String especie, String nome, float peso, String raça) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.peso = peso;
		this.raça = raça;
		
		
	}
	@Override
	public String toString() {
		return "Animal [especie=" + especie + ", nome=" + nome + ", peso=" + peso + ", raça=" + raça + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + "]";
	}
	
}
