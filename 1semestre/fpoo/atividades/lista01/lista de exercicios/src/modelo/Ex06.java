package modelo;

import java.util.Scanner;

public class Ex06 {
	public static Scanner leia;
	public static void main(String[] args) {

		leia = new Scanner(System.in);
		
		float raio,altura,at,v;
		float pi = (float) 3.14;
		
		System.out.print("digite o valor do raio:");
		raio = leia.nextFloat();
		System.out.print("digite a altura do cilindro:");
		altura = leia.nextFloat();
		
		at = 2 * raio * pi * (raio + altura);
		v = pi * raio * raio *altura;
		
		System.out.printf("a area do cilindro � = a %.2f\n",at);
		System.out.printf("o volume do cilindro � = a %.2f\n",v);
	}
}