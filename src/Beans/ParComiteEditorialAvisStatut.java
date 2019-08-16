/**
 * 
 */
package Beans;

/**
 * @author lina RADI
 *
 */
//ASSOCIATION COMITE /PLUSIEURS PROJETS : par exepmle plusieurs projets qui sont refusés ou bien qui sont acceptés ...etc
public class ParComiteEditorialAvisStatut {

	//PCAS=Par Comité Editorial Avis Statut 
	private int pcas_id ; //l'identifiant 
	private String pcas_intitule;//l'intu=itulé 
	private boolean pcas_is_synced;
	private boolean pcas_is_rapport_ca ;
	
	
	public ParComiteEditorialAvisStatut(int pcas_id, String pcas_intitule, boolean pcas_is_synced,
			boolean pcas_is_rapport_ca) {
		super();
		this.pcas_id = pcas_id;
		this.pcas_intitule = pcas_intitule;
		this.pcas_is_synced = pcas_is_synced;
		this.pcas_is_rapport_ca = pcas_is_rapport_ca;
	}


	public int getPcas_id() {
		return pcas_id;
	}


	public void setPcas_id(int pcas_id) {
		this.pcas_id = pcas_id;
	}


	public String getPcas_intitule() {
		return pcas_intitule;
	}


	public void setPcas_intitule(String pcas_intitule) {
		this.pcas_intitule = pcas_intitule;
	}


	public boolean isPcas_is_synced() {
		return pcas_is_synced;
	}


	public void setPcas_is_synced(boolean pcas_is_synced) {
		this.pcas_is_synced = pcas_is_synced;
	}


	public boolean isPcas_is_rapport_ca() {
		return pcas_is_rapport_ca;
	}


	public void setPcas_is_rapport_ca(boolean pcas_is_rapport_ca) {
		this.pcas_is_rapport_ca = pcas_is_rapport_ca;
	}


	@Override
	public String toString() {
		return "ParComiteEditorialAvisStatut [pcas_id=" + pcas_id + ", pcas_intitule=" + pcas_intitule
				+ ", pcas_is_synced=" + pcas_is_synced + ", pcas_is_rapport_ca=" + pcas_is_rapport_ca + "]";
	}
	
	
	
}
