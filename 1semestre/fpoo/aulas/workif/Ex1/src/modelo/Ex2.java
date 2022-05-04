package modelo;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int mes = 0;
		
		int ano, idade, AT;
		
		System.out.println("em que ano vc nasceu?:");
		ano = leia.nextInt();
		
		System.out.println("em que ano estamos?:");
		AT = leia.nextInt();		
		
		System.out.println("em que mes vc nasceu? em numeros:");
		mes = leia.nextInt();
		
		
		idade = AT - ano;	
		
		if (mes > 1) {
			idade = idade - 1;
		}else {
			System.out.println("voce é maior de idade");
		}
		
		
		if (idade >= 18) {
			System.out.println("voce tem "+idade+" e é maior de idade pode entrar!!");
		}else {
			System.out.println("Acesso negado, voce tem "+idade+ " e é menor de idade");
			
			}
		}	
	}
