package modelo;

import java.util.Scanner;

public class Ex03 {
	public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
	
	int n,a,s;
	
	System.out.print("digite um numero:");
	n = leia.nextInt();
	
	a = n-1;
	s = n+1;
	
	if(n <= 0) {
		System.out.printf("errado, digite um numero inteiro!");
	}else{ 
		System.out.printf("o antecessor é "+a+" e o sucessor é "+s);		
	}
	}
}