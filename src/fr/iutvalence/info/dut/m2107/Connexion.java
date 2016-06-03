package fr.iutvalence.info.dut.m2107;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import fr.iutvalence.info.dut.m2107.ihm.IHMConnexionUser;
import fr.iutvalence.info.dut.m2107.ihm.IHMWindow;

public class Connexion {


	/**
	 * Email avec doit être un caractère puis un  @ un autre type de caractère et enfin un point suivit d'autre caractère tout en miniscule.
	 */
	private static final String EMAIL_PATTERN = "^[_aA-Za-z0-9--]+(\\.[_A-Za-z0-9--]+)*@[A-Za-z0-9--]+(\\.[A-Za-z0-9--]+)+$";

	/**
	 * //Mot de passe comprend une majusculte en début puis n'importe quel caractère de type [a-z 0-9]
	 */
	private static final String MOT_DE_PASSE ="^[A-Z][A-Za-z0-9]+";
	
	/**
	 * Vérifie que la connexion est possible
	 * @param mail
	 * @param MDP
	 * @return
	 */
	public static boolean estUneConnexion(String mail, String MDP) {
		if(mail.matches(EMAIL_PATTERN)&& MDP.matches(MOT_DE_PASSE))
			return true;
		else return false;
	}
	
	
	/**
	 * Se connecter
	 */
	public Connexion(){
	try {
		
	      System.out.println("Driver O.K.");
	      
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        System.out.println("Driver O.K.");

        String url = "jdbc:postgresql://gigondas:5432/battonh";
	    String user = "battonh";
	    String passwd = "battonh";
	    Connection connexion = DriverManager.getConnection(url, user, passwd);
        
        Statement stmt = connexion.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT mail, mdp FROM utilisateur");
        String ln = null;
        String email = null;
        String fn = null;
        String mdp = null;
        
        while (rs.next()) {
        	ln = rs.getString("mail");
        	email = IHMConnexionUser.jTextFieldMail.getText();
        	fn = rs.getString("mdp");
        	mdp = new String(IHMConnexionUser.jPasswordField0.getPassword());
        		        	
        	
        }
        if (ln.equals(email)&& fn.equals(mdp))
    	{
    		IHMWindow.main(null);
    		IHMConnexionUser fcnxx = new IHMConnexionUser();
    		fcnxx.dispose();
    		
    	}
    	else {

    		System.out.println("erreur coordonnées");
    		Component frame = null;
    		JOptionPane.showMessageDialog(frame ,
    			    "Il semblerait que vos identifiants ne soient pas correct. Veuillez réessayer :",
    			    "Erreur de connexion",
    			    JOptionPane.OK_OPTION);
    		IHMConnexionUser.main(null);
		}
        
	}
	catch(SQLException e2) 
	{
	
		System.err.println("Problème de connexion");
		e2.printStackTrace();
	}
	}
}
		


	


