package aula15;

import java.util.Scanner;

public class Ex07 {
	public static Scanner leia;
	public static void main(String[] args) {
		
		leia = new Scanner(System.in);

		System.out.println("Digite o tamanho dos vetores:");
		int qtd = leia.nextInt();

		int[] vec1 = new int[qtd];
		int[] vec2 = new int[qtd];

		System.out.println("Vetor 1\n");

		for (int i = 0; i < vec2.length; i++) {
			System.out.println("Digite um número:");
			vec1[i] = leia.nextInt();
		}

		System.out.println("\n\nVetor 2\n");

		for (int i = 0; i < vec2.length; i++) {
			System.out.println("Digite um número:");
			vec2[i] = leia.nextInt();
		}

		boolean iguais = false;

		for (int i = 0; i < vec2.length; i++) {
			if (vec1[i] == vec2[i]) {
				iguais = true;
			} else {
				iguais = false;
				break;
			}
		}

		if (iguais) {
			System.out.println("São IGUAIS");
		} else {
			System.out.println("São DIFERENTES");
		}

	}

}
