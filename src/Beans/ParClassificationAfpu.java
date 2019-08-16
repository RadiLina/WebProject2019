/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//LA CLASSIFICATION AFPU
public class ParClassificationAfpu {

	//PCA=Par Classification Afpu
	private int pca_id;//l'identifiant de la classification
	private String pca_intitule;//l'intitulé de la classification 
	
	public ParClassificationAfpu(int pca_id, String pca_intitule) {
		super();
		this.pca_id = pca_id;
		this.pca_intitule = pca_intitule;
	}

	public int getPca_id() {
		return pca_id;
	}

	

	public String getPca_intitule() {
		return pca_intitule;
	}

	public void setPca_intitule(String pca_intitule) {
		this.pca_intitule = pca_intitule;
	}

	@Override
	public String toString() {
		return "ParClassificationAfpu [pca_id=" + pca_id + ", pca_intitule=" + pca_intitule + "]";
	}
	
	
}
