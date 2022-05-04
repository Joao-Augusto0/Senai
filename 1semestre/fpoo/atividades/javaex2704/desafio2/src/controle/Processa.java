package controle;

import java.io.IOException;
import java.util.ArrayList;
import modelo.Alunos;

public class Processa {
	
	static ArrayList<Alunos> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void carregar() throws IOException {
		linhas = dao.abrir();
	}
	
	public static void saida() {
		dao.salvar(linhas);
	}
}