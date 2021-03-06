package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner leia = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		
		int opcao = 0;
		
		do {
			System.out.println("1-cadastrar carro:");
			System.out.println("2-listar carro:");
			System.out.println("0-sair:");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("informe seu nome: ");
				String nome = leia.next();
				 
				System.out.println("informe sua idade: ");
				String idade = leia.next();
				
				System.out.println("informe sua cidade: ");
				String cidade = leia.next();
				
				String data = nome + ";" + idade + ";" + cidade;
				
				arq.escrever(data, "pessoas",false);
				
				break;
			case 2:
				ArrayList<String> infoFile = arq.Ler("pessoas");
				System.out.println("digite o nome que quer encontrar: ");
				String busca = leia.next();
				
				for(String linha: infoFile) {
					String[] temp = linha.split(";");
					if(temp[0].toLowerCase().contains(busca.toLowerCase())) {
					System.out.println("nome :" + temp[0]);
					System.out.println("idade :" + temp[1]);
					System.out.println("cidade :" + temp[2]);
				}
				}
				break;
			case 0:
				System.out.println(" ");
				break;
		}
		}while(opcao != 0);
		
//		try {
//			FileWriter fw = new FileWriter("base.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			bw.write("meu primeiro arquivo.");
//			
//			bw.close();
//			fw.close();
//			
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		
//		try {
//			FileReader fr = new FileReader("base.txt");
//			BufferedReader br = new BufferedReader(fr);
//			
//			String linha = "";
//		
//			while( (linha = br.readLine()) != null) {
//				System.out.println(linha);
//			}
//		
//		br.close();
//		fr.close();
//		
//	}catch (FileNotFoundException e) {
//		System.out.println(e.toString());
//	}catch (IOException e) {
//		System.out.println(e.toString());
//	}
		
	}
}