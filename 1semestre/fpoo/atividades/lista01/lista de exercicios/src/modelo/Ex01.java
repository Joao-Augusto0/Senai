package modelo;

import java.util.Scanner;

public class Ex01 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner (System.in);
		
		float a,b,c,r;
		
		System.out.print("digite o valor de a:");
		a = leia.nextFloat();
		System.out.print("digite o valor de b:");
		b = leia.nextFloat();
		System.out.print("digite o valor de c:");
		c = leia.nextFloat();
		
		r = (a + b)/c;
		
		System.out.printf("o resultado da expressão é: %.2f",r);
	}

}
