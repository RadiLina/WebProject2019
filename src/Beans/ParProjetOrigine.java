package Beans;

/**
 * @author Lina RADI
 *
 */

//L'ORIGINE DU PROJET {CENTRE_DE_RECHERCHE , EXTERIEUR...} 
public class ParProjetOrigine {


	//PPO=Par Projet Origine
	private int ppo_id; //l'identifiant
	private String ppo_intitule;//l'ititulé 
	
	public ParProjetOrigine(int ppo_id, String ppo_intitule) {
		super();
		this.ppo_id = ppo_id;
		this.ppo_intitule = ppo_intitule;
	}
	
	public int getPpo_id() {
		return ppo_id;
	}
	
	public String getPpo_intitule() {
		return ppo_intitule;
	}
	public void setPpo_intitule(String ppo_intitule) {
		this.ppo_intitule = ppo_intitule;
	}
	
	
	@Override
	public String toString() {
		return "ParProjetOrigine [ppo_id=" + ppo_id + ", ppo_intitule=" + ppo_intitule + "]";
	}
	
	
	
	
}
