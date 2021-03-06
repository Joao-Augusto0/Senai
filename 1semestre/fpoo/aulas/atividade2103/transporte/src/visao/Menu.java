package visao;

import java.util.Scanner; 

import modelo.Veiculo;

public class Menu {
	
	//atributos 
	private static Scanner leia = new Scanner(System.in);
	private static  Veiculo veiculos[] = new Veiculo[10];
	private static String itens[] = {"cadastrar veiculo","listar veiculo","sair"};
	private static int menu = 0;	
	private static int indice = 0;
	
	
	//metodo main
	public static void main(String[]args) {
		while (menu != 3) {
			printMenu(itens);
			switch(menu) {
			
			case 1:
				cadastrarVeiculo();
				break;
			case 2:
				listarVeiculo();
				break;
			case 3:
				System.out.println("bye");
				break;
			default:
				System.out.println("opcao invalida");
				break;
			
			}	
		}
	}
	
	private static int printMenu(String[] itens) {
		
		for(int i = 0; i <itens.length; i++) 
			System.out.println((i + 1) + "-" + itens[i]);
		System.out.println("escolha uma opcao:");
		return leia.nextInt();
	}
	
	private static void cadastrarVeiculo() {
		
		System.out.println("placa\tmarca\tmodelo\tano modelo\tano fabricacao\tcor:");
		
		veiculos[indice] = new Veiculo(leia.next(), leia.next(),leia.next(),leia.nextInt(),leia.nextInt(),leia.next());
		indice++;	
	}
	
	private static void listarVeiculo() {
		for(int i =0;i < indice;i++) {
			System.out.println(veiculos[i].toString());
		}
	}
}