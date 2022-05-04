package correcao;
import java.util.Scanner;
public class Ex3 {
public static Scanner leia;
	public static void main(String[] args) {
		leia = new Scanner(System.in);
		
		int maior = 0,menor = 0,val;
		
		for(int i = 0; i < 10; i ++) {
			System.out.println("informe um valor qualquer: ");
			
			val = leia.nextInt();
			
			if(i == 0) {
				maior = val;
				menor = val;
				
			}else {
				if(val > maior ) maior = val;
				if(val < menor ) menor = val;
			}
			
		}
		
		System.out.println(maior);
		System.out.println(menor);
		
	}

}
