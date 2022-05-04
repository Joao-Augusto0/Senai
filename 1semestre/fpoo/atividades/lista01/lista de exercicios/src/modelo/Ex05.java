package modelo;

import java.util.Scanner;

public class Ex05 {
	public static Scanner leia;
	
	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		float alqueire,caminhao,viagem;
		
		
		System.out.print("quantos caminhões tem em sua fazendo?:");
		caminhao = leia.nextFloat();
		System.out.print("quantos alqueires tem um sua fazenda?:");
		alqueire = leia.nextFloat();
		
		viagem = ((alqueire * 250)/caminhao)/ 18;
				
		System.out.printf("vc tera que fazer:");
		System.out.print(Math.round(viagem));
		System.out.printf(" viagens!");
	}
}