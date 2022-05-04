package modelo;

import java.util.Scanner;

public class Menu {

	public static Scanner leia; 
	
	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		
		int menu = 0;
		
		System.out.println("Esclha uma opção:");
		System.out.println("1 Engantinhar");
		System.out.println("2 andar");
		System.out.println("3 correr");
		System.out.println("4 pedalar");
		System.out.println("5 dirigir");
		System.out.println("6 pilotar");
		
		menu = leia.nextInt();
		switch(menu) {
		case 1: System.out.println("vem nenem");
		break;
		case 2: System.out.println("anda nenem");
		break;
		case 3: System.out.println("vai cair");
		break;
		case 4: System.out.println("cuidado com os dentes");
		break;
		case 5: System.out.println("vem e oq ce fez");
		break;
		case 6: System.out.println("não esquece o capacete");
		break;
		default: System.out.println("opção invalida");
		break;
		}
	}

}
