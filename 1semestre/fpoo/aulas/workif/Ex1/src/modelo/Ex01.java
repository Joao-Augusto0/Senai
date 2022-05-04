package modelo;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner  leia = new Scanner(System.in);

		int idade;
		
		System.out.println("qual a sua idade?:");
		idade = leia.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voce é maior de 18 anos pode entrar!!");
		}else {
			System.out.println("Acesso negado voce tem a idade menor que 18 anos!");
		}
	}
}