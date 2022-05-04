package exjava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Nome {
	
	
	public void bloco(String info, String FileName, boolean append) {
		
		try {
			
			FileWriter fw = new FileWriter(FileName +".txt", append);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(info + "\r\n");
			
			bw.close();
			fw.close();
			
		}catch(Exception e) {
			
			System.out.println(e.toString());
		}
	}
	
	public ArrayList<String> ler (String fileName){
		ArrayList<String> nome = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(fileName + ".txt");
			BufferedReader br = new BufferedReader(fr);
			
			String linha = "";
			
			while((linha = br.readLine()) != null) {
				nome.add(linha);
			}
			
			br.close();
			fr.close();
			
		}catch (Exception e) {
			
			System.out.println(e.toString());
		}
		return nome;
		
	}
}