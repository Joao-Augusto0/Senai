package modelo;

import java.util.Scanner;

public class Exemplo2{
public static Scanner leia;
	public static void main(String[] args) {
		int opcao = 0;
		leia = new Scanner(System.in);
		
		System.out.print("digite 1 para sair");
		opcao = leia.nextInt();
		
		while(opcao != 1);
				System.out.print("adeus");
	}
}