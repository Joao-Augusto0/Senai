package treinim;

import java.util.Scanner;

public class Lex05 {
	public static Scanner leia;
	
	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		System.out.print("digite o valor do xerox: ");
		float x = leia.nextFloat();
	
		int c = 0;
		
		for(int i = 1; i <= 200; i++) {
			System.out.printf("%d = %.2f\t", i,(x * i));
			c++;
			
			if(c == 10) {
				c = 0;
				System.out.println();
				
			}
		}	
	}
}