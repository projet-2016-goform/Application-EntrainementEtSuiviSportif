package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class IHMSceance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private static JPanel jPanelAffichage;
	private JButton jButton0;
	private ImageIcon img = new ImageIcon("img/icon.png");
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public IHMSceance() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		setIconImage(img.getImage());
		add(getJLabel0(), new Constraints(new Leading(183, 123, 10, 10), new Leading(40, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(400, 10, 10), new Leading(660, 10, 10)));
		add(getPanelAffichage(), new Constraints(new Leading(30, 10, 10), new Leading(60, 10, 10)));
		setSize(500, 700);
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Terminer");
		}
		return jButton0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Vous avez choisi la séance Test1");
		}
		return jLabel0;
	}
	
	public static JPanel getPanelAffichage() {
		
		try {
			
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        System.out.println("Driver O.K.");

	        String url = "jdbc:postgresql://gigondas:5432/battonh";
		    String user = "battonh";
		    String passwd = "battonh";
		    Connection connexion = DriverManager.getConnection(url, user, passwd);
	        
	        java.sql.Statement instruction = connexion.createStatement();
			ResultSet resultatcnx = instruction.executeQuery("Select * FROM exercice WHERE id_seance = 3");	
			jPanelAffichage = new JPanel();
	      	while (resultatcnx.next()) {
	      		JLabel intituleNom = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">"+resultatcnx.getString("libelle_exercice")+"</p></html>");

				jPanelAffichage.add(intituleNom);
	      	}
	        
		}
		catch(SQLException e2) 
		{
		
			System.out.println("Erreur");
			e2.printStackTrace();
		}
		return jPanelAffichage;
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

	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				IHMSceance frame = new IHMSceance();
				frame.setDefaultCloseOperation(IHMSceance.EXIT_ON_CLOSE);
				frame.setTitle("IHMSceance");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
