package Beans;
/**
 * @author lina RADI
 *
 */

//CECI REPRESENTE LES POURCENTAGES DE DROIT FINANICER POUVANT ETRE DANS UN CONTRAT ( 5.00% ,6.00% ) 
public class ParContratDroit {

	//PCD=Par Contrat Droit 
	private int pcd_id;//l'identifiant 
	private double pcd_pourc ;//le pourcentage du droit financier 
	private String pcd_combo ;//combinaison 
	
	
	public ParContratDroit(int pcd_id, double pcd_pourc, String pcd_combo) {
		super();
		this.pcd_id = pcd_id;
		this.pcd_pourc = pcd_pourc;
		this.pcd_combo = pcd_combo;
	}
	
	
	public int getPcd_id() {
		return pcd_id;
	}


	public double getPcd_pourc() {
		return pcd_pourc;
	}
	public void setPcd_pourc(double pcd_pourc) {
		this.pcd_pourc = pcd_pourc;
	}
	public String getPcd_combo() {
		return pcd_combo;
	}
	public void setPcd_combo(String pcd_combo) {
		this.pcd_combo = pcd_combo;
	}
	
	
	@Override
	public String toString() {
		return "ParContratDroit [pcd_id=" + pcd_id + ", pcd_pourc=" + pcd_pourc + ", pcd_combo=" + pcd_combo + "]";
	}
	
	
}
