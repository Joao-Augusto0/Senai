package correcao;

import java.util.Scanner;

public class Ex05 {
public static Scanner leia;
	
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		System.out.print("informe o valor da copia: ");
		float val = leia.nextFloat();
		
		int cont = 0;
		
		for(int i = 1; i <=200; i++) {
			System.out.printf("%d = %.2f\t", i,  (val * i));
			cont++;
			if(cont == 10) {
				cont = 0;
				System.out.println();
			}
		}
		
	}

}
