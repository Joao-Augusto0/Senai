package modelo;
  
import java.util.Random;
import java.util.Scanner;

public class Ex1 {

	public static Scanner leia;
	
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int ex =0;
		
		while(ex !=3) {
			ex = leia.nextInt();
			
			switch (ex) {
			
			case 1:
				exercicio1();
			break;
			
			case 2:
				exercicio2();
			break;
			
			default:
				System.out.print("digitou errado");
				
				
			}
		}
	}
	
	static void exercicio1() {
		Random rand = new Random();
		
		int n[][] = new int[5][5];
		
			for(int c = 0;c < 5;c++)
				for(int i = 0; i < 5;i++)
				n[c][i] = rand.nextInt(100);
		
			for(int c = 0;c < 5;c++) {
				System.out.println();
				for(int i = 0; i<5;i++) {
					System.out.print(n[c][i]+" ");	
								
			}
					
			}
				
	}	
	
	static void impar() {
		int menor[][]
				
		
	}
	
	static void exercicio2() {
		
	}

}