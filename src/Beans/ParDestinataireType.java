/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//CECI REPRESENTE LE TYPE DU DESTINATAIRE 
public class ParDestinataireType {

	//PDET=Par DEstinataire Type
	private int pdet_id;//l'identifiant 
	private String pdet_intitule;//l'ititulé
	private int pdet_code;//le code du destinataire 
	
	
	public ParDestinataireType(int pdet_id, String pdet_intitule, int pdet_code) {
		super();
		this.pdet_id = pdet_id;
		this.pdet_intitule = pdet_intitule;
		this.pdet_code = pdet_code;
	}


	public int getPdet_id() {
		return pdet_id;
	}


	public String getPdet_intitule() {
		return pdet_intitule;
	}


	public void setPdet_intitule(String pdet_intitule) {
		this.pdet_intitule = pdet_intitule;
	}


	public int getPdet_code() {
		return pdet_code;
	}


	public void setPdet_code(int pdet_code) {
		this.pdet_code = pdet_code;
	}


	@Override
	public String toString() {
		return "ParDestinataireType [pdet_id=" + pdet_id + ", pdet_intitule=" + pdet_intitule + ", pdet_code="
				+ pdet_code + "]";
	}
	
	
	
	
}
