package aula14;

import java.util.Scanner;

public class Ex4 {
public static Scanner leia;
	public static void main(String[] args) {
		leia = new Scanner(System.in);

		System.out.print("digite um valor:");
		int n = leia.nextInt();
		
		for(int c = n; c <= n;c--) {
			
			System.out.println(c);
			
			int f = n * c;
			
			System.out.print(f);
		}
		
	}

}
