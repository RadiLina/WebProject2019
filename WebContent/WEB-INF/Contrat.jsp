

<%@page import="Beans.Projet"%>
<%@page import="Beans.Tiers"%>
<%@page import="Beans.ProjetTiers"%>
<%@page import="JavaClasses.MesMethodes"%>


<%@page import="java.util.Calendar"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
    
<% 
		
		int projetId=Integer.parseInt(request.getParameter("projetId"));
		int tierId= Integer.parseInt(request.getParameter("tierId"));
		  
		MesMethodes execute=new MesMethodes();
		Tiers contributeur =(Tiers)execute.creerTier(tierId);
		
		Projet projet= (Projet)execute.getProjectById(projetId);
		String titreContribution= execute.getContribTitleByIds(projetId, tierId);
		Calendar now = Calendar.getInstance();
		
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contrat <%= contributeur.getTie_prenom() %> <%= contributeur.getTie_nom() %> </title>
<style>
#signatureClient {
    float: right;
     padding-right:5em;
}
#signatureAgence {
    float: left;
     padding-left:5em;
}
#date {
float: right;
 padding-right:3em;
}
#bothContrat{
		height:50em;
		border-radius: 0px;
		
		 padding-right:2em;
		padding-left:1em; 
}
div.justiferText {
  text-align: justify;
  text-justify: inter-word;
  font-size: 15px;
}		
</style>
</head>
<body>
<img src="assets/img/Septentrion_Logo.jpg" style="width: 35%;float:right;" />


<section id="banner1">
<div class="inner" style="    padding-top: unset">

<div class="RightSide"> 
      <div class="catrow">
        <ul>

 <section class="wrapper">
          <ul   id="bothContrat" >
         
              <br> 
					
                 <h1 style="text-align:center;margin-bottom: 0px;" >CONTRAT D’ÉDITION <br>
												CONTRIBUTEUR D’OUVRAGE     </h1> 
           
              
<div class="justiferText">               
<p  style="white-space: pre-line;"> 
Entre les soussignés : 
Les <b> Presses Universitaires du Septentrion, </b> 
représentées par leur Directrice scientifique Madame <b> Catherine Denys </b>,
dont le siège est situé rue du Barreau, BP 30199, 59654 VILLENEUVE D’ASCQ CEDEX, 
ci-après dénommées « l’Éditeur », d’une part,

et

<%= contributeur.getTie_civilite() %> <b> <%= contributeur.getTie_prenom() %> <%= contributeur.getTie_nom() %> </b> ,demeurant <b> <%=  "".equals(contributeur.getTie_pro_adresse()) ? "" : contributeur.getTie_pro_adresse()+"," %> <%="".equals(contributeur.getTie_adresse_l1()) ? "" : contributeur.getTie_adresse_l1()+","  %> 
<%= "".equals(contributeur.getTie_adresse_l2()) ? "" : contributeur.getTie_adresse_l2()+"," %> <%= contributeur.getTie_pro_cp() %> <%= contributeur.getTie_pro_ville() %>,<%= contributeur.getTie_pro_pays()%>. </b> 			
ci-après dénommé « l’Auteur », d’autre part, 
il a été convenu ce qui suit : 
</p>
<b> Article 1 – Étendue de la cession </b> <br>
		L’Auteur cède à l’Éditeur, qui y consent pour lui-même et pour ses ayants droit, ses droits (ci-après les « Droits d’auteur ») pour la reproduction de la Contribution : <br>
			<!-- text-justify: inter-word;  //  style="text-align:center;"-->
<center> <p style="text-align: center;;max-width: 450px;" > <b>  <%= titreContribution %>  </b>   <br>
 au sein de l’ouvrage  <br>
 <b> <%= projet.getPrj_titre() %>  </b>  <br>
sous la direction de <b> <%= projet.getPrj_auteur_principal() %> </b>  </p>  </center>
			 
aux conditions suivantes :<br>

		Les Droits d’auteur cédés comprennent le droit de reproduction, le droit de représentation, le droit de mise à disposition du public, le droit de reprographie, le droit de prêt, le droit de représentation et de reproduction sonore, le droit d’adaptation et le droit de traduction de la Contribution sur tous supports, par tous procédés, et notamment par tous services de communication au public en ligne, par télédiffusion, par réseaux ou autres systèmes de télécommunication tels que l’Internet, sur tous supports, connus ou inconnus à ce jour, notamment papier et numérique, en tous formats connus ou inconnus à ce jour. 
		<br><br>
		L’Auteur accepte que la Contribution fasse l’objet de modifications afin de répondre aux spécificités techniques des supports de son exploitation.
		<br><br>
		Cette cession est réalisée pour le monde entier et pour toute la durée de la protection légale d’après les législations tant françaises qu’étrangères ainsi que les conventions internationales. 
		<br><br>
		Elle est consentie à titre exclusif pour une durée de dix (10) ans à compter de la date de signature du présent contrat.
		<br><br>
		Cette cession vaut tant pour une exploitation de la Contribution de l’auteur au sein de l’ouvrage mentionné préalablement que pour une exploitation individuelle de la Contribution. Le contributeur bénéficie néanmoins d’un droit de diffusion secondaire au terme d’un délai de vingt-quatre mois à compter de la date de publication de l’ouvrage.

<br>
<br>
<b> Article 2 – Déclarations et Garanties </b><br>
		L’Auteur déclare expressément disposer des droits de propriété intellectuelle qu’il cède aux termes du Contrat et garantit à l’Éditeur la jouissance paisible et entière et libre des droits cédés contre tous troubles, revendications et évictions quelconques. 
		<br><br>
		L’Auteur garantit notamment que sa Contribution est inédite et entièrement originale et ne contient aucun emprunt à une autre œuvre de quelque nature que ce soit qui serait susceptible d’engager la responsabilité de l’Éditeur.


<p style="float:left;"> 
<br> <br> 
Page 1 sur 2  <br>  
contrat <b> <%= contributeur.getTie_nom() %></b>  (contrib)
</p>

<div style="float:right;width:350px;"> 

<p style="float:left; font-size:12px;"  border="0"> 			 
	    <b> Presses Universitaires du Septentrion </b> <br>
<!--	    <p style="float:left;" > <font size="2">     -->
		rue du Barreau – BP 30199<br>
		59 654 Villeneuve d’Ascq cedex – France<br>
		téléphone : 03 20 41 66 80<br>
		fax : 03 20 41 66 90<br>
		www.septentrion.com ● contact@septentrion.com
		</p>
 <img src="images/Septentrion/images_petit_logo.jpg" style="width:80px;float:right" border="0" />
 
 </div>
  </p> 
      
  <br>   <br>   <br>   <br> <br> <br> <br> 
			L’Auteur garantit également que sa Contribution ne contient rien qui puisse tomber sous le coup des lois et usages relatifs à la contrefaçon, à la diffamation, l'injure, la vie privée, le droit à l'image, les droits de la personnalité et tous droits de tiers.
			<br><br>
			L’Auteur s’engage à obtenir les autorisations nécessaires à la reproduction des illustrations qu’il apporte aux fins de publication et à les transmettre à l’Éditeur. Il garantit l’Éditeur contre toute revendication ou éviction quelconque relative à ces illustrations.

<br>
<br>
<b> Article 3 – Cession à titre gracieux</b><br>
		L’Auteur consent expressément la cession de ses droits de reproduction et de représentation, et droits dérivés, sur les supports spécifiés au Contrat, pour la durée et le lieu spécifié, à titre gracieux, notamment en raison des conditions particulières d’édition de l’Ouvrage et de sa finalité culturelle et éducative.
		<br><br>
		La contrepartie de la présente cession étant : <br>
		-	l’investissement financier réalisé par l’Éditeur<br>
		-	le gain de notoriété que l’Ouvrage apportera à l’Auteur, s’agissant d’un thème très spécialisé.<br>
		-	la mise à disposition de la version de l’Éditeur de la Contribution pour un usage personnel sur son site internet personnel, sur le site de son centre de laboratoire ou sur un site d’archivage tel que mentionné sur la base de données HELOISE, sous réserve de la mention de la première publication chez l’Éditeur et du respect de la politique de l’éditeur en matière d’archives ouvertes.
				<br>	<br>L’Auteur recevra également un exemplaire de l’Ouvrage. Les exemplaires sollicités en plus par l'Auteur seront facturés avec 50 % de remise sur le prix de vente hors taxes (frais de port en sus). Ces exemplaires sont incessibles.
<br>
<br>			
<b> Article 4 – Mention du nom et aménagement de la Contribution </b><br>
			Le nom de l’Auteur devra toujours figurer comme auteur de la Contribution. Compte tenu des caractéristiques de l’Ouvrage, dans lequel différentes contributions seront publiées, il est convenu que l’Éditeur pourra apporter des aménagements à la Contribution, sous réserve que ceux-ci soient préalablement soumis à l’Auteur. Les épreuves seront retournées à l’Éditeur avec le bon à tirer de l’Auteur.

<br>
<br>
<b> Article 5 – Mises à jour des nouvelles éditions</b><br>
			L’Auteur s’engage à apporter, à la demande de l’Éditeur, les modifications nécessaires à sa Contribution pour que celle-ci conserve son actualité ou la convenance à son objet.
			
<br>
<br>			
<b> Article 6 – Résiliation </b> <br>
			En cas de manquement d'une des Parties à ses obligations, le Contrat pourra être résilié par l'autre Partie, dans un délai de deux (2) mois suivant l'envoi d'une mise en demeure visant des manquements contractuels adressée par lettre recommandée avec accusé de réception et restée infructueuse.
			<br><br>En cas de résiliation, l’Auteur recouvrera la jouissance de ses droits et l’Éditeur sera dégagé de toute obligation vis-à-vis de l’Auteur.
			<br><br>Cette résiliation sera toutefois sans effet sur les cessions et autorisations consenties par l’Éditeur à des tiers en exécution du Contrat.

<br>
<br>
<b> Article 7 - Attribution de compétence </b><br>
			Pour tout litige né de l'interprétation ou de l'exécution du Contrat, il est fait attribution expresse de juridiction aux tribunaux compétents dans le ressort de la Cour d’appel de Lille.
			<p  style="white-space: pre-line;margin-top: 0px;margin-bottom: 0px;">
			Fait et signé, 
			À Villeneuve d’Ascq, le <%= now.get(Calendar.DAY_OF_MONTH)+"/"%> <%=now.get(Calendar.MONTH)+1+"/" %> <%=now.get(Calendar.YEAR )%>
			<p style="float:left;white-space: pre-line;margin-top: 0px;margin-bottom: 0px;">
			
			L’Auteur,
			<b> <%= contributeur.getTie_prenom() %> <%= contributeur.getTie_nom() %> </b>
			</p>
			
<div style="float:right;width:200px;margin-right: 100px;"> 

<p style="white-space: pre-line;float:left;"  border="0"> 			 
			Pour l’éditeur, 
			Catherine DENYS	 
			</p>
		</p>
  <img src="images/Septentrion/catherine.jpg" style="width:80px;float:right" border="0" />
 
 </div>
			 
			
		
			<p style="float:left;white-space: pre-line;margin-top: 0px;margin-bottom: 0px;margin-top: 0px;margin-bottom: 0px;"> 
			
					
Page 2 sur 2   
contrat <b> <%= contributeur.getTie_nom() %></b>  (contrib).<b> <%= projet.getPrj_titre() %>  </b> 
</p> 
 <img src="images/Septentrion/images_petit_logo.jpg" style="width:80px;float:right ;margin-top: 0px;margin-bottom: 0px;" />			
			</p>
 </div>						      
            </div>
      
          </section>
      
    <p > 
  <input id="input" type="button" value="imprimer" onclick="myFunction()">       
    </p>    
     
</body>
</html>

<script> 
	function myFunction() {
	  document.getElementById("input").remove(); //suppression du bouton dans le contrat
	  window.print(); // method pour afficher le contrat
	}
</script>