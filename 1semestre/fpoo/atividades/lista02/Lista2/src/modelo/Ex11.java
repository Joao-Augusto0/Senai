package modelo;

import java.util.Scanner;

public class Ex11 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
	
		float a,b,c;
	
		System.out.print("digite o valor do lado a:");
		a = leia.nextFloat();
		System.out.print("digite o valor do lado b:");
		b = leia.nextFloat();
		System.out.print("digite o valor do lado c:");
		c = leia.nextFloat();
	
		if (a == b && b == c) {
			System.out.print("Seu triangulo é equilátero!");
		}else if(a != b && b!= c){
				System.out.print("seu triangulo é escaleno");
		}else {
			System.out.print("seu triangulo é isósceles ");
		}
	
	}
}