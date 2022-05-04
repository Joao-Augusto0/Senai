package modelo;

import java.util.Scanner;

public class Exemplolaço {
public static Scanner leia;
	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		int opcao;
		do {
			System.out.print("digite 1 para sair");
				opcao = leia.nextInt();
		}while(opcao != 1);
				System.out.print("adeus");
	}
}