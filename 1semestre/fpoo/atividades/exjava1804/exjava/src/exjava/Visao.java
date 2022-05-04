package exjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Visao {

	public static void main(String[] args) {
		
		Nome nm = new Nome();
		Scanner leia = new Scanner(System.in);
		
		int opcao = 0;

		do {
			System.out.println("1-digite seu nome e sua data de nascimento:");
			System.out.println("0- sair");
			
			opcao = leia.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.println("informe seu nome:");
					String nome = leia.next();
					System.out.println("informe seu ano de nascimento");
					String data = leia.next();
					
				
				String Nome = nome +";" + data;
				
				nm.bloco(Nome,"nome e data", true);
				
				break;
				case 2:
					
					ArrayList<String> infoFile = nm.ler("nome e data");
					
					for(String n1: infoFile) {
						System.out.println(n1);
					}
					
					
				case 0:
					System.out.println("Inté");
					break;
				default:
					System.out.println("ain");
					break;
			}
			
		}while(opcao != 0);
		
	}
}