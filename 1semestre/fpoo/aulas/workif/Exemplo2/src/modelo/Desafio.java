package modelo;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
	//entrada	
		Scanner leia = new Scanner(System.in);
		
		char sexo = 0;
		int n1, n2, idade, falta;
		float media;
		
		System.out.println("qual a primeira nota:");
		n1 = leia.nextInt();
		System.out.println("qual a segunda nota:");
		n2 = leia.nextInt();
		
		System.out.println("qual seu sexo digite (f) para feminino e (m) para masculino:");
		sexo = leia.
		
		//processamento
				
		media = (n1 + n2) / 2;
		
		if (media >= 6) {
			
			System.out.println("voce foi aprovado pela nota!!");
		}else {
			System.out.println("voce foi reprovado pela nota");
		}
		
		switch (sexo) {
		case 'f': System.out.println("Sexo feminino!");
		break;
		case 'm': System.out.println("Sexo masculino");
		break;
		default : System.out.println("Não especificado");
		break;
		
		}
	}
	}

