package controle;

import java.util.ArrayList; 
import modelo.Usuarios;

public class UsuarioProcessa {
	
	public static ArrayList<Usuarios> usuarios = new ArrayList<>();
	private static UsuarioDao ud = new UsuarioDao(); 

	public static void carregar() {
		usuarios = ud.abrir();
	}
	
	public static int checarUsuario (String email){
		int retorno = -1;
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getEmail().equals(email)) {
				retorno = i;
			}
		}
		return retorno;
	}
	
	public static boolean checarSenha(int indice,String senha){		
		return usuarios.get(indice).getSenha().equals(senha);
	}
}