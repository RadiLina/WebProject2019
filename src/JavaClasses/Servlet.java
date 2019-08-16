package JavaClasses;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Projet;
import Beans.ProjetTiers;
import Beans.Utilisateur;
import Beans.Tiers;

/**
 * @author Lina RADI
 */

/**
 * Servlet implementation class Servlet
 */

public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Servlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	
	String Page = (String) request.getParameter("pageName");// recuperer le nom de la page appelee
	HttpSession session = request.getSession();
	MesMethodes execute = new MesMethodes();// Creation d'un objet de type Methodes (methodes.java) qui contient toutes les methodes
	
	
	switch (Page) { // Selon la page souhaitee , un traitement sera effectue et une page sera appelee
		
		//LE CAS QUI CONCERNE LA CONNEXION AUX COMPTES
		case "SeConnecter": {
		Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur"); // recuperation de l'utilisateur
		if (utilisateur != null) {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); //redirection vers la page du menu ,si l'utilisateur est deja connecte
		} else {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Sauthentifier.jsp").forward(request, response); //redirection vers la page d'authentification si l'utilisateur est deconnecte
		}
		break;
		}
		
		
		//LE CAS QUI CONCERNE LA CREATION D'UN NOUVEAU COMPTE
		case "toCreerCompte": {
			//tester s'il existe deja un utilisateur dans la session , on le redirectionne vers deconnection ??
		Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur"); // recuperation de l'utilisateur
		if (utilisateur != null) {
			//supprimer l'utlisateur de la session et redirection vers creer un compte 
		session.setAttribute("utilisateur",null);
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreerUnCompte.jsp").forward(request, response);	
		}else {
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreerUnCompte.jsp").forward(request, response);	
		}
		break;
		}
		
		//LE CAS QUI CONCERNE LA DECONNEXION 
		case "deconnecter": {
			session.setAttribute("utilisateur",null);
			this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			break;
		}
		
	
		//LE CAS QUI MENE VERS REMPLIR LA FICHE D'AUTEUR 
		case "toRemplirFicheAuteur": {
		this.getServletContext().getRequestDispatcher("/WEB-INF/FicheAuteur.jsp").
		forward(request, response); 
		break; 
		}
		 
	
		
		//LE CAS QUI MENE VERS L'AJOUT D'UN NOUVEL OUVRAGE COLLECTIF 
		case "AjouterUnOuvrageCollectif": {
		this.getServletContext().getRequestDispatcher("/WEB-INF/AjouterUnOuvrageCollectif.jsp").forward(request,response);
		break;
		}
	
			 
		//LE CAS POUR LA CONSULTATION DES OUVRAGES
		case "toConsulterLesOuvrages": {
			ArrayList<Projet> projets = null;
			projets=new ArrayList<>();
			projets= execute.getProjets(); //methode pour recuperer tous les projets 
			request.setAttribute("projets", projets);
			this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterProjets.jsp").forward(request,response);	
			break;
		}
		
		
		
		//LE CAS QUI MENE VERS LA PAGE DE RECHERCHE D'UN OUVRAGE 
		case "toRechercherUnOuvrage": {
			this.getServletContext().getRequestDispatcher("/WEB-INF/RechercherUnOuvrage.jsp").forward(request,response);	
			break;
		}
		
			
		//LE CAS QUI MENE VERS L'AJOUT DES INFORMATIONS DU CONTRIBUTEUR (REMPLIR LA FICHE AUTEUR)
		case "toAjouterContributeur2": {
			this.getServletContext().getRequestDispatcher("/WEB-INF/FicheAuteur.jsp").forward(request, response);
			break;
		} 
	
		
		//LE CAS QUI MENE VERS LE MENU 
		case "toMenu": {
			this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response);
			break;
		}
	
		//LE CAS QUI MENE VERS LA PAGE POUR RENTRER LE CODE INTERNE , PLUSIEURS PAGES PEUVENT APPELEE CE CAS 
		case "toEnterCodeInterne": {
			String resultPage = (String) request.getParameter("resultPage"); 
			/**
			 * j'ai utilisé un attribut en plus "resultPage" pour faire la difference entre les pages appelées et resultantes ,que je met dans la session 
			 */
			session.setAttribute("resultPage", resultPage);
			this.getServletContext().getRequestDispatcher("/WEB-INF/EntrerCodeInterne.jsp").forward(request,response);
			break;
		}
			
			
		//LE CAS CONCERNANT L'AJOUT D'UN NOUVEAU TITRE DE CONTRIBUTION 
		case "toAjouterTitreContribution": {
			int projetId=Integer.parseInt(request.getParameter("projetId")); //l'identifiant du projet
			int tierId= Integer.parseInt(request.getParameter("tierId")); //l'identifiant de l'auteur (contributeur) 
			
			  // concerne le cas de modification du titre de contribution String
			  String cas=(String)request.getParameter("cas");
			  session.setAttribute("cas",cas );
			  // fin de ce cas
			 			
			session.setAttribute("projetId", projetId);
			session.setAttribute("tierId", tierId);
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/TitreContribution.jsp").forward(request, response);
			break;
		} 
			
			
		
			
		//LE CAS QUI CONCERNE L'AFFICHAGE DU CONTRAT 
		case "EtablirContrat": {
				 this.getServletContext().getRequestDispatcher("/WEB-INF/Contrat.jsp").forward(request, response);
				 break;
			} 
		
		
		
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *     
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doGet(request, response);

		
		//RECUPERER LE NOM DE LA PAGE SOUHAITEE "pageName"
				String Page = (String) request.getParameter("pageName");
				HttpSession session = request.getSession();
				MesMethodes execute = new MesMethodes(); //Creation d'un objet de type Methodes (methodes.java) qui contient toutes les methodes
		
				switch (Page) { // Selon la page souhaitée , un traitement sera effectue et une page sera appelée 

		  //LE CAS QUI CONCERNE L'AUTHENTIFICATION DES UTILISATEURS
		  case "Sauthentifier": { 
				Utilisateur utilisateur = null;
				String email = (String) request.getParameter("email");
				if (execute.isValidEmail(email)) { //teste si l'email entre par l'utilisateur est valide ou pas 
					String motDePasse = (String) request.getParameter("password");
					utilisateur = (Utilisateur) execute.getUtilisateur(email, motDePasse); //creation de l'objet utilisateur correspondant au donnees entrees 
					session.setAttribute("utilisateur", utilisateur); // mettre l'utilisateur dans session 
					this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); //redirection vers la page du menu
				} else {
					this.getServletContext().getRequestDispatcher("/WEB-INF/Sauthentifier.jsp").forward(request, response); //redirection vers la page d'authentification
				}
				break;
			}
		  
		  
		  //LE CAS QUI CONCERNE LA RECHERCHE D'UN OUVRAGE AVEC LE TITRE / LE NUMERO DU PROJET OU LE CODE INTERNE
		  case "RechercherUnOuvrage":{
			Projet projet=null;
			String CodeInterne = (String) request.getParameter("CodeInterne");
			projet=execute.getProjetByCodeInterne(CodeInterne);
			ArrayList<Projet> projets = null;
			projets=new ArrayList<>();
			projets.add(projet); //Ajouter le projet dans une liste , pour utiliser la meme jsp que pour la consultation de plusieurs projets 
			request.setAttribute("projets", projets);
			this.getServletContext().getRequestDispatcher("/WEB-INF/ConsulterProjets.jsp").forward(request,response);	
			break;
		  }
		  
		  
		  //LE CAS POUR LA CREATION D'UN NOUVEAU COMPTE 
		  case "CreerCompte": {
				String nom = (String) request.getParameter("Nom"); 
				String prenom = (String) request.getParameter("Prenom");
				String email = (String) request.getParameter("Email");
				String motDePasse=(String) request.getParameter("password");
				
				if (execute.isValidEmail(email)) { //restester si l'email est valid
					Utilisateur nouvelUti= new Utilisateur(email,nom,prenom,motDePasse); //creation d'un objet utilisateur 
					if(execute.ajouterNvUtilisateur(nouvelUti)) {  //inserser le nouvel utilisateur dans la base de donnees 
						session.setAttribute("utilisateur",nouvelUti);
						this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); //redirection vers la page du menu
					}else {
						this.getServletContext().getRequestDispatcher("/WEB-INF/CreerUnCompte.jsp").forward(request, response);	
					}
					
				}else {
					this.getServletContext().getRequestDispatcher("/WEB-INF/CreerUnCompte.jsp").forward(request, response);	
				}
				break;
			}
	
		  //LE CAS QUI CONCERNE L'AJOUT DES CONTRIBUTEURS D'UN OUVRAGE
		  case "toAjouter": {
			String resultPage = (String) session.getAttribute("resultPage"); 
			/**
			 * j'ai utilisé l'attribut "resultPage" pour faire la difference entre les pages appelées et resultantes ,que j'ai recuperé dans le cas "toEnterCodeInterne"
			 */
			String codeInterne = (String) request.getParameter("codeInterne"); //recuperation du code interne
			if (codeInterne != null) {
				Projet projet = null;
				projet = execute.getProjetByCodeInterne(codeInterne); //creation d'un objet "projet" a partir du code interne 
				if (projet == null) {
						this.getServletContext().getRequestDispatcher("/WEB-INF/EntrerCodeInterne.jsp").forward(request,response);
				}else {
						
					switch(resultPage) {
					case "titre": {
								if(projet.getPrj_ppt_id()==8) { //tester si le projet s'agit bien d'un ouvrage collectif ( prj_ppt_id==8 > projet collectif)
									 //creation d'une liste de contributeurs 
									ArrayList<ProjetTiers> contributeurs = new ArrayList<>();
									contributeurs = execute.getContributeurs(projet);
									// s'il n'y a pas de contributeurs , redirections vers 
									if(contributeurs==null) {
										this.getServletContext().getRequestDispatcher("/WEB-INF/PasDeContributeurs.jsp").forward(request,response);
									}else {
										request.setAttribute("contributeurs", contributeurs);
										this.getServletContext().getRequestDispatcher("/WEB-INF/AjouterTitresContributions.jsp").forward(request, response);
									}
								}else {
									this.getServletContext().getRequestDispatcher("/WEB-INF/EntrerCodeInterne.jsp").forward(request,response);
								}
								break;
					}
					case "contrib": {
							if(projet.getPrj_ppt_id()!=8) {//tester s'il s'agit d un ouvrage collectif ou pas 
								this.getServletContext().getRequestDispatcher("/WEB-INF/AjouterUnContributeur.jsp").forward(request,response);
							}else {
								session.setAttribute("Projet", projet);// mettre l'objet projet dans la session 
								this.getServletContext().getRequestDispatcher("/WEB-INF/FicheAuteur.jsp").forward(request,response);
								
							}
							break;
					}
					case "contrat": {
								if(projet.getPrj_ppt_id()==8) {//tester s'il s'agit d un ouvrage collectif ou pas (Prj_ppt_id()=8 donc c'est un ouvrage collectif)
									ArrayList<ProjetTiers> contributeurs = new ArrayList<>();
									contributeurs = execute.getContributeurs(projet);
									if(contributeurs==null) {
										this.getServletContext().getRequestDispatcher("/WEB-INF/PasDeContributeurs.jsp").forward(request,response);
									}else {
										request.setAttribute("contributeurs", contributeurs);
										this.getServletContext().getRequestDispatcher("/WEB-INF/EtablirContrats.jsp").forward(request, response); //redirection vers la page qui permet de generer les contrats
									}
								}else {
									 this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response);
								}
								break;
					}
							
					case "modifTitre": {
								if(projet.getPrj_ppt_id()==8) {//tester s'il s'agit d un ouvrage collectif ou pas (Prj_ppt_id()=8 donc c'est un ouvrage collectif)
									ArrayList<ProjetTiers> contributeurs = new ArrayList<>();
									contributeurs = execute.getContributeurs(projet);
									if(contributeurs==null) {
										this.getServletContext().getRequestDispatcher("/WEB-INF/PasDeContributeurs.jsp").forward(request,response);
									}else {
										request.setAttribute("contributeurs", contributeurs);
										this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierTitreDeContrib.jsp").forward(request, response); //redirection vers la page qui permet de changer les titres de contributions
									}
								}else {
									 this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response);
								}
								break;
								
								
					}
					}
					
				}
			}
			break;
			} 

		
		 
			//SUITE DU CAS QUI CONCERNE L'AJOUT DES CONTRIBUTEURS D'UN OUVRAGE
			case "AjouterContributeur": {
			String civilite = (String) request.getParameter("Civilite");
			String nom = (String) request.getParameter("Nom");
			String prenom = (String) request.getParameter("Prenom");
			Date dateDeNaissance = null;
			try {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

				String d = (String) request.getParameter("date");
				// quand l'utilisateur n'entre pas une date ,elle est prise comme vide ""
				if (d.equals("")) {
					dateDeNaissance = null; //insertion de la valeur null au lieu d'un vide
				} else {
					dateDeNaissance = format.parse(request.getParameter("date"));
				}} catch (ParseException e) {
					e.printStackTrace();
				}
			
			String adresse = (String) request.getParameter("Adresse");
			String adresse1 = (String) request.getParameter("Adresse2");
			String adresse2 = (String) request.getParameter("Adresse3");
			String adresse3 = (String) request.getParameter("Adresse4");
			String codePostal = (String) request.getParameter("CodePostal");
			String ville = (String) request.getParameter("Ville");
			String pays = (String) request.getParameter("Pays");
			String numeroTelephone = (String) request.getParameter("NumeroTelephone");
			String securiteSociale = (String) request.getParameter("SecuriteSociale");
			String email = (String) request.getParameter("Email");
			String reseauxSociaux = (String) request.getParameter("ReseauxSociaux");
			//creation d'un objet tier (contributeur) avec tous ses coordonnees 
			Tiers tier = new Tiers(civilite, nom, prenom, dateDeNaissance, adresse, adresse1, adresse2, adresse3,
					codePostal, ville, pays, numeroTelephone, securiteSociale, email, reseauxSociaux);
			/**
			 * si le tier existe deja , on fait une mise a jour, s'il n'existe pas on
			 * l'ajoute dans la base de donnees
			 */
			int idTier = 0;
			idTier = execute.isExisteTier(tier); // Recuperer l'identifiant du tier s'il existe
			if (idTier != 0) {// le tier existe deja dans la base
				if (execute.updateTier(tier, idTier)) //Mise a jour des informations concernant le contributeur
					this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); //redirection vers la page du menu
			} else {
				idTier = execute.insertTier(tier); //Nouvelle insertion sinon
				session.setAttribute("idTier", idTier); // ID DE L'OBJET TIER
				Projet projet = (Projet) session.getAttribute("Projet"); // recuperer le projet
				if (execute.insertTierProjet(idTier, projet)) {// inserer le contributeur dans la table " tier- projet"
					// redirection vers l'ajout d'un autre contributeur ou retourner vers le menu .
					this.getServletContext().getRequestDispatcher("/WEB-INF/AjouterUnAutreContributeur.jsp").forward(request, response);
				}else {
					this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); //redirection vers la page du menu
				}
			} 
			break;
			}
			
			
			//LE CAS CONCERNANT L'AJOUT D'UN NOUVEL OUVRAGE 
			case "AjouterOuvrageCollectif": {
			// recuperation des informations de l'ouvrage
			String NumeroProjet = (String) request.getParameter("NumeroProjet");
			String CodeInterne = (String) request.getParameter("CodeInterne");
			String Titre = (String) request.getParameter("Titre");
			String SousTitre = (String) request.getParameter("SousTitre");

			Date DateCreation = null, DateProgrammation = null, DateParution = null;
			try {
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

				String d = (String) request.getParameter("DateCreation");
				// quand l'utilisateur n'entre pas une date ,elle est prise comme vide ""
				if (d.equals("")) {
					DateCreation = null; //insertion de la valeur null au lieu d'un vide
				} else {
					DateCreation = format.parse(request.getParameter("DateCreation"));
				}

				String d2 = (String) request.getParameter("DateProgrammation");
				if (d2.equals("")) {
					DateProgrammation = null;
				} else {
					DateProgrammation = format.parse(request.getParameter("DateProgrammation"));
				}

				String d3 = (String) request.getParameter("DateParution");
				if (d3.equals("")) {
					DateParution = null;
				} else {
					DateParution = format.parse(request.getParameter("DateParution"));
				}
			} catch (ParseException e) {
				e.printStackTrace();
			}

			String Auteur = (String) request.getParameter("Auteur");
			Projet projetCollectif = new Projet(NumeroProjet, CodeInterne, Titre, SousTitre, DateCreation,// creation d'un objet Projet
					DateProgrammation, DateParution, Auteur); 
/**
 * si le projet existe , deja ,on fait une mise a jour ,
 * s'il n existe pas je l'insert a nouveau
 */
			int idProjet = 0;
			idProjet = execute.isExisteProjet(projetCollectif); // Recuperer l'identifiant de l'ouvrage s'il existe
			if (idProjet != 0) {     // le projet existe deja dans la base
				if (execute.updateProjet(projetCollectif,idProjet)) //mettre a jour les numeros du projet 
					this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); 
			}else {
					if (execute.ajouterProjet(projetCollectif)) { // Insertion reussie
						this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); 
					}else {  //redirection vers "projet existe deja "
						this.getServletContext().getRequestDispatcher("/WEB-INF/ProjetExistant.jsp").forward(request, response); 
					}
				}
			break;
			}

		
		
			//LE CAS CONCERNANT L'AJOUT D'UN NOUVEL OUVRAGE 
			case "AjouterTitreContribution": {
			ArrayList<ProjetTiers> contributeurs ;
			String titreContribution=(String)request.getParameter("titreContribution"); //recuperation du titre de contribution
			int projetId =(int)session.getAttribute("projetId");
			int tierId =(int)session.getAttribute("tierId");
			//added
			String cas=(String)session.getAttribute("cas");
			
				if(execute.addContibTitle(projetId,tierId,titreContribution)) { //ajouter le titre de contribution dans la base de donnees
					contributeurs = new ArrayList<>();
					contributeurs = execute.getContributeursByProjectId(projetId); //recuperation de tous les contributeurs dans un meme ouvrage a partir de l'identifiant de l'ouvrage 
					
					request.setAttribute("contributeurs", contributeurs);
						if(cas.equals("Modifier")) { //il s'agit d'une modification d'un titre de contribution 
						this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierTitreDeContrib.jsp").forward(request, response); 
						}else 
					this.getServletContext().getRequestDispatcher("/WEB-INF/AjouterTitresContributions.jsp").forward(request, response);//ajouter d'autre titres de contributions
				
				}else {
					this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response); 
				}
				
				break;
			}
			
		
		
		
	
		}
	}
}
