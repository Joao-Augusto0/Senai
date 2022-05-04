package modelo;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		double n1, n2, media;
	
		Scanner leia = new  Scanner(System.in);
		
		//entrada
		System.out.printf("digite um numero:");
		 n1 = leia.nextDouble();
		
		System.out.printf("digite outro numero:");
		 n2 = leia.nextDouble();
		 
		//processamento / saida
		 media = (n1 + n2) /2;
		 
		 
		 if (media >=5) {
			System.out.println("sua media é "+ media +" aluno aprovado");
		 }else  { 	
			 System.out.println("sua media é"+ media + "aluno reprovado:");
		 
		 
		 }
		
		
	}

}
