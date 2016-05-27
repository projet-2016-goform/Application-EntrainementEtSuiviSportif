//Classe d'accès à une base PostgreSQL
package fr.iutvalence.info.dut.m2107.bdd;
import java.sql.*;

public class ConnexionDB {
 
 private static final String xPilote = "org.postgresql.Driver";
 private static final String xURL = "jdbc:postgresql://gigondas:5432/battonh";
 private static final String xUser = "battonh";
 private static final String xPassword = "battonh";
 private static Connection con = null;
 

 public ConnexionDB() { 
	 
   try {
	System.out.println("Connexion à la base...");
	Class.forName(xPilote);
	System.out.println("\tPilote chargé.");
   } catch (Exception e) {
	System.err.println("Impossible de charger le pilote " + xPilote);
	e.printStackTrace();
   }

   try {
     con = DriverManager.getConnection(xURL, xUser, xPassword);
	System.out.println("\tConnexion établie.");
   } catch (SQLException e) {
	    System.out.println("SQLException: " + e.getMessage());
	    System.out.println("SQLState:     " + e.getSQLState());
	    System.out.println("VendorError:  " + e.getErrorCode());
	    e.printStackTrace();
   } catch (Exception e) { // Attrape-tout
	e.printStackTrace();
	System.exit(1);
   }
 }

 public static void main(String[] args)
 {
	   ConnexionDB maBD = new ConnexionDB();
 }
}
