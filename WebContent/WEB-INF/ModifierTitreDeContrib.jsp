<%@page import="Beans.Utilisateur"%>

<%@page import="Beans.Projet"%>
<%@page import="Beans.ProjetTiers"%>
<%@page import="Beans.Tiers"%>
<%@page import="JavaClasses.MesMethodes"%>


<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Modifier un titre de contribution</title>
<link href="assets/css/bootstrap.css" rel="stylesheet" />

     
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
       
    <link href="assets/css/custom.css" rel="stylesheet" />
     
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
                        <a href="Servlet?pageName=toAjouterUnContributeur"><i class="fa fa-user" ></i>Ajouter un contributeur</a>
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

        
        <div id="page-wrapper" >
            <div id="page-inner">
                 
                <hr/>
                <div class="row text-center pad-top" style="padding-left:30px;">
                  		<h2 style="float:left;">Contributeurs:</h2>
                  		<br>
                  		<div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                  	    <th>Titre ouvrage</th>
                                        <th>Contributeur</th>
                                        <th>Titre contribution</th>
                                        <th>Modifier le titre de contribution</th>
                                    </tr>
                                </thead>
                                <tbody>
                                 <% 
                                ArrayList<ProjetTiers> contributeurs =(ArrayList)request.getAttribute("contributeurs");
                               	MesMethodes m=new MesMethodes();
                                
                                for(int i=0;i<contributeurs.size();i++){
                                	                           
                                	
                                	if(i%2==0){
                                    	out.println("<tr style=\"background-color:#bfbcbc;\">");
                                    	}
                                    	if(i%2==1){
                                    out.println("<tr style=\"background-color:#e5e6e8;\">");}
                                	out.println("<td>"+m.getProjectTitleById(contributeurs.get(i).getPau_prj_id()) +"</td>");
                                	out.println("<td>"+m.getTierNameById(contributeurs.get(i).getPau_tie_id())+"</td>");
                                	if(contributeurs.get(i).getPau_titre_contrib()==null){ 
									out.println("<td><a href=\"Servlet?pageName=toAjouterTitreContribution&projetId="+contributeurs.get(i).getPau_prj_id()+"&tierId="+contributeurs.get(i).getPau_tie_id()+"\" class=\"btn btn-success\">Ajouter un titre de contribution</a></td>");     
                                	 }else{
                                		 out.println("<td>"+contributeurs.get(i).getPau_titre_contrib()+"</td>");
                                	 }
                                      
                                	if(contributeurs.get(i).getPau_titre_contrib()!=null){ 
                                    	out.println("<td><a href=\"Servlet?pageName=toAjouterTitreContribution&cas=Modifier&projetId="+contributeurs.get(i).getPau_prj_id()+"&tierId="+contributeurs.get(i).getPau_tie_id()+"\" class=\"btn btn-success\">Modifier</a></td>");     
                                    	 }else{
                                    		 out.println("<td>"+"/"+"</td>");
                                    	 }
                                       
                                      
                                	out.println("</tr>");
                                }
                                %>
                                    
                                </tbody>
                            </table>
                        </div>
                  		
                  		
             	 </div>

              
</body>
</html>