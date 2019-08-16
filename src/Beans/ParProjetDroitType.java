/**
 * 
 */
package Beans;
/**
 * @author lina RADI
 *
 */

//CETTE CLASSE REPRESENTE LE TYPE DU DROIT 
public class ParProjetDroitType {

	//PDT=par Projet Droit Type
	private int pdt_id; //l'identifiant 
	private String pdt_intitule;//l'intitulé
	
	public ParProjetDroitType(int pdt_id, String pdt_intitule) {
		super();
		this.pdt_id = pdt_id;
		this.pdt_intitule = pdt_intitule;
	}
	public int getPdt_id() {
		return pdt_id;
	}
	
	public String getPdt_intitule() {
		return pdt_intitule;
	}
	public void setPdt_intitule(String pdt_intitule) {
		this.pdt_intitule = pdt_intitule;
	}
	
	
	public String toString() {
		return "ParProjetDroitType [pdt_id=" + pdt_id + ", pdt_intitule=" + pdt_intitule + "]";
	}
	
	
	
}
