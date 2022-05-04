package modelo;

import java.util.Scanner;

public class INSS {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double salario, desconto;
		
		System.out.println("digite seu salario");
		salario = leia.nextDouble();
		
		System.out.println("");
	
		if (salario > 7087.22) {
			desconto = (salario * 11)/100;
			
		}else if (salario > 3641.03)  {
			desconto = salario * 9/100;
		}else if (salario > 2427.35) {
			desconto = salario * 
		}	
			
		
		System.out.println("o desconto de INSS é %.2f\n"+desconto);
		System.out.println("voce vai receber"+salario);	

		}
		
	}


