/**
 * Classe d'inscription première étape 2.
 */
package fr.iutvalence.info.dut.m2107.ihm;

/**
 * Importation des librairies.
 */
import fr.iutvalence.info.dut.m2107.Sexe;
import fr.iutvalence.info.dut.m2107.ihm.IHMConnexionUser;
import fr.iutvalence.info.dut.m2107.ihm.IHMInscriptionUser1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


public class IHMInscriptionUser2 extends JFrame implements ActionListener {
	
	/**
	 * Elements de l'IHM
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jTextField0;
	private JComboBox jComboBox0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField JTextPoids;
	private JLabel jTaille;
	private JTextField JTextTaille;
	private JLabel jage;
	private JTextField JTextAge;
	private JButton bannuler;
	private JButton bTerminer;
	private JScrollPane jScrollPane0;
	private JLabel jImc;
	private JLabel jIndiceImc;
	private JProgressBar jProgressBarImc;
	private JLabel jLabel7;
	private JScrollPane jScrollPane1;
	private JLabel jintro;
	
	/**
	 * Icone de l'application.
	 */
	private ImageIcon img = new ImageIcon("img/icon.png");
	
	/**
	 * Look end feel.
	 */
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	
	public IHMInscriptionUser2() {
		initComponents();
	}

	/**
	 * Positionnement des éléments dans la fenêtre.
	 */
	private void initComponents() {
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/bg_inscription.jpg")));
		setIconImage(img.getImage());
		setTitle("GoForm");
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(398, 10, 10), new Leading(660, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(289, 10, 10), new Leading(660, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(49, 12, 12), new Leading(142, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(49, 12, 12), new Leading(184, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(49, 12, 12), new Leading(246, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(49, 12, 12), new Leading(308, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(49, 12, 12), new Leading(370, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(49, 12, 12), new Leading(466, 10, 10)));
		add(getJTextPoids(), new Constraints(new Leading(49, 414, 12, 12), new Leading(212, 12, 12)));
		add(getJTextTaille(), new Constraints(new Leading(49, 414, 12, 12), new Leading(274, 12, 12)));
		add(getJTextAge(), new Constraints(new Leading(49, 414, 12, 12), new Leading(336, 12, 12)));
		add(getJProgressBar0(), new Constraints(new Leading(49, 414, 12, 12), new Leading(404, 17, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(49, 12, 12), new Leading(114, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(49, 414, 12, 12), new Leading(35, 63, 10, 10)));
		setSize(500, 700);
		
		/**
		 * Bouton annuler.
		 */
		bannuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IHMConnexionUser.main(null);
			}
		});
		
		/**
		 * Bouton terminer l'inscription.
		 * Ajout des informations saisie à la Base de données.
		 */
		bTerminer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int taille = Integer.parseInt(JTextTaille.getText());
				int poids = Integer.parseInt(JTextPoids.getText());
				int age = Integer.parseInt(JTextAge.getText());
				double imc = poids / Math.sqrt(taille/10);
				Sexe HOMME = null;
				Sexe sexe = HOMME;
				String nom = IHMInscriptionUser1.jTextFieldnom.getText();
				String prenom = IHMInscriptionUser1.jTextFieldPrenom.getText();
				String mail = IHMInscriptionUser1.jTextFieldMail.getText();
				String mdp = IHMInscriptionUser1.jPasswordField0.getText();
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
				        
				      instruction.executeUpdate(""
				      		+ ""
				      		+ "INSERT INTO  utilisateur ( nom  , prenom  , mail  , mdp  , sexe  , imc  , taille  , poids , age)"
				      		+ "VALUES ('+"+nom+"',  '"+prenom+"',  '"+mail+"',  '"+mdp+"',  '"+sexe+"',  '"+imc+"',  '"+taille+"',  '"+poids+"', '"+age+"');");
				      
				      System.out.println("Informations enregistrées: Taille"+taille+"et Poids :"+poids);
				      
				      
				      dispose();
				      IHMConnexionUser.main(null);
				      
				      
				} 
				catch (Exception ex) 
				{
				      ex.printStackTrace();
				} 
				
				
			}
		});
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	/**
	 * Label de demande de saisie.
	 * @return jintro
	 */
	private JLabel getJLabel8() {
	
			jintro = new JLabel();
			jintro.setText("<html>Veuillez renseigner les champs suivant afin de vous inscrire aux différents programmes d'entraînements :</html>");
			jintro.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jintro.setForeground(Color.WHITE);

		return jintro;
	}
	/**
	 * Barre de progression.
	 * @return jProgressBarImc
	 */
	private JProgressBar getJProgressBar0() {
		
			jProgressBarImc = new JProgressBar();
			jProgressBarImc.setString("0 %");
			
		
		return jProgressBarImc;
		
	}
	/**
	 * Label définition de l'anagramme IMC.
	 * @return jIndiceImc
	 */
	private JLabel getJLabel6() {
	
			jIndiceImc = new JLabel();
			jIndiceImc.setText("IMC* : Indice de masse corporelle.");

		return jIndiceImc;
	}
	
	/**
	 * Label pour l'IMC.
	 * @return jImc
	 */
	private JLabel getJLabel5() {

			jImc = new JLabel();
			jImc.setText("Votre IMC* est de :");
			

		return jImc;
		
		
	}

	
	/**
	 * Bouton pour terminer l'inscription.
	 * @return bTerminer
	 */
	private JButton getJButton1() {

			bTerminer = new JButton();
			bTerminer.setText("Terminer");
	
		
		return bTerminer;
	}
	/**
	 * Bouton annuler.
	 * @return bannuler
	 */
	private JButton getJButton0() {

			bannuler = new JButton();
			bannuler.setText("Annuler");
		
		return bannuler;
		
	}
	
	/**
	 * Saisie de l'âge.
	 * @return JTextAge
	 */
	private JTextField getJTextAge() {

			JTextAge = new JTextField();
		
		return JTextAge;
	}
	
	/**
	 *Label de demande de saisie d'âge.
	 * @return
	 */
	private JLabel getJLabel4() {

			jage = new JLabel();
			jage.setText("Votre âge :");
			jage.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jage.setForeground(Color.WHITE);
	
		return jage;
	}
	

	/**
	 *Saisie de la taille.
	 * @return JTextTaille
	 */
	private JTextField getJTextTaille() {

			JTextTaille = new JTextField();
		
		return JTextTaille;
	}

	/**
	 * Label de demande de saisie de la taille.
	 * @return jTaille
	 */
	private JLabel getJLabel3() {

			jTaille = new JLabel();
			jTaille.setText("Votre taille :");
			jTaille.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jTaille.setForeground(Color.WHITE);
		
		return jTaille;
	}

	/**
	 * Saisie du poids.
	 * @return JTextPoids
	 */
	private JTextField getJTextPoids() {
		
			JTextPoids = new JTextField();
		
		return JTextPoids;
	}
	
	/**
	 * Label de demande de saisie du poids.
	 * @return jLabel2
	 */
	private JLabel getJLabel2() {

			jLabel2 = new JLabel();
			jLabel2.setText("Votre poids :");
			jLabel2.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel2.setForeground(Color.WHITE);
		
		return jLabel2;
	}

	/**
	 * Label de demande du sexe de la personne.
	 * @return jLabel0
	 */
	private JLabel getJLabel0() {

			jLabel0 = new JLabel();
			jLabel0.setText("Votre sexe :");			
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.WHITE);
		
		return jLabel0;
	}
	
	/**
	 * Liste de choix.
	 * @return jComboBox0
	 */
	private JComboBox getJComboBox0() {
		
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "Femme", "Homme"}));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		
		return jComboBox0;
	}
	
	/**
	 *Look end feel. 
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
				
				IHMInscriptionUser2 finsc2 = new IHMInscriptionUser2();
				finsc2.setDefaultCloseOperation(IHMInscriptionUser2.EXIT_ON_CLOSE);
				finsc2.setTitle("IHMIscriptionUser");
				finsc2.getContentPane().setPreferredSize(finsc2.getSize());
				finsc2.pack();
				finsc2.setLocationRelativeTo(null);
				finsc2.setVisible(true);
				finsc2.setResizable(false);
			}
		});
		
	}
	
}
