package modelo;

public class Lista2_1 {

	public static void main(String[] args) {

		mostra();
		
	}

	public static void mostra () {
		
		int[] n = new int[5];
	
		n[0] = 2;
		n[1] = 4;
		n[2] = 5;
		n[3] = 6;
		n[4] = 8;
		
		int[] indice = new int[5];
		
		indice[0] = 0;
		indice[1] = 1;
		indice[2] = 2;
		indice[3] = 3;
		indice[4] = 4;
		
		System.out.println("N?meros     Indice");
		
		for(int i = 0; i < n.length; i++) {
			
			System.out.println(n[i]);
			System.out.println(indice[i]);	
		}
	}
}
