package aula15;

import java.util.Scanner;

public class Ex04 {
	public static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		String nome[] = new String[10];
		
		for(int i = 0; i < 10; i++) {
			

			System.out.println("digite um nome: ");
			nome[i] = leia.nextLine();
			
		}
		
		System.out.println("digite o nome que deseja buscar: ");
		String nn = leia.nextLine();
		
		boolean p = false;
		
		for (int i = 0; i < 10; i++) {
			
			if (nome[i].equals(nn)) {
				
				System.out.println("achei");
				p = true;
			}
		}
		
		if(!p) {
			System.out.println("nao achei");
	}

}
}