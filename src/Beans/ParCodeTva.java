/**
 * 
 */
package Beans;
/**
 * @author lina RADI
 *
 */

//TVA
public class ParCodeTva {

	//PTV=Par Code Tva
	private int ptv_id;//l'identifiant 
	private int ptv_code;//le code du tva
	private String ptv_intitule; //l'intitulé
	private String ptv_combo;//combinaison code/intutulé
	
	
	public ParCodeTva(int ptv_id, int ptv_code, String ptv_intitule, String ptv_combo) {
		super();
		this.ptv_id = ptv_id;
		this.ptv_code = ptv_code;
		this.ptv_intitule = ptv_intitule;
		this.ptv_combo = ptv_combo;
	}


	public int getPtv_id() {
		return ptv_id;
	}


	


	public int getPtv_code() {
		return ptv_code;
	}


	public void setPtv_code(int ptv_code) {
		this.ptv_code = ptv_code;
	}


	public String getPtv_intitule() {
		return ptv_intitule;
	}


	public void setPtv_intitule(String ptv_intitule) {
		this.ptv_intitule = ptv_intitule;
	}


	public String getPtv_combo() {
		return ptv_combo;
	}


	public void setPtv_combo(String ptv_combo) {
		this.ptv_combo = ptv_combo;
	}
	
	
	
	
}
