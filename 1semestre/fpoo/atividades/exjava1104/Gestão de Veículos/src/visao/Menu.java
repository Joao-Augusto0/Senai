package visao;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Carro;
import modelo.Moto;

public class Menu {
	
	private static Scanner leia = new Scanner(System.in);
	private static ArrayList<Carro> carros = new ArrayList<Carro>();
	private static ArrayList<Moto> motos = new ArrayList<Moto>();

	public static void main(String[] args) {
		int menu = 0;
		while(menu != 6) {
			
			System.out.println("escolha:\n[1]cadastrar carro\n[2]cadastrar moto[3]listar carro\\n[4]listar moto");
			menu = leia.nextInt();
			
			switch(menu) {
			case 1:
				cadastrarCarro();
				break;
			case 2:
				cadastrarMoto();
				break;
			case 3:
				listarCarro();
				break;
			case 4:
				listarMoto();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				System.out.println("op??o incorreta");
				break;	
			}
		}
	}
	
	private static void cadastrarCarro() {
		System.out.println("digite o tipo do carro: ");
		String tipoCarro = leia.next();
		System.out.println("quantidade de passageiros que vai caber no carro: ");
		int passageiros = leia.nextInt();
		System.out.println("digite a placa do carro: ");
		String placaCarro = leia.next();
		System.out.println("digite o ano modelo do carro: ");
		int  anoModeloCarro = leia.nextInt();
		System.out.println("digite o anoFabricacao do carro: ");
		int anoFabricacaoCarro = leia.nextInt();
		System.out.println("digite o modelo do carro: ");
		String modeloCarro = leia.next();
		System.out.println("digite a marca do carro: ");
		String marcaCarro = leia.next();
		System.out.println("digite o valor do carro: ");
		double valorCarro = leia.nextDouble();
		
		Carro carro = new Carro(tipoCarro,passageiros,placaCarro,anoModeloCarro,anoFabricacaoCarro,modeloCarro,marcaCarro,valorCarro);
		
		carros.add(carro);
		
	}
	
	private static void cadastrarMoto() {
		
		System.out.println("digite quantas cilindradas a moto tem: ");
		int cilindradas = leia.nextInt();
		System.out.println("digite a placa da moto: ");
		String placaMoto = leia.next();
		System.out.println("digite o ano modelo da moto: ");
		int  anoModeloMoto = leia.nextInt();
		System.out.println("digite o anoFabricacao da moto: ");
		int anoFabricacaoMoto = leia.nextInt();
		System.out.println("digite o modelo da moto: ");
		String modeloMoto = leia.next();
		System.out.println("digite a marca da moto: ");
		String marcaMoto = leia.next();
		System.out.println("digite o valor da moto: ");
		double valorMoto = leia.nextDouble();
		
		Moto moto = new Moto(cilindradas,placaMoto,anoModeloMoto,anoFabricacaoMoto,modeloMoto,marcaMoto,valorMoto);
		
		motos.add(moto);
	}
	
	private static void listarCarro() {
		for(Carro c: carros) {
			System.out.println(c.toString());
	}
	}
		
	private static void listarMoto() {
		for(Moto m: motos) {
			System.out.println(m.toString());
		}
		
	}
	
	}
