package visao;

import java.util.Scanner;

public class Menu {
	
	private static Scanner leia = new Scanner(System.in);
	private static ArrayList<Funcion�rio>funcionarios = new ArrayList<Funcion�rio>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 6){
			
			System.out.println("[1]cadastar Cliente[2]cadastar Funcion�rio[3]listar Cliente[4]Listar funcion�rio");
			menu = leia.nextInt();
			
			switch(menu) {
			
		case 1:
			cadastrarCliente();
			break;
		case 2:
			cadastrarFuncion�rio();
			break;
		case 3:
			listarCliente();
			break;
		case 4:
			listarFuncion�rio();
			break;
		case 5:
			
			}
		}
	}
	
	public static void cadastrarCliente(){
		System.out.println("digite seu nome:");
		String nomeCliente = leia.next();
		
		System.out.println("digite seu telefone:");
		String telefoneCliente = leia.next();
		
		System.out.println("digite sua data de nascimento:");
		String  nascimentoCliente = leia.next();
		
		System.out.println("digite seu id:");
		int id = leia.nextInt();
		
		System.out.println("digite seu credito limite:");
		double creditoLimite = leia.nextDouble();
		
		Cliente cliente = new Cliente(nomeCliente,telefoneCliente,nascimentoCliente,id,creditoLimite);
		
		clientes.add(cliente);
	}
	
	public static void cadastrarFuncion�rio() {
		
	}
	
	public static void listarCliente() {
		
	}
	
	public static void listarFuncion�rio() {
		
	}

	
}