package modelo;

public class Nota {

	public String componente;
	public float nota[] = new float[3];
	
	public Nota(String componente,float nota[]) {
		this.componente = componente;
		this.nota = nota;
	}
   public float obterMedia() {
	   float soma = 0;
	   float media = 0;
	   for (int i = 0; i < nota.length; i++) {
		soma += nota[i];
	}
	   return media = soma/3;
   }
   
}