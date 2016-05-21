package fr.iutvalence.info.dut.m2107.bdd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionDB {

  public static void main(String[] argv) {

	System.out.println("-------- Test de la connexion � MySQL------------");

	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("o� se trouve le driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("Driver bien enregistr�");
	Connection connection = null;

	try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/goform","GOFORM", "goform");

	} catch (SQLException e) {
		System.out.println("Connexion �chou�e, v�rifiez le lien");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("L'acc�s � la base de donn�es est ouvert");
	} else {
		System.out.println("Impossible d'�tablir la connexion � la base de donn�es !");
	}
  }
}