package treinim;

import java.util.Scanner;

public class Lex01 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		System.out.print("digite o 1 valor: ");
		int n1 = leia.nextInt();
		
		System.out.print("digite o 2 valor: ");
		int n2 = leia.nextInt();
		
		if(n1 % 2 != 0)n1++;
		for(int i = n1; i < n2;i +=2) {
			System.out.println("par"+i);
			}
		
			if(n1 % 2 == 0)n1++;
			for(int i = n1; i < n2; i+=2) {
				System.out.println("impar"+i);
		
		}
	}	
}
