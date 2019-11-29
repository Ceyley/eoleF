/**
 * 
 */
package affichage;

import java.awt.BorderLayout;

import javax.swing.*;

/**
 * @author amougeno
 * Création de la fenetre d'acceuil (en cour)
 */
public class Fenêtre extends JFrame {
	String textIntro = "je suis gentil test";
	JButton btnDépart, btnSuppr, btnVider;
	
/**	
 * @author amougeno
 * modif
 */
	public Fenêtre() { 
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
		Fenêtre f1 = new Fenêtre();
		f1.setVisible(true);
		
	}

}
