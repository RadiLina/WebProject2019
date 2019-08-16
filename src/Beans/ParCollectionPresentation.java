/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//LA PRESENTATION DE LA COLLECCTION
public class ParCollectionPresentation {

	//PCP=Par Collection Presentation
	private int pcp_id ;//l'identifiant 
	private String pcp_intitule;//l'intitulé
	
	
	public ParCollectionPresentation(int pcp_id, String pcp_intitule) {
		super();
		this.pcp_id = pcp_id;
		this.pcp_intitule = pcp_intitule;
	}


	public int getPcp_id() {
		return pcp_id;
	}




	public String getPcp_intitule() {
		return pcp_intitule;
	}


	public void setPcp_intitule(String pcp_intitule) {
		this.pcp_intitule = pcp_intitule;
	} 
	
	
	
}
