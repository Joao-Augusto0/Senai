package treinim;

import java.util.Scanner;

public class Lex04 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		System.out.print("digite o valor: ");
		int v = leia.nextInt();
		
		int f = 1;
		
		for(int i = v; i >=1; i--) {
			f *= i;
		}
		
		System.out.println(f);	
	}
}