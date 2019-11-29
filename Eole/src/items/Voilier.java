/**
 * 
 */
package items;

/**
 * @author BASTIAN
 * @author jmunz
 * @version 1.0
 *
 */
public class Voilier {
	private String nom;
	private double rating;
	private int classe;
	private String skipper;
	private boolean estArrive;
	private Voilier suivant;
	private int tpsReel;
	private boolean aAbandone;
	/**
	 * @author jmunz
	 * @return the estArrive
	 */
	public boolean isEstArrive() {
		return estArrive;
	}
	/**
	 * @author jmunz
	 * @param estArrive the estArrive to set
	 */
	public void setEstArrive(boolean estArrive) {
		this.estArrive = estArrive;
	}
	/**
	 * @author jmunz
	 * @return the suivant
	 */
	public Voilier getSuivant() {
		return suivant;
	}
	/**
	 * @author jmunz
	 * @param suivant the suivant to set
	 */
	public void setSuivant(Voilier suivant) {
		this.suivant = suivant;
	}
	/**
	 * @author jmunz
	 * @return the tpsReel
	 */
	public int getTpsReel() {
		return tpsReel;
	}
	/**
	 * @author jmunz
	 * @param tpsReel the tpsReel to set
	 */
	public void setTpsReel(int tpsReel) {
		this.tpsReel = tpsReel;
	}
	/**
	 * @author jmunz
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @author jmunz
	 * @return the classe
	 */
	public int getClasse() {
		return classe;
	}
	/**
	 * @author jmunz
	 * @param skipper the skipper to set
	 */
	public void setSkipper(String skipper) {
		this.skipper = skipper;
	}
	/**
	 * @author jmunz
	 * @param aAbandone the aAbandone to set
	 */
	public void setaAbandone(boolean aAbandone) {
		this.aAbandone = aAbandone;
	}
	
	

}
