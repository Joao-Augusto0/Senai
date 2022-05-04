package visao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.PetProcessa;
import modelo.Pet;

public class Petform extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel painel;
	private JLabel id1, especie1, nome1, raca1, peso1, nascimento1, Dono1, telefone1, rotulos1, imagem;
	private JTextField Id2, Nome2, Raca2, Peso2, Nascimento2, Dono2, Telefone2;
	private JComboBox<String> cbEspecie;
	private JTextArea verResultados;
	private JButton create, read, update, delete;
	private String imgIco = "C:\\Users\\jaugu\\Desktop\\senai\\1semestre\\fpoo\\aulas\\exjava0305\\pets\\src\\img\\panda.jpg";
	private String[] imagens = { "C:\\Users\\jaugu\\Desktop\\senai\\1semestre\\fpoo\\aulas\\exjava0305\\pets\\src\\img\\cachorro.jpg",
			"C:\\Users\\jaugu\\Desktop\\senai\\1semestre\\fpoo\\aulas\\exjava0305\\pets\\src\\img\\gato.jpg",
			"C:\\Users\\jaugu\\Desktop\\senai\\1semestre\\fpoo\\aulas\\exjava0305\\pets\\src\\img\\coelho.jpg",
			"C:\\Users\\jaugu\\Desktop\\senai\\1semestre\\fpoo\\aulas\\exjava0305\\pets\\src\\img\\panda.jpg" };
	private ImageIcon icon;
	private int autoId = PetProcessa.pets.size() + 1;
	private String texto = "";

	Petform() {
		setTitle("Formulário de Pets");
		setBounds(200, 300, 600, 500);
		setIconImage(new ImageIcon(imgIco).getImage());
		painel = new JPanel();
		painel.setBackground(new Color(169, 247, 247));
		setContentPane(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		id1 = new JLabel("Id:");
		id1.setBounds(20, 20, 120, 30);
		Id2 = new JTextField(String.format("%d", autoId));
		Id2.setEditable(false);
		Id2.setBounds(140, 20, 260, 30);
		
		
		especie1 = new JLabel("Especie:");
		especie1.setBounds(20, 50, 120, 30);
		cbEspecie = new JComboBox<String>(new String[] { "Cachorro", "Gato", "Coelho", "Outro" });
		cbEspecie.setBounds(140, 50, 260, 30);
		
		
		nome1 = new JLabel("Nome pet:");
		nome1.setBounds(20, 80, 120, 30);
		Nome2 = new JTextField();
		Nome2.setBounds(140, 80, 260, 30);
		
		
		raca1 = new JLabel("Raça:");
		raca1.setBounds(20, 110, 120, 30);
		Raca2 = new JTextField();
		Raca2.setBounds(140, 110, 260, 30);
		
		
		peso1 = new JLabel("Peso:");
		peso1.setBounds(20, 140, 120, 30);
		Peso2 = new JTextField();
		Peso2.setBounds(140, 140, 260, 30);
		
		
		nascimento1 = new JLabel("Nascimento:");
		nascimento1.setBounds(20, 170, 120, 30);
		Nascimento2 = new JTextField();
		Nascimento2.setBounds(140, 170, 260, 30);
		
		
		Dono1 = new JLabel("Nome dono:");
		Dono1.setBounds(20, 200, 120, 30);
		Dono2 = new JTextField();
		Dono2.setBounds(140, 200, 260, 30);
		
		
		telefone1 = new JLabel("Telefone:");
		telefone1.setBounds(20, 230, 120, 30);
		Telefone2 = new JTextField();
		Telefone2.setBounds(140, 230, 260, 30);
		
		rotulos1 = new JLabel("Id|Espécie|NomePet|Raça|Peso|Idade|Dono|Telefone:");
		rotulos1.setBounds(20, 260, 500, 30);
		
		painel.add(id1);
		painel.add(especie1);
		painel.add(nome1);
		painel.add(raca1);
		painel.add(peso1);
		painel.add(nascimento1);
		painel.add(Dono1);
		painel.add(telefone1);
		painel.add(rotulos1);		
		painel.add(Id2);
		painel.add(cbEspecie);
		painel.add(Nome2);
		painel.add(Raca2);
		painel.add(Peso2);
		painel.add(Nascimento2);
		painel.add(Dono2);
		painel.add(Telefone2);
		verResultados = new JTextArea();
		
		// verResultados.setEnabled(false);
		
		verResultados.setBounds(20, 290, 545, 150);
		verResultados.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		preencherAreaDeTexto();
		painel.add(verResultados);
		imagem = new JLabel();
		imagem.setBounds(410, 145, 150, 115);
		imagem.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		alternarImagens(0);
		painel.add(imagem);

		create = new JButton("Cadastrar");
		read = new JButton("Buscar");
		update = new JButton("Atualizar");
		delete = new JButton("Excluir");
		create.setBounds(410, 20, 150, 30);
		read.setBounds(410, 50, 150, 30);
		update.setBounds(410, 80, 150, 30);
		delete.setBounds(410, 110, 150, 30);
		update.setEnabled(false);
		delete.setEnabled(false);
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);

		// Ouvir os eventos dos Botões, ComboBox e outros
		cbEspecie.addActionListener(this);
		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

	}

	private void alternarImagens(int indice) {
		icon = new ImageIcon(new ImageIcon(imagens[indice]).getImage().getScaledInstance(150, 115, 100));
		imagem.setIcon(icon);
	}

	// CREATE - CRUD
	private void cadastrar() {
		if (Nome2.getText().length() != 0 && Raca2.getText().length() != 0 && Peso2.getText().length() != 0
				&& Nascimento2.getText().length() != 0 && Dono2.getText().length() != 0
				&& Telefone2.getText().length() != 0) {	
			PetProcessa.pets
					.add(new Pet(autoId, cbEspecie.getSelectedItem().toString(), Nome2.getText(), Raca2.getText(), Float.parseFloat(Peso2.getText()), Nascimento2.getText(), Dono2.getText(), Telefone2.getText()));
			autoId++;
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
	}

	private void limparCampos(){
		Nome2.setText(null);
		Raca2.setText(null);
		Peso2.setText(null);
		Nascimento2.setText(null);
		Dono2.setText(null);
		Telefone2.setText(null);
	}
	
	private void preencherAreaDeTexto() {
		texto = ""; //Limpar a área de texto antes de preenher
		for (Pet p : PetProcessa.pets) {
			texto += p.toString();
		}
		verResultados.setText(texto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cbEspecie) {
			alternarImagens(cbEspecie.getSelectedIndex());
		}
		if (e.getSource() == create) {
			cadastrar();
		}
		if (e.getSource() == read) {

		}
		if (e.getSource() == update) {

		}
		if (e.getSource() == delete) {

		}
	}

	public static void main(String[] agrs) throws ParseException {
		PetProcessa.carregarTestes();
		new Petform().setVisible(true);
	}

}