package modelo;

public class Agenda2 {

	 public static void main(String[] args) {
		 //criando um objeto
		 
		 Contato c1 = new Contato();
		 
		 //preenche os atributos
		 
		 c1.id = "30";
		 c1.none = "jaqueline";
		 c1.idade = 19;
		 
		 //mostra na tela
		 
		 System.out.println(c1.id+"\t"+c1.none+"\t"+c1.idade);
		 
		 //limpa o objeito ou renova ele
		 
		 c1 = new Contato();
		 
		 System.out.println(c1.id+"\t"+c1.none+"\t"+c1.idade);
		
		 c1.id = "25";
		 c1.none = "marcos";
		 c1.idade = 21;
		 
		 // mostra na tela
		 
		 System.out.println(c1.id+"\t"+c1.none+"\t"+c1.idade);
	 }
}
