package modelo;

import java.util.Scanner;

public class Teste {
	public static Scanner leia;
	public static void main(String[] args) {
		leia = new Scanner(System.in);
		int n1,n2,r;
		
		System.out.print("digite um numero:");
		n1 = leia.nextInt();
		System.out.print("digite outro numero:");
		n2 = leia.nextInt();
		
		if (n1 > n2) {
			for (;n1 > n2; n1++  ) {
				}
		}else {
			for (;n1 < n2;n1--) {
	}
		}
}
}