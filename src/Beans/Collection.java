package Beans;

/**
 * 
 */


/**
 * @author lina RADI
 *
 */

//CETTE CLASSE REPRESENTE LES COLLECTIONS DANS LEQUELS APPARTIENT UN OUVRAGE (une collection est aussi un comité)
public class Collection {

	//COL=COLlection
	private int col_id;//l'identifiant de la collection
	private int col_parent_id;//l'identifiant de la comité
	private int col_pcp_id;//pcp=par collection presentation
	private int col_ptv_id;//ptv=par code TVA
	private int col_pcc_id;//pcc=par classification CLIL
	private String col_titre; //le titre de la collection
	private String col_titre_ancien;//l'ancien titre de la collection
	private String col_titre_autre;
	private String col_issn; //code issn 
	private String col_sodis;//code sodis
	private int col_stock_mini;//le stock 
	private int col_seuil_non_facturation;//le seuil de non facturation
	private String col_presentation;
	private int col_faculte_retour;
	private int col_traitement_retour;
	private String col_indent;
	private String col_path;
	private String ft_text;
	public Collection(int col_id, int col_parent_id, int col_pcp_id, int col_ptv_id, int col_pcc_id, String col_titre,
			String col_titre_ancien, String col_titre_autre, String col_issn, String col_sodis, int col_stock_mini,
			int col_seuil_non_facturation, String col_presentation, int col_faculte_retour, int col_traitement_retour,
			String col_indent, String col_path, String ft_text) {
		super();
		this.col_id = col_id;
		this.col_parent_id = col_parent_id;
		this.col_pcp_id = col_pcp_id;
		this.col_ptv_id = col_ptv_id;
		this.col_pcc_id = col_pcc_id;
		this.col_titre = col_titre;
		this.col_titre_ancien = col_titre_ancien;
		this.col_titre_autre = col_titre_autre;
		this.col_issn = col_issn;
		this.col_sodis = col_sodis;
		this.col_stock_mini = col_stock_mini;
		this.col_seuil_non_facturation = col_seuil_non_facturation;
		this.col_presentation = col_presentation;
		this.col_faculte_retour = col_faculte_retour;
		this.col_traitement_retour = col_traitement_retour;
		this.col_indent = col_indent;
		this.col_path = col_path;
		this.ft_text = ft_text;
	}
	public int getCol_id() {
		return col_id;
	}
	
	public int getCol_parent_id() {
		return col_parent_id;
	}
	
	public int getCol_pcp_id() {
		return col_pcp_id;
	}
	
	public int getCol_ptv_id() {
		return col_ptv_id;
	}
	
	public int getCol_pcc_id() {
		return col_pcc_id;
	}
	
	public String getCol_titre() {
		return col_titre;
	}
	public void setCol_titre(String col_titre) {
		this.col_titre = col_titre;
	}
	public String getCol_titre_ancien() {
		return col_titre_ancien;
	}
	public void setCol_titre_ancien(String col_titre_ancien) {
		this.col_titre_ancien = col_titre_ancien;
	}
	public String getCol_titre_autre() {
		return col_titre_autre;
	}
	public void setCol_titre_autre(String col_titre_autre) {
		this.col_titre_autre = col_titre_autre;
	}
	public String getCol_issn() {
		return col_issn;
	}
	public void setCol_issn(String col_issn) {
		this.col_issn = col_issn;
	}
	public String getCol_sodis() {
		return col_sodis;
	}
	public void setCol_sodis(String col_sodis) {
		this.col_sodis = col_sodis;
	}
	public int getCol_stock_mini() {
		return col_stock_mini;
	}
	public void setCol_stock_mini(int col_stock_mini) {
		this.col_stock_mini = col_stock_mini;
	}
	public int getCol_seuil_non_facturation() {
		return col_seuil_non_facturation;
	}
	public void setCol_seuil_non_facturation(int col_seuil_non_facturation) {
		this.col_seuil_non_facturation = col_seuil_non_facturation;
	}
	public String getCol_presentation() {
		return col_presentation;
	}
	public void setCol_presentation(String col_presentation) {
		this.col_presentation = col_presentation;
	}
	public int getCol_faculte_retour() {
		return col_faculte_retour;
	}
	public void setCol_faculte_retour(int col_faculte_retour) {
		this.col_faculte_retour = col_faculte_retour;
	}
	public int getCol_traitement_retour() {
		return col_traitement_retour;
	}
	public void setCol_traitement_retour(int col_traitement_retour) {
		this.col_traitement_retour = col_traitement_retour;
	}
	public String getCol_indent() {
		return col_indent;
	}
	public void setCol_indent(String col_indent) {
		this.col_indent = col_indent;
	}
	public String getCol_path() {
		return col_path;
	}
	public void setCol_path(String col_path) {
		this.col_path = col_path;
	}
	public String getFt_text() {
		return ft_text;
	}
	public void setFt_text(String ft_text) {
		this.ft_text = ft_text;
	}
	
	
	@Override
	public String toString() {
		return "Collection [col_id=" + col_id + ", col_parent_id=" + col_parent_id + ", col_pcp_id=" + col_pcp_id
				+ ", col_ptv_id=" + col_ptv_id + ", col_pcc_id=" + col_pcc_id + ", col_titre=" + col_titre
				+ ", col_presentation=" + col_presentation + "]";
	}
	
	
	
	
}
