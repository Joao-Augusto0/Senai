package javamodelo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Lista nm = new Lista();
		
		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		
		do {
			System.out.println("1-soma!");
			System.out.println("2-mult!");
			System.out.println("3-subtra��o");
			System.out.println("4-divi!");
			System.out.println("5-sair");
			
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("digite um numero:");
				Double n1 = leia.nextDouble();
				System.out.println("digite algum texto");
				Double n2 = leia.nextDouble();
				
				Double Soma = n1 + n2;
			
			Double ssoma = Soma;
			
			nm.lista(ssoma,"soma");
			
			break;
			
			case 2:
				System.out.println("digite o 1 nmr:");
				Double n3 = leia.nextDouble();
				System.out.println("digite o 2 nmr");
				Double n4 = leia.nextDouble();
				
				Double mult = n3 * n4;
			
			Double mmult = mult;
			
			nm.lista(mmult,"mult");
			
						
			case 3:
				System.out.println("digite 1 nmr:");
				Double n5 = leia.nextDouble();
				System.out.println("digite 2 nmr");
				Double n6 = leia.nextDouble();
				
				Double sub = n5 - n6;
			
			Double ssub = sub;
			
			nm.lista(ssub, "sub");
				
				break;
				
			case 4:	
				System.out.println("digite 1 nmr:");
				Double n7 = leia.nextDouble();
				System.out.println("digite 2 nmr");
				Double n8 = leia.nextDouble();
				
				Double div = n7 / n8;
			
			Double ddiv = div;
			
			nm.lista(ddiv,"sub");
				
			default:
				System.out.println("ain");
				break;
		}
		
	}while(opcao != 0);
	
}
}
