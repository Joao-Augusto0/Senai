package solucao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	
	
	//espa?o de entrada 
	static BufferedReader br;
	static BufferedWriter bw;
	
	//endere?o do arquivo
	
	static String entrada =  "C:\\Users\\DESENVOLVIMENTO\\Desktop\\atividade java\\solucao\\entrada.csv";
	static String saida =  "C:\\Users\\DESENVOLVIMENTO\\Desktop\\atividade java\\solucao\\entrada.csv";
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao = 0;
		
	
		
		while (opcao != 5) {
			System.out.println("1-soma!");
			System.out.println("2-mult!");
			System.out.println("3-subtra??o");
			System.out.println("4-divi!");
			System.out.println("5-sair");
			opcao = leia.nextInt();
		
		//abre o arquivo tratando os possiveis erros
		
		try {
			
			//abre o arquivo
			
		br = new BufferedReader(new FileReader(entrada));
		bw = new BufferedWriter(new FileWriter(saida,false));
		String linha = br.readLine();
		
		while(linha != null) {
			String[] cep = linha.split(";");
			int v1 = Integer.parseInt(cep[0]);
			int v2 = Integer.parseInt(cep[1]);
			int result = 0;
			
			if(opcao == 1) {
				result = v1 + v2;
			
			}else if(opcao == 2){
				result = v1 * v2;
			
			}else if(opcao == 3) {
				result = v1 - v2;	
				
			}else{
				result = v1 / v2;
				
			}
			System.out.println(result);
			bw.write(result+"\n");
			linha = br.readLine();
		}
		
		//fecha o arquivo
		br.close();
		bw.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		System.out.println("bye");

}
}