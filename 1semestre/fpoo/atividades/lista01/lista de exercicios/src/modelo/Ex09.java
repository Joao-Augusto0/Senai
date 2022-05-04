package modelo;

import java.util.Scanner;

public class Ex09 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int n1,n2,r;
		
		System.out.print("digite um numero inteiro:");
		n1 = leia.nextInt();
		System.out.print("digite outro numero inteiro:");
		n2 = leia.nextInt();
		
		r = n1 + n2;
		
		System.out.printf("o resultado da soma é:"+r);


	}

}
