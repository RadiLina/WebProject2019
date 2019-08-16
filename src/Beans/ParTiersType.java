/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//INDIQUE LE TYPE DU TIER {CENTRE_DE_RECHERCHE, UNIVERSITE...ETC}
public class ParTiersType {

	//PTT=Par Tiers Type 
	private int ptt_id;//l'identifiant
	private String ptt_intitule; //l'intitulé du type 
	
	
	
	public ParTiersType(int ptt_id, String ptt_intitule) {
		super();
		this.ptt_id = ptt_id;
		this.ptt_intitule = ptt_intitule;
	}


	public int getPtt_id() {
		return ptt_id;
	}



	public String getPtt_intitule() {
		return ptt_intitule;
	}


	public void setPtt_intitule(String ptt_intitule) {
		this.ptt_intitule = ptt_intitule;
	}


	@Override
	public String toString() {
		return "ParTiersType [ptt_id=" + ptt_id + ", ptt_intitule=" + ptt_intitule + "]";
	}
	
	
	
	
	
}
