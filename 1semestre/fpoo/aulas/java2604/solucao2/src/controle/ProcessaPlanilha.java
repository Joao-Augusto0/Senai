package controle;

import java.io.IOException;
import java.util.ArrayList;

import modelo.Planilha;

public class ProcessaPlanilha {
	
	static ArrayList<Planilha> linhas = new ArrayList<>();
	
	private static DAO dao =  new DAO();
	
	
	public static void carregar() throws IOException {
		linhas = dao.abrir();
	}
	
	public static void saida(int opcao) {
		switch(opcao) {
		case 1: dao.salvarsoma(linhas);
		break;
		case 2: dao.salvarmult(linhas);
		break;
		case 3: dao.salvarsub(linhas);
		break;
		case 4: dao.salvardiv(linhas);
		break;
		
		}
	}
}