package visao;
import javax.swing.JButton;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.UsuarioProcessa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Telalogin extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField Email, Senha;
	private JButton login;
	
	
	Telalogin(){
		setTitle("Tela de Login");
		setBounds(600,300,360,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);
		
		
		rotulo1 = new JLabel("email");
		rotulo1.setBounds(20,20,100,20);
		Email = new JTextField();
		Email.setBounds(120,20,200,30);
		rotulo2 = new JLabel("senha");
		rotulo2.setBounds(20,60,100,20);
		Senha = new JTextField();
		Senha.setBounds(120,60,200,30);
		login = new JButton();
		login.setBounds(120,100,200,30);
		 
		login.addActionListener(this); 
		
		painel.add(rotulo1);
		painel.add(Email);
		painel.add(rotulo2);
		painel.add(Senha);
		painel.add(login);
		 
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == login) {
			int indice = UsuarioProcessa.checarUsuario(Email.getText());
			if(indice != -1) {
				if (UsuarioProcessa.checarSenha(indice, Senha.getText())) {
					JOptionPane.showMessageDialog(this,"acesso permitido");
					this.dispose();
				}else {
					JOptionPane.showMessageDialog(this,"acesso negado");
				}
		}else {
			JOptionPane.showConfirmDialog(this,"usuario não encontrado");
		}
	}
}
	
	public static void main(String[] args) {
		UsuarioProcessa.carregar();
		Telalogin tela = new Telalogin();
		tela.setVisible(true);
	}
	
}