/**
 * 
 */
package Beans;

/**
 * @author Lina RADI
 *
 */

//LE TYPE DU PROJET {MONOGRAPHIE, TRADUCTION, OUVRAGE_COLLECTIF...}
public class ParProjetType {

	//PPT=Par Projet Type
	private int ppt_id ; //l'identifiant 
	private String ppt_intitule;//l'intitulé du type 
	
	
	public int getPpt_id() {
		return ppt_id;
	}
	
	public String getPpt_intitule() {
		return ppt_intitule;
	}
	public void setPpt_intitule(String ppt_intitule) {
		this.ppt_intitule = ppt_intitule;
	}
	
	
	public String toString() {
		return "ParProjetType [ppt_id=" + ppt_id + ", ppt_intitule=" + ppt_intitule + "]";
	}
	
	
	
	
}
