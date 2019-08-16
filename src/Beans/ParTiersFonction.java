/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//REPRENSTE LA FONCTION DU TIER {COORDINATEUR, FONDATEUR, DIRECTEUR...ETC}
public class ParTiersFonction {

	//PTF=Par Tiers Fonction
	private int ptf_id ;//l'identifiant 
	private String ptf_intitule;//l'intitulé de la fonction 
	
	public ParTiersFonction(int ptf_id, String ptf_intitule) {
		super();
		this.ptf_id = ptf_id;
		this.ptf_intitule = ptf_intitule;
	}
	
	public int getPtf_id() {
		return ptf_id;
	}

	
	public String getPtf_intitule() {
		return ptf_intitule;
	}
	public void setPtf_intitule(String ptf_intitule) {
		this.ptf_intitule = ptf_intitule;
	}
	@Override
	public String toString() {
		return "ParTiersFonction [ptf_id=" + ptf_id + ", ptf_intitule=" + ptf_intitule + "]";
	}
	
	
}
