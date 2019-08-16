/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */

//CECI INDIQUE LE TYPE D'ENVOI 
public class ParEnvoiType {
	//PET=Par Envoi Type
	private int pet_id; //l'identifiant 
	private String pet_intitule;//l'intitulé de l'envoi
	
	
	public ParEnvoiType(int pet_id, String pet_intitule) {
		super();
		this.pet_id = pet_id;
		this.pet_intitule = pet_intitule;
	}


	public int getPet_id() {
		return pet_id;
	}


	public String getPet_intitule() {
		return pet_intitule;
	}


	public void setPet_intitule(String pet_intitule) {
		this.pet_intitule = pet_intitule;
	}


	@Override
	public String toString() {
		return "ParEnvoiType [pet_id=" + pet_id + ", pet_intitule=" + pet_intitule + "]";
	}
	
	
	
	
}
