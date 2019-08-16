/**
 * 
 */
package Beans;

import java.util.Date;

/**
 * @author lina RADI
 *
 */

//CETTE CLASSE REPRESENTE LES TIERS (AUTEURS) 
public class Tiers {

	//TIE=Tier 
	private int tie_id; //l'identifiant du tier 
	private int tie_ptt_id; //le type du tier 
	public enum Civilite{Madame,Monsieur};//enumeration pour la civilité
	private Civilite tie_civilite ;//la civilité du tier
	private boolean tie_inactif;//indique si le tier est actif ou pas 
	private String tie_nom;//le nom du tier 
	private String tie_prenom;//le prenom du tier 
	private Date tie_naissance_date;//la date de naissance du tier 
	private String tie_naissance_ville;//la ville de naissance 
	private String tie_complement;//le complement d'adresse 
	private String tie_cp;//le code postal 
	private String tie_ville;//la ville actuelle 
	private String tie_pays;//le pays actuel 
	private String tie_pro_adresse;//l'adresse professionnelle
	private String tie_pro_complement;//le complement d'adresse professionnelle 
	private String tie_pro_cp;//le code postal de l'adresse professionnelle
	private String tie_pro_ville; //la ville de profession 
	private String tie_pro_pays;//le pays de profession 
	private String tie_adresse_l1;//la ligne 1 de l'adresse 
	private String tie_adresse_l2;//la ligne 2 de l'adresse 
	private String tie_adresse_l3;//la ligne 3 de l'adresse 
	private String tie_adresse_l4;//la ligne 4 de l'adresse
	private String tie_telephone;//le numéro de telephone 
	private String tie_email;//l'email du tier 
	private String tie_site_internet;//le site du tier 
	private String tie_blog;//le blog du tier 
	private String tie_profession;// la profession du tier 
	private String tie_etablissement;//l'etablissment de profession 
	private String tie_centre_recherche;//le centre de recherche 
	private String tie_commentaire;//un commentaire sur le tier 
	private String tie_reseaux_sociaux;//les reseaux sociaux du tier 
	private String tie_num_secu;//le numero de sécurité sociale du tier 
	private String tie_code_isni;//le code isni 
	private String tie_orcid; //le code orcid 
	
	
	
	public Tiers(int tie_id, int tie_ptt_id, Civilite tie_civilite, boolean tie_inactif, String tie_nom,
			String tie_prenom, Date tie_naissance_date, String tie_naissance_ville, String tie_complement,
			String tie_cp, String tie_ville, String tie_pays, String tie_pro_adresse, String tie_pro_complement,
			String tie_pro_cp, String tie_pro_ville, String tie_pro_pays, String tie_adresse_l1, String tie_adresse_l2,
			String tie_adresse_l3, String tie_adresse_l4, String tie_telephone, String tie_email,
			String tie_site_internet, String tie_blog, String tie_profession, String tie_etablissement,
			String tie_centre_recherche, String tie_commentaire, String tie_reseaux_sociaux, String tie_num_secu,
			String tie_code_isni, String tie_orcid) {
		super();
		this.tie_id = tie_id;
		this.tie_ptt_id = tie_ptt_id;
		this.tie_civilite = tie_civilite;
		this.tie_inactif = tie_inactif;
		this.tie_nom = tie_nom;
		this.tie_prenom = tie_prenom;
		this.tie_naissance_date = tie_naissance_date;
		this.tie_naissance_ville = tie_naissance_ville;
		this.tie_complement = tie_complement;
		this.tie_cp = tie_cp;
		this.tie_ville = tie_ville;
		this.tie_pays = tie_pays;
		this.tie_pro_adresse = tie_pro_adresse;
		this.tie_pro_complement = tie_pro_complement;
		this.tie_pro_cp = tie_pro_cp;
		this.tie_pro_ville = tie_pro_ville;
		this.tie_pro_pays = tie_pro_pays;
		this.tie_adresse_l1 = tie_adresse_l1;
		this.tie_adresse_l2 = tie_adresse_l2;
		this.tie_adresse_l3 = tie_adresse_l3;
		this.tie_adresse_l4 = tie_adresse_l4;
		this.tie_telephone = tie_telephone;
		this.tie_email = tie_email;
		this.tie_site_internet = tie_site_internet;
		this.tie_blog = tie_blog;
		this.tie_profession = tie_profession;
		this.tie_etablissement = tie_etablissement;
		this.tie_centre_recherche = tie_centre_recherche;
		this.tie_commentaire = tie_commentaire;
		this.tie_reseaux_sociaux = tie_reseaux_sociaux;
		this.tie_num_secu = tie_num_secu;
		this.tie_code_isni = tie_code_isni;
		this.tie_orcid = tie_orcid;
	}

/**
 * Constructeur lors du remplissage de la fiche auteur 
 * @param civilite
 * @param nom
 * @param prenom
 * @param dateDeNaissance
 * @param adresse
 * @param adresse1
 * @param adresse2
 * @param adresse3
 * @param codePostal
 * @param ville
 * @param pays
 * @param numeroTelephone
 * @param securiteSociale
 * @param email
 * @param reseauxSociaux
 */

	public Tiers(String civilite, String nom, String prenom, Date dateDeNaissance, String adresse, String adresse1,
			String adresse2, String adresse3, String codePostal, String ville, String pays, String numeroTelephone,
			String securiteSociale, String email, String reseauxSociaux) {
		// TODO Auto-generated constructor stub
		System.out.println("je suis civilite "+civilite);
		if(civilite.equals("Madame")) {
			tie_civilite = Civilite.Madame;
		}else {
			tie_civilite = Civilite.Monsieur;
		}
		this.tie_nom = nom;
		this.tie_prenom = prenom;
		this.tie_naissance_date = dateDeNaissance;
		this.tie_naissance_ville = ville;
		this.tie_pro_adresse = adresse;
		this.tie_adresse_l1 = adresse1;
		this.tie_adresse_l2 = adresse2;
		this.tie_adresse_l3 = adresse3;
		this.tie_pro_cp = codePostal;
		this.tie_pro_ville = ville;
		this.tie_pro_pays = pays;
		this.tie_telephone = numeroTelephone;
		this.tie_num_secu =securiteSociale ;
		this.tie_email = email;
		this.tie_reseaux_sociaux = reseauxSociaux;
		
		
	}


/**
 * Constructeur pour la creation d'un contributeur pour la generation des contrats
 */
	public Tiers(int idTier,String civilite, String nom, String prenom, String adresse, String complement, String cp,
			String ville, String pays, String adresse_l1, String adresse_l2, String adresse_l3, String adresse_l4) {
		// TODO Auto-generated constructor stub
		this.tie_id = idTier;
		if(civilite.equals("Madame")) {
			tie_civilite = Civilite.Madame;
		}else {
			tie_civilite = Civilite.Monsieur;
		}
		this.tie_nom = nom;
		this.tie_prenom = prenom;
		this.tie_pro_adresse = adresse;
		this.tie_pro_complement = complement;
		this.tie_pro_cp = cp;
		this.tie_pro_ville = ville;
		this.tie_pro_pays = pays;
		this.tie_adresse_l1 = adresse_l1;
		this.tie_adresse_l2 = adresse_l2;
		this.tie_adresse_l3 = adresse_l3;
		this.tie_adresse_l4 = adresse_l4;
		
	}



	public int getTie_id() {
		return tie_id;
	}



	public void setTie_id(int tie_id) {
		this.tie_id = tie_id;
	}



	public int getTie_ptt_id() {
		return tie_ptt_id;
	}



	public void setTie_ptt_id(int tie_ptt_id) {
		this.tie_ptt_id = tie_ptt_id;
	}



	public Civilite getTie_civilite() {
		return tie_civilite;
	}



	public void setTie_civilite(Civilite tie_civilite) {
		this.tie_civilite = tie_civilite;
	}



	public boolean isTie_inactif() {
		return tie_inactif;
	}



	public void setTie_inactif(boolean tie_inactif) {
		this.tie_inactif = tie_inactif;
	}



	public String getTie_nom() {
		return tie_nom;
	}



	public void setTie_nom(String tie_nom) {
		this.tie_nom = tie_nom;
	}



	public String getTie_prenom() {
		return tie_prenom;
	}



	public void setTie_prenom(String tie_prenom) {
		this.tie_prenom = tie_prenom;
	}



	public Date getTie_naissance_date() {
		return tie_naissance_date;
	}



	public void setTie_naissance_date(Date tie_naissance_date) {
		this.tie_naissance_date = tie_naissance_date;
	}



	public String getTie_naissance_ville() {
		return tie_naissance_ville;
	}



	public void setTie_naissance_ville(String tie_naissance_ville) {
		this.tie_naissance_ville = tie_naissance_ville;
	}



	public String getTie_complement() {
		return tie_complement;
	}



	public void setTie_complement(String tie_complement) {
		this.tie_complement = tie_complement;
	}



	public String getTie_cp() {
		return tie_cp;
	}



	public void setTie_cp(String tie_cp) {
		this.tie_cp = tie_cp;
	}



	public String getTie_ville() {
		return tie_ville;
	}



	public void setTie_ville(String tie_ville) {
		this.tie_ville = tie_ville;
	}



	public String getTie_pays() {
		return tie_pays;
	}



	public void setTie_pays(String tie_pays) {
		this.tie_pays = tie_pays;
	}



	public String getTie_pro_adresse() {
		return tie_pro_adresse;
	}



	public void setTie_pro_adresse(String tie_pro_adresse) {
		this.tie_pro_adresse = tie_pro_adresse;
	}



	public String getTie_pro_complement() {
		return tie_pro_complement;
	}



	public void setTie_pro_complement(String tie_pro_complement) {
		this.tie_pro_complement = tie_pro_complement;
	}



	public String getTie_pro_cp() {
		return tie_pro_cp;
	}



	public void setTie_pro_cp(String tie_pro_cp) {
		this.tie_pro_cp = tie_pro_cp;
	}



	public String getTie_pro_ville() {
		return tie_pro_ville;
	}



	public void setTie_pro_ville(String tie_pro_ville) {
		this.tie_pro_ville = tie_pro_ville;
	}



	public String getTie_pro_pays() {
		return tie_pro_pays;
	}



	public void setTie_pro_pays(String tie_pro_pays) {
		this.tie_pro_pays = tie_pro_pays;
	}



	public String getTie_adresse_l1() {
		return tie_adresse_l1;
	}



	public void setTie_adresse_l1(String tie_adresse_l1) {
		this.tie_adresse_l1 = tie_adresse_l1;
	}



	public String getTie_adresse_l2() {
		return tie_adresse_l2;
	}



	public void setTie_adresse_l2(String tie_adresse_l2) {
		this.tie_adresse_l2 = tie_adresse_l2;
	}



	public String getTie_adresse_l3() {
		return tie_adresse_l3;
	}



	public void setTie_adresse_l3(String tie_adresse_l3) {
		this.tie_adresse_l3 = tie_adresse_l3;
	}



	public String getTie_adresse_l4() {
		return tie_adresse_l4;
	}



	public void setTie_adresse_l4(String tie_adresse_l4) {
		this.tie_adresse_l4 = tie_adresse_l4;
	}



	public String getTie_telephone() {
		return tie_telephone;
	}



	public void setTie_telephone(String tie_telephone) {
		this.tie_telephone = tie_telephone;
	}



	public String getTie_email() {
		return tie_email;
	}



	public void setTie_email(String tie_email) {
		this.tie_email = tie_email;
	}



	public String getTie_site_internet() {
		return tie_site_internet;
	}



	public void setTie_site_internet(String tie_site_internet) {
		this.tie_site_internet = tie_site_internet;
	}



	public String getTie_blog() {
		return tie_blog;
	}



	public void setTie_blog(String tie_blog) {
		this.tie_blog = tie_blog;
	}



	public String getTie_profession() {
		return tie_profession;
	}



	public void setTie_profession(String tie_profession) {
		this.tie_profession = tie_profession;
	}



	public String getTie_etablissement() {
		return tie_etablissement;
	}



	public void setTie_etablissement(String tie_etablissement) {
		this.tie_etablissement = tie_etablissement;
	}



	public String getTie_centre_recherche() {
		return tie_centre_recherche;
	}



	public void setTie_centre_recherche(String tie_centre_recherche) {
		this.tie_centre_recherche = tie_centre_recherche;
	}



	public String getTie_commentaire() {
		return tie_commentaire;
	}



	public void setTie_commentaire(String tie_commentaire) {
		this.tie_commentaire = tie_commentaire;
	}



	public String getTie_reseaux_sociaux() {
		return tie_reseaux_sociaux;
	}



	public void setTie_reseaux_sociaux(String tie_reseaux_sociaux) {
		this.tie_reseaux_sociaux = tie_reseaux_sociaux;
	}



	public String getTie_num_secu() {
		return tie_num_secu;
	}



	public void setTie_num_secu(String tie_num_secu) {
		this.tie_num_secu = tie_num_secu;
	}



	public String getTie_code_isni() {
		return tie_code_isni;
	}



	public void setTie_code_isni(String tie_code_isni) {
		this.tie_code_isni = tie_code_isni;
	}



	public String getTie_orcid() {
		return tie_orcid;
	}



	public void setTie_orcid(String tie_orcid) {
		this.tie_orcid = tie_orcid;
	}



	@Override
	public String toString() {
		return "tiers [tie_id=" + tie_id + ", tie_civilite=" + tie_civilite + ", tie_nom=" + tie_nom + ", tie_prenom="
				+ tie_prenom + "]";
	}
	
	
	
	
}
