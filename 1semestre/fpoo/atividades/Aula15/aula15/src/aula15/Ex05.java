package aula15;

import java.util.Scanner;

public class Ex05 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		int a[] = new int[20];  
		int	b[] = new int[20];
		int dif[] = new int[20];
		int soma[] = new int[20];
		int multi[] = new int[20];
		
		for(int i = 0; i < 20; i++) {
			System.out.print("digite numeros aleatorios: ");
			a[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 20; i++) {
			
			System.out.print("digite outros numeros: ");
			b[i] = leia.nextInt();
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println(dif [i] = a[i] - b[i]);
		}
		
		for(int i = 0; i < 20; i ++) {
			System.out.println(soma[i] = a[i] + b[i]);
		}
		
		for(int i = 0; i< 20; i++) {
			System.out.println(multi[i] = a[i] * b[i]);
		}	
	}
}