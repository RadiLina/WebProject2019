package JavaClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;

import Beans.Projet;
import Beans.ProjetTiers;
import Beans.Tiers;
import Beans.Utilisateur;

/**
 * @author Lina RADI
 *
 */


//CETTE CLASSE CONTIENT TOUTES LES METHODES NECESSAIRES POUR L'ACCES A LA BASE DE DONNEES EN INSERTION/SELECTION ...ETC
 
public class MesMethodes {
	Connection con = DBConnexion.getInstance();// objet de connextion a la base de donnees
	Statement stat = null; // creation du statement
	ResultSet rs = null; // creation d'un objet reseultSet

	/**
	 * methode pour la creation d'un utilisateur de l'application
	 * 
	 * @param email
	 * @param motDePasse
	 * @return un objet utilisateur
	 * @throws SQLException
	 */
	public Utilisateur getUtilisateur(String email, String motDePasse) {
		Utilisateur utilisateur = null;
		try {
			stat = con.createStatement();
			// WHERE ... nomColonneDuMotDePasse = crypt('MonMotDePasse',
			// nomColonneDuMotDePasse); >permet de decrypter le mot de passe pour comparer
			ResultSet rs = stat.executeQuery("SELECT * FROM public.utilisateur where uti_email='" + email
					+ "' and uti_motdepasse= crypt('" + motDePasse + "', uti_motdepasse) ;");
			while (rs.next()) {
				utilisateur = new Utilisateur(rs.getString("uti_email"), rs.getString("uti_nom"),
						rs.getString("uti_prenom"), rs.getString("uti_motdepasse"));
			}
			return utilisateur;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}

	/**
	 * methode qui verifie la validitation d'une adresse mail
	 * 
	 * @param email : l'email entre par l'utilisateur
	 * @return true s'il s'agit d'un email valid,false sinon
	 */
	public boolean isValidEmail(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	/**
	 * cette methode permet de recuperer un projet par son code interne
	 * 
	 * @param codeInterne : code interne du projet
	 * @return : on objet projet
	 * @throws SQLException
	 */
	public Projet getProjetByCodeInterne(String codeInterne) {
		Projet projet = null;
		try {
			stat = con.createStatement();
			rs = stat.executeQuery(
					"SELECT prj_id,prj_num_projet,prj_num_septentrion,prj_ppt_id,prj_titre, prj_auteur_principal,prj_date_parution FROM public.projet where prj_num_septentrion='"
							+ codeInterne + "';");
			if (rs.next()) {
				projet = new Projet(rs.getInt("prj_id"), rs.getString("prj_num_projet"),
						rs.getString("prj_num_septentrion"), rs.getInt("prj_ppt_id"), rs.getString("prj_titre"),
						rs.getString("prj_auteur_principal"), rs.getDate("prj_date_parution"));
				return projet;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projet;
	}

	
	/**
	 * cette methode permet de recuperer un projet a partir de son identidiant
	 * @param prjId : l'identifiant du projet(ouvrage) :int
	 * @return l'objet projet (l'ouvrage)
	 */
	public Projet getProjectById(int prjId) {
		Projet projet = null;
		try {
			stat = con.createStatement();
			rs = stat.executeQuery(
					"SELECT prj_id,prj_num_projet,prj_num_septentrion ,prj_ppt_id,prj_titre, prj_auteur_principal,prj_date_parution  FROM public.projet where prj_id='"
							+ prjId + "';");
			if (rs.next()) {
				projet = new Projet(rs.getInt("prj_id"), rs.getString("prj_num_projet"),
						rs.getString("prj_num_septentrion"), rs.getInt("prj_ppt_id"), rs.getString("prj_titre"),
						rs.getString("prj_auteur_principal"),rs.getDate("prj_date_parution"));
				return projet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projet;

	}

	

	/**
	 * cette methode teste si le tier(auteur/contributeur) existe deja dans la base
	 * de donnees
	 * 
	 * @param tier : auteur(contributeur)
	 * @return : l'identifiant du tier( auteur/contributeur)
	 */
	public int isExisteTier(Tiers tier) {
		int idTier = 0;
		try {
			stat = con.createStatement();
			// iLIKE dans la requette permet d'ignorer s'il s'agit d'une majuscule ou
			// miniscule dans le nom ou prenom
			rs = stat.executeQuery("SELECT tie_id FROM public.tiers where tie_nom iLIKE  '" + "%" + tier.getTie_nom()
					+ "%" + "' and tie_prenom iLIKE " + "'" + "%" + tier.getTie_prenom() + "%" + "';");
			if (rs.next()) {
				idTier = rs.getInt("tie_id");
				return idTier;
			} else {
				return idTier;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idTier;
	}

	/**
	 * methode pour mettre a jour les informations concernant le contributeur.
	 * 
	 * @param tier:  auteur/contributeur
	 * @param idTier : l'identifiant du tier(auteur/contributeur)
	 * @return le resultat de l'insertion
	 */
	public boolean updateTier(Tiers tier, int idTier) {
		try {
			stat = con.createStatement();
			stat.executeUpdate(" UPDATE public.tiers SET tie_civilite='" + tier.getTie_civilite() + "', "
					+ "tie_pro_adresse='" + tier.getTie_pro_adresse() + "', tie_pro_complement='"
					+ tier.getTie_adresse_l1() + "'," + "tie_pro_cp='" + tier.getTie_pro_cp() + "', tie_pro_ville='"
					+ tier.getTie_pro_ville() + "', " + "tie_pro_pays='" + tier.getTie_pro_pays()
					+ "', tie_adresse_l1='" + tier.getTie_adresse_l1() + "', " + "tie_adresse_l2='"
					+ tier.getTie_adresse_l2() + "', tie_adresse_l3='" + tier.getTie_adresse_l3() + "',"
					+ " tie_telephone='" + tier.getTie_telephone() + "', tie_email='" + tier.getTie_email() + "', "
					+ " tie_reseaux_sociaux='" + tier.getTie_reseaux_sociaux() + "', " + "tie_num_secu='"
					+ tier.getTie_num_secu() + "'\r\n" + "WHERE tie_id='" + idTier + "' ;  ");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	/**
	 * cette methode permet d'inserer un tier(auteur) dans la base de donnees (
	 * table Tiers)
	 * 
	 * @param tier : objet tier representant le tier
	 * @return l'identidiant du tier
	 */
	public int insertTier(Tiers tier) {
		int idTier = 0;
		try {

			PreparedStatement stmt = con.prepareStatement(
					/**
					 * NEXTVAL('seq'): une sequence qui permet l'insertion dans un auto_increment
					 * sur postgres, cree avec les 2 lignes sql suivantes: 1-Create sequence seq;
					 * 2-select setval('seq',maxIdValue);
					 **/
					"INSERT INTO public.tiers(\r\n"
							+ "tie_id, tie_ptt_id, tie_civilite, tie_inactif, tie_nom, tie_prenom,tie_naissance_date,tie_pro_adresse, tie_pro_cp, tie_pro_ville, tie_pro_pays, tie_adresse_l1,tie_adresse_l2, tie_adresse_l3, tie_adresse_l4, tie_telephone, tie_pro_telephone, tie_email,tie_reseaux_sociaux,tie_num_secu) VALUES (NEXTVAL('seq'), '3', '"
							+ tier.getTie_civilite() + "' , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

			stmt.setBoolean(1, false);
			stmt.setString(2, tier.getTie_nom());
			stmt.setString(3, tier.getTie_prenom());
			if (tier.getTie_naissance_date() == null) {

				stmt.setDate(4, null);
			} else {
				// conversion de java.util.Date VERS java.sql.Date
				java.util.Date utilDate = tier.getTie_naissance_date();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				stmt.setDate(4, sqlDate);
			}
			stmt.setString(5, tier.getTie_pro_adresse());
			stmt.setString(6, tier.getTie_pro_cp());
			stmt.setString(7, tier.getTie_pro_ville());
			stmt.setString(8, tier.getTie_pro_pays());
			stmt.setString(9, tier.getTie_pro_adresse());
			stmt.setString(10, tier.getTie_adresse_l1());
			stmt.setString(11, tier.getTie_adresse_l2());
			stmt.setString(12, tier.getTie_adresse_l3());
			stmt.setString(13, tier.getTie_telephone());
			stmt.setString(14, tier.getTie_telephone());
			stmt.setString(15, tier.getTie_email());
			stmt.setString(16, tier.getTie_reseaux_sociaux());
			stmt.setString(17, tier.getTie_num_secu());

			// execution de la requete
			stmt.executeUpdate();
			ResultSet rs = null;
			rs = stat.executeQuery("SELECT tie_id FROM public.tiers where tie_nom iLIKE  '" + "%" + tier.getTie_nom()
					+ "%" + "'" + " and tie_prenom iLIKE '" + "%" + tier.getTie_prenom() + "%" + "';");
			if (rs.next()) {
				idTier = rs.getInt("tie_id");
				return idTier;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idTier;
	}

	/**
	 * Methode pour la creation d'un objet Tier (Auteur)
	 * 
	 * @param idTier : l'identifiant du tier
	 * @return: l'objet Tier
	 */
	public Tiers creerTier(int idTier) {
		Tiers contributeur = null;
		try {
			stat = con.createStatement();
			rs = stat.executeQuery(
					"SELECT tie_civilite, tie_nom, tie_prenom, tie_pro_adresse, tie_pro_complement, tie_pro_cp, tie_pro_ville, "
							+ "tie_pro_pays, tie_adresse_l1, tie_adresse_l2, tie_adresse_l3, tie_adresse_l4\r\n"
							+ "	FROM public.tiers where tie_id='" + idTier + "';");
			if (rs.next()) {
				contributeur = new Tiers(idTier, rs.getString("tie_civilite"), rs.getString("tie_nom"),
						rs.getString("tie_prenom"), rs.getString("tie_pro_adresse"), rs.getString("tie_pro_complement"),
						rs.getString("tie_pro_cp"), rs.getString("tie_pro_ville"), rs.getString("tie_pro_pays"),
						rs.getString("tie_adresse_l1"), rs.getString("tie_adresse_l2"), rs.getString("tie_adresse_l3"),
						rs.getString("tie_adresse_l4"));
				return contributeur;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return contributeur;

	}

	/**
	 * ajouter un nouveau projet COLLECTIF dans la base de donnees
	 * 
	 * @param projetCollectif
	 */
	public boolean ajouterProjet(Projet projetCollectif) {
		try {
			/*
			 * preparation de la requette d'insertion d'un nouvel ouvrage collectif ,
			 * l'utilisation de PreparedStatement permet l'ignorance des " ' " dans les
			 * titres des ouvrages par exemple.
			 */
			PreparedStatement stmt = con.prepareStatement(""
					/**
					 * NEXTVAL('projetSeq'): une sequence qui permet l'insertion dans un
					 * auto_increment sur postgres, cree avec les 2 lignes sql suivantes: 1-Create
					 * sequence projetSeq; 2-select setval('seq',maxProjectIdValue);
					 */
					+ "INSERT INTO public.projet (prj_id, prj_ppt_id, prj_num_projet, prj_num_septentrion, prj_titre, prj_soustitre,prj_date_creation, prj_date_programmation, prj_date_parution,prj_auteur_principal)"
					+ " VALUES (NEXTVAL('projetSeq'),'8',?,?,?,?,?,?,?,?)"); // le '8' pour un prj_ppt_id=8 pour ouvrage
																				// collectif
			stmt.setString(1, projetCollectif.getPrj_num_projet());
			stmt.setString(2, projetCollectif.getPrj_num_septentrion());
			stmt.setString(3, projetCollectif.getPrj_titre());
			stmt.setString(4, projetCollectif.getPrj_soustitre());

			if (projetCollectif.getPrj_date_creation() == null) {
				stmt.setDate(5, null);
			} else {
				// conversion de java.util.Date VERS java.sql.Date
				java.util.Date utilDate = projetCollectif.getPrj_date_creation();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				stmt.setDate(5, sqlDate);
			}
			if (projetCollectif.getPrj_date_programmation() == null) {
				stmt.setDate(6, null);
			} else {
				// conversion de java.util.Date VERS java.sql.Date
				java.util.Date utilDate = projetCollectif.getPrj_date_programmation();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				stmt.setDate(6, sqlDate);
			}
			if (projetCollectif.getPrj_date_parution() == null) {
				stmt.setDate(7, null);
			} else {
				// conversion de java.util.Date VERS java.sql.Date
				java.util.Date utilDate = projetCollectif.getPrj_date_parution();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
				stmt.setDate(7, sqlDate);
			}
			stmt.setString(8, projetCollectif.getPrj_auteur_principal());
			// execution de la requete
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * Insertion d'un contributeur dans un ouvrage (insertion dans la table
	 * tier-projet)
	 * 
	 * @param idTier : i'identifiant du contributeur
	 * @param projet : le projet
	 * @return : return true lorsque l'insertion est bien faite
	 */
	public boolean insertTierProjet(int idTier, Projet projet) {
		try {
			// preparation de la requette d'insertion d'un contributeur
			PreparedStatement stmt = con.prepareStatement(
					"INSERT INTO public.projet_tiers( pau_prj_id, pau_tie_id, pau_ppat_id, pau_principal,"
							+ " pau_titre_contrib, pau_resume_fr, pau_resume_en) VALUES (?, ?, '2', ?, ?, ?, ?)");
			// le 2 pour pau_ppat_id (par projet auteur type =2 = contributeur)

			stmt.setInt(1, projet.getPrj_id());
			stmt.setInt(2, idTier);
			stmt.setBoolean(3, false);
			stmt.setString(4, null);
			stmt.setString(5, null);
			stmt.setString(6, null);
			// execution de la requete
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Une methode pour avoir les contributeurs dans un meme ouvrage
	 * 
	 * @param projet
	 * @return : contributeurs
	 */
	public java.util.ArrayList<ProjetTiers> getContributeurs(Projet projet) {
		ArrayList<ProjetTiers> listeContributeurs = null;
		try {
			stat = con.createStatement();
			ResultSet rs = stat
					.executeQuery("SELECT pau_prj_id, pau_tie_id, pau_titre_contrib FROM public.projet_tiers where "
							+ "pau_prj_id='" + projet.getPrj_id() + "' and pau_ppat_id='2';");
			while (rs.next()) {
				if (listeContributeurs == null)
					listeContributeurs = new ArrayList<>();
				ProjetTiers contributeur = new ProjetTiers(rs.getInt("pau_prj_id"), rs.getInt("pau_tie_id"),
						rs.getString("pau_titre_contrib"));
				listeContributeurs.add(contributeur);
			}
			return listeContributeurs;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listeContributeurs;
	}

	/**
	 * cette permet permet de recuperer un le titre d'u ouvrage a partir de son id
	 * 
	 * @param prjId : l'identifiant de l'ouvrage(projet)
	 * @return : String titre
	 */
	public String getProjectTitleById(int prjId) {
		String titreOuvrage = null;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery("SELECT prj_titre FROM public.projet where prj_id='" + prjId + "' ;");
			while (rs.next()) {
				titreOuvrage = rs.getString("prj_titre");
			}
			return titreOuvrage;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return titreOuvrage;
	}

	/**
	 * Cette methode permet de recuperer le titre de contribution d'un tier dans un
	 * ouvrage
	 * 
	 * @param idProjet : l'identifiant du projet
	 * @param idTier   : l'identifiant du tier
	 * @return :String titreContrib, le titre de contribution
	 */
	public String getContribTitleByIds(int idProjet, int idTier) {
		String titreContrib = null;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery("SELECT pau_titre_contrib FROM public.projet_tiers where pau_prj_id='"
					+ idProjet + "' and pau_tie_id='" + idTier + "' ;");
			while (rs.next()) {
				titreContrib = rs.getString("pau_titre_contrib");
			}
			return titreContrib;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return titreContrib;

	}

	/**
	 * cette methode permet de recuperer le nom complet du
	 * tier=l'auteur(contributeur)
	 * 
	 * @param tierId : l'identifiant du tier (contributeur)
	 * @return : le nom complet du tier (contributeur)
	 */
	public String getTierNameById(int tierId) {
		String nom = null, prenom = null;
		try {
			stat = con.createStatement();
			ResultSet rs = stat
					.executeQuery("SELECT tie_nom, tie_prenom FROM public.tiers where tie_id='" + tierId + "' ;");
			while (rs.next()) {
				nom = rs.getString("tie_nom");
				prenom = rs.getString("tie_prenom");
			}
			return nom + " " + prenom;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nom + " " + prenom;
	}

	/**
	 * cette methode permet l'ajout d'un titre de cotrinbution
	 * 
	 * @param projetId          : l'identifiant du projet (ouvrage)
	 * @param tierId            : l'identifiant du tier (contributeur)
	 * @param titreContribution : le titre de contribution
	 * @return : boolean qui indique si l'insertion est reussie ou non
	 */
	public boolean addContibTitle(int projetId, int tierId, String titreContribution) {

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(
					"UPDATE public.projet_tiers SET  pau_titre_contrib=? where pau_prj_id=? and pau_tie_id=? ");
			stmt.setString(1, titreContribution);
			stmt.setInt(2, projetId);
			stmt.setInt(3, tierId);
			// execution de la requete
			stmt.executeUpdate();
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

	/**
	 * cette methodes permet de recuperer tous les contributeurs dans meme ouvrage a
	 * partir de l'identifiant de cet ouvrage(projet)
	 * 
	 * @param projetId : l'identifiant du projet(ouvrage)
	 * @return : la liste des contributeurs
	 */
	public ArrayList<ProjetTiers> getContributeursByProjectId(int projetId) {
		ArrayList<ProjetTiers> listeContributeurs = null;
		try {
			stat = con.createStatement();
			ResultSet rs = stat
					.executeQuery("SELECT pau_prj_id, pau_tie_id, pau_titre_contrib FROM public.projet_tiers "
							+ "where pau_prj_id='" + projetId + "' and pau_ppat_id='2' ;");
			while (rs.next()) {
				if (listeContributeurs == null)
					listeContributeurs = new ArrayList<>();
				ProjetTiers contributeur = new ProjetTiers(rs.getInt("pau_prj_id"), rs.getInt("pau_tie_id"),
						rs.getString("pau_titre_contrib"));
				listeContributeurs.add(contributeur);
			}
			return listeContributeurs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeContributeurs;

	}

	/**
	 * METHODE POUR RECUPRER TOUS LES PROJETS
	 * 
	 * @returnliste des projets (ouvrages )
	 */
	public ArrayList<Projet> getProjets() {
		ArrayList<Projet> projets = null;
		Projet p;
		try {
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery(
					"SELECT prj_num_projet, prj_num_septentrion, prj_titre, prj_date_creation, prj_date_programmation, prj_auteur_principal,"
							+ "prj_date_parution FROM public.projet;");

			while (rs.next()) {
				if (projets == null)
					projets = new ArrayList<>();
				p = new Projet(rs.getString("prj_num_projet"), rs.getString("prj_num_septentrion"),
						rs.getString("prj_titre"), rs.getDate("prj_date_programmation"),
						rs.getString("prj_auteur_principal"), rs.getDate("prj_date_parution"));
				projets.add(p);
			}
			return projets;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return projets;

	}

	/**
	 * methode qui permet l'ajout d'un nouvel utilisateur dans la base de donnees
	 * lors de la creation d'un nouveau compte
	 * 
	 * @param nouvelUti
	 * @return
	 */
	public boolean ajouterNvUtilisateur(Utilisateur nouvelUti) {

		try {
			PreparedStatement stmt = con
					.prepareStatement(" INSERT INTO public.utilisateur(uti_email, uti_nom, uti_prenom, uti_motdepasse)"
							+ " VALUES (?, ?, ?, crypt('" + nouvelUti.getUti_motDePasse() + "' , gen_salt('bf')))");
			// crypt('"+nouvelUti.getUti_motDePasse()+"' , gen_salt('bf'))) : permet de
			// crypter le mot de passe entrer par l'utilisateur
			stmt.setString(1, nouvelUti.getUti_email());
			stmt.setString(2, nouvelUti.getUti_nom());
			stmt.setString(3, nouvelUti.getUti_prenom());
			// execution de la requete
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	/**
	 * cette methode permet de tester l'existence d'un ouvrage ou pas dans la base
	 * de donnees a partir d'un ou des deux "numero projet" et le"code interne"
	 * 
	 * @param projetCollectif : un objet projet
	 * @return idProjet :int , l'identifiant du projet
	 */
	public int isExisteProjet(Projet projetCollectif) {
		int idProjet = 0;
		try {
			stat = con.createStatement();
			rs = stat.executeQuery("SELECT prj_id FROM public.projet where prj_num_septentrion='"
					+ projetCollectif.getPrj_num_septentrion() + "' or prj_num_projet='"
					+ projetCollectif.getPrj_num_projet() + "'   ;");
			if (rs.next()) {
				idProjet = rs.getInt("prj_id");
				return idProjet;
			} else {
				return idProjet;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idProjet;
	}

	/**
	 * cette methode permet de mettre a jour le numero du projet ou le code interne
	 * .
	 * 
	 * @param projetCollectif : objet projet
	 * @param idProjet
	 * @return : le resultat de la mise a jour
	 */
	public boolean updateProjet(Projet projetCollectif, int idProjet) {

		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(
					"UPDATE public.projet SET  prj_num_septentrion=?,prj_num_projet=? where prj_id=? ");
			stmt.setString(1, projetCollectif.getPrj_num_septentrion());
			stmt.setString(2, projetCollectif.getPrj_num_projet());
			stmt.setInt(3, idProjet);
			// execution de la requete
			stmt.executeUpdate();
			return true;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}

}