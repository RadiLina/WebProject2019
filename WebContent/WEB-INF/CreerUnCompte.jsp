<%@page import="Beans.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Creer un compte</title>
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
              
                     <ul>
      
       
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

					<h3 style="color:black;"> Creer un nouveau compte </h3>

					<form method="post" action="Servlet">

						
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
							<label for="text">Email</label>
							<input  type="email" name="Email" value="" pattern="[a-zA-Z0-9!#$%&amp;'*+\/=?^_`{|}~.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*" placeholder="Email"  >
						
						</div>
						<div class="field half">
							<label for="text">Mot de passe</label>
							<input  type="password" name="password" id="password" onkeyup="check()" value="" minlength="5" placeholder="Saisissez un mot de passe" REQUIRED >
						
						</div>
						<div class="field half">
							<label for="text">Confirmer mot de passe</label>
							<input  type="password" name="password2" id="confirm_password" onkeyup="check()" minlength="5" value="" placeholder="Confirmez le mot de passe" REQUIRED >
						</div>
						<br>
							<span id='message'></span>
						
							<br>
							<br>
							<br>
						
						<input type="hidden" name="pageName" value="CreerCompte">
						<ul class="actions">
							<li><input id="Submit" value="Creer" class="button alt" type="submit" ></li>
						
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
function check() {
	
  if (document.getElementById('password').value ==
    document.getElementById('confirm_password').value) {
    document.getElementById('message').style.color = 'green';
    document.getElementById('message').innerHTML = 'les deux mot de passes sont identiques';
    document.getElementById("Submit").disabled = false;
  } else {
    document.getElementById('message').style.color = 'red';
    document.getElementById('message').innerHTML = 'les deux mot de passes ne sont pas identiques';
    document.getElementById("Submit").disabled = true;
  }
}
</script>  
</body>
</html>