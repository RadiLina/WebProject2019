/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//CETTE CLASSE PRESENTE LES IDENTIFIANTS DES COMPTES DES UTILISATEURS DE L'APPLICATION 
public class Utilisateur {

	//UTI=UTIlisateur
	private String uti_email;//l'email de l'utilisateur 
	private String uti_nom; //le nom de l'utilisateur 
	private String uti_prenom; //le prenom de l'utilisateur 
	private String uti_motDePasse;//le mot de passe du compte de l'utilisateur
	
	public Utilisateur(String uti_email, String uti_nom, String uti_prenom, String uti_motDePasse) {
		super();
		this.uti_email = uti_email;
		this.uti_nom = uti_nom;
		this.uti_prenom = uti_prenom;
		this.uti_motDePasse = uti_motDePasse;
	}
	public String getUti_email() {
		return uti_email;
	}
	public void setUti_email(String uti_email) {
		this.uti_email = uti_email;
	}
	public String getUti_nom() {
		return uti_nom;
	}
	public void setUti_nom(String uti_nom) {
		this.uti_nom = uti_nom;
	}
	public String getUti_prenom() {
		return uti_prenom;
	}
	public void setUti_prenom(String uti_prenom) {
		this.uti_prenom = uti_prenom;
	}
	public String getUti_motDePasse() {
		return uti_motDePasse;
	}
	public void setUti_motDePasse(String uti_motDePasse) {
		this.uti_motDePasse = uti_motDePasse;
	}
	
	
	@Override
	public String toString() {
		return "Utilisateur [uti_email=" + uti_email + ", uti_nom=" + uti_nom + ", uti_prenom=" + uti_prenom
				 + "]";
	}
	
	
}
