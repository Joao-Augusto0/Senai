package modelo;

import java.util.Scanner;

public class Ex1 {
	public static Scanner leia;
	public static void main(String[] args) {
		
		leia = new Scanner(System.in);
		int opcao =0;
		
		while(opcao != 5) {
			mostrarOpcoes();
			opcao = leia.nextInt();
			
			switch (opcao) {
			
			case 1:
				calcularHorasExtras();
			break;
	
			case 2:
				calcularApuracao();
			break;
			
			case 3:
				calcularMateriasPrimas();
				break;
				
			case 4:
				calcularBlocos();
			break;
		}
	}
}
		
	public static void calcularHorasExtras() {
		leia = new Scanner(System.in);
		int opcao_horas = 0;
		 
		while(opcao_horas != 2) {
			System.out.print("");
			System.out.print("");
			opcao_horas = leia.nextInt();
			
			if(opcao_horas==1) {
				System.out.print("digite quantas horas extras foram feitas:");
				int total_horas = leia.nextInt();
				
				System.out.print("digite quantas horas foram trabalhadas:");
				int hora_extras =  leia.nextInt();
				
				double salario = total_horas * 5.625;
				salario = salario + (hora_extras + (5.625 * 1.75));
				
				System.out.printf("O salario é:R$ %.2f\n",salario);
		}
			
	}
}
	
	
	public static void calcularApuracao() {
		leia = new Scanner(System.in);
		
		String[] categorias = new String[3];
		categorias[0] = "Bateria";
		categorias[1] = "Samba-enredo";
		categorias[2] = "Fantasias";
		
		String[] nome_escolas = new String[5];
		int[] soma_escolas = new int[5];
		int[] media_escolas = new int[5];
		
		for(int i = 0; i < nome_escolas.length; i++) {
			System.out.print("Informe o nome da escola: ");
			nome_escolas[i] = leia.nextLine();
		}
		int maior_nota = 0;
		int index_maior_nota = 0;
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k < categorias.length; k++) {
				System.out.println("Classifique a escola " + nome_escolas[i] + " na categoria: " + categorias[k]);
				
				soma_escolas[i] = soma_escolas[i] + leia.nextInt();
			}
			media_escolas[i] = soma_escolas[i] / categorias.length;
			
			if(media_escolas[i] > maior_nota) {
				maior_nota = media_escolas[i];
				index_maior_nota = i;
			}
		}
		
		for(int i = 0; i < soma_escolas.length; i++) {
			System.out.println("Nome da escola: " + nome_escolas[i]);
			System.out.println("Média da escola: " + media_escolas[i]);
			System.out.println();
		}
		
		System.out.println("A escola campea, foi a: " + nome_escolas[index_maior_nota]);
	}
			
		
			
	
	
	public static void calcularMateriasPrimas() {
		leia = new Scanner(System.in);
			

	}
	
	public static void calcularBlocos () {
		leia = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pessoas: ");
		int quantidade_pessoas = leia.nextInt();
		
		System.out.println("Comissão de frente: " + quantidade_pessoas*0.15);
		System.out.println("Abre-alas: " + quantidade_pessoas*0.05);
		System.out.println("Ala das baianas: " + quantidade_pessoas*0.15);
		System.out.println("Carros Alegóricos: " + quantidade_pessoas * 0.2);
		System.out.println("Mestre-sala e Porta-Bandeira: " + quantidade_pessoas * 0.03);
		System.out.println("Bateria: " + quantidade_pessoas*0.2);
		System.out.println("Madrinha de bateria: " + quantidade_pessoas*0.02);
		System.out.println("Recuo da bateria: " + quantidade_pessoas * 0.2);
	} 	

	public static void mostrarOpcoes() {
		String[] vetor_opcoes = new String[5];
		vetor_opcoes[0] = "1. Horas extras.";
		vetor_opcoes[1] = "2. Apuracao.";
		vetor_opcoes[2] = "3. Matérias primas.";
		vetor_opcoes[3] = "4. Blocos.";
		vetor_opcoes[4] = "5. Sair.";
		
		for(int i = 0; i < vetor_opcoes.length; i++) {
			System.out.println(vetor_opcoes[i]);
		}
	}
}