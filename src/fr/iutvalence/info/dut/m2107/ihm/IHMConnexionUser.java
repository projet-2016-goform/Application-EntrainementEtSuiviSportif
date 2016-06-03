package fr.iutvalence.info.dut.m2107.ihm;
import fr.iutvalence.info.dut.m2107.Connexion;
import fr.iutvalence.info.dut.m2107.ihm.IHMInscriptionUser1;
import fr.iutvalence.info.dut.m2107.ihm.IHMWindow;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import java.sql.*;
/**
 * Création de la fenêtre principale pour accèder à l'application.
 * 
 * @author HASSAINE ABDERRAHMANE
 *@version 1.0
 */


public class IHMConnexionUser extends JFrame implements ActionListener {
	
	/**
	 * Eléméents de l'IHM.
	 */
	Font f;
	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	public static JTextField jTextFieldMail;
	private JButton bConnexion;
	private JLabel jMdp;
	public static JPasswordField jPasswordField0;
	private JButton bInscription;
	private JLabel jLabel2;
	private static JButton bQuitter;
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
	public IHMConnexionUser() {
		initComponents();
	}

	/**
	 * Initialisation des composents
	 */
	private void initComponents() {
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/bg_connexion.jpg")));
		setIconImage(img.getImage());
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(35, 10, 10), new Leading(91, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(35, 220, 10, 10), new Leading(119, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(35, 12, 12), new Leading(165, 10, 10)));
		add(getJPasswordField0(), new Constraints(new Leading(35, 220, 12, 12), new Leading(193, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(161, 12, 12), new Leading(253, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(35, 12, 12), new Leading(253, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(213, 10, 10), new Leading(319, 10, 10)));
		setSize(290, 350);
		
		 
		
		
		bConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
					Connexion newCo = new Connexion();
					dispose();
					
			}	
		});
		
		bInscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				IHMInscriptionUser1.main(null);
				
			}	
		});
			
	}
	
	/**
	 * Bouton quitter
	 * @return bQuitter
	 */
	private JButton getJButton2() {
			bQuitter = new JButton();
			bQuitter.setText("Quitter");
		return bQuitter;		
	}

	/**
	 * Bouton inscritpion
	 * @return bQuitter
	 */
	private JButton getJButton1() {
			bInscription = new JButton();
			bInscription.setText("Inscription");
		return bInscription;
	}

	/**
	 * Entré du mot de passe.
	 * @return jPasswordField0
	 */
	public JPasswordField getJPasswordField0() {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setText("azertyuiop");
			jPasswordField0.setEchoChar('•');
		return jPasswordField0;
	}

	/**
	 * Label de demande du mot de passe
	 * @return jMdp
	 */
	private JLabel getJLabel1() {
			jMdp = new JLabel();
			jMdp.setText("Mot de passe :");
			jMdp.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jMdp.setForeground(Color.WHITE);
		return jMdp;
	}

	/**
	 * Bouton connexion
	 * @return bConnexion
	 */
	private JButton getJButton0() {
			bConnexion = new JButton();
			bConnexion.setText("Connexion");
		return bConnexion;
	}

	/**
	 * Entré de l'adresse mail.
	 * @return jPasswordField0
	 */
	public JTextField getJTextField0() {
			jTextFieldMail = new JTextField();
			jTextFieldMail.setText("maxime.ambry@iut-valence.fr");
		return jTextFieldMail;
	}

	/**
	 * Label de demande d'adresse mail
	 * @return jMdp
	 */
	private JLabel getJLabel0() {
			jLabel0 = new JLabel();
			jLabel0.setText("Adresse mail :");
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.WHITE);
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
	 * Main entry of the class.
	 */
	public static void main(String[] args) {
		
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				IHMConnexionUser fcnx = new IHMConnexionUser();
				fcnx.setDefaultCloseOperation(IHMConnexionUser.EXIT_ON_CLOSE);
				fcnx.setTitle("GoForm");
				fcnx.getContentPane().setPreferredSize(fcnx.getSize());
				fcnx.pack();
				fcnx.setLocationRelativeTo(null);
				fcnx.setVisible(true);
				fcnx.setResizable(false);
				
				bQuitter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
				
								JOptionPane d = new JOptionPane();
								int option = d.showConfirmDialog(fcnx, "Voulez vous vraiment quitter ?", "Quitter ?", JOptionPane.ERROR_MESSAGE);
								if (option == JOptionPane.YES_OPTION) {
									fcnx.dispose();
								}
					
					}
				});
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
