package controle;

import java.io.BufferedReader; 
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuarios;

public class UsuarioDao {
	
	private BufferedReader br;	
	private String path = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\Gui\\Login\\dados\\usuarios.csv";
	
	public ArrayList<Usuarios> abrir(){
		ArrayList<Usuarios> lista = new ArrayList<Usuarios>();
		Usuarios usuario;

		try {	
			br = new BufferedReader(new FileReader(path));
			 String linha = br.readLine();
			while(linha != null) {
				usuario = new Usuarios(linha);
				lista.add(usuario);
				linha = br.readLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		return lista;
	}
}