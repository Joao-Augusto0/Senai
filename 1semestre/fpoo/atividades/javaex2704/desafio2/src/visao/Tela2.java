package visao;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4 ;
	private JTextField Nome, Nota1, Nota2,Nota3;
	private JButton Media;
	
	
	Tela2(){
		setTitle("Tela de Login");
		setBounds(800,400,460,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("Nome");
		rotulo1.setBounds(20,20,100,20);
		Nome = new JTextField();
		Nome.setBounds(120,20,200,30);
		
		rotulo2 = new JLabel("nota1");
		rotulo2.setBounds(20,60,100,20);
		Nota1 = new JTextField();
		Nota1.setBounds(120,60,200,30);
		
		rotulo3 = new JLabel("nota2");
		rotulo3.setBounds(20,100,100,20);
		Nota2 = new JTextField();
		Nota2.setBounds(120,100,200,30);
		
		rotulo4 = new JLabel("nota3");
		rotulo4.setBounds(20,140,100,20);
		Nota3 = new JTextField();
		Nota3.setBounds(120,140,200,30);
		
		Media = new JButton();
		Media.setBounds(120,200,200,30);
		 
		 
		painel.add(rotulo1);
		painel.add(Nome);
		painel.add(rotulo2);
		painel.add(Nota1);
		painel.add(rotulo3);
		painel.add(Nota2);
		painel.add(rotulo4);
		painel.add(Nota3);
		
		painel.add(Media);
		 
	}
	
	public static void main(String[] args) {

		Tela2 tela = new Tela2();
		tela.setVisible(true);
	}

}