/**
 * 
 */
package Beans;

import java.util.Date;

/**
 * @author lina RADI
 *
 */

//UNE ASSOCIATION ENTRE UN PROJET ET UN COMITE EDITORIAL AVEC L'AVIS SUR LE PROJET 
public class ComiteEditorialAvis {

	//CRA=COmité editoRial avis
	private int cra_cor_id;//l'identifiant du comité
	private int cra_prj_id;// l'identifiant du projet
	private int cra_pcas_id;//pcas=par comité avis statut: le statut du projet
	private Date cor_observation ;//une observation
	
	
	public ComiteEditorialAvis(int cra_cor_id, int cra_prj_id, int cra_pcas_id, Date cor_observation) {
		super();
		this.cra_cor_id = cra_cor_id;
		this.cra_prj_id = cra_prj_id;
		this.cra_pcas_id = cra_pcas_id;
		this.cor_observation = cor_observation;
	}
	public int getCra_cor_id() {
		return cra_cor_id;
	}
	
	public int getCra_prj_id() {
		return cra_prj_id;
	}
	
	public int getCra_pcas_id() {
		return cra_pcas_id;
	}
	
	public Date getCor_observation() {
		return cor_observation;
	}
	public void setCor_observation(Date cor_observation) {
		this.cor_observation = cor_observation;
	}
	
	@Override
	public String toString() {
		return "ComiteEditorialAvis [cra_cor_id=" + cra_cor_id + ", cra_prj_id=" + cra_prj_id + ", cra_pcas_id="
				+ cra_pcas_id + ", cor_observation=" + cor_observation + "]";
	}
	
	
	
	
	
}
