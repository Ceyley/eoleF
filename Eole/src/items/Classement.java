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
	/*
	 * @author gatzenho
	 * @param calcule le temps compens� par rapport au temps r�el
	 */
	public void calculTps(int tpsReel) {
		double hand = (5143 / Math.sqrt(36)) * 126;
		double tpsCompense;
		
		if(tpsReel == 0)
			tpsCompense = 0;
		else
			tpsCompense = tpsReel + hand;
	}
	/**
	 * @author jmunz
	 * @return le classement g�n�ral ou d'une classe
	 */
	public ArrayList classement(int classe) {
		return null;
	}
}
