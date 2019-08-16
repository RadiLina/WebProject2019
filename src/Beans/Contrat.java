/**
 * 
 */
package Beans;

import java.util.Date;


/**
 * @author lina RADI
 *
 */


//REPRENSTE UN CONTTRAT 
public class Contrat {
	public enum statut{envoyee,nonEnvoyee,autre};//une enumeration pour indique le statut du contrat
	
	//CON=CONtrat
	private int con_id;//l'identifiant du contrat
	private int con_prj_id; //l'identifiant du projet
	private int con_tie_id;//l'identifiant du tier(auteur)
	private int con_pct_id;//pct=par contrat type : le type du contrat 
	private int con_pcd_id;//pcd=par contrat droit : reprente les droits financiers 
	private String con_reference;//reference du contrat
	private boolean con_droits;//indique s'il existe des droits finaniciers ou pas 
	private int con_nb_exe_tirage;//le nombre d'exemplaires a tirer 
	private int con_nb_exe_gratuit;//le nombre d'exemplaires gratuits 
	private int con_nb_exe_auteur;//nombre d'exemplaire de l'auteur 
	private int con_nb_exe_sp;//nombre d'exemplaire pour le sp(service de presse)
	private int con_seuil_vente;// le seuil minimum de vente , une fois depassé, donne des droits financiers à l'auteur
	private Date con_date_envoi_sp;// la date d'envoi du service de presse 
	private Date con_date_envoi;//la date d'envoi du contrat
	private Date con_date_reception;//la date de recéption du contrat signé par l'auteur
	private statut con_statut ;//le statut du contrat 
	
	
	
	public Contrat(int con_id, int con_prj_id, int con_tie_id, int con_pct_id, int con_pcd_id, String con_reference,
			boolean con_droits, int con_nb_exe_tirage, int con_nb_exe_gratuit, int con_nb_exe_auteur, int con_nb_exe_sp,
			int con_seuil_vente, Date con_date_envoi_sp, Date con_date_envoi, Date con_date_reception,
			statut con_statut) {
		super();
		this.con_id = con_id;
		this.con_prj_id = con_prj_id;
		this.con_tie_id = con_tie_id;
		this.con_pct_id = con_pct_id;
		this.con_pcd_id = con_pcd_id;
		this.con_reference = con_reference;
		this.con_droits = con_droits;
		this.con_nb_exe_tirage = con_nb_exe_tirage;
		this.con_nb_exe_gratuit = con_nb_exe_gratuit;
		this.con_nb_exe_auteur = con_nb_exe_auteur;
		this.con_nb_exe_sp = con_nb_exe_sp;
		this.con_seuil_vente = con_seuil_vente;
		this.con_date_envoi_sp = con_date_envoi_sp;
		this.con_date_envoi = con_date_envoi;
		this.con_date_reception = con_date_reception;
		this.con_statut = con_statut;
	}



	public int getCon_id() {
		return con_id;
	}





	public int getCon_prj_id() {
		return con_prj_id;
	}




	public int getCon_tie_id() {
		return con_tie_id;
	}




	public int getCon_pct_id() {
		return con_pct_id;
	}




	public int getCon_pcd_id() {
		return con_pcd_id;
	}




	public String getCon_reference() {
		return con_reference;
	}



	public void setCon_reference(String con_reference) {
		this.con_reference = con_reference;
	}



	public boolean isCon_droits() {
		return con_droits;
	}



	public void setCon_droits(boolean con_droits) {
		this.con_droits = con_droits;
	}



	public int getCon_nb_exe_tirage() {
		return con_nb_exe_tirage;
	}



	public void setCon_nb_exe_tirage(int con_nb_exe_tirage) {
		this.con_nb_exe_tirage = con_nb_exe_tirage;
	}



	public int getCon_nb_exe_gratuit() {
		return con_nb_exe_gratuit;
	}



	public void setCon_nb_exe_gratuit(int con_nb_exe_gratuit) {
		this.con_nb_exe_gratuit = con_nb_exe_gratuit;
	}



	public int getCon_nb_exe_auteur() {
		return con_nb_exe_auteur;
	}



	public void setCon_nb_exe_auteur(int con_nb_exe_auteur) {
		this.con_nb_exe_auteur = con_nb_exe_auteur;
	}



	public int getCon_nb_exe_sp() {
		return con_nb_exe_sp;
	}



	public void setCon_nb_exe_sp(int con_nb_exe_sp) {
		this.con_nb_exe_sp = con_nb_exe_sp;
	}



	public int getCon_seuil_vente() {
		return con_seuil_vente;
	}



	public void setCon_seuil_vente(int con_seuil_vente) {
		this.con_seuil_vente = con_seuil_vente;
	}



	public Date getCon_date_envoi_sp() {
		return con_date_envoi_sp;
	}



	public void setCon_date_envoi_sp(Date con_date_envoi_sp) {
		this.con_date_envoi_sp = con_date_envoi_sp;
	}



	public Date getCon_date_envoi() {
		return con_date_envoi;
	}



	public void setCon_date_envoi(Date con_date_envoi) {
		this.con_date_envoi = con_date_envoi;
	}



	public Date getCon_date_reception() {
		return con_date_reception;
	}



	public void setCon_date_reception(Date con_date_reception) {
		this.con_date_reception = con_date_reception;
	}



	public statut getCon_statut() {
		return con_statut;
	}



	public void setCon_statut(statut con_statut) {
		this.con_statut = con_statut;
	}



	@Override
	public String toString() {
		return "Contrat [con_id=" + con_id + ", con_prj_id=" + con_prj_id + ", con_tie_id=" + con_tie_id
				+ ", con_statut=" + con_statut + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
