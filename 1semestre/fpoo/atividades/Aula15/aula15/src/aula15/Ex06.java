package aula15;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		System.out.print("digite a quatidade de nuemros que quer: ");
		int a = leia.nextInt();
		
		int n[] = new int[a];
		
		int qi = 0, qp = 0;
		
		for(int i = 0; i < a; i++) {
			System.out.println("digite um numero: ");
			n[i] = leia.nextInt();
			
			if(n[i] % 2 == 0) {
				qp++;	
			}else {
				qi++;
			}
		}
		
		int[] impar = new int[qi];
		int[] par = new int[qp];
		
		for(int i = 0; i < par.length;i++) {
			par[i] = 1;
		}
		
		for (int i = 0; i < impar.length; i++) {
			impar[i] = 0;
		}
		
		for(int i = 0; i < n.length;i++) {
			
			if(n[i] % 2 == 0) {
				
				for (int x = 0; x < par.length;x++) {
					
					if(par[x] == 1) {
						
						par[x] = n[i];
						
						break;
					}
				}
			}else {
				
				for(int x = 0;x < impar.length; x++) {
					
					if(impar[x] == 0) {
						
						impar[x] = n[i];
						
						break;
					}
				}
			}
		}
		
		Arrays.sort(par);
		Arrays.sort(impar);
		
		System.out.println("Pares: ");
		
		for(int i = 0; i <par.length; i++) {
			System.out.println(par[i]+ " ");
		}
		
		System.out.println("\nimpar: ");
		
		for(int i = impar.length - 1; i >= 0; i--) {
			System.out.print(impar[i] + " ");
		}
		System.out.println("");
	}

}
