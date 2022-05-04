package aula15;

import java.util.Scanner;

public class Ex01 {
public static Scanner leia;



	public static void main(String[] args) {
		
		int []m = new int[10];
		
		leia = new Scanner(System.in);
			
		for(int i = 0; i < 10; i++) {
			System.out.println("digite 10 valores aleatorios: ");
			m[i] = leia.nextInt();
		}
		
		for(int x = 0; x < 10 ; x++) {
			System.out.println(m[x] + " ");
			
		}	
		System.out.println("");
		for(int z = 9; z > 1; z--) {
			System.out.println(m[z]);
		}
	}
	
	
	
}