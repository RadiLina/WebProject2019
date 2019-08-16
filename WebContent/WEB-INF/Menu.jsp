<%@page import="Beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Menu</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   <style type="text/css">
   ul {
  display: inline;
  margin: 0;
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
            <div class="sidebar-collapse">
               <ul class="nav" id="main-menu">
                 


                     <li class="active-link">
                        <a href="Servlet?pageName=SeConnecter" ><i class="fa fa-desktop "></i>Menu</a>
                    </li>
                   

                    <li>
                        <a href="Servlet?pageName=AjouterUnOuvrageCollectif"><i class="fa fa-book "></i>Ajouter un ouvrage collectif</a>
                    </li>
                    <li>
                        <a href="Servlet?pageName=toAjouterUnContributeur"><i class="fa fa-user" aria-hidden="true"></i>Ajouter un contributeur</a>
                    </li>
					 <li>
                        <a href="Servlet?pageName=toEnterCodeInterne"><i class="fa fa-pencil-square-o "></i>Ajouter des titres de contribution</a>
                    </li>
 					<li>
                        <a href="Servlet?pageName=toEnterCodeInterne&resultPage=contrat"><i class="fa fa-file "></i>Etablir un contrat</a>
                    </li>
                   
                    <li>
                        <a href="Servlet?pageName=toRechercherUnOuvrage"><i class="fa fa-search "></i>Rechercher un ouvrage</a>
                    </li>
                     <li>
                        <a href="Servlet?pageName=toConsulterLesOuvrages"><i class="fa fa-list "></i>Consulter les ouvrages</a>
                    </li>
                    <li>
                        <a href="Servlet?pageName=toEnterCodeInterne&resultPage=modifTitre"><i class="fa fa-wrench"></i>Modifer le titre de contribution</a>
                    </li>
                     <li>
                        <a href="Servlet?pageName=deconnecter"><i class="fa fa-power-off "></i>Deconnecter</a>
                    </li>
                  
                    
                   
                </ul>
                            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
            <div id="page-inner">
                              
                 <!-- /. ROW  -->
                  <hr />
                <div class="row">
              
                    <div class="col-lg-12 ">
                        <div class="alert alert-info">
                             <strong>Bienvenue ! </strong>
                        </div>
                       
                    </div>
                    </div>
                  <!-- /. ROW  --> 
                            <div class="row text-center pad-top">
                  <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=AjouterUnOuvrageCollectif" >
 <i class="fa fa-book  fa-5x"></i>
                      <h4>Ajouter un ouvrage collectif</h4>
                      </a>
                      </div>
                     
                     
                  </div> 
             
             <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=toEnterCodeInterne&resultPage=contrib" >
 <i class="fa fa-user fa-5x" aria-hidden="true" ></i>
                      <h4>Ajouter un contributeur</h4>
                      </a>
                      </div>
                     
                     
                  </div> 
                 
                  <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=toEnterCodeInterne&resultPage=titre" >
<i class="fa fa-pencil-square-o fa-5x"></i>
                      <h4>Ajouter des titres de contribution</h4>
                      </a>
                      </div>
                  </div>
                  
                  <div class="">
                      
                      
                     
                  </div>
                 
                  <div class="">    
                      <div class="div-square">
                           <a href="Servlet?pageName=toEnterCodeInterne&resultPage=contrat" >
 <i class="fa fa-file fa-5x"></i>
                      <h4>Etablir un contrat</h4>
                      </a>
                      </div>                    
                    </div> 
                 
             
             
              </div>
                 <!-- /. ROW  --> 
                <div class="row text-center pad-top">
                 
                 
                  
                  <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=toRechercherUnOuvrage" >
 <i class="fa fa-search fa-5x"></i>
                      <h4>Rechercher un ouvrage</h4>
                      </a>
                      </div>                    
                  </div>
       <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=toConsulterLesOuvrages" >
 <i class="fa fa-list fa-5x"></i>
                      <h4>Consulter les ouvrages</h4>
                      </a>
                      </div>
                     
                     
                  </div>
                  
     			  <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=toEnterCodeInterne&resultPage=modifTitre" >
 <i class="fa fa-wrench fa-5x"></i>
                      <h4>Modifier le titre de contribution</h4>
                      </a>
                      </div>
                  </div>
                  
                  
                  <div class="">
                      <div class="div-square">
                           <a href="Servlet?pageName=deconnecter" >
 <i class="fa fa-power-off fa-5x"></i>
                      <h4>Déconnecter</h4>
                      </a>
                      </div>
                  </div>
                  
                  
                  
              </div>   
                  <!-- /. ROW  -->    
                 <div class="row text-center pad-top">
                   
                
                  
                  </div>
              </div>
                 <!-- /. ROW  -->  
                 <div class="row text-center pad-top">
                 
              
              </div>   
                  <!-- /. ROW  -->  
                
                 <!-- /. ROW  -->   
				  <div class="row">
                    <div class="col-lg-12 ">
					<br/>
                      
                       
                    </div>
                    </div>
                  <!-- /. ROW  --> 
    </div>
             <!-- /. PAGE INNER  -->
            </div>
         <!-- /. PAGE WRAPPER  -->
        </div>
    <div class="footer">
      
    
            <div class="row">
                <div class="col-lg-12" >
                    
                </div>
            </div>
        </div>
          

     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
      <!-- CUSTOM SCRIPTS -->
    <script src="assets/js/custom.js"></script>
    
   
</body>
</html>