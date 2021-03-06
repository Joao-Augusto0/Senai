package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Pessoas;

public class DAO {
	
	private BufferedReader br;
	private BufferedWriter bw;
	
	private String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\Nova atividade java 2704\\desafios1\\dados\\Entrada.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\Nova atividade java 2704\\desafios1\\dados\\Saida.csv";
	
	public ArrayList<Pessoas> abrir() throws IOException {
		
		ArrayList<Pessoas> linhas = new ArrayList<>();
		Pessoas p;
		
		try {
			
			br = new BufferedReader(new FileReader(entrada));
			 String l = br.readLine();
			while(l != null) {
				p = new Pessoas(l);
				linhas.add(p);
				l = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		return linhas;
	}

	public void salvardata(ArrayList<Pessoas> linhas) {
		try {
			
			bw = new BufferedWriter(new FileWriter(saida));
			for (Pessoas p : linhas) {
				bw.write(p.toString()+"\r\n");
			}
			
			bw.close();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
	}
}