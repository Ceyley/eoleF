package eole;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Fen_Classement extends JFrame implements ActionListener {
	private JPanel panel, panLeft, panRight, panRightUp, panRightDown, panPodium;
	private JButton btnPdf, btnNouvRegate;
	private JComboBox<String> combo;
	private JLabel lblClassement, lblPodium, lblTop1, lblTop2, lblTop3;
	private JTable table;
	
	String[][] donnees = {{"test1", "salut", "je", "suis", "content"},
						{"test2", "salut", "je", "suis", "content"},
						{"test3", "salut", "je", "suis", "content"},
						{"test4", "salut", "je", "suis", "content"},
						{"test5", "salut", "je", "suis", "content"},
						{"test6", "salut", "je", "suis", "content"}};
	String[] entetes = {"Nom voilier", "je", "vais", "t'enculer", "fils de loutre"};
	
	String[] lstClass = {};
	
	public Fen_Classement() {
		setSize(940, 750);
		setTitle("Classement des régates");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Initialisation des objets
		panel = new JPanel();
		panLeft = new JPanel();
		panRight = new JPanel();
		panRightUp = new JPanel();
		panRightDown = new JPanel();
		panPodium = new JPanel();
		table = new JTable(donnees, entetes);
		btnPdf = new JButton("PDF");
		btnNouvRegate = new JButton("Nouvelle régate");
		lblClassement = new JLabel("Sélectionner le classement");
		lblPodium = new JLabel(new ImageIcon("podium.png"));
		lblTop1 = new JLabel("Le premier");
		lblTop2 = new JLabel("Le deuxième");
		lblTop3 = new JLabel("Le troisième");
		combo = new JComboBox<String>(lstClass);
		
		// Taille des objets
		btnPdf.setPreferredSize(new Dimension(64, 32));
		combo.setPreferredSize(new Dimension(128, 24));
		
		// Podium
		panPodium.setLayout(new FlowLayout());
		panPodium.add(lblPodium);
		panPodium.add(lblTop1);
		panPodium.add(lblTop2);
		panPodium.add(lblTop3);
		lblTop1.setBounds(0, 0, 32, 32);
		lblTop2.setLocation(0, 100);
		lblTop3.setLocation(50, 50);
		panRightUp.add(panPodium, BorderLayout.WEST);
		
		// Panneau GAUCHE		
		panLeft.setLayout(new BorderLayout()); // Params du panel
		panLeft.add(table.getTableHeader(), BorderLayout.NORTH);
		panLeft.add(table);
		table.getTableHeader().setReorderingAllowed(false);
		
		// Panneau DROIT
		panRightUp.setLayout(new FlowLayout());
		panRightDown.setLayout(new FlowLayout());
		
		panRight.setLayout(new BorderLayout()); // Params des panels
		panRight.add(panRightUp, BorderLayout.NORTH);
		panRight.add(panRightDown, BorderLayout.SOUTH);
		panRightDown.add(btnPdf);
		panRightDown.add(btnNouvRegate);
		panRightUp.add(lblClassement);
		panRightUp.add(combo);
		
		// Listener
		btnPdf.addActionListener(this);
		btnNouvRegate.addActionListener(this);
		
		panel.setLayout(new GridLayout());
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.add(panLeft);
		panel.add(panRight);
		
		setContentPane(panel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == btnPdf) {
			System.out.println("PDF");
		} else if(source == btnNouvRegate) {
			System.out.println("Nouvelle régate");
		}
	}
	
	public static void main(String[] args) {
		new Fen_Classement();
	}
}
