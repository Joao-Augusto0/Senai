package modelo;

public class Vetores {
	public static void mostra() {
		
	}

	public static void main(String[] args) {

		
		int [] vetorInteiro  = new int[5];
		
		vetorInteiro[0] = 2;
		vetorInteiro[1] = 4;
		vetorInteiro[2] = 5;
		vetorInteiro[3] = 6;
		vetorInteiro[4] = 8;
		
		for (int i = 0; i < vetorInteiro.length; i++) {
			System.out.println(i + "\t"+ vetorInteiro[i]);
		}								
	}
}