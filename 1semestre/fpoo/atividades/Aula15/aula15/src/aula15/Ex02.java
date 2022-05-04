package aula15;

import java.util.Scanner;

public class Ex02 {
	public static Scanner leia;

	public static void main(String[] args) {

	leia = new Scanner(System.in);	
	int []m = new int[10];
	int[]  n = new int[10];
	int aux = 0;
	
	for(int i = 0; i < 10; i++) {
		System.out.println("digite 10 valores aleatorios: ");
		m[i] = leia.nextInt();	
		}
	
		for(int j = 9; j >= 0; j--) {
			
			n[j] = m[aux];
			aux++;
		}
		
		for(int k = 0; k < 10; k++) {
			System.out.print(m[k] + " ");
		}
		
		System.out.println("");
		for(int l = 0; l<10;l++) {
			System.out.print(n[l] + " ");
		}
		
		System.out.println("");
	}
}