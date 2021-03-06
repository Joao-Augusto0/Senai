package modelo;

import java.text.DecimalFormat;

public class Alunos {

	private String nome;
	private double n1;
	private double n2;
	private double n3;
	
	public Alunos(String entrada) {
		nome = (entrada.split(";")[0]);
		n1 = Double.parseDouble(entrada.split(";")[1]);
		n2 = Double.parseDouble(entrada.split(";")[2]);
		n3 = Double.parseDouble(entrada.split(";")[3]);
	}
	
	public String toString() {
	double media =  (n1 + n2 + n3)/3 ;
	 DecimalFormat formatador = new DecimalFormat("0.00");
		return nome + ";" + formatador.format(media) ;
	}
}