/**
 * 
 */
package affichage;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * @author amougeno
 * Cr�ation de la fenetre d'acceuil (en cour)
 */
public class Fen�tre extends JFrame {
	String textIntro = "je suis gentil test";
	JButton btnD�part, btnSuppr, btnVider;
	
/**	
 * @author amougeno
 * modif
 */
	public Fen�tre() { 
		JPanel panAccueil = new JPanel();
		panAccueil.setLayout(new BorderLayout());
		setTitle("Eole");
		setSize(940, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initBtnAccueil();
		
		
		
	}
	public void initBtnAccueil() { // Initalisation des buttons de l'accueil
		JTextPane taIntro = new JTextPane();
		
		
		add(taIntro);
	}

	static public void main(String args[]) {
		Fen�tre f1 = new Fen�tre();
		f1.setVisible(true);
		
	}

}
