package visao;

import java.io.IOException;
import java.util.Scanner;
import controle.Processa;

public class Tela {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		try {
			Processa.carregar();
			Processa.saida();
		}catch(IOException e) {
			System.out.println(e.toString());
			System.out.println("M�dias calculadas com sucesso");
		}
	}
}