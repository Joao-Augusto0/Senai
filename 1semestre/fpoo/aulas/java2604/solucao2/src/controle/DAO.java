package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Planilha;

public class DAO {

	private BufferedReader br;
	private BufferedWriter bw;

	private String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\atividade java\\solucao2\\dados\\Entrada.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\atividade java\\solucao2\\dados\\Saida.csv";

	public ArrayList<Planilha> abrir() throws IOException {
		
		ArrayList<Planilha> linhas = new ArrayList<>();
		Planilha p;
		
		try {
			
			br = new BufferedReader(new FileReader(entrada));
			String l = br.readLine();
			while(l != null) {
				p = new Planilha(l);
				linhas.add(p);
				l = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return linhas;
	}
	

	public void salvarsoma(ArrayList<Planilha> linhas) {
		try {
			
			bw = new BufferedWriter (new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.adicao()+"\r\n");
				
			}
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void salvarmult(ArrayList<Planilha> linhas) {
		try {
			
			bw = new BufferedWriter (new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.mult()+"\r\n");
				
			}
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void salvarsub(ArrayList<Planilha> linhas) {
		try {
			
			bw = new BufferedWriter (new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.sub()+"\r\n");
				
			}
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void salvardiv(ArrayList<Planilha> linhas) {
		try {
			
			bw = new BufferedWriter (new FileWriter(saida));
			for (Planilha l : linhas) {
				bw.write(l.div()+"\r\n");
				
			}
			bw.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	}
}