<%@page import="Beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Ajouter un autre contributeur</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <link href="assets/css/mainSeptentrionFA.css" rel="stylesheet" />
    
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
   <style type="text/css">
   ul {
  display: inline;
  margin: 0;
  padding: 0;
  margin-left:25%;
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
                    
                    
                    
                    
<!--  Logo Septentrion -->                                     
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
       
            </div>
             <!-- /. PAGE INNER  -->
             
             
             <!--Body-->
             <br><br><br><br><br>
  <!-- LA PARTIE SE CONNECTER -->           
         
            <div class="table-responsive">
                            <table class="table">
                                <thead>
                                    <tr>
                                        
                                       <th>Ajouter un nouveau contributeur</th>
                                       <th>Retourner vers le menu</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                                <%            
                                
                                out.println("<td><a id=\"nextPageButton\" href=\"Servlet?pageName=toAjouterContributeur2\" class=\"btn btn-primary\">Ajouter un autre contributeur</a></td>");
                                out.println("<td><a id=\"nextPageButton\" href=\"Servlet?pageName=toMenu\" class=\"btn btn-primary\">Retourner vers le menu</a></td>");							                                	
                                
                                %>
                                    <tr>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                        <td> </td>
                                    </tr>
                                   
                                </tbody>
                            </table>
                        </div>
           
          <div class="field half firstAuthentification">
						
							
						

							
			</div>
           	
						
						
			  <!--       <input type="hidden" name="pageName" value="toAjouterContributeur1">           -->
			<input type="hidden" name="pageName" value="toAjouter">
						<ul class="actions">
							
						</ul>
					
			 </form>			
         <!-- /. PAGE WRAPPER  -->
        
   

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