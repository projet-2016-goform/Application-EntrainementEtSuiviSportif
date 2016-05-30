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
import javax.swing.JTextField;
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
	private JButton bCreerSeance;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JTextField jTextField2;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton0;
	private JButton jButton3;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JButton jButton4;
	private JTextField jTextField5;
	private JButton jButton5;
	private JButton bValider;
	private JLabel jLabel0;
	private JLabel jLabel1;
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
	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Réglages application:");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Réglage profil :");
		}
		return jLabel0;
	}

	private JButton getJButton7() {
		if (bValider == null) {
			bValider = new JButton();
			bValider.setText("Tout valider");
		}
		return bValider;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("Appliquer");
		}
		return jButton5;
	}

	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setText("Poids");
			jTextField5.setAutoscrolls(true);
		}
		return jTextField5;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Appliquer");
		}
		return jButton4;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setText("mot de passe");
			jTextField3.setAutoscrolls(true);
		}
		return jTextField3;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setText("Taille");
			jTextField4.setAutoscrolls(true);
		}
		return jTextField4;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Appliquer");
		}
		return jButton3;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Appliquer");
		}
		return jButton0;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Appliquer");
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Appliquer");
		}
		return jButton1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("e-mail");
			jTextField2.setAutoscrolls(true);
		}
		return jTextField2;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("Prénom");
			jTextField1.setAutoscrolls(true);
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("Nom");
			jTextField0.setAutoscrolls(true);
		}
		return jTextField0;
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
	
	private JButton getbCreerSeance() {
		if (bCreerSeance == null) {
			bCreerSeance = new JButton();
			bCreerSeance.setText("Créer une séance");
		}
		return bCreerSeance;
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
				
		JLabel infos = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\"><u>Informations</u> : <br></p></html>");
		jAccueil.add(infos);
		jAccueil.add(getbQuitter(), new Constraints(new Leading(412, 10, 10), new Trailing(12, 12, 12)));
		
	
	return jAccueil;
}


	private JPanel getjReglages() {
		if (jReglages == null) {
			jReglages = new JPanel();
			jReglages.setLayout(new GroupLayout());
			jReglages.add(getJTextField0(), new Constraints(new Leading(39, 290, 142, 154), new Leading(42, 10, 10)));
			jReglages.add(getJTextField1(), new Constraints(new Leading(39, 290, 151, 151), new Leading(97, 10, 10)));
			jReglages.add(getJTextField2(), new Constraints(new Leading(39, 290, 12, 12), new Leading(152, 10, 10)));
			jReglages.add(getJTextField3(), new Constraints(new Leading(39, 290, 12, 12), new Leading(213, 10, 10)));
			jReglages.add(getJTextField4(), new Constraints(new Leading(39, 290, 130, 130), new Leading(273, 10, 10)));
			jReglages.add(getJTextField5(), new Constraints(new Leading(39, 290, 12, 12), new Leading(333, 10, 10)));
			jReglages.add(getJButton7(), new Constraints(new Leading(400, 10, 10), new Leading(626, 10, 10)));
			jReglages.add(getJButton1(), new Constraints(new Leading(355, 88, 12, 12), new Leading(97, 12, 12)));
			jReglages.add(getJButton0(), new Constraints(new Leading(355, 88, 12, 12), new Leading(42, 12, 12)));
			jReglages.add(getJButton2(), new Constraints(new Leading(355, 88, 12, 12), new Leading(152, 12, 12)));
			jReglages.add(getJButton3(), new Constraints(new Leading(355, 88, 12, 12), new Leading(213, 12, 12)));
			jReglages.add(getJButton4(), new Constraints(new Leading(355, 88, 12, 12), new Leading(273, 12, 12)));
			jReglages.add(getJButton5(), new Constraints(new Leading(355, 88, 12, 12), new Leading(333, 12, 12)));
			jReglages.add(getJLabel0(), new Constraints(new Leading(15, 12, 12), new Leading(14, 12, 12)));
			jReglages.add(getJLabel1(), new Constraints(new Leading(15, 12, 12), new Leading(390, 10, 10)));
		}
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
		        		JLabel id = new JLabel("<html><ul style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\"><li>"+resultatcnx.getString("n_med")+"</li>"+resultatcnx.getString("identite_med")+"<li></li></ul></html>");

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
	        	Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      
			      System.out.println("Connexion effective !");  
			      
			      Statement instruction = connexion.createStatement();
			        
			      
			      ResultSet resultatcnx = instruction.executeQuery("Select * FROM utilisateur WHERE mail = '"+email+"'");	
					System.out.println("test");
			      	while (resultatcnx.next()) {
			        		JLabel id = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">Nom :"+resultatcnx.getString("nom")+"</p><br>"
			        				+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">Prénom : "+resultatcnx.getString("prenom")+"</p><br>"
					        		+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">E-mail : "+resultatcnx.getString("mail")+"</p><br>"
			        				+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">Age : "+resultatcnx.getString("age")+"</p><br>"
			        				+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">Taille : "+resultatcnx.getString("taille")+"</p><br>"
					        		+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">Poids : "+resultatcnx.getString("poids")+"</p><br>"
			        				+ "<p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">IMC : "+resultatcnx.getString("imc")+"</p><br></html>");

							jProfil.add(id);
			        		
			      	}
			      	jProfil.add(getbQuitter(), new Constraints(new Leading(412, 10, 10), new Trailing(12, 12, 12)));
			      
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
