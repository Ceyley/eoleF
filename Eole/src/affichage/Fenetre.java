package affichage;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Fenetre extends JFrame {

	private JPanel contentPane;
	private JTable tableRegate;
	
	String [][] donnee = {{"La bonne bière", "1", "69"}};
	String [] entete = {"Nom Voilier", "classe", "rating"};
	private JTextField tfRating;
	private JTextField tfClasse;
	private JTextField tfNomVoilier;
	private JTextField tfNomRegate;
	private JTextField tfDistance;
	private JTextField tfLieu;

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
		
		JTextArea taBienvenue = new JTextArea();
		String bienvenue = "Bienvenue, \n Veuillez entrer ci-dessous \n toutes les informations sur \n la régate et ses participants."; 
		taBienvenue.setText(bienvenue);
		taBienvenue.setEditable(false);
		taBienvenue.setBounds(39, 34, 191, 139);
		contentPane.add(taBienvenue);
		
	
		
		//Bouton départ
		JButton btnDepart = new JButton("D\u00E9part");
		btnDepart.setBounds(39, 560, 191, 101);
		contentPane.add(btnDepart);
		
		//Jtable
		tableRegate = new JTable(donnee, entete);
		tableRegate.setBounds(325, 79, 484, 582);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setColumnHeaderView(tableRegate.getTableHeader());
		scrollPane.setBounds(325,56,484,23);
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
		
		JTextArea taProposVoilier = new JTextArea();
		String pv = "Ajouter un voilier";
		taProposVoilier.setText(pv);
		taProposVoilier.setEditable(false);
		taProposVoilier.setBounds(39, 201, 191, 21);
		contentPane.add(taProposVoilier);
		
		JTextArea taVoilier = new JTextArea();
		String v = "Nom Voilier";
		taVoilier.setText(v);
		taVoilier.setEditable(false);
		taVoilier.setBounds(39, 233, 89, 22);
		contentPane.add(taVoilier);
		
		tfNomVoilier = new JTextField();
		tfNomVoilier.setBounds(144, 235, 86, 20);
		contentPane.add(tfNomVoilier);
		tfNomVoilier.setColumns(10);
		
		JTextArea taClasse = new JTextArea();
		String c = "Classe";
		taClasse.setText(c);
		taClasse.setEditable(false);
		taClasse.setBounds(39, 266, 89, 22);
		contentPane.add(taClasse);
		
		tfClasse = new JTextField();
		tfClasse.setBounds(144, 268, 86, 20);
		contentPane.add(tfClasse);
		tfClasse.setColumns(10);
		
		JTextArea taRating = new JTextArea();
		String r = "Rating";
		taRating.setText(r);
		taRating.setEditable(false);
		taRating.setBounds(39, 299, 89, 22);
		contentPane.add(taRating);
		
		tfRating = new JTextField();
		tfRating.setBounds(144, 299, 86, 20);
		contentPane.add(tfRating);
		tfRating.setColumns(10);
		
		JButton btnAjout = new JButton("Ajouter");
		btnAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAjout.setBounds(144, 330, 89, 23);
		contentPane.add(btnAjout);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(438, 23, 263, 22);
		contentPane.add(comboBox);
		
		JTextArea taSelecVoilier = new JTextArea();
		String sv = "Voilier(s) :";
		taSelecVoilier.setText(sv);
		taSelecVoilier.setEditable(false);
		taSelecVoilier.setBounds(325, 22, 89, 22);
		contentPane.add(taSelecVoilier);
		
		JTextArea taProposRegate = new JTextArea();
		String dr = "Descriptif Régate";
		taProposRegate.setText(dr);
		taProposRegate.setEditable(false);
		taProposRegate.setBounds(39, 386, 191, 21);
		contentPane.add(taProposRegate);
		
		JTextArea taNomRegate = new JTextArea();
		String nr = "Nom Régate";
		taNomRegate.setText(nr);
		taNomRegate.setEditable(false);
		taNomRegate.setBounds(39, 418, 86, 20);
		contentPane.add(taNomRegate);
		
		tfNomRegate = new JTextField();
		tfNomRegate.setBounds(144, 418, 86, 20);
		contentPane.add(tfNomRegate);
		tfNomRegate.setColumns(10);
		
		JTextArea taDistance = new JTextArea();
		String dist = "Distance";
		taDistance.setText(dist);
		taDistance.setEditable(false);
		taDistance.setBounds(39, 449, 86, 20);
		contentPane.add(taDistance);
		
		tfDistance = new JTextField();
		tfDistance.setColumns(10);
		tfDistance.setBounds(144, 451, 86, 20);
		contentPane.add(tfDistance);
		
		JTextArea taLieu = new JTextArea();
		String lieu = "Lieu";
		taLieu.setText(lieu);
		taLieu.setEditable(false);
		taLieu.setBounds(39, 480, 86, 20);
		contentPane.add(taLieu);
		
		tfLieu = new JTextField();
		tfLieu.setColumns(10);
		tfLieu.setBounds(144, 482, 86, 20);
		contentPane.add(tfLieu);
	}
}