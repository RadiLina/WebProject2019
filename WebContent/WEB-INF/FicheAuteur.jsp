<%@page import="Beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Fiche auteur </title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
   <link rel="stylesheet" href="assets/css/mainSeptentrionFA.css" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   <style type="text/css">
   ul {
  display: inline;
  margin: 0
  padding: 0;
}
ul li {display: inline-block;}

ul li:hover ul {display: block;}
ul li ul {
  position: absolute;
  width: 150px;
  display: none;
  list-style-type: circle;
}
ul li ul li { 
  background: #6cc091; 
  display: block; 
}
ul li ul li a {display:block !important;} 
ul li ul li:hover {background: #666;}
</style>
</head>
<body>
     
           
          
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">
                    
                    
                    
                    
      <!--  
      Logo Septentrion 
      -->
                      
                                                                             
                        <img src="assets/img/Septentrion_Logo.jpg" style="width: 250px;" style="height: 100px;" />

                    </a>
                    
                </div>
                <!--  <span class="logout-spn" > 
				<a href="#" style="color:#fff;"><i class="fa fa-power-off" aria-hidden="true" style="font-size: 0.8em;text-align:center;"><br>Déconnecter</i></a>
                </span>-->
              <span style="float:right;margin-top: 20px;margin-right: 20px;">
              <ul>
    <li>
      <!-- Recuperation des identifiants de l'utilisateur  -->
              <img src="images/client.png" style="width: 40px;"><%Utilisateur u=(Utilisateur)session.getAttribute("utilisateur");
                     
                     out.println(u.getUti_nom()+" "+u.getUti_prenom());
                     %>
                     <ul>
        <li><a href="Servlet?pageName=deconnecter" style="color:#fff;"><i class="fa fa-power-off" aria-hidden="true" style="font-size: 1.2em;margin:5px;">Déconnecter</i></a></li>
       
      </ul>
                     </li>
    </ul>
              </span>
            </div>
        </div>
        <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            

        </nav>
        <!-- /. NAV SIDE  -->
       
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
   <footer id="footer">
				<div class="inner">

					<h3 style="color:black;">Fiche Auteur </h3>

					<form method="post" action="Servlet">

						<div class="field half first">
							<label for="name">Civilité</label>
							
							<select name="Civilite" >
							  <option value="Madame">Madame</option>
							  <option value="Monsieur">Monsieur</option>
							</select>
							  
							  
							
							
						</div>
						<br>
						<div class="field half">
							<label for="email">Nom</label>
							<input  type="text" name="Nom" value="" placeholder="Nom" pattern="[A-Z][^0-9]+" REQUIRED >
						
						</div>
						<div class="field half">
							<label for="text">Prenom</label>
							<input  type="text" name="Prenom" value="" placeholder="Prenom" pattern="[A-Z][^0-9]+" REQUIRED >
						
						</div>
						<div class="field half">
							<label for="date">Date de naissance</label>
							<input  type="date" name="date"  max="2019-01-01" placeholder="Date de naissance"  >
						
						</div>
						<div class="field half">
							<label for="text">Adresse</label>
							<input  type="text" name="Adresse" value="" placeholder="Adresse"  >
						</div>
						<div class="field half">
							<label for="text">Adresse 2</label>
							<input  type="text" name="Adresse2" value="" placeholder="Adresse 2"  >
						</div>
						<div class="field half">
							<label for="text">Adresse 3</label>
							<input  type="text" name="Adresse3" value="" placeholder="Adresse 3"  >
						</div>
						<div class="field half">
							<label for="text">Adresse 4</label>
							<input  type="text" name="Adresse4" value="" placeholder="Adresse 4" >
						</div>
						
						
						<div class="field half">
							<label for="text">Code Postal</label>
							<input  type="text" name="CodePostal" value="" placeholder="Code Postal" >
						
						</div>
						<div class="field half">
							<label for="text">Ville</label>
							<input  type="text" name="Ville" value="" placeholder="Ville" pattern="[A-Z][^0-9]+"  >
						
						</div>
						<div class="field half">
							<label for="text">Pays</label>
							<input  type="text" name="Pays" value="" placeholder="Pays" pattern="[A-Z][^0-9]+"  >
						
						</div>
						<div class="field half">
							<label for="message">Numero de Telephone(0XXXXXXXXX)</label>
							<input type="text" name="NumeroTelephone" placeholder="Numero de telephone" value=""  pattern="[0][0-9]{3}[0-9]{2}[0-9]{2}[0-9]{2}" >
						</div>	
						<div class="field half">
							<label for="message">Numero de sécurité sociale</label>
							<input type="text" name="SecuriteSociale" placeholder="Ex 1 85 11 18 148 410" value="" pattern="[12][ \.\-]?[0-9]{2}[ \.\-]?(0[1-9]|[1][0-2])[ \.\-]?([0-9]{2}|2A|2B)[ \.\-]?[0-9]{3}[ \.\-]?[0-9]{3}">
						</div>
						<div class="field half">
							<label for="text">Email</label>
							<input  type="email" name="Email" value="" pattern="[a-zA-Z0-9!#$%&amp;'*+\/=?^_`{|}~.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*" placeholder="Email"  >
						
						</div>
						<div class="field half">
							<label for="message">Comptes réseaux sociaux</label>
							<input type="text" name="ReseauxSociaux" placeholder="Comptes réseaux sociaux" value="" >
						</div>
						<br>
							
						
							<br>
							<br>
							<br>
						
						<input type="hidden" name="pageName" value="AjouterContributeur">
						<ul class="actions">
							<li><input id="Submit" value="Ajouter" class="button alt" type="submit" onclick="myFunction()"></li>
						</ul>
						
						
					</form>


				</div>
			</footer>

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    <script>
function myFunction() {
	alert( "Contributeur bien ajouté !");
}
</script>  
</body>
</html>