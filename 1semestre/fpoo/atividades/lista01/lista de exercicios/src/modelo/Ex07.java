package modelo;
import java.util.Scanner;

public class Ex07 {
	public static Scanner leia;
	public static void main (String[]args) {
		
		leia = new Scanner(System.in);
		
		float massa,densidade,volume;
		
		System.out.print("qual ? a massa da barra?:");
		massa = leia.nextFloat();
		System.out.print("qual o volume da barra?:");
		volume = leia.nextFloat();
		
		densidade = massa / volume ;
		
		System.out.printf("a densidade da barra ? de: %.2f",densidade);
	}
}