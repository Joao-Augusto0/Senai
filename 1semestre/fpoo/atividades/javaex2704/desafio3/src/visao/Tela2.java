package visao;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela2 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1;
	private JTextField numero;
	private JButton aleatorio;
	
	
	Tela2(){
		setTitle("Tela de Login");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		rotulo1 = new JLabel("numeros aleatorios");
		rotulo1.setBounds(20,20,100,20);
		numero = new JTextField();
		numero.setBounds(120,20,200,30);
		
		aleatorio= new JButton();
		aleatorio.setBounds(120,100,200,30);
		 
		painel.add(rotulo1);
		painel.add(numero);
		painel.add(aleatorio);
		 
	}
	public static void main(String[] args) {

		Tela2 tela = new Tela2();
		tela.setVisible(true);
	}
}