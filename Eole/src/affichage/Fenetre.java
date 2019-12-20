package affichage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JTextField TfBienvenue;
	private JTable tableRegate;
	
	Object [][] donnee = {{"La bonne bière", "1", "69"}};
	String [] entete = {"Nom Voilier", "classe", "rating"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre frame = new Fenetre();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Champ texte
		TfBienvenue = new JTextField();
		TfBienvenue.setBounds(39, 41, 191, 155);
		contentPane.add(TfBienvenue);
		TfBienvenue.setColumns(10);
		
		//Bouton départ
		JButton btnDepart = new JButton("D\u00E9part");
		btnDepart.setBounds(39, 512, 191, 124);
		contentPane.add(btnDepart);
		
		//Jtable
		tableRegate = new JTable(donnee, entete);
		tableRegate.setBounds(325, 41, 484, 620);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setColumnHeaderView(tableRegate.getTableHeader());
		scrollPane.setBounds(325,20,484,22);
		tableRegate.getTableHeader().setReorderingAllowed(true);
		contentPane.add(scrollPane);
		contentPane.add(tableRegate);
		
		//Bouton vider
		JButton btnVider = new JButton("Vider");
		btnVider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVider.setBounds(438, 662, 89, 23);
		contentPane.add(btnVider);
		
		//Bouton supprimer
		JButton btnSupp = new JButton("Supprimer");
		btnSupp.setBounds(612, 662, 89, 23);
		contentPane.add(btnSupp);
	}
	
	public class Regate {
		private String nomV;
		private String nomS;
		private int classe;
		private int rating;
		
		public Regate(String nomV, String nomS, int classe, int rating) {
			this.nomV = nomV;
			this.nomS = nomS;
			this.classe = classe;
			this.rating = rating;
		}
		
	public String getNomV() {
			return nomV;
		}

	public void setNomV(String nomV) {
			this.nomV = nomV;
		}

	public String getNomS() {
			return nomS;
		}

	public void setNomS(String nomS) {
			this.nomS = nomS;
		}
	
	public int getClasse() {
			return classe;
		}

	public void setClasse(int classe) {
			this.classe = classe;
		}

	public int getRating() {
			return rating;
		}

	public void setRating(int rating) {
			this.rating = rating;
		}

	}
}	
  
