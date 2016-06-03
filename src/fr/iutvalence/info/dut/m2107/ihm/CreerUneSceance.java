/**
 * Classe de création de séance.
 */
package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;



//VS4E -- DO NOT REMOVE THIS LINE!
public class CreerUneSceance extends JFrame {
	
	/**
	 * Eléments d'affichage pour l'IHM
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jTitre;
	private JLabel jNomSceance;
	private JTextField jTextFieldNomSceance;
	private JLabel jNbExo;
	private JComboBox jComboBox0;
	private JButton bTerminer;
	private JLabel jNomExo;
	private JLabel jNbRep;
	private JTextField jTextField1;
	private JSpinner jSpinnerRep1;
	private JTextField jTextField2;
	private JSpinner jSpinnerRep2;
	private JTextField jTextField3;
	private JSpinner jSpinnerRep3;
	/**
	 * Récupération de l'iamge pour le logo
	 */
	private ImageIcon img = new ImageIcon("img/icon.png");
	/**
	 * Définition du look and feel
	 */
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	
	/**
	 * Création d'une séance
	 */
	public CreerUneSceance() {
		initComponents();
	}

	/**
	 * Initialisation des composants
	 */
	private void initComponents() {
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/bg_seance.jpg")));
		setLayout(new GroupLayout());
		setIconImage(img.getImage());
		setTitle("GoForm");
		add(getJLabel1(), new Constraints(new Leading(55, 10, 10), new Leading(110, 12, 12)));
		add(getJTextFieldNomSceance(), new Constraints(new Leading(185, 269, 10, 10), new Leading(105, 10, 10)));
		add(getJNbExo(), new Constraints(new Leading(150, 10, 10), new Leading(192, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(215, 10, 10), new Leading(660, 10, 10)));
		add(getJComboBox0(), new Constraints(new Leading(275, 10, 10), new Leading(188, 12, 12)));
		add(getJNomExo(), new Constraints(new Leading(80, 10, 10), new Leading(251, 12, 12)));
		add(getJNbRep(), new Constraints(new Leading(305, 10, 10), new Leading(251, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(84, 88, 12, 12), new Leading(293, 10, 10)));
		add(getJSpinnerRep1(), new Constraints(new Leading(331, 50, 12, 12), new Leading(293, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(84, 88, 12, 12), new Leading(347, 10, 10)));
		add(getJSpinnerRep2(), new Constraints(new Leading(331, 50, 12, 12), new Leading(347, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(84, 88, 12, 12), new Leading(406, 10, 10)));
		add(getJSpinnerRep3(), new Constraints(new Leading(331, 50, 12, 12), new Leading(406, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(125, 278, 10, 10), new Leading(21, 10, 10)));
		setSize(500, 700);
		
		bTerminer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom_seance = jTextFieldNomSceance.getText();
				String nb_exos = jComboBox0.getSelectedItem().toString();
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
				      instruction.executeUpdate("INSERT INTO seance(libelle_seance, nb_exercices, seance_g) VALUES ('"+nom_seance+"', "+nb_exos+", FALSE);");
				      
				      Statement test = connexion.createStatement();
				      ResultSet id_seance = test.executeQuery("SELECT id_seance FROM seance WHERE libelle_seance = '"+nom_seance+"'");
						System.out.println("test");
				      	while (id_seance.next()) {
				      		int id = id_seance.getInt(1);

				      		  String nom_exos1 = jTextField1.getText();
					    	  int qt1 = (Integer) jSpinnerRep1.getValue();
					    	  String nom_exos2 = jTextField2.getText();
					    	  int qt2 = (Integer) jSpinnerRep2.getValue();
					    	  String nom_exos3 = jTextField3.getText();
					    	  int qt3 = (Integer) jSpinnerRep3.getValue();
					    	  
					    	  Statement ajoutExos = connexion.createStatement();
					    	  ajoutExos.executeUpdate("INSERT INTO exercice(libelle_exercice, nb_repetition, id_seance)"
						    	  		+ "VALUES ('"+nom_exos1+"', "+qt1+", "+id+"),"
						    	  		+ "('"+nom_exos2+"', "+qt2+", "+id+"),"
						    	  		+ "('"+nom_exos3+"', "+qt3+", "+id+");");
				        		
				      	}

				} 
				catch (Exception ex) 
				{
				      ex.printStackTrace();
				} 
			}});
	}

	/**
	 * Choix du nombre de répétitions de l'exercice 3.
	 * @return liste déroulante
	 */
	private JSpinner getJSpinnerRep3() {
			jSpinnerRep3 = new JSpinner();
		return jSpinnerRep3;
	}

	/**
	 * Choix du nom de l'exercice 3.
	 * @return textfield3
	 */
	private JTextField getJTextField3() {
			jTextField3 = new JTextField();
			jTextField3.setText("exo3");
		return jTextField3;
	}

	/**
	 * Choix du nombre de répétitions de l'exercice 2.
	 * @return liste déroulante
	 */
	private JSpinner getJSpinnerRep2() {
			jSpinnerRep2 = new JSpinner();
		return jSpinnerRep2;
	}

	/**
	 * Choix du nom de l'exercice 2.
	 * @return textfield2
	 */
	private JTextField getJTextField2() {
			jTextField2 = new JTextField();
			jTextField2.setText("exo2");
		return jTextField2;
	}
	
	/**
	 * Choix du nombre de répétitions de l'exercice 1.
	 * @return liste déroulante
	 */
	private JSpinner getJSpinnerRep1() {
			jSpinnerRep1 = new JSpinner();
		return jSpinnerRep1;
	}

	/**
	 * Choix du nom de l'exercice 1.
	 * @return textfield1
	 */
	private JTextField getJTextField1() {
			jTextField1 = new JTextField();
			jTextField1.setText("exo1");
		return jTextField1;
	}
	
	/**
	 * Label du nombre de répétitions.
	 * @return jNbRep
	 */
	private JLabel getJNbRep() {
			jNbRep = new JLabel();
			jNbRep.setText("Nombre de répétition");
			jNbRep.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jNbRep.setForeground(Color.WHITE);
		return jNbRep;
	}

	/**
	 * Label du nom de l'exercice.
	 * @return jNbRep
	 */
	private JLabel getJNomExo() {
			jNomExo = new JLabel();
			jNomExo.setText("Nom de l'exercice");
			jNomExo.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jNomExo.setForeground(Color.WHITE);
		return jNomExo;
	}

	/**
	 * Bouton terminer.
	 * @return bTerminer
	 */
	private JButton getJButton0() {
			bTerminer = new JButton();
			bTerminer.setText("Terminer");
		return bTerminer;
	}

	/**
	 * choix du nombre d'exercices souhaités.
	 * @return jComboBox0
	 */
	private JComboBox getJComboBox0() {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "0", "1", "2", "3"}));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		return jComboBox0;
	}

	/**
	 * Label du nombre d'exercice.
	 * @return jNbRep
	 */
	private JLabel getJNbExo() {
		if (jNbExo == null) {
			jNbExo = new JLabel();
			jNbExo.setText("Nombre d'exercices :");
			jNbExo.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jNbExo.setForeground(Color.WHITE);
		}
		return jNbExo;
	}

	/**
	 * Saisi du nom de l'exercice.
	 * @return jTextFieldNomSceance
	 */
	private JTextField getJTextFieldNomSceance() {
			jTextFieldNomSceance = new JTextField();
			jTextFieldNomSceance.setText("nomSeance");
		return jTextFieldNomSceance;
	}

	/**
	 * Label du nom de la séance.
	 * @return jNbRep
	 */
	private JLabel getJLabel1() {
			jNomSceance = new JLabel();
			jNomSceance.setText("Nom de la scéance :");
			jNomSceance.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jNomSceance.setForeground(Color.WHITE);
		return jNomSceance;
	}

	/**
	 * Titre.
	 * @return jTitre
	 */
	private JLabel getJLabel0() {
			jTitre = new JLabel();
			jTitre.setText("<html><h2 style=\"color: white;\">Créez votre scéance d'enfer</h2></html>");
		return jTitre;
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
	 * Main entry of the class.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CreerUneSceance frame = new CreerUneSceance();
				frame.setDefaultCloseOperation(CreerUneSceance.DISPOSE_ON_CLOSE);
				frame.setTitle("CreerUneSceance");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
			}
		});
	}

}
