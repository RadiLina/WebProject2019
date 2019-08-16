/**
 * 
 */
package Beans;

import java.util.Date;

/**
 * @author lina RADI
 *
 */

//COMITE EDITORIAL EST UNE REUNION QUI DESCUTE LA VALIDITE DES PROJETS PROPOSES
public class ComiteEditorial {

	//COR=COmité editoRial
	private int cor_id;//l'identifiant du comité editorial
	private int cor_col_comite_id;//l'identidiant du comité editorial
	private Date cor_date;//la date du comité
	private String cor_commentaire;//commentaire
	
	
	public ComiteEditorial(int cor_id, int cor_col_comite_id, Date cor_date, String cor_commentaire) {
		super();
		this.cor_id = cor_id;
		this.cor_col_comite_id = cor_col_comite_id;
		this.cor_date = cor_date;
		this.cor_commentaire = cor_commentaire;
	}


	public int getCor_id() {
		return cor_id;
	}


	
	public int getCor_col_comite_id() {
		return cor_col_comite_id;
	}


	
	public Date getCor_date() {
		return cor_date;
	}


	public void setCor_date(Date cor_date) {
		this.cor_date = cor_date;
	}


	public String getCor_commentaire() {
		return cor_commentaire;
	}


	public void setCor_commentaire(String cor_commentaire) {
		this.cor_commentaire = cor_commentaire;
	}


	@Override
	public String toString() {
		return "ComiteEditorial [cor_id=" + cor_id + ", cor_col_comite_id=" + cor_col_comite_id + ", cor_date="
				+ cor_date + ", cor_commentaire=" + cor_commentaire + "]";
	}
	
	
	
	
	
}
