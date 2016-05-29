package fr.iutvalence.info.dut.m2107.ihm;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import java.sql.*;

public class IHMWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTabbedPane jTabbOnglets;
	private JPanel jAccueil;
	private JPanel jProfil;
	private JPanel jEntrainement;
	private JPanel jSuivi;
	private JPanel jReglages;
	private JPanel jApropos;
	private JPanel jSeanceGoform;
	private JPanel jSeanceUser;
	private JTabbedPane jTabbSeance;
	private JList jList0;
	private JScrollPane jScrollPane0;
	private JList jList1;
	private JScrollPane jScrollPane1;
	private JButton bQuitter;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	private ImageIcon img = new ImageIcon("img/icon.png");
	Color red = Color.decode("#c86650");
	
	public IHMWindow() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getjTabbOnglets(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(0, 0, 50)));
		setIconImage(img.getImage());
		setSize(500, 700);
	}

	private JButton getbQuitter() {
		if (bQuitter == null) {
			bQuitter = new JButton();
			bQuitter.setText("Quitter");
		}
		return bQuitter;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJList1());
		}
		return jScrollPane1;
	}

	private JList getJList1() {
		if (jList1 == null) {
			jList1 = new JList();
			DefaultListModel listModel = new DefaultListModel();
			listModel.addElement("fgdfgdgdf");
			listModel.addElement("dfgdgdfgdfg");
			listModel.addElement("gdfgdfgdfgdgdgd");
			listModel.addElement("gdgdgd");
			listModel.addElement("dg");
			listModel.addElement("dd");
			listModel.addElement("null");
			listModel.addElement("dgdggdfdgfdfdd");
			listModel.addElement("item1");
			listModel.addElement("item2");
			listModel.addElement("item3");
			jList1.setModel(listModel);
		}
		return jList1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJList0());
		}
		return jScrollPane0;
	}

	private JList getJList0() {
		
			jList0 = new JList();
			DefaultListModel listModel = new DefaultListModel();
			listModel.addElement("Séance1");
			listModel.addElement("Séance2");
			listModel.addElement("Séance2");
			listModel.addElement("séance3");
			listModel.addElement("Séance4");
			listModel.addElement("Séance de lolololololollo");
			jList0.setModel(listModel);
		
		return jList0;
	}

	private JTabbedPane getJTabbSeance() {
		
			jTabbSeance = new JTabbedPane();
			jTabbSeance.addTab("Seances crées par GoForm", getJSeanceGoform());
			jTabbSeance.addTab("Seances crées par les utilisateurs", getJSeanceUser());
		
		return jTabbSeance;
	}

	private JPanel getJSeanceUser() {
		if (jSeanceUser == null) {
			jSeanceUser = new JPanel();
			jSeanceUser.setVisible(false);
			jSeanceUser.setLayout(new GroupLayout());
			jSeanceUser.add(getJScrollPane1(), new Constraints(new Leading(117, 100, 10, 10), new Leading(36, 135, 10, 10)));
		}
		return jSeanceUser;
	}

	private JPanel getJSeanceGoform() {
		
			jSeanceGoform = new JPanel();
			jSeanceGoform.setLayout(new GroupLayout());
			jSeanceGoform.add(getJScrollPane0(), new Constraints(new Leading(32, 111, 10, 10), new Leading(32, 82, 10, 10)));
		
		return jSeanceGoform;
	}

	private JTabbedPane getjTabbOnglets() {
		
			jTabbOnglets = new JTabbedPane();
			jTabbOnglets.addTab("Accueil", getjAccueil());
			jTabbOnglets.addTab("Profil", getjProfil());
			jTabbOnglets.addTab("Entraînement", getjEntrainement());
			jTabbOnglets.addTab("Suivi", getjSuivi());
			jTabbOnglets.addTab("Réglages", getjReglages());
			jTabbOnglets.addTab("A propos", getjApropos());
		
		return jTabbOnglets;
	}
	


	private JPanel getjAccueil() {
		
		jAccueil = new JPanel();
		jAccueil.getLayout();
		jAccueil.setBackground(red);

		 String fichier ="conseils";	
				try{
					InputStream ips = new FileInputStream(fichier); 
					InputStreamReader ipsr = new InputStreamReader(ips);
					BufferedReader reader = new BufferedReader(ipsr);
					String ligne;
					
					while ((ligne = reader.readLine())!=null){
						JLabel intituleNom = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\"><u>Suivi du jour</u> : <br>"+ligne+"</p></html>");

						jAccueil.add(intituleNom);
					}
					
					reader.close(); 
				}		
				catch (Exception e){
					System.out.println(e.toString());
				}
		    
		jAccueil.add(getbQuitter(), new Constraints(new Leading(412, 10, 10), new Trailing(12, 12, 12)));
	
	return jAccueil;
}


	private JPanel getjReglages() {
		
			jReglages = new JPanel();
			jReglages.setLayout(new GroupLayout());
			
		
		return jReglages;
	}

	private JPanel getjSuivi() {
		
			jSuivi = new JPanel();
			jSuivi.getLayout();
			
			Connection connexion;
			try {
				
				connexion = DriverManager.getConnection("jdbc:postgresql://gigondas:5432/ambrym","ambrym","ambrym");
				java.sql.Statement instruction = connexion.createStatement();
				ResultSet resultatcnx = instruction.executeQuery("Select * FROM medecin");	
				System.out.println("test");
		      	while (resultatcnx.next()) {
		        		JLabel id = new JLabel("<html><ul><li>"+resultatcnx.getString("n_med")+"</li>"+resultatcnx.getString("identite_med")+"<li></li></ul></html>");

						jSuivi.add(id);
		        		
		      	}
		    	}
		    	catch (SQLException ex) { System.err.println("Erreur Localisation BD");}   

		
		return jSuivi;
	}
	
	private JPanel getjEntrainement() {
		
			jEntrainement = new JPanel();
			jEntrainement.setLayout(new GroupLayout());
			jEntrainement.add(getJTabbSeance(), new Constraints(new Leading(0, 500, 12, 12), new Leading(0, 655, 12, 12)));
		
		return jEntrainement;
	}

	private JPanel getjProfil() {
		
			jProfil = new JPanel();
			jProfil.setBackground(red);
			jProfil.getLayout();
	        String email = IHMConnexionUser.jTextFieldMail.getText();
			System.out.println(email);
	        try 
			{
			      Class.forName("com.mysql.jdbc.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:mysql://localhost/goform";
			      String user = "root";
			      String passwd = "";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      Statement instruction = connexion.createStatement();
			        
			      
			      ResultSet resultatcnx = instruction.executeQuery("Select * FROM utilisateur WHERE mail = '"+email+"'");	
					System.out.println("test");
			      	while (resultatcnx.next()) {
			        		JLabel id = new JLabel("<html>Nom :"+resultatcnx.getString("nom")+"<br>"
			        				+ "Prénom : "+resultatcnx.getString("prenom")+"<br>"
					        		+ "E-mail : "+resultatcnx.getString("mail")+"<br>"
			        				+ "Age : "+resultatcnx.getString("age")+"<br>"
			        				+ "Taille : "+resultatcnx.getString("taille")+"<br>"
			        				+ "Poids : "+resultatcnx.getString("poids")+"<br></html>");

							jProfil.add(id);
			        		
			      	}
			      
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
	        
	        
	        
			
		
		return jProfil;
	}
	
	private JPanel getjApropos() {
		
			jApropos = new JPanel();
			jApropos.setLayout(new GroupLayout());
		
		return jApropos;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}
	

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				IHMWindow fwindow = new IHMWindow();
				fwindow.setDefaultCloseOperation(IHMWindow.EXIT_ON_CLOSE);
				fwindow.setTitle("IHMWindow");
				fwindow.getContentPane().setPreferredSize(fwindow.getSize());
				fwindow.pack();
				fwindow.setLocationRelativeTo(null);
				fwindow.setVisible(true);
				
			}
		});
	}

}
