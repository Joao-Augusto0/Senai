package correcao;

import java.util.Scanner;

public class Ex04 {
	
public static Scanner leia;


	public static void main(String[] args) {
		

		leia = new Scanner(System.in);
		
		System.out.print("informe o valor a ser calculado:");
		int val = leia.nextInt();
		
		int fat = 1;
		
		for(int i = val; i >= 1; i--) {
			fat  *= i;
		}
		
		System.out.println(fat);
		
	}

}