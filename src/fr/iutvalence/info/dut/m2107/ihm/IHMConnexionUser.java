package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	Font f;
	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JTextField jTextFieldMail;
	private JButton bConnexion;
	private JLabel jMdp;
	private JPasswordField jPasswordField0;
	private JButton bInscription;
	private JLabel jLabel2;
	private JButton bQuitter;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private ImageIcon img = new ImageIcon("img/icon.png");
	public IHMConnexionUser() {
		initComponents();
	}

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
		add(getJLabel2(), new Constraints(new Leading(35, 220, 12, 12), new Leading(19, 50, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(213, 10, 10), new Leading(319, 10, 10)));
		setSize(290, 350);
		
		 
		bQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		bConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection cnx;
				try {
					System.out.println("test");
					cnx = DriverManager.getConnection("jdbc:postgresql://gigondas:5432/ambrym","ambrym","ambrym");
					Statement instructioncnx = cnx.createStatement();
					ResultSet resultatcnx = instructioncnx.executeQuery("Select * FROM chambre");	
											
				} 
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
	}
	private JButton getJButton2() {
		if (bQuitter == null) {
			bQuitter = new JButton();
			bQuitter.setText("Quitter");
		}
		return bQuitter;		
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText(" ");
			f = new Font("Calibri", Font.BOLD, 20);
			jLabel2.setFont(f);
			jLabel2.setHorizontalAlignment(jLabel2.CENTER); 
		}
		return jLabel2;
	}

	private JButton getJButton1() {
		if (bInscription == null) {
			bInscription = new JButton();
			bInscription.setText("Inscription");
		}
		return bInscription;
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
		if (jMdp == null) {
			jMdp = new JLabel();
			jMdp.setText("Mot de passe :");
			jMdp.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jMdp.setForeground(Color.WHITE);
		}
		return jMdp;
	}

	private JButton getJButton0() {
		if (bConnexion == null) {
			bConnexion = new JButton();
			bConnexion.setText("Connexion");
		}
		return bConnexion;
	}

	private JTextField getJTextField0() {
		if (jTextFieldMail == null) {
			jTextFieldMail = new JTextField();
			jTextFieldMail.setText("exemple@exemple.com");
		}
		return jTextFieldMail;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Adresse mail :");
			jLabel0.setFont(new Font("Sans Serif", Font.PLAIN, 12));
			jLabel0.setForeground(Color.WHITE);
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
	public static void main(String[] args ) {
		
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
				frame.setResizable(false);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}