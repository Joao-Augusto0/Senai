package modelo;

public class Agenda5 {

	 public static void main(String[] args) {
		 //criando um objeto
		 
		 Contato c1 = new Contato(30,"Jaqueline",19,"");
		 Contato c2 = new Contato();
		 
		 System.out.println(c1.contatoTab());
		 System.out.println(c2.contatoTab());
}
}