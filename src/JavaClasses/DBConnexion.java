package JavaClasses;

import java.sql.*;
/**
 * @author Lina RADI
 *
 */


//CETTE CLASSE SERT POUR LA CONNEXION A LA BASE DE DONNEES 
public class DBConnexion {
	private static Connection con=null;
	
	
private DBConnexion(){
	try
	{
		try {
			Class.forName("org.postgresql.Driver");
			//getConnection(url:dataBase name, owner name , password) 
			con=(Connection)DriverManager.getConnection("jdbc:postgresql:septentrion", "postgres","123");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	catch(SQLException e1)
	{
		e1.printStackTrace();
	}
}

public static Connection getInstance()
{
	if(con==null)
		new DBConnexion();
	return con;
}



}