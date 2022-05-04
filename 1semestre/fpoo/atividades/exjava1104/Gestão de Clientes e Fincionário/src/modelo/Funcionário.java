package modelo;

import java.util.Date;

public class Funcionário extends Pessoa {

	private int matricula;
	private double comissao;
	
	public void Funcionário(){
		
	} 
	
	public Funcionário(String nomeFuncionario,String telefoneFuncionario,Date nascimentoFuncionario, int matricula,double comissao) {
		setNome(nomeFuncionario);
		setTelefone(telefoneFuncionario);
		setNascimento(nascimentoFuncionario);
		
		this.matricula = matricula;
		this.comissao = comissao;
	}
	
	public String toString(){
		return "Funcionario: " +getNome() + " telefone: " + getTelefone() + " nascimento: " + getNascimento() + " matricula: " + matricula + " comissao: " + comissao;
	}
	
	
}
