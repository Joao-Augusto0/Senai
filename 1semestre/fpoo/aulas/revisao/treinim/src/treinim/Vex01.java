package treinim;

import java.util.Scanner;

public class Vex01 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int p[] = new int[10];
		
		for(int i = 0; i < 10;i++) {
			System.out.print("digite 10 valores: ");
			p[i] = leia.nextInt();
		
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(p[i] +" ");
		}
			
		System.out.println("");
		for(int i = 9; i > 1; i--) {
			System.out.println(p[i]);
		}
		
	}

}
