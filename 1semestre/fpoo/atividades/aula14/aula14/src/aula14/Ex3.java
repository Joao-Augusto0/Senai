package aula14;

import java.util.Scanner;

public class Ex3 {
	public static Scanner leia;
	public static void main(String[] args) {
		leia = new Scanner(System.in);
			int b = 0  , ma = 0, me = 9999;
			
			for(int n = 0; n < 10; n++) {
				 
				System.out.print("digite um numero:");
				b = leia.nextInt();
				
				if(n == 0) {
					
					ma = b;
					me = b;
					
				}
				if(b > ma) {
					ma = b;
					
				}
				if(b <  me) {
					me = b;
				}
				
			}
			System.out.printf(" maior "+ ma+" menor "+me);
	}	
}