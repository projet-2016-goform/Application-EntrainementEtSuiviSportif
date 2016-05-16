package fr.iutvalence.info.dut.m2107.bdd;
import java.sql.*;

import org.omg.CORBA.Request;


public class ConnexionDB {

	
	
	
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub

		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver ok");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/goform","GOFORM","goform");
		System.out.println("Connexion établie");
		
		
	}
}