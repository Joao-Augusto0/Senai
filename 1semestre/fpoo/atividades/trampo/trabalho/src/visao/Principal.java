package visao;

import java.util.Scanner;
import modelo.Aluno;
import modelo.Nota;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.IOException;
import java.util.Date;

public class Principal {
	static Scanner leia = new Scanner(System.in);
	static Aluno alunos[] = new Aluno[10];
	static int alunosC = 0;
	static int menu = 0;

	public static void main(String[] args) throws IOException, ParseException {

		while (menu != 8) {
			System.out.print("Escolha uma op??o:\n[1]Cadastrar Alunos.\t[2]Cadastrar notas.\t[3]Lista de todos os alunos cadastrados.\t[4]Listar todas as notas.\t\nR:");
			menu = leia.nextInt();
			switch (menu) {
			case 1:
				cadastrarAlunos();
				break;
			case 2:
				cadastrarNota();
				break;
			case 3:
				listarAlunos();
				break;
			case 4:
				listarNotas();
				break;
			default:
				System.out.println("tente novamente!!!");
				break;
			}
		}
	}
	public static int obterAluno(int ra) {
		int indice = -1;
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].ra == ra) {
					indice = i;
				}
			}
		}
		return indice;
	}

	public static String listarNotas() {
		for (int i = 0; i < 10; i++) {
			if (alunos[i] != null) {

				System.out.println(alunos[i].nome);

				System.out.println("\tmateria.\tNota 1\tNota 2\tNota 3\tM?dia\n");
				for (int j = 0; j < 4; j++) {
					if (alunos[i].notas[j] != null) {
						System.out.print("\t" + alunos[i].notas[j].componente);
						for (int a = 0; a < 3; a++) {
							System.out.print("\t" + alunos[i].notas[j].nota[a]);
						}
						if (alunos[i].notas[j].obterMedia() < 50) {
							System.out.printf("\t %.2f ", alunos[i].notas[j].obterMedia());
							System.out.println("\n");
						} else {
							System.out.printf("\t%.2f", alunos[i].notas[j].obterMedia());
						}
					}
				}
				System.out.println(alunos[i].obterConceito());
				System.out.println("\n");
			}
		}
		return null;
	}
	public static String listarAlunos() {
		System.out.println("RA\tNome\tNascimento\tIdade");
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				System.out.println(alunos[i].ra + "\t" + alunos[i].nome + "\t"
						+ new SimpleDateFormat("dd/MM/yyyy").format(alunos[i].nascimento) + "\t"
						+ alunos[i].calcIdade());
			}
		}
		return null;
	}
	public static void cadastrarNota() {
		System.out.print("Digite o ra: ");
		int ra = leia.nextInt();

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i] != null) {
				if (alunos[i].ra == ra) {

					Nota[] notas = alunos[i].notas;
					float nota[] = new float[3];
					String comp = "";
					for (int j = 0; j < 4; j++) {
						if (notas[j] == null) {
							System.out.print("Digite o nome da materia:");
							comp = leia.next();
							for (int a = 0; a < 3; a++) {
								System.out.print("Digite a nota do aluno:");
								nota[a] = leia.nextFloat();
							}
							notas[j] = new Nota(comp, nota);
							alunos[i].notas = notas;
							break;
						}
					}
				}
			}
		}
	}
	public static void cadastrarAlunos() throws ParseException {
			for (int i = 0; i < alunos.length; i++) {
				if (alunos[9] == null) {
					if (alunos[i] == null) {

						System.out.println("Digite o RA do aluno:");
						int ra = leia.nextInt();

						System.out.println("Digite o nome do Aluno");
						String nome = leia.next();

						System.out.println("Digite a data de nascimento do Aluno (EX: 01/01/1999)");
						String nasc = leia.next();
						Date nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(nasc);

						alunosC++;
						alunos[i] = new Aluno(ra, nome, nascimento);

						System.out.println("__________________________");
						break;
					}
				} else {
					System.out.println("Limite Excedido");
					break;
			}
		}
	}
}