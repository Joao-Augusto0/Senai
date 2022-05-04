package treinim;

import java.util.Scanner;

public class Lex03 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		int ma = 0, me = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("digite 10 valores: ");
			int n = leia.nextInt();
		
			if( i == 0) {
				ma = n;
				me = n;
			}else {
				if( n > ma) ma = n;
				if( n < me) me = n;
				
			}	
		}
		
		System.out.println("o maior valor é: "+ma);
		System.out.println("o menor valor é: "+me);
	}
}