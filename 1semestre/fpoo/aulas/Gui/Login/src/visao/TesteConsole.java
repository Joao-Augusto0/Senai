package visao;

import java.util.Scanner;

import controle.UsuarioProcessa;


public class TesteConsole {

	private static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		UsuarioProcessa.carregar();
		
		System.out.println("digite o email");
		int indice = UsuarioProcessa.checarUsuario(leia.next());
		if (indice != -1){
			System.out.println("digite a senha");
			String senha = leia.next();
			if (UsuarioProcessa.checarSenha(indice, senha)) {
				System.out.println("Acesso permitido");
			}else {
				System.out.println("Acesso negado");
			}
			
		}else {
			System.out.println("usuario n?o encontrado");
		}
	}

}
