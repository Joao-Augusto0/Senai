package visao;

import java.util.Scanner;
import java.util.ArrayList;
import modelo.Cao;
import modelo.Gato;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);
	private static int menu = 0;
	private static String[] itensMenu = {"CadastrarCao","CadastraGato","ListarCao","ListarGato","Sair"};
	private static ArrayList <Cao> caes = new ArrayList<>();
	private static ArrayList <Gato> gatos = new ArrayList<>();
	public static void main(String[] args) {

		while (menu != 5) {
			menu = menu(itensMenu);
			switch (menu) {
			
			case 1:
				cadastrarCao();
				break;
			case 2:
				cadastrarGato();
				break;
			case 3:listarGato();
				break;
			case 4:listarCao();
				break;
			case 5: ;
				break;
			default:
				System.out.println("\nOp??o inv?lida\n");
				break;
			}
		}
	}
	private static void cadastrarCao(){
		System.out.print("especie:\tnome:\tpeso:\tra?a:\tquantidade de motoqueiros atacados:");
		Cao cao = new Cao(sc.next(),sc.next(), sc.nextFloat(),sc.next(),sc.nextInt());
				caes.add(cao);
	}
	
	private static void cadastrarGato(){
		System.out.print("vidas = 7\tespecie\tnome\tpeso\tra?a");
		Gato gato = new Gato(sc.nextInt(),sc.next(),sc.next(), sc.nextFloat(),sc.next());
			gatos.add(gato);
	}
	private static void listarGato(){
		for(Gato g:gatos) {
			System.out.println(g.toString());
		}
		
	}
	
	private static void listarCao(){
		for(Cao c:caes) {
			System.out.println(c.toString());
		}
	}
	
	private static int menu(String[] itens) {
		for (int i = 0; i < itens.length; i++) {
			System.out.println((i + 1) + "." + itens[i]);
		}
		System.out.println("Escolha uma op??o:");
		return sc.nextInt();
	}
}

