package modelo;

import java.util.Scanner;

public class laço {
	public static Scanner leia;

	public static void main(String[] args) {
	leia = new Scanner(System.in);
	int escolha = 0;
	
	while (escolha < 12) {
		System.out.print("digite o numero do programa que quer executar!");
		System.out.print("P1:[1]\nP2[2]\nP3[3]\nP4[4]\nP5[5]\nP6[6]\nP7[7]\nP8[8]\nP9[9]\nP10[10]\nP11[11]");
		
		switch (escolha) {
		case 1:
			for (int n = 10; n <= 200; n++) {
				System.out.print(n);
			}
			break;
		case 2:
			for (int n = 200; n > 0 ; n--) {
				System.out.print(n);
			}
			break;
		case 3:
			System.out.print("digite um valor:"); 
			int valor = leia.nextInt();
			for (int n = 0;n <valor;n++ )	{
				System.out.print(n);
			}
			break;
		case 4:
			System.out.print("digite um valor:");
			int n1 = leia.nextInt();
			System.out.print("digite outro valor:");
			int n2 = leia.nextInt();
			int s;
			s = n1 & n2;
			if  (n1 > n2) {
				for(;n1 > n2; n1++  ) {
					}
			}else {
				for (;n1 < n2;n1--) {
					System.out.print("fica assim:"+s);
					
				}
			}
		}
	}
	}
}