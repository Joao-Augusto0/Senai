package visao;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField Nome, Ano;
	private JButton Calcular;
	
	
	Tela2(){
		setTitle("Tela de Login");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("nome");
		rotulo1.setBounds(20,20,100,20);
		Nome = new JTextField();
		Nome.setBounds(120,20,200,30);
		rotulo2 = new JLabel("ano de nascimento");
		rotulo2.setBounds(20,60,100,20);
		Ano = new JTextField();
		Ano.setBounds(120,60,200,30);
		Calcular = new JButton();
		Calcular.setBounds(120,100,200,30);
		 
		 
		painel.add(rotulo1);
		painel.add(Nome);
		painel.add(rotulo2);
		painel.add(Ano);
		painel.add(Calcular);
		 
	}
	
	public static void main(String[] args) {

		Tela2 tela = new Tela2();
		tela.setVisible(true);
	}

}