package aula15;

import java.util.Scanner;

public class Ex03 {
public static Scanner leia;
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		int[]a = new int[10];
		int[]b = new int[10];
		
		for(int z = 0; z < 10;z++) {
			System.out.print("digite 10 valores: ");
			a[z] = leia.nextInt();
		}
		
		for(int y = 0; y < 10;y++) {
			
				if(y % 2 == 0){
					b[y] = a[y] /2;
					
				}else {
					b[y] = a[y] * 3;
			}
		}
		
		for(int x = 0; x < 10; x++) {
			System.out.println(a[x]);
			
		}
		
		for(int w = 0; w < 10; w++) {
			System.out.println(b[w]);
		}
		System.out.println("");
	}
}