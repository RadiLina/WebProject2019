<%@page import="Beans.Utilisateur"%>
<%@page import="Beans.Projet"%>
<%@ page import="java.util.ArrayList"%>
<%@page import="java.text.DateFormat"%> 
<%@page import="java.text.SimpleDateFormat"%> 
<%@page import="java.time.LocalDateTime"%> 
<%@page import="java.time.format.DateTimeFormatter"%> 
<%@page import="java.util.Calendar"%> 
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%> 
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Consulter Projets  </title>
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
<style>


/* Style the tab */
.tab {
    overflow: hidden;
    border: 1px solid #b32c29;
    background-color: #b32c29;
    border-top-left-radius: 10px;
    border-top-right-radius: 10px;
}

/* Style the buttons inside the tab */
.tab button {
    background-color: inherit;
    float: left;
    border: none;
    outline: none;
    cursor: pointer;
    padding: 14px 16px;
    transition: 0.3s;
    font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #b32c29;
    border-top: none;
    border-radius:10px;
    border-top-left-radius: 0px;
    border-top-right-radius: 0px;
}
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
              <img src="images/client.png" style="width: 40px;"><%Utilisateur utilisateur =(Utilisateur)session.getAttribute("utilisateur");
              if(utilisateur!=null)out.println(utilisateur.getUti_nom()+" "+utilisateur.getUti_prenom());
             
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
        
        <div id="page-wrapper" >
            <div id="page-inner">
                 
                <hr/>
                <div class="row text-center pad-top" style="padding-left:30px;">
                  		<h2 style="float:left;">Consulter Projets:</h2>
                  		<br>
                  		<br>
                  		<div class="tab" style="margin-top: 20px;">
  <button class="tablinks" onclick="openCase(event, 'Paru')">Projets parus</button>
  <button class="tablinks" onclick="openCase(event, 'NonParu')">Projets non parus</button>
  <button class="tablinks" onclick="openCase(event, 'Autre')">Autres</button>
</div>

<div id="Paru" class="tabcontent">
  <h3 style="float: left;">Projets parus</h3>
  <div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Numero projet</th>
                                        <th>Numero septentrion</th>
                                        <th>Auteur principal</th>
                                        <th>Titre</th>
                                        <th>Date programmation</th> 
                                        <th width="10%">Date parution</th>
                                        
                                        
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                <%  
                
                                ArrayList<Projet> projets =(ArrayList)request.getAttribute("projets");
                                
                                int j=0;    
                                for(int i=0;i<projets.size();i++){
                                Date dateParution= projets.get(i).getPrj_date_parution();
								Date dateActuelle = java.sql.Date.valueOf(LocalDate.now());
                                

     
        /**
        *
        * Condition pour les projets parus 
        *
        **/
        
        
       							 if (dateParution!=null && dateActuelle.after(dateParution)) {
       								j++;
                                	if(j%2==0){
                                    	out.println("<tr style=\"background-color:#9c9090;\">");
                                    	}
                                    	if(j%2==1){
                                    	out.println("<tr style=\"background-color:#e5e6e8;\">");}
                                    	out.println("<td>"+projets.get(i).getPrj_num_projet()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_num_septentrion()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_auteur_principal()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_titre()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_programmation()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_parution()+"</td>");
                                    	
                                		out.println("</tr>");
       							 }   
        }
                                
                                
                                
                                %>
                                    <tr>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
                        </div>
</div>

<div id="NonParu" class="tabcontent">
   <h3 style="float: left;">Projets non parus:</h3>
  <div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Numero projet</th>
                                        <th>Numero septentrion</th>
                                        <th>Auteur principal</th>
                                        <th>Titre</th>
                                        <th>Date programmation</th>
                                        <th width="10%">Date parution</th>
                                    
                                        
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                 <%  
                                 int k=0; 
                            for(int i=0;i<projets.size();i++){
                            Date dateParution= projets.get(i).getPrj_date_parution();  
							Date dateActuelle = java.sql.Date.valueOf(LocalDate.now());
							
							
		/**
		*
		* Condition pour les projets non parus 
		*
		**/					   
		
        					 if (dateParution!=null && dateActuelle.before(dateParution)) {
        						 k++;
                                	if(k%2==0){
                                    	out.println("<tr style=\"background-color:#9c9090;\">");
                                    	}
                                    	if(k%2==1){
                                    	out.println("<tr style=\"background-color:#e5e6e8;\">");}
                                    	out.println("<td>"+projets.get(i).getPrj_num_projet()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_num_septentrion()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_auteur_principal()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_titre()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_programmation()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_parution()+"</td>");
                                		out.println("</tr>");
        					 }
        }
                                
                                                  
                                %>
                             
                                    <tr>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
                        </div>
</div>
<div id="Autre" class="tabcontent">
  <h3 style="float: left;">Autres</h3>
  <div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th>Numero projet</th>
                                        <th>Numero septentrion</th>
                                        <th>Auteur principal</th>
                                        <th>Titre</th>
                                        <th>Date programmation</th>
                                        <th width="10%" >Date parution</th> 
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                <%  
                    
                                int x=0;
                                for(int i=0;i<projets.size();i++){
                                	Date dateParution= projets.get(i).getPrj_date_parution();
                                	
    /**
    *
    * Condition pour les autres projets (avec date parution==null) 
    *
    **/ 							 
    
       							    if (dateParution==null || dateParution.equals("")) {
     								x++;
                                	if(x%2==0){
                                    	out.println("<tr style=\"background-color:#9c9090;\">");
                                    	}
                                    	if(x%2==1){
                                    	out.println("<tr style=\"background-color:#e5e6e8;\">");}
                                    	out.println("<td>"+projets.get(i).getPrj_num_projet()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_num_septentrion()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_auteur_principal()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_titre()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_programmation()+"</td>");
                                    	out.println("<td>"+projets.get(i).getPrj_date_parution()+"</td>");
                                		out.println("</tr>");
                               
        }
                                
                                }                      
                                %>
                                    <tr>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
                        </div>
</div>
                  		
                  		
             	 </div>


<script>
function openCase(evt, Name) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(Name).style.display = "block";
    evt.currentTarget.className += " active";
}
</script>
              
</body>
</html>