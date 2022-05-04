package modelo;

import java.util.Random;

public class Vetor {

	public static void main(String[] args) {
	
	}
	
	public static void imprimirvetor() {;
		
		String nome[]= new String[4];
		nome[0] = "Bruno";
		nome[1] = "Filipe";
		nome[2] = "lilia";
		nome[3] = "carlos";
	
		String  sobrenome[] = new String[4];
		sobrenome[0] = "fdsaf";
		sobrenome[1] = "dasdsa";
		sobrenome[2] = "fsdf";
		sobrenome[3] = "msfd";
		
		 
		for(int i =0; i < 4 ;i++) {
			Random aleatorio = new Random();
			
		    int nome_aleatorio = aleatorio.nextInt(nome.length);
		    int nome_sobre = aleatorio.nextInt(nome.length);
		    		
				System.out.print(nome [nome_aleatorio]+ " ");
				System.out.print(sobrenome[nome_sobre]);
				
				
			}
	}
}