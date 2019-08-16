/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//CETTE CLASSE REPRESENTE LES TIERS QUI CONTRIBUENT DANS UN MEME OUVRAGE 
public class ProjetTiers {

	//PAU=Projet Tiers
	private int pau_prj_id;//l'identifiant du projet
	private int pau_tie_id;//l'identifiant du tier (auteur)
	private int pau_ppat_id;//le type de l'auteur 
	private boolean pau_principal;//indique si le contributeur est un auteur pricipal en meme temps ou pas
	private String pau_titre_contrib;//le titre de contribution 
	private String pau_resume_fr;//le résumé en français 
	private String pau_resume_en;//le résumé en anglais 
	
	
	public ProjetTiers(int pau_prj_id, int pau_tie_id, int pau_ppat_id, boolean pau_principal, String pau_titre_contrib,
			String pau_resume_fr, String pau_resume_en) {
		super();
		this.pau_prj_id = pau_prj_id;
		this.pau_tie_id = pau_tie_id;
		this.pau_ppat_id = pau_ppat_id;
		this.pau_principal = pau_principal;
		this.pau_titre_contrib = pau_titre_contrib;
		this.pau_resume_fr = pau_resume_fr;
		this.pau_resume_en = pau_resume_en;
	}


	public ProjetTiers(int idProjet, int idTier, String titreContrib) {
		this.pau_prj_id = idProjet;
		this.pau_tie_id = idTier;
		this.pau_titre_contrib = titreContrib;
	}


	public int getPau_prj_id() {
		return pau_prj_id;
	}


	
	public int getPau_tie_id() {
		return pau_tie_id;
	}



	public int getPau_ppat_id() {
		return pau_ppat_id;
	}


	
	public boolean isPau_principal() {
		return pau_principal;
	}


	public void setPau_principal(boolean pau_principal) {
		this.pau_principal = pau_principal;
	}


	public String getPau_titre_contrib() {
		return pau_titre_contrib;
	}


	public void setPau_titre_contrib(String pau_titre_contrib) {
		this.pau_titre_contrib = pau_titre_contrib;
	}


	public String getPau_resume_fr() {
		return pau_resume_fr;
	}


	public void setPau_resume_fr(String pau_resume_fr) {
		this.pau_resume_fr = pau_resume_fr;
	}


	public String getPau_resume_en() {
		return pau_resume_en;
	}


	public void setPau_resume_en(String pau_resume_en) {
		this.pau_resume_en = pau_resume_en;
	}


	@Override
	public String toString() {
		return "ProjetTiers [pau_prj_id=" + pau_prj_id + ", pau_tie_id=" + pau_tie_id + ", pau_ppat_id=" + pau_ppat_id
				+ ", pau_principal=" + pau_principal + ", pau_titre_contrib=" + pau_titre_contrib + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
