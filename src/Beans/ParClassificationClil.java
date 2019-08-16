/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//LA CLASSIFICATION CLIL
public class ParClassificationClil {

	//PCC=Par Classification Clil
	private int pcc_id;//l'identifiant de la classification
	private int pcc_parent_id;//la classification parente 
	private int pcc_code;//le code de la classification
	private String pcc_intitule;//l'intitulé de la classification 
	private String pcc_indent;
	private String pcc_path ;
	
	public ParClassificationClil(int pcc_id, int pcc_parent_id, int pcc_code, String pcc_intitule, String pcc_indent,
			String pcc_path) {
		super();
		this.pcc_id = pcc_id;
		this.pcc_parent_id = pcc_parent_id;
		this.pcc_code = pcc_code;
		this.pcc_intitule = pcc_intitule;
		this.pcc_indent = pcc_indent;
		this.pcc_path = pcc_path;
	}

	public int getPcc_id() {
		return pcc_id;
	}

	

	public int getPcc_parent_id() {
		return pcc_parent_id;
	}

	public void setPcc_parent_id(int pcc_parent_id) {
		this.pcc_parent_id = pcc_parent_id;
	}

	public int getPcc_code() {
		return pcc_code;
	}

	public void setPcc_code(int pcc_code) {
		this.pcc_code = pcc_code;
	}

	public String getPcc_intitule() {
		return pcc_intitule;
	}

	public void setPcc_intitule(String pcc_intitule) {
		this.pcc_intitule = pcc_intitule;
	}

	public String getPcc_indent() {
		return pcc_indent;
	}

	public void setPcc_indent(String pcc_indent) {
		this.pcc_indent = pcc_indent;
	}

	public String getPcc_path() {
		return pcc_path;
	}

	public void setPcc_path(String pcc_path) {
		this.pcc_path = pcc_path;
	}
	
	
	
	
}
