package items;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author BASTIAN
 * @author jmunz
 * @version 1.0
 */
public class Classement {
	private HashMap score = new HashMap();
	
	
	
	public Classement() {
		
	}
	/**.
	 * @author jmunz
	 * @author gatzenhoffer
	 * @param calcule le temps compensé par rapport au temps réel
	 */
	public void calculTps(int tpsReel, double R, double dist) {
		double hand = (5143 / (Math.sqrt(R) + 3.5)) * dist;
		double tpsCompense;
		
		if(tpsReel == 0)
			tpsCompense = 0;
		else
			tpsCompense = tpsReel + Math.round(hand);
	}
	/**
	 * @author jmunz
	 * @return le classement général ou d'une classe
	 */
	public ArrayList classement(int classe) {
		return null;
	}
}
