package modelo;

import java.util.Scanner;

public class Ex10 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
	
		float area,tq,r;
		float m2 = (float) 0.37;
		
		//10kg pedra = 130 reias
		//10 kg pedra = 3.7 m2
	
		System.out.print("digite a area a ser preenchida:");
		area = leia.nextFloat();
		
	tq  = m2 * area;
	r = 13 * tq;
	
	System.out.printf("O total de quilos é %.2f",tq);
	System.out.printf(" O valor dos quilos em R$ %.2f",r);
	}
}