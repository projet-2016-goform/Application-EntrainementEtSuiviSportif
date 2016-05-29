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
	private ImageIcon img = new ImageIcon("img/icon.png");
	Color red = Color.decode("#c86560");
	private JLabel jLabel2;
	private JLabel jPrenom;
	private JTextField jTextFieldPrenom;
	private JLabel jNom;
	private JTextField jTextFieldnom;
	private JLabel jEmail;
	private JTextField jTextFieldMail;
	private JLabel jmdp;
	private JLabel jconfirmmdp;
	private JPasswordField jPasswordField0;
	private JPasswordField jPasswordField1;
	private JLabel jIntro;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public IHMInscriptionUser1() {
		initComponents();
		
	}

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
	
		bAnnuler.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
		});
		
		bSuivant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//insertion dans la bdd a faire.
				
			//passage a la deuxieme ihm
				
				IHMInscriptionUser2.main(null);
				dispose();
			}
			});
	}	
	private JLabel getjIntro() {
		if (jIntro == null) {
			jIntro = new JLabel();
			jIntro.setText("<html>Veuillez renseigner les champs suivant afin de vous inscrire aux différents programmes d'entraînements :</html>");
		}
		return jIntro;
	}

	private JPasswordField getJPasswordField1() {
		if (jPasswordField1 == null) {
			jPasswordField1 = new JPasswordField();
			jPasswordField1.setText("motdepasse");
			jPasswordField1.setEchoChar('•');
		}
		return jPasswordField1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setText("motdepasse");
			jPasswordField0.setEchoChar('•');
		}
		return jPasswordField0;
	}

	private JLabel getjconfirmmdp() {
		if (jconfirmmdp == null) {
			jconfirmmdp = new JLabel();
			jconfirmmdp.setText("Confirmer le mot de passe :");
		}
		return jconfirmmdp;
	}

	private JLabel getjmdp() {
		if (jmdp == null) {
			jmdp = new JLabel();
			jmdp.setText("Mot de passe :");
		}
		return jmdp;
	}

	private JTextField getjTextFieldMail() {
		if (jTextFieldMail == null) {
			jTextFieldMail = new JTextField();
			jTextFieldMail.setText("exemple@exemple.com");
		}
		return jTextFieldMail;
	}

	private JLabel getjEmail() {
		if (jEmail == null) {
			jEmail = new JLabel();
			jEmail.setText("E-mail :");
		}
		return jEmail;
	}

	private JTextField getjTextFieldnom() {
		if (jTextFieldnom == null) {
			jTextFieldnom = new JTextField();
			jTextFieldnom.setText("votre nom");
		}
		return jTextFieldnom;
	}

	private JLabel getjNom() {
		if (jNom == null) {
			jNom = new JLabel();
			jNom.setText("Nom :");
		}
		return jNom;
	}

	private JTextField getjTextFieldPrenom() {
		if (jTextFieldPrenom == null) {
			jTextFieldPrenom = new JTextField();
			jTextFieldPrenom.setText("votre prénom");
		}
		return jTextFieldPrenom;
	}

	private JLabel getjPrenom() {
		if (jPrenom == null) {
			jPrenom = new JLabel();
			jPrenom.setText("Prénom :");
		}
		return jPrenom;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Indiquez vos coordonnées :");
		}
		return jLabel2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private JButton getbSuivant() {
		if (bSuivant == null) {
			bSuivant = new JButton();
			bSuivant.setText("Suivant");
		}
		return bSuivant;
	}

	private JButton getbAnnuler() {
		if (bAnnuler == null) {
			bAnnuler = new JButton();
			bAnnuler.setText("Annuler");
		}
		return bAnnuler;
	}

	private JRadioButton getJRadioButton5() {
		if (jRadioButton5 == null) {
			jRadioButton5 = new JRadioButton();
			jRadioButton5.setBackground(new Color(200, 101, 96));
			jRadioButton5.setSelected(true);
			jRadioButton5.setText("Explosivité");
		}
		return jRadioButton5;
	}

	private JRadioButton getJRadioButton4() {
		if (jRadioButton4 == null) {
			jRadioButton4 = new JRadioButton();
			jRadioButton4.setBackground(new Color(200, 101, 96));
			jRadioButton4.setSelected(true);
			jRadioButton4.setText("Endurence");
		}
		return jRadioButton4;
	}

	private JRadioButton getJRadioButton3() {
		if (jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setBackground(new Color(200, 101, 96));
			jRadioButton3.setSelected(true);
			jRadioButton3.setText("Fitnesse");
		}
		return jRadioButton3;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Quelle entraînement souhaitez vous suivre ?");
			jLabel1.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel1.setForeground(Color.black);
		}
		return jLabel1;
	}

	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setBackground(new Color(200, 101, 96));
			jRadioButton2.setSelected(true);
			jRadioButton2.setText("Une fois par mois");
		}
		return jRadioButton2;
	}

	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setBackground(new Color(200, 101, 96));
			jRadioButton1.setSelected(true);
			jRadioButton1.setText("Une fois par semaine");
		}
		return jRadioButton1;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setBackground(new Color(200, 101, 96));
			jRadioButton0.setSelected(true);
			jRadioButton0.setText("Plusieurs fois par semaine");
		}
		return jRadioButton0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("A quelle fréquence pratiquez vous une activité sportive :");
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.black);
		}
		return jLabel0;
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