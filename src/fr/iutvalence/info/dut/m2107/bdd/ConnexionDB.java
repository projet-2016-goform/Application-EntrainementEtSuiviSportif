package fr.iutvalence.info.dut.m2107.bdd;
import java.sql.*;

import org.omg.CORBA.Request;


public class ConnexionDB {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("driver ok");
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://gigondas/hassaina","hassaina","hassaina");
		} catch (SQLException e) {
			System.out.println("conncter a la bdd");
			e.printStackTrace();
		}
		System.out.println("Connexion établie");
		
		
	}
}