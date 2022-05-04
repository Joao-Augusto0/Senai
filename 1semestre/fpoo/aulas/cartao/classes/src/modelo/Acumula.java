package modelo;

import java.util.Random;

public class Acumula {

	public static void main(String[] args) {
		System.out.println("o algoritimo de acumulação");
		System.out.print("simplesm, retornou = ");
		System.out.println(simples(345));
		System.out.println("Total = "+ aleatorio(345));
		
	}
	
	public static int simples(int interacoes) {
		
		int x = 0;
		
		for(int i = 0;i < interacoes;i++)
			x+=i;
		return x;
	}
	
	public static int aleatorio(int iteracoes) {
		  Random rand = new Random();
		  
		int x = 0;
		
		for(int i= 0; i < iteracoes; i++) {
			int r = rand.nextInt(100);
			
			System.out.println("aleatorio = " +r);
			x+=r;
			System.out.println("acumulado = "+x);
	}
			return x;
		
	}

	public static int fatorial (int f) {
		int a = f;
		int f2 = f;
		for(int i = 0;i<f-- ; i++) {
			f2--;
			a = a *f2;
			
		}
		
		return a;
	}
}
