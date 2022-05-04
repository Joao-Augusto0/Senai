package modelo;

import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
	public static Scanner leia;


	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int menu = 0;
		
		while(menu != 4) {
			System.out.print("1 - Numeros Inteiros\n2 - Numeros Reais\n3 - Nomes\n4 - Sair ");
			
			menu = leia.nextInt();
			
			switch(menu) {
			case 1:
				GerarInteiro();
				break; 
			case 2:
				GerarReal();
				break;
			case 3:
				GerarNome();
				break;
			case 4:
				System.out.print("obrigado!");
				break;
			default:
				System.out.print("op��o invalida:");
			}
		}

			
		}
				
		


public static void GerarInteiro() {
	leia = new Scanner(System.in);
	Random rand= new Random();
	
	System.out.print("Digite quantos numero deseja gerar: ");
	int  qntd = leia.nextInt();
	
	int[] numeros = new int [qntd];
	
	for (int i = 0; i < qntd; i++) {
		numeros [i] = rand.nextInt();
		System.out.print(numeros[i]);
	}
}


public static void GerarReal() {
			leia = new Scanner(System.in);
			Random rand= new Random();
			
			System.out.print("Digite quantos numero deseja gerar: ");
			int  qntd = leia.nextInt();
			
			double[] numeros = new double [qntd];
			
			for (int i = 0; i < qntd; i++) {
				numeros [i] = rand.nextDouble() + 100;
				System.out.printf("%.2f\n", numeros[i]);
			}
}

public static void GerarNome() {
	leia = new Scanner(System.in);
	Random rand= new Random();
	
	System.out.print("Digite quantos nomes deseja gerar: ");
	int  qntd = leia.nextInt();
	
	String[] nomes = ("joao","rodolfo","gabriel","breno","vinicius","lucas","natan","iza","larissa","jose");

	
	for (int i = 0; i < qntd; i++) {
		int a = rand .nextInt(nomes.length);
		
		System.out.print(nomes [a]);
	}
}
}