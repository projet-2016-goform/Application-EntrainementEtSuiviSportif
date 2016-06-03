/**
 * Classe pour réaliser la  séance choisie.
 */
package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.IntUnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.base.Item;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

public class IHMSceance extends JFrame {

	/**
	 * Elements de l'IHM.
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private static JButton jButton0;
	private JPanel jP;
	private JScrollPane jScrollPane1;
	private static JButton jButton1;
	static JPanel jPanel0;
	/**
	 * Récupération de l'icon.
	 */
	private ImageIcon img = new ImageIcon("img/icon.png");
	/**
	 * Définition de la couleur bleu.
	 */
	Color blue = Color.decode("#2D3E50");
	/**
	 * Définition du look and feel.
	 */
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	/**
	 * Affiche de la séance.
	 */
	public IHMSceance() {
		initComponents();
	}
	/**
	 * initialisation des composents.
	 */
	private void initComponents() {
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/bg_encours.jpg")));
		setLayout(new GroupLayout());
		setIconImage(img.getImage());
		add(getJScrollPane1(), new Constraints(new Leading(56, 380, 12, 12), new Leading(104, 302, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(120, 380, 12, 12), new Leading(40, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(56, 12, 12), new Trailing(25, 26, 141, 418)));
		add(getJButton0(), new Constraints(new Leading(284, 152, 12, 12), new Trailing(25, 26, 141, 418)));
		add(getJPanel0(), new Constraints(new Leading(56, 380, 12, 12), new Leading(440, 143, 10, 10)));
		setSize(500, 700);
		
	}

	/**
	 * Panel du chronomètre
	 * @return jPanel0
	 */
	private JPanel getJPanel0() {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Chronomètre", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("SansSerif",
					Font.BOLD, 12), new Color(255, 255, 255)));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.setBackground(blue);
			
		return jPanel0;
	}
	
	/**
	 * Bouton d'abandon.
	 * @return jButton1
	 */
	private JButton getJButton1() {
			jButton1 = new JButton();
			jButton1.setText("Abandonner la séance");
		return jButton1;
	}

	/**
	 * Barre de scrool.
	 * @return jScrollPane1
	 */
	private JScrollPane getJScrollPane1() {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea1());
		return jScrollPane1;
	}


	/**
	 * Zone d'affichage des exercices à réaliser.
	 * @return jP
	 */
	private JPanel getJTextArea1() {
			jP = new JPanel();
			jP.setBackground(new Color(214, 217, 223));
			jP.setAutoscrolls(false);
			jP.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						
			try 
			{
	        	Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      Statement instruction = connexion.createStatement();
			      
			      String nom = null;
			      String id = null;
						
			      ResultSet nom_seance = instruction.executeQuery("Select nom FROM infos WHERE id = 1");
			      while(nom_seance.next())
	              { 
	                  nom = nom_seance.getString("nom");
				  }
			      System.out.println(nom);
			      ResultSet id_seance = instruction.executeQuery("Select id_seance FROM seance WHERE libelle_seance = '"+nom+"'");
			      while(id_seance.next())
	              { 
	                  id = id_seance.getString("id_seance");
				  }
			      JLabel intituleNom = null;
			      JLabel rep = null;
			      System.out.println(id);
			      ResultSet resultatcnx = instruction.executeQuery("Select libelle_exercice, nb_repetition FROM exercice WHERE id_seance = "+id+"");	
				  while(resultatcnx.next())
	              { 
	                  intituleNom = new JLabel(resultatcnx.getString("libelle_exercice"));
	                  rep = new JLabel(resultatcnx.getString("nb_repetition")+" répétitions !");
					  jP.add(intituleNom);
					  jP.add(rep);
	                  System.out.println(intituleNom);
	                  System.out.println(rep);
	                  
	              }
			} 
			catch (Exception ex) 
			{
			      ex.printStackTrace();
			} 
		return jP;
	}

	/**
	 * Bouton de validation de la séance.
	 * @return jButton0
	 */
	private JButton getJButton0() {
			jButton0 = new JButton();
			jButton0.setText("Valider la séance");
		return jButton0;
	}
	/**
	 * Nom de la séance.
	 */
	static String nom = null;
	
	/**
	 * Affichage du nom de la séance.
	 * @return jLabel0
	 */
	private JLabel getJLabel0() {
		
			jLabel0 = new JLabel();
			 try {
				  Class.forName("org.postgresql.Driver");
			      System.out.println("Driver O.K.");

			      String url = "jdbc:postgresql://gigondas:5432/battonh";
			      String user = "battonh";
			      String passwd = "battonh";
			      Connection connexion = DriverManager.getConnection(url, user, passwd);
			      Statement instruction = connexion.createStatement();
			      
			      
						
			      ResultSet nom_seance = instruction.executeQuery("Select nom FROM infos WHERE id = 1");
			      while(nom_seance.next())
	              { 
	                nom = nom_seance.getString("nom");
				  }
				  jLabel0.setText("C'est partie pour la séance "+nom);
				  jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
				  jLabel0.setForeground(Color.WHITE);
			} catch (Exception e) {
				// TODO: handle exception
			}
		
		return jLabel0;
	}

	/**
	 * Look and feel.
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
	 * Main. 
	 * @param args
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				
				IHMSceance frame = new IHMSceance();
				frame.setDefaultCloseOperation(IHMSceance.DISPOSE_ON_CLOSE);
				frame.setTitle("IHMSceance");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				IHMChrono.main(null);
				jButton0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							  Class.forName("org.postgresql.Driver");
						      System.out.println("Driver O.K.");

						      String url = "jdbc:postgresql://gigondas:5432/battonh";
						      String user = "battonh";
						      String passwd = "battonh";
						      Connection connexion = DriverManager.getConnection(url, user, passwd);
						      Statement instruction = connexion.createStatement();

						      instruction.executeQuery("INSERT INTO suivi(seance_real) VALUES ('"+nom+"')");
						}
						  catch (Exception e1) {
							// TODO: handle exception
						  }
						JOptionPane d = new JOptionPane();
						d.showConfirmDialog(frame, "Séance ajoutée à votre suivi !", "Félicitation", JOptionPane.CLOSED_OPTION);
						frame.dispose();
					}
				});
				
				jButton1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane d = new JOptionPane();
						int option = d.showConfirmDialog(frame, "Voulez vous vraiment abandonner ?", "Une prochaine fois surement !", JOptionPane.OK_CANCEL_OPTION);
						if (option == JOptionPane.YES_OPTION) {
						    frame.dispose();
						}
					}
				});
			}
		});
	}

}
