package correcao;

import java.util.Scanner;

public class Ex1 {
public static Scanner leia;

	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		System.out.println("informe o incio do intervalo : ");
		int inicio = leia.nextInt();
		
		System.out.println("informe o fim do intevalo : ");
		int fim = leia.nextInt();
		
		if(inicio % 2 != 0) inicio++;
		
		for(int i = inicio; i <=  fim;i+=2) {
			System.out.println("par" + i);
		}
		
		if(inicio % 2 == 0) inicio++;
		
		for(int i = inicio; i <=  fim;i+=2) {
			System.out.println("impar" +i);
	}

}
}
