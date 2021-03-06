package visao;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Cliente;
import modelo.Funcionário;

public class Menu {
	
	private static Scanner leia = new Scanner(System.in);
	private static ArrayList<Funcionário> funcionarios = new ArrayList<Funcionário>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void main(String[] args) throws ParseException {
		int menu = 0;
		while(menu != 6) {
			
			System.out.println("escolha:\n[1]cadastrar funcionário\n[2]cadastar cliente\n[3]listar funcionário\n[4]listar cliente");
			menu = leia.nextInt();
			
			switch(menu) {
			case 1:
				cadastrarFuncionario();
				break;
			case 2:
				cadastrarCliente();
				break;
			case 3:
				listarFuncionario();
				break;
			case 4:
				listarCliente();
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			default:
				System.out.println("opção incorreta");
				break;	
			}
		}
	}
	private static void cadastrarFuncionario() throws ParseException{
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("digite seu nome: ");
		String nomeFuncionario = leia.next();
		
		System.out.print("digite seu telefone: ");
		String telefoneFuncionario = leia.next();
		
		System.out.print("data de nascimento: ");
		String dataFuncionario = leia.next();
		Date nascimentoFuncionario = df.parse(dataFuncionario);
		
		System.out.print("matricula: ");
		int matricula = leia.nextInt();
		
		System.out.print("comissao: ");
		double comissao = leia.nextDouble();
		
		Funcionário funcionario = new Funcionário(nomeFuncionario,telefoneFuncionario,nascimentoFuncionario,matricula,comissao);
		
		funcionarios.add(funcionario);
	}
	
	private static void cadastrarCliente() throws ParseException {
		
		SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("digite seu nome: ");
		String nomeCliente = leia.next();
		
		System.out.print("digite seu telefone: ");
		String telefoneCliente = leia.next();
		
		System.out.print("data de nascimento: ");
		String dataCliente = leia.next();
		Date nascimentoCliente = df2.parse(dataCliente);
		
		int id = leia.nextInt();
		double creditoLimite = leia.nextDouble();
		
		Cliente cliente = new Cliente(nomeCliente,telefoneCliente,nascimentoCliente,id,creditoLimite);
		
		clientes.add(cliente);

	}

	private static void listarFuncionario() {
		for(Funcionário f: funcionarios) {
			System.out.println(f.toString());
		}
	}
	
	private static void listarCliente() {
		for(Cliente c:clientes) {
			System.out.println(c.toString());
		}
		
	}
}