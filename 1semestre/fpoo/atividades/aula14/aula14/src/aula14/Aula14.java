package aula14;

import java.util.Scanner;

public class Aula14 {
	public static Scanner leia;
	public static void main(String[] args) {

		leia = new Scanner(System.in);

		
		System.out.print("digite um valor");
		int i = leia.nextInt();
		
		System.out.print("digite outro valor:");
		int n = leia.nextInt();
		
		if(i % 2 != 0) {
			i++;
		}
		
		for(int c = i; c < n; c+= 2) {
			
			System.out.println("numero par: "+c);
		}
		
		if(i % 2 ==0) {
		 i--;
		}
		
		for(int c = i; c < n; c+=2)
			System.out.println("numero impar: "+c);
		
		}
	}