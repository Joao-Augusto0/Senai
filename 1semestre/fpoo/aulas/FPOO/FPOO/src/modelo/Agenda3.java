package modelo;

public class Agenda3 {

	 public static void main(String[] args) {
		 //criando um objeto
		 
		 Contato c1 = new Contato();
		 Contato c2 = new Contato();
		 
		 c1.id = "30";
		 c1.none = "jaqueline";
		 c1.idade = 19;
		 c1.telefone = "(19)3454-4536";
		 
		 c2.id = "25";
		 c2.none = "marcos";
		 c2.idade = 21;
		 c2.telefone = "(19)97777-1111";
		 
		 System.out.println(c1.contatoTab());
		 System.out.println(c2.contatoTab());
}
}