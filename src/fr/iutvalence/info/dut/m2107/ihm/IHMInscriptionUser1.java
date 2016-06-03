/**
 * Classe d'inscription première étape 1.
 */
package fr.iutvalence.info.dut.m2107.ihm;

import fr.iutvalence.info.dut.m2107.ihm.IHMInscriptionUser2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


public class IHMInscriptionUser1 extends JFrame implements ActionListener  {

	/**
	 * Elements de l'IHM
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JRadioButton jRadioButton0;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JLabel jLabel1;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JButton bAnnuler;
	private JButton bSuivant;
	Color red = Color.decode("#e74c3c");
	private JLabel jLabel2;
	private JLabel jPrenom;
	static JTextField jTextFieldPrenom;
	private JLabel jNom;
	static JTextField jTextFieldnom;
	private JLabel jEmail;
	static JTextField jTextFieldMail;
	private JLabel jmdp;
	private JLabel jconfirmmdp;
	static JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JLabel jIntro;
	
	/**
	 * Icone de l'application.
	 */
	private ImageIcon img = new ImageIcon("img/icon.png");
	
	/**
	 * Look end feel.
	 */
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	
	
	public IHMInscriptionUser1() {
		initComponents();
		
	}
	/**
	 * Positionnement des éléments dans la fenêtre.
	 */
	private void initComponents() {
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("img/bg_inscription2.jpg")));
		setIconImage(img.getImage());
		setTitle("GoForm");
		setLayout(new GroupLayout());
		add(getbAnnuler(), new Constraints(new Leading(398, 10, 10), new Leading(655, 12, 12)));
		add(getbSuivant(), new Constraints(new Leading(299, 12, 12), new Leading(655, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(43, 10, 10), new Leading(97, 18, 10, 10)));
		add(getjNom(), new Constraints(new Leading(43, 41, 10, 10), new Leading(141, 10, 10)));
		add(getjTextFieldnom(), new Constraints(new Leading(102, 130, 10, 10), new Leading(139, 10, 10)));
		add(getjEmail(), new Constraints(new Leading(42, 10, 10), new Leading(188, 10, 10)));
		add(getjPrenom(), new Constraints(new Leading(269, 10, 10), new Leading(139, 20, 10, 10)));
		add(getjTextFieldPrenom(), new Constraints(new Leading(338, 127, 10, 10), new Leading(139, 10, 10)));
		add(getjTextFieldMail(), new Constraints(new Leading(101, 185, 10, 10), new Leading(183, 12, 12)));
		add(getjIntro(), new Constraints(new Leading(39, 426, 12, 12), new Leading(12, 70, 12, 12)));
		add(getjmdp(), new Constraints(new Leading(43, 12, 12), new Leading(227, 15, 10, 10)));
		add(getjconfirmmdp(), new Constraints(new Leading(42, 12, 12), new Leading(284, 10, 10)));
		add(getJPasswordField1(), new Constraints(new Leading(42, 156, 12, 12), new Leading(312, 10, 10)));
		add(getJPasswordField0(), new Constraints(new Leading(43, 152, 12, 12), new Leading(254, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(43, 12, 12), new Leading(475, 12, 12)));
		add(getJRadioButton3(), new Constraints(new Leading(62, 86, 12, 12), new Leading(509, 12, 12)));
		add(getJRadioButton4(), new Constraints(new Leading(62, 12, 12), new Leading(532, 20, 10, 10)));
		add(getJRadioButton5(), new Constraints(new Leading(62, 12, 12), new Leading(551, 12, 12)));
		add(getJRadioButton2(), new Constraints(new Leading(62, 178, 12, 12), new Leading(433, 12, 12)));
		add(getJRadioButton0(), new Constraints(new Leading(62, 178, 12, 12), new Leading(388, 12, 12)));
		add(getJRadioButton1(), new Constraints(new Leading(62, 178, 12, 12), new Leading(410, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(43, 12, 12), new Leading(354, 12, 12)));
		setSize(500, 700);
		
		/**
		 * Bouton annuler.
		 */
		bAnnuler.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			IHMConnexionUser.main(null);
		}
		});
		
		/**
		 * Bouton suivant pour continuer l'inscription.
		 */
		bSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IHMInscriptionUser2.main(null);
				dispose();
			}
			});
	}	
	
	/**
	 * Label de demande de saisie.
	 * @return jintro
	 */
	private JLabel getjIntro() {
	
			jIntro = new JLabel();
			jIntro.setText("<html>Veuillez renseigner les champs suivant afin de vous inscrire aux différents programmes d'entraînements :</html>");
			jIntro.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jIntro.setForeground(Color.WHITE);
		
		return jIntro;
	}
	
	
	/**
	 * Zone de saisie de mot de passe.
	 * @return jPasswordField1
	 */
	private JPasswordField getJPasswordField1() {
		
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setText("motdepasse");
			jPasswordField1.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jPasswordField1.setForeground(Color.WHITE);
			jPasswordField1.setEchoChar('•');
		
		return jPasswordField1;
	}
	
	/**
	 * Zone de confirmation de saisie de mot de passe.
	 * @return jPasswordField0
	 */

	private JPasswordField getJPasswordField0() {
	
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setText("motdepasse");
			jPasswordField0.setEchoChar('•');
			jPasswordField0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jPasswordField0.setForeground(Color.WHITE);
	
		return jPasswordField0;
	}
	/**
	 * Label de demande de confimation de mot de passe.
	 * @return jconfirmmdp
	 */
	private JLabel getjconfirmmdp() {
	
			jconfirmmdp = new JLabel();
			jconfirmmdp.setText("Confirmer le mot de passe :");
			jconfirmmdp.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jconfirmmdp.setForeground(Color.WHITE);
		
		return jconfirmmdp;
	}

	/**
	 * Label de demande de mot de passe.
	 * @return jmdp
	 */
	private JLabel getjmdp() {

			jmdp = new JLabel();
			jmdp.setText("Mot de passe :");
			jmdp.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jmdp.setForeground(Color.WHITE);
	
		return jmdp;
	}
	
	
	/**
	 * Zone de saisie de mail.
	 * @return jTextFieldMail
	 */
	private JTextField getjTextFieldMail() {

			jTextFieldMail = new JTextField();
			jTextFieldMail.setText("exemple@exemple.com");
		
		return jTextFieldMail;
	}
	
	/**
	 * Label de demande de saisie de mail.
	 * @return jEmail
	 */

	private JLabel getjEmail() {
		
			jEmail = new JLabel();
			jEmail.setText("E-mail :");
			jEmail.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jEmail.setForeground(Color.WHITE);
	
		return jEmail;
	}

	
	/**
	 * Zone de demande de saisie de nom.
	 * @return jTextFieldnom
	 */
	private JTextField getjTextFieldnom() {
	
			jTextFieldnom = new JTextField();
			jTextFieldnom.setText("votre nom");
		
		return jTextFieldnom;
	}
	/**
	 * Label de demande de saisie de nom.
	 * @return jNom
	 */
	private JLabel getjNom() {

			jNom = new JLabel();
			jNom.setText("Nom :");
			jNom.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jNom.setForeground(Color.WHITE);
			
		return jNom;
	}

	/**
	 * Zone de demande de saisie de prénom.
	 * @return jTextFieldnom
	 */
	private JTextField getjTextFieldPrenom() {
		if (jTextFieldPrenom == null) {
			jTextFieldPrenom = new JTextField();
			jTextFieldPrenom.setText("votre prénom");
		}
		return jTextFieldPrenom;
	}

	/**
	 * Label de demande de saisie de nom.
	 * @return jPrenom
	 */
	private JLabel getjPrenom() {
		if (jPrenom == null) {
			jPrenom = new JLabel();
			jPrenom.setText("Prénom :");
			jPrenom.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jPrenom.setForeground(Color.WHITE);
		}
		return jPrenom;
	}

	/**
	 * Label de demande de saisie des coordonnées.
	 * @return jLabel2
	 */
	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Indiquez vos coordonnées :");
			jLabel2.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel2.setForeground(Color.WHITE);
		}
		return jLabel2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	/**
	 * Bouton pour passer à une autre frame pour le formulaire.
	 * @return bSuivant
	 */
	
	private JButton getbSuivant() {
		
			bSuivant = new JButton();
			bSuivant.setText("Suivant");
		
		return bSuivant;
	}
	/**
	 * Bouton pour annuler l'inscription.
	 * @return bAnnuler
	 */
	
	private JButton getbAnnuler() {
	
			bAnnuler = new JButton();
			bAnnuler.setText("Annuler");
		
		return bAnnuler;
	}
	/**
	 * Bouton Radio.
	 * @return jRadioButton5
	 */
	
	private JRadioButton getJRadioButton5() {

			jRadioButton5 = new JRadioButton();
			jRadioButton5.setBackground(red);
			jRadioButton5.setSelected(true);
			jRadioButton5.setText("Explosivité");
		
		return jRadioButton5;
	}
	
	/**
	 * Bouton Radio.
	 * @return jRadioButton4
	 */

	private JRadioButton getJRadioButton4() {
		if (jRadioButton4 == null) {
			jRadioButton4 = new JRadioButton();
			jRadioButton4.setBackground(red);
			jRadioButton4.setSelected(true);
			jRadioButton4.setText("Endurence");
		}
		return jRadioButton4;
	}

	
	/**
	 * Bouton Radio.
	 * @return jRadioButton3
	 */
	private JRadioButton getJRadioButton3() {
		if (jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setBackground(red);
			jRadioButton3.setSelected(true);
			jRadioButton3.setText("Fitnesse");
		}
		return jRadioButton3;
	}

	
	/**
	 * Label question pour demander le choix du type d'exercice.
	 * @return jLabel1
	 */
	private JLabel getJLabel1() {
		
			jLabel1 = new JLabel();
			jLabel1.setText("Quelle entraînement souhaitez vous suivre ?");
			jLabel1.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel1.setForeground(Color.black);
	
		return jLabel1;
	}

	/**
	 * Bouton Radio.
	 * @return jRadioButton2
	 */
	private JRadioButton getJRadioButton2() {
	
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setBackground(red);
			jRadioButton2.setSelected(true);
			jRadioButton2.setText("Une fois par mois");
	
		return jRadioButton2;
	}
	
	/**
	 * Bouton Radio.
	 * @return jRadioButton1
	 */
	private JRadioButton getJRadioButton1() {
	
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setBackground(red);
			jRadioButton1.setSelected(true);
			jRadioButton1.setText("Une fois par semaine");
		
		return jRadioButton1;
	}
	
	/**
	 * Bouton Radio.
	 * @return jRadioButton0
	 */
	private JRadioButton getJRadioButton0() {
	
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setBackground(red);
			jRadioButton0.setSelected(true);
			jRadioButton0.setText("Plusieurs fois par semaine");
		
		return jRadioButton0;
	}
	
	/**
	 * Label question pour demander la fréquence de pratique du sport.
	 * @return jLabel0
	 */
	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("A quelle fréquence pratiquez vous une activité sportive :");
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.black);
		}
		return jLabel0;
	}
	
	/**
	 * Look end feel.
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
				IHMInscriptionUser1 finsc1 = new IHMInscriptionUser1();
				finsc1.setDefaultCloseOperation(IHMInscriptionUser1.EXIT_ON_CLOSE);
				finsc1.setTitle("IHMInscriptionUser2");
				finsc1.getContentPane().setPreferredSize(finsc1.getSize());
				finsc1.pack();
				finsc1.setLocationRelativeTo(null);
				finsc1.setVisible(true);
				finsc1.setResizable(false);
			}
		});
	}

}
