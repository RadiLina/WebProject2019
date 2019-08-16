/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//LE STATUT DU TIER {EN_MANDAT , EN_FIN_MANDAT...}
public class ParTiersStatut {

	//PTS=Par Tier Statut
	private int pts_id;//l'identifiant 
	private String pts_intitule;//l'ititulé du statut 
	
	
	public ParTiersStatut(int pts_id, String pts_intitule) {
		super();
		this.pts_id = pts_id;
		this.pts_intitule = pts_intitule;
	}
	public int getPts_id() {
		return pts_id;
	}
	
	public String getPts_intitule() {
		return pts_intitule;
	}
	public void setPts_intitule(String pts_intitule) {
		this.pts_intitule = pts_intitule;
	}
	
	
	public String toString() {
		return "ParTiersStatut [pts_id=" + pts_id + ", pts_intitule=" + pts_intitule + "]";
	}
	
	
}
