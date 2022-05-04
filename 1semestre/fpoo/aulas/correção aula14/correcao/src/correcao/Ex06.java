package correcao;

import java.util.Scanner;

public class Ex06 {
public static Scanner leia;
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		System.out.println("Inform o inicio da sequencia : ");
		int inicio = leia.nextInt();
		
		System.out.println("informe o fim da sequencia : ");
		int fim = leia.nextInt();
		
		int somapar = 0, somaimpar = 0;
		
		for (int i = inicio; i <= fim; i++) {
			if(i%2 == 0) {
				somapar += i;
			}else {
				somaimpar += i;
			}
		}
	
		System.out.println(somapar);
		System.out.println(somaimpar);
		
	}
}