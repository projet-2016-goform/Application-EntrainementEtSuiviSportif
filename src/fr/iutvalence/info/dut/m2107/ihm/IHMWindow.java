/**
 * Classe priincipale de l'application.
 */
package fr.iutvalence.info.dut.m2107.ihm;
import fr.iutvalence.info.dut.m2107.bdd.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
import javax.imageio.ImageIO;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IHMWindow extends JFrame implements ActionListener {

	/**
	 * Elements de l'IHM.
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane jTabbOnglets;
	private JPanel jAccueil;
	private JPanel jProfil;
	public JPanel jEntrainement;
	private JPanel jSuivi;
	private JPanel jReglages;
	private JPanel jApropos;
	private JPanel jSeanceGoform;
	private JPanel jSeanceUser;
	private JTabbedPane jTabbSeance;
	@SuppressWarnings("rawtypes")
	public static JList jListGoform;
	private JScrollPane jScrollPane0;
	@SuppressWarnings("rawtypes")
	public static JList jListUser;
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
	private JLabel jLabel2;
	private JLabel jLabel3;
	private BufferedImage bg;
	private BufferedImage bg_propos;
	private BufferedImage bg_reglages;
	private BufferedImage bg_seance;
	private BufferedImage bg_profil;
	/**
	 * Récupération du look and feel.
	 */
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	/**
	 * Récupération de l'icon.
	 */
	private ImageIcon img = new ImageIcon("img/icon.png");
	/**
	 * Couleur rouge.
	 */
	Color red = Color.decode("#E84C3D");
	/**
	 * Couleur bleu.
	 */
	Color blue = Color.decode("#2D3E50");
	
	/**
	 * Création de la fenetre.
	 */
	public IHMWindow() {
		initComponents();
	}

	/**
	 * Initialisation des composants.
	 */
	private void initComponents() {
		setLayout(new GroupLayout());
		add(getjTabbOnglets(), new Constraints(new Bilateral(0, 0, 0), new Bilateral(0, 0, 0)));
		setIconImage(img.getImage());
		setSize(500, 700);
	
		bCreerSeance.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			CreerUneSceance.main(null);
			
		}
		});
	
	
		jListUser.addListSelectionListener( new ListSelectionListener() {
		public void valueChanged(ListSelectionEvent e) {

		}
		});	
	
	
	}
	
	/**
	 * Label de présentation des séances de l'application.
	 * @return jLabel2
	 */
	private JLabel getJLabelSeanceG() {
		jLabel2 = new JLabel();
		jLabel2.setText("Choisissez parmi les séances que nous vous proposons !");
		jLabel2.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		jLabel2.setForeground(Color.WHITE);
		return jLabel2;
    }
	/**
	 * Label de présentation des séances des autres utilisateurs.
	 * @return jLabel2
	 */
	private JLabel getJLabelSeance() {
		jLabel3 = new JLabel();
		jLabel3.setText("Choisissez parmi les séance de la communauté !");
		jLabel3.setFont(new Font("Sans Serif", Font.PLAIN, 12));
		jLabel3.setForeground(Color.WHITE);
		return jLabel0;
	}
	/**
	 * Label de modifications des réglages de l'application.
	 * @return jLabel1
	 */
	private JLabel getJLabel1() {
			jLabel1 = new JLabel();
			jLabel1.setText("Réglages application:");
			jLabel1.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel1.setForeground(Color.WHITE);
		
		return jLabel1;
	}

	/**
	 * Label de modifications des réglages du profil.
	 * @return jLabel0
	 */
	private JLabel getJLabel0() {
			jLabel0 = new JLabel();
			jLabel0.setText("Réglage profil :");
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.WHITE);
		
		return jLabel0;
	}

	/**
	 * Bouton de validation de toutes les modifications des réglages.
	 * @return bValider
	 */
	private JButton getJButton7() {
			bValider = new JButton();
			bValider.setText("Tout valider");
		
		return bValider;
	}

	/**
	 * Bouton d'application des modifications d'un champ réglages.
	 * @return bValider
	 */
	private JButton getJButton5() {
			jButton5 = new JButton();
			jButton5.setText("Appliquer");
		return jButton5;
	}

	/**
	 * Affichage et récupération des données du poids.
	 * @return jTextField5
	 */
	@SuppressWarnings("unused")
	private JTextField getJTextField5() {
			jTextField5 = new JTextField();
			
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      

			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select poids FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String poids = resultatcnx.getString(1);
			      		jTextField5.setText(""+poids+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			jTextField5.setAutoscrolls(true);
		return jTextField5;
	}

	/**
	 * Bouton d'application des réglages.
	 * @return
	 */
	private JButton getJButton4() {
			jButton4 = new JButton();
			jButton4.setText("Appliquer");
		return jButton4;
	}

	/**
	 * Affichage et récupération des données du mot de passe.
	 * @return jTextField3
	 */
	private JTextField getJTextField3() {
			jTextField3 = new JTextField();
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select mdp FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String mdp = resultatcnx.getString(1);
			      		jTextField3.setText(""+mdp+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			jTextField3.setAutoscrolls(true);
		return jTextField3;
	}

	/**
	 * Affichage et récupération des données de la taille.
	 * @return jTextField4
	 */
	private JTextField getJTextField4() {
			jTextField4 = new JTextField();
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select taille FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String taille = resultatcnx.getString(1);
			      		jTextField4.setText(""+taille+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			jTextField4.setAutoscrolls(true);
		return jTextField4;
	}

	/**
	 * Bouton d'application des modifications.
	 * @return jButton3
	 */
	private JButton getJButton3() {
			jButton3 = new JButton();
			jButton3.setText("Appliquer");
		return jButton3;
	}
	/**
	 * Bouton d'application des modifications.
	 * @return jButton0
	 */
	private JButton getJButton0() {
			jButton0 = new JButton();
			jButton0.setText("Appliquer");
		return jButton0;
	}
	/**
	 * Bouton d'application des modifications.
	 * @return jButton2
	 */
	private JButton getJButton2() {
			jButton2 = new JButton();
			jButton2.setText("Appliquer");
		return jButton2;
	}

	/**
	 * Bouton d'application des modifications.
	 * @return jButton1
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Changer Prenom");
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String prenom = jTextField1.getText();
			      System.out.println(prenom);
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      
			      Statement instruction = connexion.createStatement();	      
			      instruction.executeUpdate("UPDATE utilisateur "
			      		+ "SET prenom='"+prenom+"'"
			      		+ "WHERE mail = '"+email+"';");	
				
		
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
		}
		return jButton1;
	}

	/**
	 * Affichage et récupération des données du mail.
	 * @return jTextField2
	 */
	private JTextField getJTextField2() {
			jTextField2 = new JTextField();
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select mail FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String mail = resultatcnx.getString(1);
			      		jTextField2.setText(""+mail+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			jTextField2.setAutoscrolls(true);
		return jTextField2;
	}

	/**
	 * Affichage et récupération des données du prenom.
	 * @return jTextField1
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select prenom FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String prenom = resultatcnx.getString(1);
			      		jTextField1.setText(""+prenom+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			jTextField1.setAutoscrolls(true);
		}
		return jTextField1;
	}

	/**
	 * Affichage et récupération des données du nom.
	 * @return jTextField0
	 */
	private JTextField getJTextField0() {
			jTextField0 = new JTextField();
			try 
			{
	        	  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      
			      System.out.println("Connexion effective !");  
			      
			      String email = IHMConnexionUser.jTextFieldMail.getText();
			      Statement instruction = connexion.createStatement();	      
			      ResultSet resultatcnx = instruction.executeQuery("Select nom FROM utilisateur WHERE mail = '"+email+"'");	
				
			      	while (resultatcnx.next()) {
			      		String nom = resultatcnx.getString(1);
			      		jTextField0.setText(""+nom+"");
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			
			jTextField0.setAutoscrolls(true);
		return jTextField0;
	}
	
	/**
	 * Bouton quitter
	 * @return bQuitter
	 */
	private JButton getbQuitter() {
			bQuitter = new JButton();
			bQuitter.setText("Quitter");
		return bQuitter;
	}
	
	
	/**
	 * Barre de scroll de la liste des seance des utilisateurs.
	 * @return jScrollPane1
	 */
	private JScrollPane getJScrollPane1() {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJListUser());
		return jScrollPane1;
	}
	
	/**
	 * Récupération du nom de la séance des exercices de l'application après un double click.
	 * @param e
	 */
	public static void nomSeanceG(MouseEvent e){
    	if(e.getClickCount() == 2){
    		 String item = (String) jListGoform.getModel().getElementAt(jListGoform.locationToIndex(e.getPoint()));
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
 						
 			      ResultSet resultatcnx = instruction.executeQuery("INSERT INTO infos(nom) VALUES"+item+";");	
 			      
 				  System.out.println("Libelle :"+resultatcnx.getString("id_seance"));
			      
 			} 
 			catch (Exception ex) 
 			{
 			      ex.printStackTrace();
 			} 
        }
    }
	
	/**
	 * Barre de scroll de la liste des seance prédéfinis.
	 * @return jScrollPane1
	 */
	public static void nomSeance(MouseEvent e){
    	if(e.getClickCount() == 2){
    		 String item = (String) jListUser.getModel().getElementAt(jListUser.locationToIndex(e.getPoint()));
    		 System.out.println("---------------------------"+item);
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
 						
 			      ResultSet resultatcnx = instruction.executeQuery("INSERT INTO infos(nom) VALUES"+item+";");	
 			      
 				  System.out.println("Libelle :"+resultatcnx.getString("id_seance"));
			      
 			} 
 			catch (Exception ex) 
 			{
 			      ex.printStackTrace();
 			} 
        }
    }
	
	
	/**
	 * Liste des séances des utilisateurs.
	 * @return jListUser
	 */
	public static JList getJListUser() {
		jListUser = new JList();
		jListUser.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e){
	        	   if(e.getClickCount() == 2){
	        	     int index = jListUser.locationToIndex(e.getPoint());
	        	     ListModel dlm = jListUser.getModel();
	        	     Object item = dlm.getElementAt(index);;
	        	     jListUser.ensureIndexIsVisible(index);
	        	     System.out.println("Double clicked on " + item);
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
	     				  instruction.executeQuery("UPDATE infos SET nom='"+item+"' WHERE id = 1;");	
	     			      	    			      
	     			} 
	     			catch (Exception ex) 
	     			{
	     			      ex.printStackTrace();
	     			} 
	        	     IHMSceance.main(null);
	        	   }}
					});
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
					        
					      
					      ResultSet resultatcnx = instruction.executeQuery("Select libelle_seance FROM seance WHERE seance_g = FALSE");	
			
			           DefaultListModel dlm = new DefaultListModel();
				       while(resultatcnx.next())
			           { 
			               dlm.addElement(resultatcnx.getString("libelle_seance"));
			           }
				       jListUser.setModel(dlm);
					      
					} 
					catch (Exception ex) 
					{
					      ex.printStackTrace();
					} 
		
		
		return jListUser;
	}
	
	/**
	 * Barre de scroll de la liste des seances prédéfinis.
	 * @return jScrollPane0
	 */
	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJListGoform());
		}
		return jScrollPane0;
	}

	/**
	 * Liste des séances des séances prédéfinis.
	 * @return jListUser
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JList getJListGoform() {
		
			jListGoform = new JList();
			jListGoform.addMouseListener(new MouseAdapter() {
			    public void mouseClicked(MouseEvent e){
		        	   if(e.getClickCount() == 2){
		        	     int index = jListGoform.locationToIndex(e.getPoint());
		        	     ListModel dlm = jListGoform.getModel();
		        	     Object item = dlm.getElementAt(index);;
		        	     jListGoform.ensureIndexIsVisible(index);
		        	     System.out.println("Double clicked on " + item);
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
		     				  instruction.executeQuery("UPDATE infos SET nom='"+item+"' WHERE id = 1;");	
		     			      
		    			      
		     			} 
		     			catch (Exception ex) 
		     			{
		     			      ex.printStackTrace();
		     			} 
		        	     IHMSceance.main(null);
		        	   }}
			});
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
			        
			      
			      ResultSet resultatcnx = instruction.executeQuery("Select libelle_seance FROM seance WHERE seance_g = TRUE");	

                  DefaultListModel dlm = new DefaultListModel();
		    	  while(resultatcnx.next())
                  { 
                      dlm.addElement(resultatcnx.getString("libelle_seance"));
                  }
                  jListGoform.setModel(dlm);
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
			
	
		return jListGoform;
	}
	
	/**
	 * Sous onglets des séances.
	 * @return jTabbSeance
	 */
	private JTabbedPane getJTabbSeance() {
			jTabbSeance = new JTabbedPane();
			jTabbSeance.addTab("Seances crées par GoForm", getJSeanceGoform());
			jTabbSeance.addTab("Seances crées par les utilisateurs", getJSeanceUser());
		return jTabbSeance;
	}
	
	/**
	 * Bouton de la création de séance.
	 * @return bCreerSeance
	 */
	private JButton getbCreerSeance() {
			bCreerSeance = new JButton();
			bCreerSeance.setText("Créer une séance");
		return bCreerSeance;
	}
 
	/**
	 * Séances utilisateurs.
	 * @return jSeanceUser
	 */
    private JPanel getJSeanceUser() {

        try {
        	InputStream is = new FileInputStream("img/bg_seanceList.jpg");
            bg_seance = ImageIO.read(is);
        } catch (IOException ex) {
            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
        }

        JPanel jSeanceUser = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg_seance, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };
        jSeanceUser.setVisible(false);
        jSeanceUser.setLayout(new GroupLayout());
        jSeanceUser.add(getJScrollPane1(), new Constraints(new Leading(50, 400, 15, 15), new Leading(100, 440, 15, 15)));
        jSeanceUser.add(getbCreerSeance(), new Constraints(new Leading(200, 10, 10), new Trailing(20, 12, 12)));
        jSeanceUser.add(getJLabelSeanceG(), new Constraints(new Leading(75, 400, 12, 12), new Leading(25, 50, 12, 12)));

        return jSeanceUser;
	}
	
    /**
	 * Séances prédéfinis.
	 * @return jSeanceGoForm
	 */
	private JPanel getJSeanceGoform() {
			try {
	        	InputStream is = new FileInputStream("img/bg_seanceList.jpg");
	            bg_seance = ImageIO.read(is);
	        } catch (IOException ex) {
	            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
	        }

	        JPanel jSeanceGoForm = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(bg_seance, 0, 0, getWidth(), getHeight(), this);
	            }
	
	            @Override
	            public Dimension getPreferredSize() {
	                return new Dimension(400, 300);
	            }
	        };
	        jSeanceGoForm.setLayout(new GroupLayout());
	        jSeanceGoForm.add(getJScrollPane0(), new Constraints(new Leading(50, 400, 15, 15), new Leading(100, 440, 15, 15)));
	        jSeanceGoForm.add(getJLabelSeanceG(), new Constraints(new Leading(75, 400, 12, 12), new Leading(25, 50, 12, 12)));

	        return jSeanceGoForm;
	}

	/**
	 * Onglets de l'application.
	 * @return jTabbOnglets
	 */ 
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
	

	/**
	 * Affichage de l'accueil.
	 * @return jAccueil
	 */
	private JPanel getjAccueil() {
		try {
        	InputStream is= new FileInputStream("img/bg_accueil.jpg");
            bg = ImageIO.read(is);
        } catch (IOException ex) {
            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
        }

        JPanel jAccueil = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };
		
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
				
		JLabel infos = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px; margin-bottom: 336px;\"><u>Informations</u> : <br></p></html>");
		jAccueil.add(infos);
		jAccueil.add(getbQuitter());
		bQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IHMConnexionUser.main(null);
				
			}
			});

		return jAccueil;
	}

	/**
	 * Affichage des réglages.
	 * @return jReglages
	 */
	private JPanel getjReglages() {
		try {
        	InputStream is= new FileInputStream("img/bg_reglages.jpg");
            bg_reglages = ImageIO.read(is);
        } catch (IOException ex) {
            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
        }

        JPanel jReglages = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(bg_reglages, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };
        
			jReglages.setLayout(new GroupLayout());
			jReglages.add(getJTextField0(), new Constraints(new Leading(39, 290, 142, 154), new Leading(56, 10, 10)));
			jReglages.add(getJTextField1(), new Constraints(new Leading(39, 290, 151, 151), new Leading(111, 10, 10)));
			jReglages.add(getJTextField2(), new Constraints(new Leading(39, 290, 12, 12), new Leading(166, 10, 10)));
			jReglages.add(getJTextField3(), new Constraints(new Leading(39, 290, 12, 12), new Leading(227, 10, 10)));
			jReglages.add(getJTextField4(), new Constraints(new Leading(39, 290, 130, 130), new Leading(287, 10, 10)));
			jReglages.add(getJTextField5(), new Constraints(new Leading(39, 290, 12, 12), new Leading(347, 10, 10)));
			jReglages.add(getJButton7(), new Constraints(new Leading(210, 10, 10), new Leading(620, 10, 10)));
			jReglages.add(getJButton1(), new Constraints(new Leading(355, 88, 12, 12), new Leading(111, 12, 12)));
			jReglages.add(getJButton0(), new Constraints(new Leading(355, 88, 12, 12), new Leading(56, 12, 12)));
			jReglages.add(getJButton2(), new Constraints(new Leading(355, 88, 12, 12), new Leading(166, 12, 12)));
			jReglages.add(getJButton3(), new Constraints(new Leading(355, 88, 12, 12), new Leading(227, 12, 12)));
			jReglages.add(getJButton4(), new Constraints(new Leading(355, 88, 12, 12), new Leading(287, 12, 12)));
			jReglages.add(getJButton5(), new Constraints(new Leading(355, 88, 12, 12), new Leading(347, 12, 12)));
			jReglages.add(getJLabel0(), new Constraints(new Leading(39, 12, 12), new Leading(15, 12, 12)));
			jReglages.add(getJLabel1(), new Constraints(new Leading(39, 12, 12), new Leading(404, 10, 10)));
			jReglages.setBackground(red);
		
		return jReglages;
	}

	/**
	 * Affichage du suivi.
	 * @return jSuivi
	 */
	private JPanel getjSuivi() {
		
			try {
	        	InputStream is= new FileInputStream("img/bg_profil.jpg");
	            bg_profil = ImageIO.read(is);
	        } catch (IOException ex) {
	            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
	        }
	
	        JPanel jSuivi = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(bg_profil, 0, 0, getWidth(), getHeight(), this);
	            }
	
	            @Override
	            public Dimension getPreferredSize() {
	                return new Dimension(400, 300);
	            }
	        };
			jSuivi.getLayout();
			JLabel text = new JLabel("<html><p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Vos séances réalisée :</p></html>");
    		jSuivi.add(text);
			try 
			{
	        	Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      Statement instruction = connexion.createStatement();

			      ResultSet resultatcnx = instruction.executeQuery("Select seance_real FROM suivi");	
			      	while (resultatcnx.next()) {
			      		
			        		JLabel nom = new JLabel("<html><li style=\"color : white;\">"+resultatcnx.getString("seance_real")+"</li></html>");
			        		jSuivi.add(nom);
			        		
			      	}
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 

		
		return jSuivi;
	}
	
	/**
	 * Affichage des entrainements.
	 * @return jEntrainement
	 */
	private JPanel getjEntrainement() {
			jEntrainement = new JPanel();
			jEntrainement.setLayout(new GroupLayout());
			jEntrainement.add(getJTabbSeance(), new Constraints(new Leading(0, 500, 12, 12), new Leading(0, 670, 12, 12)));
		return jEntrainement;
	}
	
	/**
	 * Affichage du profil.
	 * @return jProfil
	 */
	private JPanel getjProfil() {
		
			try {
	        	InputStream is= new FileInputStream("img/bg_profil.jpg");
	            bg_profil = ImageIO.read(is);
	        } catch (IOException ex) {
	            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
	        }
	
	        JPanel jProfil = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                g.drawImage(bg_profil, 0, 0, getWidth(), getHeight(), this);
	            }
	
	            @Override
	            public Dimension getPreferredSize() {
	                return new Dimension(400, 300);
	            }
	        };
	        
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
			        		JLabel id = new JLabel("<html><p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Nom :"+resultatcnx.getString("nom")+"</p><br>"
			        				+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Prénom : "+resultatcnx.getString("prenom")+"</p><br>"
					        		+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">E-mail : "+resultatcnx.getString("mail")+"</p><br>"
			        				+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Age : "+resultatcnx.getString("age")+"</p><br>"
			        				+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Taille : "+resultatcnx.getString("taille")+"</p><br>"
					        		+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; \">Poids : "+resultatcnx.getString("poids")+"</p><br>"
			        				+ "<p style=\"width: 350px; color: black; background-color: white; padding: 15px; margin-top: 10px; margin-bottom: 20px;\">IMC : "+resultatcnx.getString("imc")+"</p><br></html>");

							jProfil.add(id);
			        		
			      	}
			      	jProfil.add(getbQuitter(), new Constraints(new Leading(500, 10, 10), new Trailing(12, 12, 12)));
			      
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 

		return jProfil;
	}
	
	/**
	 * Affichage du à propos.
	 * @return jApropos
	 */
	private JPanel getjApropos() {
		
		try {
        	InputStream is = new FileInputStream("img/bg_propos.jpg");
            bg_propos = ImageIO.read(is);
        } catch (IOException ex) {
            Logger.getLogger(TabBackground.class.getName()).log(Level.SEVERE, null, ex);
        }

        JPanel jApropos = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
            	
                super.paintComponent(g);
                g.drawImage(bg_propos, 0, 0, getWidth(), getHeight(), this);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        };
		
        
		return jApropos;
	}

	/**
	 * Look and feel
	 */
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
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Color blue = Color.decode("#2D3E50");
				IHMWindow fwindow = new IHMWindow();
				fwindow.setDefaultCloseOperation(IHMWindow.EXIT_ON_CLOSE);
				fwindow.setTitle("IHMWindow");
				fwindow.getContentPane().setPreferredSize(fwindow.getSize());
				fwindow.pack();
				fwindow.setLocationRelativeTo(null);
				fwindow.setVisible(true);
				fwindow.setBackground(blue);
				fwindow.setResizable(false);
			}
		});
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
