package modelo;

import java.util.Scanner;

public class Ex08 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		float n1,n2,r;
		
		System.out.print("digite um nuemero:");
		n1 = leia.nextInt();
		System.out.print("digite outro numero:");
		n2 = leia.nextInt();
		
		r = n1 % n2;
		System.out.printf("o resto da divis�o entre "+n1+" e "+n2+ " �:"+r);		
	}
}