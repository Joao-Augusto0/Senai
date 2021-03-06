package modelo;

import java.util.Objects;

public class Funcionario {
	
	private String login;
	private String senha;
	
	
	public Funcionario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public Funcionario(String linha) {
		this.login = linha.split(";")[0];
		this.senha = linha.split(";")[1];
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(login);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(login, other.login);
	}

	@Override
	public String toString() {
		return login + "\t" + senha;
	}

	public String toCSV() {
		return login + ";" + senha + "\r\n";
	}
	
}