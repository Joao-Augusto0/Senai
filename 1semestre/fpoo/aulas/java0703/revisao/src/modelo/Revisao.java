package modelo;

import java.util.Random;

public class Revisao {

	public static void main(String[] args) {
		//declaração da matriz
		int[][] m = new int [5][5];
		
		Random r = new Random();
		
		//percorrer as linhas da matriz
		for(int i = 0;i < 5;i++) {
			
			//percorrer as colunas da matriz
			for(int c = 0; c <= 4; c++) {
				m[i][c] = r.nextInt(100);
				System.out.print(m[i][c] + "\t");
			}
				System.out.println();
		}
		
	}

}

