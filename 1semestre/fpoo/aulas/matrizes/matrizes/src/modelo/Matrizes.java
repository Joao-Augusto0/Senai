package modelo;
import java.util.Random;

public class Matrizes {
	
	public static void main(String[] args) {
		vetor();
	
	}
	
	static void vetor() {
		Random rand = new Random();
		
		int n[] = new int[27];
		for(int c = 0;c < 27;c++) 
			n[c] = rand.nextInt(100);
		
		for(int c = 0; c < 27; c++) {
			System.out.println(n[c]+"\t");
		}
		}	
	
	static void matriz() {
		Random rand = new Random();
		
		int x[][] = new int[3][9];
		for (int c = 0;c < 3;c++)
			for(int i = 0;i < 9;i++)
				x[c][i] = rand.nextInt(100);
		
		for(int c = 0;c < 3;c++) {
			System.out.println();
			for(int i = 0; i < 9;i++)
				System.out.print(x[c][i]+" ");
			
		}
	}

	}

