package items;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author BASTIAN
 * @author jmunz
 * @version 1.0
 */
public class Classement {
	static private HashMap<Voilier, Double> score;
	Regate reg;
	
	
	/**
	 * initialise la HashMap score
	 * @author Bastian
	 * @param reg La regate à laquelle le classement est affilié.
	 */
	public Classement(Regate reg) {
		score = new HashMap<Voilier, Double>();
		this.reg = reg;
		Voilier VActu = reg.getPremier();
		Boolean firstLoop = true;
		do {
			if(firstLoop) {
				firstLoop = false;
			} else {
				VActu = VActu.getSuivant();
			}
			score.put(VActu, calculTps(VActu.getTpsReel(), VActu.getRating()));
		} while(VActu != reg.getDernier());
	}
	/**
	 * @author jmunz
	 * @author gatzenhoffer
	 * @param calcule le temps compensÃ© par rapport au temps rÃ©el
	 * 
	 * modifié le 13/12/2019 : Besoin d'un return pour la hashmap.
	 * @author Bastian 13/12/2019
	 * @see Classement
	 * 
	 * Refaire les commentaires !!! (param)
	 */
	public double calculTps(int tpsReel, double R/*, double dist */) {
		double hand = (5143 / (Math.sqrt(R) + 3.5)) * reg.getDistance();
		//double hand = (5143 / (Math.sqrt(R) + 3.5)) * dist; La distance est dans Regate ! Voir ligne au dessus
		double tpsCompense;
		
		if(tpsReel == 0)
			tpsCompense = 0;
		else
			tpsCompense = tpsReel + Math.round(hand);
		return tpsCompense;
	}
	
	
	/**
	 * @author tBastian
	 * @return le classement d'une classe (HashMap)
	 * @see Comparateur
	 * 
	 * TODO Tester la méthode
	 */
	public TreeMap<Voilier, Double> classement(int classe) {
		HashMap<Voilier,Double> temp = new HashMap<Voilier,Double>();
		
		for (Voilier v : score.keySet()) {
			if(v.getClasse() == classe) {
				temp.put(v, score.get(v)); // Ajout de tout les voiliers de la classe concernée
			}
		}
		Comparateur comp = new Comparateur(temp);
		TreeMap<Voilier, Double> res = new TreeMap<Voilier, Double>(comp);
		res.putAll(temp);
		// System.err.println(res);
		return res;
	}
	
	/**
	 * @author Bastian
	 * @return Le classement général (ArrayList)
	 */
	public ArrayList classement() {
		return null;
	}
	
	
	/**
	 * 
	 * @author Bastian
	 * Permet de trier la hashMap afin d'en déduire un classement
	 * @see Classement.classement
	 */
	class Comparateur implements Comparator {

		Map tuple;
		public Comparateur(HashMap map) {
			this.tuple = map;
		}
		
		public int compare(Object o1, Object o2) {
			
			if ((int) tuple.get(01) <= (int) tuple.get(02)) {
				return -1;
			} else {
				return 1;
			}
		}
		
	}
	

	
}
