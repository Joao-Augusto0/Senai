package lista03;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int menu = 0;
		
		while (menu != 11) {
			System.out.println("digite uma opcao:");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
		menu = leia.nextInt();
		switch (menu) {
		case 1:	
			for(int i = 10; i <= 200; i++ ) {
				System.out.println(i);
			}
			
			break;
		case 2:
			for(int i = 200; i >= 1; i--) {
				System.out.println();
			}
			
			break;
		case 3:
			
			System.out.print("digite um valor:");
			int valor = leia.nextInt();
			for(int i = 0; i <= valor; i++) {
				System.out.println(i);
			}
			break;
		case 4:
			
			System.out.print("digite um valor: ");
			int val1 = leia.nextInt();
			System.out.println("digite outro valor");
			int val2 = leia.nextInt();
			
			for(int i = val1; i <= val2; i++) {
				System.out.println(i);
			}
			break;
		case 5:
			
			System.out.print("digite um valor:");
			int v1 = leia.nextInt();
			System.out.println("digite outro valor:");
			int v2 = leia.nextInt();
			
			
			for(int i = v1; i < v2; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
			break;
		case 6:
			
			int soma = 0;
			for(int i = 0; i <= 100; i++) {
				soma+=i;
				System.out.println(soma);
			}
			
			break;
		case 7:
			System.out.print("digite um valor: ");
			int valor1 = leia.nextInt();
			System.out.print("digite outro valor:");
			int valor2 = leia.nextInt();
			
			int soma1 = 0;
			
			for(int i = valor1; i <= valor2;i++) {
				soma1 += i;
				System.out.println(soma1);
			}
			
			
			break;
		case 8:
			System.out.print("digite um valor: ");
			int va1 = leia.nextInt();
			System.out.println("digite outro valor");
			int va2 = leia.nextInt();
			int som = 0;
			for(int i = va1; i <= va2; i++) {
				if(i % 2 == 0) {
				som +=i;
				System.out.println(som);
				}
				
				}
			
			break;
		case 9:
			
			int s = 0;
			
			for(int i = 0; i < 15; i++) {
				System.out.println("digite um numero: ");
				int num = leia.nextInt();
				
				s += num;
			}
			
			System.out.println(s);
			
			break;
		case 10:
			
			for(int i = 11; i <= 250;i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
			
			break;
		case 11:
			System.out.println("ate logo");
			break;
		default:
			System.out.println("opcao invalida");
		}
		}
	}

}
