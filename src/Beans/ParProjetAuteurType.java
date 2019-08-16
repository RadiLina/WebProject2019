/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//REPRENSTE LE TYPE DE L'AUTEUR DANS UN OUVRAGE {AUTEUR , CONTRIBUTEUR , TRADUCTEUR ...}
public class ParProjetAuteurType {

	//PPAT=Par Projet Auteur Type 
	private int ppat_id;//l'identifiant
	private String ppat_intitule;//l'ititulé 
	
	public ParProjetAuteurType(int ppat_id, String ppat_intitule) {
		super();
		this.ppat_id = ppat_id;
		this.ppat_intitule = ppat_intitule;
	}
	public int getPpat_id() {
		return ppat_id;
	}
	
	public String getPpat_intitule() {
		return ppat_intitule;
	}
	public void setPpat_intitule(String ppat_intitule) {
		this.ppat_intitule = ppat_intitule;
	}
	@Override
	public String toString() {
		return "ParProjetAuteurType [ppat_id=" + ppat_id + ", ppat_intitule=" + ppat_intitule + "]";
	}
	
	
}
