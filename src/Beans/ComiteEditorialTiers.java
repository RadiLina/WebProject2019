/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//LES TIERS QUI ONT ASSISTE A UN COMITE EDITORIAL AVEC LEURS PROFFESSIONS
public class ComiteEditorialTiers {

	//COR=COmité editorial Tiers
	private int crt_cor_id;//l'identifiant 
	private int crt_tie_id; //l'identifiant du tier
	private int crt_ptf_id; // ptf=par tier fonction : l'identifiant indiquant la profession du tier
	private boolean crt_rapporteur;
	private boolean crt_present; //indique si le tier etait present ou pas dans ce comité 
	private boolean crt_excuse;
	
	
	
	public ComiteEditorialTiers(int crt_cor_id, int crt_tie_id, int crt_ptf_id, boolean crt_rapporteur,
			boolean crt_present, boolean crt_excuse) {
		super();
		this.crt_cor_id = crt_cor_id;
		this.crt_tie_id = crt_tie_id;
		this.crt_ptf_id = crt_ptf_id;
		this.crt_rapporteur = crt_rapporteur;
		this.crt_present = crt_present;
		this.crt_excuse = crt_excuse;
	}
	public int getCrt_cor_id() {
		return crt_cor_id;
	}
	
	public int getCrt_tie_id() {
		return crt_tie_id;
	}
	
	public int getCrt_ptf_id() {
		return crt_ptf_id;
	}
	
	public boolean isCrt_rapporteur() {
		return crt_rapporteur;
	}
	public void setCrt_rapporteur(boolean crt_rapporteur) {
		this.crt_rapporteur = crt_rapporteur;
	}
	public boolean isCrt_present() {
		return crt_present;
	}
	public void setCrt_present(boolean crt_present) {
		this.crt_present = crt_present;
	}
	public boolean isCrt_excuse() {
		return crt_excuse;
	}
	public void setCrt_excuse(boolean crt_excuse) {
		this.crt_excuse = crt_excuse;
	}
	
	
	
	@Override
	public String toString() {
		return "ComiteEditorialTiers [crt_cor_id=" + crt_cor_id + ", crt_tie_id=" + crt_tie_id + ", crt_ptf_id="
				+ crt_ptf_id + ", crt_rapporteur=" + crt_rapporteur + ", crt_present=" + crt_present + ", crt_excuse="
				+ crt_excuse + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
