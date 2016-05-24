package fr.iutvalence.info.dut.m2107.bdd;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnexionDB {

  public static void main(String[] argv) {

	System.out.println("-------- Test de la connexion à MySQL------------");

	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("où se trouve le driver?");
		e.printStackTrace();
		return;
	}

	System.out.println("Driver bien enregistré");
	Connection connection = null;

	try {
		connection = DriverManager.getConnection("jdbc:postgresql://gigondas:5432/battonh", "battonh",
				"battonh");




	} catch (SQLException e) {
		System.out.println("Connexion échouée, vérifiez le lien");
		e.printStackTrace();
		return;
	}

	if (connection != null) {
		System.out.println("L'accès à la base de données est ouvert");
	} else {
		System.out.println("Impossible d'établir la connexion à la base de données !");
	}
  }
}
