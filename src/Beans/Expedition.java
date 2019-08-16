/**
 * 
 */
package Beans;

import java.util.Date;

/**
 * @author lina RADI
 *
 */

//CETTE CLASSE REPRENSTE L'EXPEDITION D'UN OUVRAGE VERS UN AUTEUR 
public class Expedition {

	//EXP=EXPedition
	private int exp_id;//l'identifiant de l'expedition 
	private int exp_prj_id;//l'identifiant du projet 
	private int exp_tie_id;//l'identifiant du tier 
	private int exp_pet_id; //pet=par expedition type : le type de l'expedition
	private int exp_pdet_id;//pdet=par destinataire type: le type du destinataire
	private int exp_preAchat;//le nombre d'ouvrage pre-achetés
	private String exp_referenceExp;//la reference de l'expedition 
	private Date exp_date_envoi;//la date d'envoi de l'expédition 
	
	
	public Expedition(int exp_id, int exp_prj_id, int exp_tie_id, int exp_pet_id, int exp_pdet_id, int exp_preAchat,
			String exp_referenceExp, Date exp_date_envoi) {
		super();
		this.exp_id = exp_id;
		this.exp_prj_id = exp_prj_id;
		this.exp_tie_id = exp_tie_id;
		this.exp_pet_id = exp_pet_id;
		this.exp_pdet_id = exp_pdet_id;
		this.exp_preAchat = exp_preAchat;
		this.exp_referenceExp = exp_referenceExp;
		this.exp_date_envoi = exp_date_envoi;
	}
	
	
	public int getExp_id() {
		return exp_id;
	}
	
	public int getExp_prj_id() {
		return exp_prj_id;
	}
	
	public int getExp_tie_id() {
		return exp_tie_id;
	}
	
	public int getExp_pet_id() {
		return exp_pet_id;
	}
	
	public int getExp_pdet_id() {
		return exp_pdet_id;
	}
	
	public int getExp_preAchat() {
		return exp_preAchat;
	}
	public void setExp_preAchat(int exp_preAchat) {
		this.exp_preAchat = exp_preAchat;
	}
	public String getExp_referenceExp() {
		return exp_referenceExp;
	}
	public void setExp_referenceExp(String exp_referenceExp) {
		this.exp_referenceExp = exp_referenceExp;
	}
	public Date getExp_date_envoi() {
		return exp_date_envoi;
	}
	public void setExp_date_envoi(Date exp_date_envoi) {
		this.exp_date_envoi = exp_date_envoi;
	}
	@Override
	public String toString() {
		return "Expedition [exp_id=" + exp_id + ", exp_prj_id=" + exp_prj_id + ", exp_tie_id=" + exp_tie_id
				+ ", exp_pet_id=" + exp_pet_id + ", exp_pdet_id=" + exp_pdet_id + ", exp_preAchat=" + exp_preAchat
				+ ", exp_referenceExp=" + exp_referenceExp + ", exp_date_envoi=" + exp_date_envoi + "]";
	}
	
	
	
	
	
	
	
	
}
