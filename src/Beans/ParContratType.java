/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//CECI REPRESENTE LE TYPE DU CONTRAT {individuel,collectif,editeur,traducteur...}
public class ParContratType {
	//PCT=Par Contrat Type
	private int pct_id;//l'identifiant
	private String pct_intitule;//l'intitulé 
	
	public ParContratType(int pct_id, String pct_intitule) {
		super();
		this.pct_id = pct_id;
		this.pct_intitule = pct_intitule;
	}
	public int getPct_id() {
		return pct_id;
	}
	
	public String getPct_intitule() {
		return pct_intitule;
	}
	public void setPct_intitule(String pct_intitule) {
		this.pct_intitule = pct_intitule;
	}
	@Override
	public String toString() {
		return "ParContratType [pct_id=" + pct_id + ", pct_intitule=" + pct_intitule + "]";
	}
	
	
}
