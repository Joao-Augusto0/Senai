package modelo;

import java.util.Random;

public class Desafio {

	public static void main(String[] args) {
		
		int [][] i = new int [3][3];
		
		Random r = new Random();
		
		for(int p = 0;p < 4; p= p + 2) {
			for(int c = 0; c < 4;c = c + 2) {
				i[p][c] = r.nextInt(100);
				System.out.print(i[p][c] + "\t");	
			}
				System.out.println();
		}
		
	}

}
