package modelo;

import java.util.Date;

public class Cliente extends Pessoa{

	
	private int id;
	private double creditoLimite;
	
	public static void Cliente(){
		
	}
	
	public Cliente(String nomeCliente,String telefoneCliente,Date nascimentoCliente,int id, double creditoLimite) {
		setNome(nomeCliente);
		setTelefone(telefoneCliente);
		setNascimento(nascimentoCliente);
		
		this.id = id;
		this.creditoLimite = creditoLimite;
	}

	public String toString(){
		return " Funcionario: " +getNome() + " telefone: " + getTelefone() + " nascimento: " + getNascimento() + " id: " + id + " creditoLimite: " + creditoLimite;
	}
}
