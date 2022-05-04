package modelo;

import java.io.IOException;
import java.util.Scanner;

public class Cama {
public static Scanner leia;
	public static void main(String[] args) throws IOException {
		leia = new Scanner(System.in);
		int menu = 0;
		while (menu != 5) {
			System.out.print("1 prob\n2 prob \n3 prob\n4 prob\n5 Sair.");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.print("Bye , bye.");
				break;
			default:
				System.out.print("opção inválida.");	
			}
		}
	}
}