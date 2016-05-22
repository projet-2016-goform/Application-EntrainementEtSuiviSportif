package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
/**
 * Création de la fenêtre principale pour accèder à l'application.
 * 
 * @author HASSAINE ABDERRAHMANE
 *@version 1.0
 */


public class IHMConnexionUser extends JFrame implements ActionListener {
	Font f;
	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JFormattedTextField jFormattedTextField0;
	private JButton jButton0;
	private JLabel jLabel1;
	private JPasswordField jPasswordField0;
	private JButton jButton1;
	private JLabel jLabel2;
	private JButton jButton2;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public IHMConnexionUser() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(35, 10, 10), new Leading(91, 10, 10)));
		add(getJFormattedTextField0(), new Constraints(new Leading(35, 220, 10, 10), new Leading(119, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(35, 12, 12), new Leading(165, 10, 10)));
		add(getJPasswordField0(), new Constraints(new Leading(35, 220, 12, 12), new Leading(193, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(161, 12, 12), new Leading(253, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(35, 12, 12), new Leading(253, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(35, 220, 12, 12), new Leading(19, 50, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(213, 10, 10), new Leading(319, 10, 10)));
		setSize(290, 350);
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Quitter");
		}
		return jButton2;		
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Bienvenue sur GoForm");
			f = new Font("Calibri", Font.BOLD, 20);
			jLabel2.setFont(f);
			jLabel2.setHorizontalAlignment(jLabel2.CENTER); 
		}
		return jLabel2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Inscription");
		}
		return jButton1;
	}

	private JPasswordField getJPasswordField0() {
		if (jPasswordField0 == null) {
			jPasswordField0 = new JPasswordField();
			jPasswordField0.setText("Motdepasse");
			jPasswordField0.setEchoChar('•');
		}
		return jPasswordField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Mot de passe :");
		}
		return jLabel1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Connexion");
		}
		return jButton0;
	}

	private JFormattedTextField getJFormattedTextField0() {
		if (jFormattedTextField0 == null) {
			jFormattedTextField0 = new JFormattedTextField();
			jFormattedTextField0.setText("exemple@exemple.com");
		}
		return jFormattedTextField0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Adresse mail :");
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
				IHMConnexionUser frame = new IHMConnexionUser();
				frame.setDefaultCloseOperation(IHMConnexionUser.EXIT_ON_CLOSE);
				frame.setTitle("GoForm");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
