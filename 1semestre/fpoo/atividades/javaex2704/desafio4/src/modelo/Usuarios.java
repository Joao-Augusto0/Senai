package modelo;

public class Usuarios {

	private String email;
	private String senha;
	
	public Usuarios(String email,String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public Usuarios(String linha) {
		this.email = linha.split(";")[0];
		this.email = linha.split(";")[1];
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "email = " + email + ", senha = " + senha;
	}
}