package visao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import modelo.Pet;
import modelo.Serviço;

public class Menu {

    private static String funcionario[] = new String[10];
    private static String servi[] = {"Tosa","Banho","Outro"};
	// Atributos uteis de entrada e sa�da
	private static Scanner read = new Scanner(System.in);
	private static int opcao = 0;
	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	private static String funcionalidades[] = { "Cadastrar funcionário[adm]", "Listar funcionários[adm]","Cadastrar Animal/Pet", "Cadastrar Servico", "Listar todos os Pets",
			"Listar Servicos", "Sair                " };
	// Atributos da l�gica de programa Orientado a Objeto
	private static Pet[] pets = new Pet[10];
	private static Serviço[] servicos = new Serviço[100];
	private static int id = 0; // O id ser� auto_increment
	private static int contPets = 0; // indice para saber quantos pets foram cadastrados
	private static int contServicos = 0; // indice para saber quantos pets foram cadastrados

	// M�todo principal "Men�" ou "Cama"
	public static void main(String[] args) throws IOException, ParseException {
		boolean sucesso = false;
		System.out.println("[ [ Gestao de Serviços de Banho e Tosa ] ]");
		while (opcao != 7) {
			System.out.print("Opcao: ");
			opcao = menu(funcionalidades);
			switch (opcao) {
			case 1:
			       cadastrarFuncionario();
			       break;
			case 2:
			       listarFuncionario();
			       break;
			case 3:
				sucesso = cadastrarAnimal();
				if (sucesso) {
				    limpaTela();
					System.out.println("Animal/Pet cadastrado com sucesso.\n\n");
					contPets++;
				} else{
				        limpaTela();
					System.out.println("Erro ao cadastrar animal.\n\n");
                       }                  
				break;
			case 4:
			    limpaTela();
			    System.out.println("Para registrar um servico, primeiro o pet deve estar cadastrado");
			    System.out.println("Escolha como deseja registrar o serviço:\n[1]Retroativo\n[2]Agora.");
			    int me = read.nextInt();
			    switch(me){
			      case 1:
			               sucesso = cadastrarServico();
	            			if (sucesso) {
			       	    limpaTela();
	      				System.out.println("Servico registrado com sucesso.\n\n");
       					contServicos++;
            				} else {
        				    limpaTela();
       					System.out.println("Erro ao registrar servico.\n\n");
                           }
                    
			      break;
			      case 2:
			             cadastrarServico2();
			      break;
                 }
				
				break;
			case 5:
				listarPets();
				break;
			case 6:
			    limpaTela();
				listarServicos();
				break;
			case 7:
				System.out.println("Ate logo.");
				break;
			default:
				System.out.println("Opcao invalida");
				break;
			}
		}
	}

	// M�todo que escreve o men�
	private static int menu(String[] itens) {
		for (int i = 0; i < itens.length; i++) {
			System.out.println("\t|" + (i + 1) + "." + itens[i] + "\t|");
		}
		System.out.println("\t:Escolha uma opcao:");
		return read.nextInt();
	}

	// M�dodo que cadastra um animal/objeto no vetor
	private static boolean cadastrarAnimal() {
		id++; // Incrementa o id para iniciar em 1 e n�o em 0 como o �ndice
		limpaTela();
		System.out.println("Tipo\tNome do Pet\tNome Dono\tPeso");
		pets[contPets] = new Pet(id, read.next(), read.next(), read.next(), read.nextFloat());
		return true;
	}

	// M�dodo que cadastra um servi�o/objeto no vetor
	private static boolean cadastrarServico() throws ParseException {
		limpaTela();
		System.out.println("Para registrar um servico, primeiro o pet deve estar cadastrado");
		System.out.println("Digite qual o id do pet/animal?");
		Pet animal = buscarAnimal(read.nextInt());
		limpaTela();
		if (animal != null) {
			System.out.println(animal.paraString());
			System.out.println("Funcionario\tDescricao\tData(dd/mm/aaaa)\tHora(hh:mm)");
			servicos[contServicos] = new Serviço(animal, read.next(), read.next(), read.next(), read.next());
			limpaTela();
			return true;
		} else {
		     limpaTela();
			System.out.println("Pet nao encontrado.\n\n");
			return false;
		}
	}

	// M�todo que busca o animal pelo Id
	private static Pet buscarAnimal(int idAnimal) {
		for (int i = 0; i < contPets; i++) {
			if (pets[i].idPet == idAnimal) {
				return pets[i];
			}
		}
		return null;
	}

	// M�todo que Lista todos os pets cadastrados
	private static void listarPets() {
	    limpaTela();
		System.out.println("Id\tTipo\tNomePet\tNome dono\tPeso");
		for (int i = 0; i < contPets; i++) {
			System.out.println(pets[i].paraString());
		}
		System.out.println("\n");
	}

	// Metodo que lista todos os Servi�os e Cria um subMenu com filtros
	private static void listarServicos() throws ParseException {
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescricao\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			System.out.println(servicos[i].tabularString());
		}
		String[] subItens = { "Filtrar Servicos", "Filtrar Por data" };
		opcao = menu(subItens);
		if (opcao == 1) {
		    limpaTela();
			System.out.println("Digite o nome do animal ou do dono, ou funcionario, ou a descricao do servico:");
			listarServicos(read.next());
		} else if (opcao == 2) {
		    limpaTela();
			System.out.print("Digite a data em que o servico foi realizado dd/mm/aaaa:");
			Date data = df.parse(read.next());
			listarServicos(data);
		} else {
			System.out.println("Filtro invalido.\n");
		}
	}

	// Listar os Servi�os + filtrar por Strings
	private static void listarServicos(String filtro) {
	    limpaTela();
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescricao\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			if (servicos[i].nomeFuncionario.equals(filtro) || servicos[i].descricao.equals(filtro)
					|| servicos[i].pet.nomePet.equals(filtro) || servicos[i].pet.nomeDono.equals(filtro)
					|| servicos[i].pet.tipoPet.equals(filtro))
				System.out.println(servicos[i].tabularString());
		}
		System.out.println("\n");
	}

	// Listar os Servi�os + filtrar por Data
	private static void listarServicos(Date filtro) {
	    limpaTela();
		System.out.println("Animal/Pet(id, tipo, nome, dono, peso)\tfuncionario\tDescricao\tData\tHora");
		for (int i = 0; i < contServicos; i++) {
			if (servicos[i].data.equals(filtro))
				System.out.println(servicos[i].tabularString());
		}
		System.out.println("\n");
	}
     private  static void limpaTela(){
            for(int count=0 ; count<200 ; count++){
                      System.out.println(""); 
              }
               
      }
      private static void cadastrarFuncionario(){
       limpaTela();
        System.out.println("Digite a senha de administrador:");
        int senha = read.nextInt();
        limpaTela();
        if(senha == 1234){
        for(int i = 0; i < 10; i++){
          if(funcionario[9] == null){
            if(funcionario[i] == null){
            System.out.println("Digite o nome do funcionário:");
            funcionario[i] = read.next();
            limpaTela();
            System.out.println("Funcionário cadastrado com sucesso!\n");
            break;
            }
            
          }else{
                System.out.println("Erro ao cadastrar, limite excedido!\n");
                break;
           }
          }
        }else{
          limpaTela();
          System.out.println("Senha incorreta!!!\n\n");
        }
      }
      private static void listarFuncionario(){
        System.out.println("Lista de Funcionários:");
        for(int i = 0; i < 10; i++){
             if(funcionario[i] != null){
               System.out.println((i + 1) + "- " + funcionario[i]);
             }               
          }
      }
      
      private static void cadastrarServico2()throws ParseException{
            limpaTela();
            System.out.println("Para registrar um servico, primeiro o pet deve estar cadastrado");
            System.out.println("Escolha o funcionário:");
            for(int i = 0; i < 10; i++){
                 if(funcionario[i] != null){
                     System.out.println((i + 1) +"- "+ funcionario[i]);
                 }
            }
            int func = (read.nextInt()) - 1;
            limpaTela();
            
            for(int i = 0; i < 10; i++){
               if(pets[i] != null){
                  System.out.println("Escolha o pet:");
                  System.out.println((i + 1) + "- tipo: " +pets[i].tipoPet+ " nome: " + pets[i].nomePet);
               }
            }
            int pe = (read.nextInt()) - 1;
            limpaTela();
            
            System.out.println("Escolha o serviço que será feito:");
            for(int i = 0; i < 3; i++){
                  System.out.println((i + 1) + "- " + servi[i]);               
            }
            int ser = (read.nextInt()) - 1;
            limpaTela();
            
            Date agora = new Date();
            Calendar c = Calendar.getInstance();
            String dia = c.get(Calendar.DAY_OF_MONTH) + "/";
            String mes = c.get(Calendar.MONTH) + "/";
            String ano = c.get(Calendar.YEAR)+" ";
            String date = dia + mes + ano;
	    	String hora = agora.getHours() + ":" + agora.getMinutes();
	    	
            servicos[contServicos] = new Serviço(pets[pe],funcionario[func], servi[ser], date, hora);
            
             contServicos++;
            
      }
}