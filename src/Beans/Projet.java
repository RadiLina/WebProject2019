/**
 * 
 */
package Beans;

import java.util.Date;

/**
 * @author lina RADI
 *
 */

//CECI REPRESENTE TOUT PROJET PRESENTÉ A LA MAISON D'EDITION 
public class Projet {

	//PRJ=Projet
	private int prj_id;//l'identifiant du projet  
	private int prj_ppt_id; //l'identifiant pour le type du projet
	private int prj_ppo_id;//l'identifiant qui indique l'origine du projet
	private int prj_col_comite_id; //l'identifiant du comité 
	private int prj_col_id;//l'identifiant de la collection 
	private int prj_pca_id; //l'identifiant de la classification afpu
	private int prj_pcas_id;//l'identifiant du comité editorial avis statut
	private String prj_num_projet;//le numero du projet 
	private String prj_num_septentrion;//le nemuro septentrion ou le code interne
	private String prj_titre;//le titre du projet (ouvrage)
	private String prj_soustitre;//le soustitre du projet (ouvrage)
	private int prj_nb_signe;//le nombre de signe 
	private boolean prj_caracteres_speciaux;//le nombre de caracteres speciaux  
	private boolean prj_graph;
	private int prj_graph_nb;
	private boolean prj_photo;
	private int prj_photo_nb;
	private Date prj_date_manuscrit;//la date du reçu du manuscrit du projet
	private Date prj_date_creation;//la date de creation du projet 
	private Date prj_date_programmation;//la date de programmation du projet 
	private Date prj_date_parution;//la date de parution de l'ouvrage 
	private Date prj_date_passage_ca;//la date de passage en conseil d’administration
	private String prj_provenance;//l'origine de l'ouvrage 
	private String prj_commentaire_manuscrit;//un commentaire sur le manuscrit 
	private String prj_subvention_soutien;
	//cette partie concerne le coté commercial
	private String prj_commerce_sujet;
	private String prj_commerce_4_couverture_rtf;
	private String prj_commerce_flyer_rtf;
	private String prj_commerce_tags;
	private String prj_commerce_rayon;
	private String prj_commerce_public;
	private String prj_commerce_concurrence;
	private String prj_commerce_placement;
	private String prj_commerce_promotion;
	private String prj_commerce_complement;
	private String prj_commerce_commentaire;
	//cette partie concerne la forme de l'ouvrage 
	private String prj_ouvrage_format;
	private String prj_ouvrage_code_sodis;
	private String prj_ouvrage_isbn;
	private String prj_ouvrage_ean;
	private float prj_ouvrage_prix_ttc; //le prix de l'ouvrage 
	private int prj_ouvrage_tirage;
	private int prj_ouvrage_nb_pages;//le nombre de pages 
	private Date prj_ouvrage_date_parution; //la date de parution de l'ouvrage
	private int prj_ouvrage_poids;//le poids de l'ouvrage
	private String ft_text;
	private boolean prj_default_arbo_created;
	private String prj_auteur_principal;//l'auteur principal de l'ouvrage / directeur d'ouvrage
	private String prj_titre_rtf;
	private String prj_titre_html;
	private String prj_ouvrage_ean_police;
	private String prj_ouvrage_retirage;
	private int prj_ouvrage_tirage_ini;
	
	
	public Projet(int prj_id, int prj_ppt_id, int prj_ppo_id, int prj_col_comite_id, int prj_col_id, int prj_pca_id,
			int prj_pcas_id, String prj_num_projet, String prj_num_septentrion, String prj_titre,
			Date prj_date_programmation, Date prj_date_parution) {
		super();
		this.prj_id = prj_id;
		this.prj_ppt_id = prj_ppt_id;
		this.prj_ppo_id = prj_ppo_id;
		this.prj_col_comite_id = prj_col_comite_id;
		this.prj_col_id = prj_col_id;
		this.prj_pca_id = prj_pca_id;
		this.prj_pcas_id = prj_pcas_id;
		this.prj_num_projet = prj_num_projet;
		this.prj_num_septentrion = prj_num_septentrion;
		this.prj_titre = prj_titre;
		this.prj_date_programmation = prj_date_programmation;
		this.prj_date_parution = prj_date_parution;
	}


	

	public Projet(String int2, String int3, String string, Date date, String string2, Date date2) {
		
		this.prj_num_projet = int2;
		this.prj_num_septentrion = int3;
		this.prj_titre = string;
		this.prj_date_programmation = date;
		this.prj_auteur_principal =string2;
		this.prj_date_parution=date2;
	}




	public Projet(int idProjet) {
		// TODO Auto-generated constructor stub
		this.prj_id = idProjet;
	}


	/*
	 * public Projet(String codeInterne, int idProjet, int ppt, String titre, String
	 * auteurPricipal) { this.prj_id = idProjet; this.prj_num_septentrion =
	 * codeInterne; this.prj_ppt_id = ppt; this.prj_titre = titre;
	 * this.prj_auteur_principal=auteurPricipal; }
	 */

/**
 * Constructeur pour la creation d'un nouvel ouvrage 
 * @param numeroProjet
 * @param codeInterne
 * @param titre
 * @param sousTitre
 * @param dateCreation
 * @param dateProgrammation
 * @param dateParution
 * @param auteur
 */
	public Projet(String numeroProjet, String codeInterne, String titre, String sousTitre, Date dateCreation,
			Date dateProgrammation, Date dateParution, String auteur) {
	// TODO Auto-generated constructor stub
		
		this.prj_num_projet = numeroProjet;
		this.prj_num_septentrion = codeInterne;
		this.prj_titre = titre;
		this.prj_soustitre=sousTitre;
		this.prj_date_creation=dateCreation;
		this.prj_date_programmation = dateProgrammation;
		this.prj_date_parution = dateParution;
		this.prj_auteur_principal=auteur;
		
}



/**
 * Constructeur pour la creation d'un ouvrage 
 * @param idProjet : l'identifiant du projet
 * @param numeroProjet : le numero du projet
 * @param codeInterne : le code interne
 * @param parProjetType : le type du projet
 * @param titre : le titre du projet
 * @param auteur : l'auteur pricipal du projet
 * @param date : la date de parution de l'ouvrage
 */
	public Projet(int idProjet, String numeroProjet, String codeInterne, int parProjetType, String titre, String auteur, Date dateParution) {
		this.prj_id = idProjet;
		this.prj_num_projet = numeroProjet;
		this.prj_num_septentrion = codeInterne;
		this.prj_ppt_id = parProjetType;
		this.prj_titre = titre;
		this.prj_auteur_principal=auteur;
		this.prj_date_parution = dateParution;
}




	public int getPrj_id() {
		return prj_id;
	}



	public int getPrj_ppt_id() {
		return prj_ppt_id;
	}


	public int getPrj_ppo_id() {
		return prj_ppo_id;
	}


	public int getPrj_col_comite_id() {
		return prj_col_comite_id;
	}


	
	public int getPrj_col_id() {
		return prj_col_id;
	}




	public int getPrj_pca_id() {
		return prj_pca_id;
	}


	
	public int getPrj_pcas_id() {
		return prj_pcas_id;
	}


	
	public String getPrj_num_projet() {
		return prj_num_projet;
	}


	public void setPrj_num_projet(String prj_num_projet) {
		this.prj_num_projet = prj_num_projet;
	}


	public String getPrj_num_septentrion() {
		return prj_num_septentrion;
	}


	public void setPrj_num_septentrion(String prj_num_septentrion) {
		this.prj_num_septentrion = prj_num_septentrion;
	}


	public String getPrj_titre() {
		return prj_titre;
	}


	public void setPrj_titre(String prj_titre) {
		this.prj_titre = prj_titre;
	}


	public String getPrj_soustitre() {
		return prj_soustitre;
	}


	public void setPrj_soustitre(String prj_soustitre) {
		this.prj_soustitre = prj_soustitre;
	}


	public int getPrj_nb_signe() {
		return prj_nb_signe;
	}


	public void setPrj_nb_signe(int prj_nb_signe) {
		this.prj_nb_signe = prj_nb_signe;
	}


	public boolean isPrj_caracteres_speciaux() {
		return prj_caracteres_speciaux;
	}


	public void setPrj_caracteres_speciaux(boolean prj_caracteres_speciaux) {
		this.prj_caracteres_speciaux = prj_caracteres_speciaux;
	}


	public boolean isPrj_graph() {
		return prj_graph;
	}


	public void setPrj_graph(boolean prj_graph) {
		this.prj_graph = prj_graph;
	}


	public int getPrj_graph_nb() {
		return prj_graph_nb;
	}


	public void setPrj_graph_nb(int prj_graph_nb) {
		this.prj_graph_nb = prj_graph_nb;
	}


	public boolean isPrj_photo() {
		return prj_photo;
	}


	public void setPrj_photo(boolean prj_photo) {
		this.prj_photo = prj_photo;
	}


	public int getPrj_photo_nb() {
		return prj_photo_nb;
	}


	public void setPrj_photo_nb(int prj_photo_nb) {
		this.prj_photo_nb = prj_photo_nb;
	}


	public Date getPrj_date_manuscrit() {
		return prj_date_manuscrit;
	}


	public void setPrj_date_manuscrit(Date prj_date_manuscrit) {
		this.prj_date_manuscrit = prj_date_manuscrit;
	}


	public Date getPrj_date_creation() {
		return prj_date_creation;
	}


	public void setPrj_date_creation(Date prj_date_creation) {
		this.prj_date_creation = prj_date_creation;
	}


	public Date getPrj_date_programmation() {
		return prj_date_programmation;
	}


	public void setPrj_date_programmation(Date prj_date_programmation) {
		this.prj_date_programmation = prj_date_programmation;
	}


	public Date getPrj_date_parution() {
		return prj_date_parution;
	}


	public void setPrj_date_parution(Date prj_date_parution) {
		this.prj_date_parution = prj_date_parution;
	}


	public Date getPrj_date_passage_ca() {
		return prj_date_passage_ca;
	}


	public void setPrj_date_passage_ca(Date prj_date_passage_ca) {
		this.prj_date_passage_ca = prj_date_passage_ca;
	}


	public String getPrj_provenance() {
		return prj_provenance;
	}


	public void setPrj_provenance(String prj_provenance) {
		this.prj_provenance = prj_provenance;
	}


	public String getPrj_commentaire_manuscrit() {
		return prj_commentaire_manuscrit;
	}


	public void setPrj_commentaire_manuscrit(String prj_commentaire_manuscrit) {
		this.prj_commentaire_manuscrit = prj_commentaire_manuscrit;
	}


	public String getPrj_subvention_soutien() {
		return prj_subvention_soutien;
	}


	public void setPrj_subvention_soutien(String prj_subvention_soutien) {
		this.prj_subvention_soutien = prj_subvention_soutien;
	}


	public String getPrj_commerce_sujet() {
		return prj_commerce_sujet;
	}


	public void setPrj_commerce_sujet(String prj_commerce_sujet) {
		this.prj_commerce_sujet = prj_commerce_sujet;
	}


	public String getPrj_commerce_4_couverture_rtf() {
		return prj_commerce_4_couverture_rtf;
	}


	public void setPrj_commerce_4_couverture_rtf(String prj_commerce_4_couverture_rtf) {
		this.prj_commerce_4_couverture_rtf = prj_commerce_4_couverture_rtf;
	}


	public String getPrj_commerce_flyer_rtf() {
		return prj_commerce_flyer_rtf;
	}


	public void setPrj_commerce_flyer_rtf(String prj_commerce_flyer_rtf) {
		this.prj_commerce_flyer_rtf = prj_commerce_flyer_rtf;
	}


	public String getPrj_commerce_tags() {
		return prj_commerce_tags;
	}


	public void setPrj_commerce_tags(String prj_commerce_tags) {
		this.prj_commerce_tags = prj_commerce_tags;
	}


	public String getPrj_commerce_rayon() {
		return prj_commerce_rayon;
	}


	public void setPrj_commerce_rayon(String prj_commerce_rayon) {
		this.prj_commerce_rayon = prj_commerce_rayon;
	}


	public String getPrj_commerce_public() {
		return prj_commerce_public;
	}


	public void setPrj_commerce_public(String prj_commerce_public) {
		this.prj_commerce_public = prj_commerce_public;
	}


	public String getPrj_commerce_concurrence() {
		return prj_commerce_concurrence;
	}


	public void setPrj_commerce_concurrence(String prj_commerce_concurrence) {
		this.prj_commerce_concurrence = prj_commerce_concurrence;
	}


	public String getPrj_commerce_placement() {
		return prj_commerce_placement;
	}


	public void setPrj_commerce_placement(String prj_commerce_placement) {
		this.prj_commerce_placement = prj_commerce_placement;
	}


	public String getPrj_commerce_promotion() {
		return prj_commerce_promotion;
	}


	public void setPrj_commerce_promotion(String prj_commerce_promotion) {
		this.prj_commerce_promotion = prj_commerce_promotion;
	}


	public String getPrj_commerce_complement() {
		return prj_commerce_complement;
	}


	public void setPrj_commerce_complement(String prj_commerce_complement) {
		this.prj_commerce_complement = prj_commerce_complement;
	}


	public String getPrj_commerce_commentaire() {
		return prj_commerce_commentaire;
	}


	public void setPrj_commerce_commentaire(String prj_commerce_commentaire) {
		this.prj_commerce_commentaire = prj_commerce_commentaire;
	}


	public String getPrj_ouvrage_format() {
		return prj_ouvrage_format;
	}


	public void setPrj_ouvrage_format(String prj_ouvrage_format) {
		this.prj_ouvrage_format = prj_ouvrage_format;
	}


	public String getPrj_ouvrage_code_sodis() {
		return prj_ouvrage_code_sodis;
	}


	public void setPrj_ouvrage_code_sodis(String prj_ouvrage_code_sodis) {
		this.prj_ouvrage_code_sodis = prj_ouvrage_code_sodis;
	}


	public String getPrj_ouvrage_isbn() {
		return prj_ouvrage_isbn;
	}


	public void setPrj_ouvrage_isbn(String prj_ouvrage_isbn) {
		this.prj_ouvrage_isbn = prj_ouvrage_isbn;
	}


	public String getPrj_ouvrage_ean() {
		return prj_ouvrage_ean;
	}


	public void setPrj_ouvrage_ean(String prj_ouvrage_ean) {
		this.prj_ouvrage_ean = prj_ouvrage_ean;
	}


	public float getPrj_ouvrage_prix_ttc() {
		return prj_ouvrage_prix_ttc;
	}


	public void setPrj_ouvrage_prix_ttc(float prj_ouvrage_prix_ttc) {
		this.prj_ouvrage_prix_ttc = prj_ouvrage_prix_ttc;
	}


	public int getPrj_ouvrage_tirage() {
		return prj_ouvrage_tirage;
	}


	public void setPrj_ouvrage_tirage(int prj_ouvrage_tirage) {
		this.prj_ouvrage_tirage = prj_ouvrage_tirage;
	}


	public int getPrj_ouvrage_nb_pages() {
		return prj_ouvrage_nb_pages;
	}


	public void setPrj_ouvrage_nb_pages(int prj_ouvrage_nb_pages) {
		this.prj_ouvrage_nb_pages = prj_ouvrage_nb_pages;
	}


	public Date getPrj_ouvrage_date_parution() {
		return prj_ouvrage_date_parution;
	}


	public void setPrj_ouvrage_date_parution(Date prj_ouvrage_date_parution) {
		this.prj_ouvrage_date_parution = prj_ouvrage_date_parution;
	}


	public int getPrj_ouvrage_poids() {
		return prj_ouvrage_poids;
	}


	public void setPrj_ouvrage_poids(int prj_ouvrage_poids) {
		this.prj_ouvrage_poids = prj_ouvrage_poids;
	}


	public String getFt_text() {
		return ft_text;
	}


	public void setFt_text(String ft_text) {
		this.ft_text = ft_text;
	}


	public boolean isPrj_default_arbo_created() {
		return prj_default_arbo_created;
	}


	public void setPrj_default_arbo_created(boolean prj_default_arbo_created) {
		this.prj_default_arbo_created = prj_default_arbo_created;
	}


	public String getPrj_auteur_principal() {
		return prj_auteur_principal;
	}


	public void setPrj_auteur_principal(String prj_auteur_principal) {
		this.prj_auteur_principal = prj_auteur_principal;
	}


	public String getPrj_titre_rtf() {
		return prj_titre_rtf;
	}


	public void setPrj_titre_rtf(String prj_titre_rtf) {
		this.prj_titre_rtf = prj_titre_rtf;
	}


	public String getPrj_titre_html() {
		return prj_titre_html;
	}


	public void setPrj_titre_html(String prj_titre_html) {
		this.prj_titre_html = prj_titre_html;
	}


	public String getPrj_ouvrage_ean_police() {
		return prj_ouvrage_ean_police;
	}


	public void setPrj_ouvrage_ean_police(String prj_ouvrage_ean_police) {
		this.prj_ouvrage_ean_police = prj_ouvrage_ean_police;
	}


	public String getPrj_ouvrage_retirage() {
		return prj_ouvrage_retirage;
	}


	public void setPrj_ouvrage_retirage(String prj_ouvrage_retirage) {
		this.prj_ouvrage_retirage = prj_ouvrage_retirage;
	}


	public int getPrj_ouvrage_tirage_ini() {
		return prj_ouvrage_tirage_ini;
	}


	public void setPrj_ouvrage_tirage_ini(int prj_ouvrage_tirage_ini) {
		this.prj_ouvrage_tirage_ini = prj_ouvrage_tirage_ini;
	}


	@Override
	public String toString() {
		return "Projet [prj_id=" + prj_id + ", prj_num_projet=" + prj_num_projet + ", prj_num_septentrion="
				+ prj_num_septentrion + ", prj_titre=" + prj_titre + "]";
	}
	
	
	
	
}
