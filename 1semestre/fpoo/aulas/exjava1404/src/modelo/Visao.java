package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Visao {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner leia = new Scanner(System.in);
		Veiculos arq = new Veiculos();
		
		int opcao = 0;
		
		do {
			System.out.println("1-cadastrar carro:");
			System.out.println("2-listar carro:");
			System.out.println("0-sair:");
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch(opcao) {
			case 1:
				System.out.println("informe modelo: ");
				String modelo = leia.next();
				 
				System.out.println("informe sua marca: ");
				String marca = leia.next();
				
				System.out.println("informe sua cor: ");
				String cor = leia.next();
				
				System.out.println("informe sua placa: ");
				String placa = leia.next();
				
				String data = modelo + ";" + marca + ";" + cor + ";" + placa;
				
				arq.escrever(data, "veiculos",true);
				
				break;
			case 2:
				ArrayList<String> infoFile = arq.Ler("veiculos");
				System.out.println("digite a placa do carro que quer encontrar");
				String busca = leia.next();
				
				for(String linha: infoFile) {
					String[] temp = linha.split(";");
					
					if(temp[3].toLowerCase().contains(busca.toLowerCase())) {
					System.out.println("modelo :" + temp[0]);
					System.out.println("marca :" + temp[1]);
					System.out.println("cor :" + temp[2]);
					System.out.println("placa :" + temp[3]);
				}
				}
				break;
			case 0:
				System.out.println(" ");
				break;
		}
		}while(opcao != 0);
		
	}
}