package visao;

import java.io.IOException;
import java.util.Scanner;

import controle.ProcessaPlanilha;

public class Tela {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
	
		ProcessaPlanilha.carregar();
		
		int menu = 0;
		
		while(menu != 5) {
			System.out.println("1-adicao\n2-mult\n3-sub\n4-divisao\n5-sair");
			menu = leia.nextInt();
			ProcessaPlanilha.saida(menu);
			
		}
	}
}