package controle;

import java.io.IOException;
import java.util.ArrayList;
import modelo.Pessoas;

public class Processa {
	
	static ArrayList<Pessoas> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	
	public static void carregar() throws IOException {
		linhas = dao.abrir();
	}
	
	public static void saida() {
		dao.salvardata(linhas);
	}
}