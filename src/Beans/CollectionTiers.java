package Beans;

/**
 * 
 */

import java.util.Date;

/**
 * @author lina RADI
 *
 */
//CETTE CLASSE REPRESENTE L'ASSOCIATION ENTRE LES COLLECTIONS ET LES TIERS(AUTEURS)
public class CollectionTiers {

	//CT=Collection Tiers
	private int ct_col_id;//l'identifiant de la collection
	private int ct_tie_id;//l'identifiant du tier
	private int ct_ptf_id;//ptf= par tier fonction ,l'id de la fonction de ce tier
	private int ct_pts_id;//pts=par tier statut , l'id du statut de ce tier
	private Date ct_date_arrivee;//la date d'arrivée de ce tier à cette collection
	private Date ct_date_premiere_nom;
	private Date ct_date_fin_mandat;//date du fin du mandat
	
	
	public CollectionTiers(int ct_col_id, int ct_tie_id, int ct_ptf_id, int ct_pts_id, Date ct_date_arrivee,
			Date ct_date_premiere_nom, Date ct_date_fin_mandat) {
		super();
		this.ct_col_id = ct_col_id;
		this.ct_tie_id = ct_tie_id;
		this.ct_ptf_id = ct_ptf_id;
		this.ct_pts_id = ct_pts_id;
		this.ct_date_arrivee = ct_date_arrivee;
		this.ct_date_premiere_nom = ct_date_premiere_nom;
		this.ct_date_fin_mandat = ct_date_fin_mandat;
	}
	public int getCt_col_id() {
		return ct_col_id;
	}
	
	public int getCt_tie_id() {
		return ct_tie_id;
	}
	
	public int getCt_ptf_id() {
		return ct_ptf_id;
	}
	
	public int getCt_pts_id() {
		return ct_pts_id;
	}
	
	public Date getCt_date_arrivee() {
		return ct_date_arrivee;
	}
	public void setCt_date_arrivee(Date ct_date_arrivee) {
		this.ct_date_arrivee = ct_date_arrivee;
	}
	public Date getCt_date_premiere_nom() {
		return ct_date_premiere_nom;
	}
	public void setCt_date_premiere_nom(Date ct_date_premiere_nom) {
		this.ct_date_premiere_nom = ct_date_premiere_nom;
	}
	public Date getCt_date_fin_mandat() {
		return ct_date_fin_mandat;
	}
	public void setCt_date_fin_mandat(Date ct_date_fin_mandat) {
		this.ct_date_fin_mandat = ct_date_fin_mandat;
	}
	
	
	
	@Override
	public String toString() {
		return "CollectionTiers [ct_col_id=" + ct_col_id + ", ct_tie_id=" + ct_tie_id + ", ct_ptf_id=" + ct_ptf_id
				+ ", ct_pts_id=" + ct_pts_id + ", ct_date_arrivee=" + ct_date_arrivee + ", ct_date_premiere_nom="
				+ ct_date_premiere_nom + ", ct_date_fin_mandat=" + ct_date_fin_mandat + "]";
	}
	
	
	
	
}
