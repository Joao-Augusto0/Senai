package treinim;

import java.util.Scanner;

public class Lex06 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		System.out.print("digite um valor: ");
		int n1 = leia.nextInt();
		
		System.out.print("digite outro valor: ");
		int n2 = leia.nextInt();
		
		int sp = 0,si = 0; 
		
		for(int i = n1; i <= n2; i++) {
			if(i % 2 == 0) {
				sp += i;
			}else {
				si += i;
			}
		}
		
		System.out.println(sp);
		System.out.println(si);
		
	}

}
