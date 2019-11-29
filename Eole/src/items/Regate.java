package items;

/**
 * @author BASTIAN
 * @author jmunz
 * @version 1.0
 *
 */
public class Regate {
	private Voilier premier;
	private Voilier dernier;
	private double distance;
	private int nbVoilier;
	/**
	 * @author jmunz
	 * @return the premier
	 */
	public Voilier getPremier() {
		return premier;
	}
	/**
	 * @author jmunz
	 * @param premier the premier to set
	 */
	public void setPremier(Voilier premier) {
		this.premier = premier;
	}
	/**
	 * @author jmunz
	 * @return the dernier
	 */
	public Voilier getDernier() {
		return dernier;
	}
	/**
	 * @author jmunz
	 * @param dernier the dernier to set
	 */
	public void setDernier(Voilier dernier) {
		this.dernier = dernier;
	}
	/**
	 * @author jmunz
	 * @return the distance
	 */
	public double getDistance() {
		return distance;
	}
	/**
	 * @author jmunz
	 * @param nbVoilier the nbVoilier to set
	 */
	public void setNbVoilier(int nbVoilier) {
		this.nbVoilier = nbVoilier;
	}
	
	/**
	 * @author jmunz
	 * @param regarde si la file est vide
	 */
	public boolean estVide() { 
		return (premier == null); 
	}
	/**
	 * @author jmunz
	 * @param ajoute un voilier à la frégate 
	 */
	public void ajoutQueue(Voilier v) {
		Voilier vNouv = new Voilier();
		if(!estVide()) {
			dernier.setSuivant(vNouv);
		}else {
			premier = vNouv;
		}	
		dernier = vNouv;
	}
	/**
	 * @author jmunz
	 * @param supprime le voillier sélectionné
	 */
	public void supprVoilier(Voilier suppr) {
		Voilier v = premier;
		if(!estVide()) {
			if(premier != suppr) {
				while(v.getSuivant() != suppr && v.getSuivant() != dernier) {
					v = v.getSuivant();
				}
				if (v == suppr){
					v.setSuivant(v.getSuivant().getSuivant());
				}
			}else {
			premier = premier.getSuivant();
			}
		}
	}
	/**
	 * @author jmunz
	 * @return une liste avec tous les voiliers
	 */
	public String listerTout() {
		if(!estVide()) {
			String s = premier.toString();
			Voilier v = premier;
			while(v.getSuivant() != null) {
				v = v.getSuivant();
				s = s + "\n" + v.toString();
			}
			return s;
			}else {
				return "Il n'y a pas de voiliers";
			}
	}
	/**
	 * @author jmunz
	 * @param vide la régate de tous ses voiliers
	 */
	public void vider() {
		premier = null;
		dernier = null;
	}
	
	public static void main(String []args) {
		Voilier v1 = new Voilier();
		Voilier v2 = new Voilier();
		Voilier v3 = new Voilier();
		Voilier v4 = new Voilier();
		Voilier v5 = new Voilier();
		Regate r = new Regate();
		r.ajoutQueue(v1);
		r.ajoutQueue(v2);
		r.ajoutQueue(v3);
		r.ajoutQueue(v4);
		r.ajoutQueue(v5);
		r.listerTout();
		r.supprVoilier(v4);
		r.listerTout();
		r.supprVoilier(v1);
		r.listerTout();
		r.supprVoilier(v5);
		r.listerTout();
		r.vider();
		r.listerTout();
	}
	
	
	
	
}
