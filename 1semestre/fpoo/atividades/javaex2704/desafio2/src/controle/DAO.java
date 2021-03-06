package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Alunos;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	
	private String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\Nova atividade java 2704\\desafio2\\dados\\Entrada.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\Nova atividade java 2704\\desafio2\\dados\\Saida.csv";
	
	public ArrayList<Alunos> abrir() throws IOException {
		
		ArrayList<Alunos> linhas = new ArrayList<>();
		Alunos a;
		
		try {
			
			br = new BufferedReader(new FileReader(entrada));
			 String l = br.readLine();
			while(l != null) {
				a = new Alunos(l);
				linhas.add(a);
				l = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return linhas;
	}

	public void salvar(ArrayList<Alunos> linhas) {
		try {
			
			bw = new BufferedWriter(new FileWriter(saida));
			for (Alunos a : linhas) {
				bw.write(a.toString()+"\r\n");
			}
			
			bw.close();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
}