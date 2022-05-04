package modelo;

	import java.util.Scanner;

	public class Vector {

		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int comprimento = 3;
			
			String [] nomes = new String [comprimento];
			int [] idades = new int [comprimento];
			
			for (int i = 0 ; i <comprimento; i++) {
				System.out.print("Nome[" + i + "]: ");
				nomes[i] = leia.next();
				
				System.out.print("idade[" + i +"]: ");
				idades[i] = leia.nextInt();
				
				
			
			}

			for (int i = 0; i < comprimento; i++ ) {
				if (idades[i] < 10 ) {
					System.out.println(nomes[i] + " criança.");
				}else if(idades[i] < 20) {
					System.out.println(nomes[i] + " jovem");
				}else {
					System.out.println(nomes [i] + " veio.");
			}
		}
	}
	
}