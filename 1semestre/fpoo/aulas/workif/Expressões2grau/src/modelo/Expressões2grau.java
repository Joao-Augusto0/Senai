package modelo;

import java.util.Scanner;

public class Expressões2grau {

	public static void main(String[] args) {
		
		   Scanner leia = new Scanner(System.in);

		
		int a,b,c,delta;
		float r1,r2;
		
				
		//entrada
		System.out.print("digite o valor de a:");
		a = leia.nextInt();
		
		System.out.print("digite o valor de b:");
		b = leia.nextInt();
		
		System.out.print("digite o valor de c:");
		c = leia.nextInt(); 
		
		//procesamento
		
		delta = b*b -4*a*c;
		
		

		
		
		 //saida
		if (delta > 0 ){
		
			r1 = (float)(-b + Math.sqrt(delta))/(2*a);
			
			r2 = (float)(-b - Math.sqrt(delta))/(2*a);	
			
		 System.out.printf("r1 = " +r1);
		 System.out.printf("r2 = " +r2);	
	}  else {
		System.out.printf("numero real");	
		
		}
		 	
		}
		
		
	}


