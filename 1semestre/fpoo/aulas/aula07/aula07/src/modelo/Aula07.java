package modelo;

import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	
		String[] nomes = new String[15];
		String[] idades = new String[15];
		
 		
		for(int i = 0; i <= 15; i++) {
			System.out.println("digite o nome: ");
			nomes[i] = leia.next();
			
		}
		
		for(int i = 0; i <= 15; i++) {
			System.out.println("digite a idade: ");
			idades[i] = leia.next();
			
		}
		
		for(int i = 0; i <= 15; i++) {
			System.out.println(nomes[i]);
		}
		
		for(int i = 0; i <= 15; i++) {
			System.out.println(idades[i]);
		}
		
	}
}