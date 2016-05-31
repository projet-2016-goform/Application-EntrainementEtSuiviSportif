package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

//VS4E -- DO NOT REMOVE THIS LINE!
public class IHMSceance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	//private static JPanel jPanelAffichage;
	private JButton jButton0;
	private JTextArea jTextArea0;
	private JScrollPane jScrollPane0;
	private JTextArea jTextArea1;
	private JScrollPane jScrollPane1;
	private JButton jButton1;
	private JInternalFrame jInternalFrame0;
	private JPanel jPanel0;
	private static final String PREFERRED_LOOK_AND_FEEL = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
	public IHMSceance() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJScrollPane1(), new Constraints(new Leading(56, 380, 12, 12), new Leading(104, 302, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(56, 380, 12, 12), new Leading(40, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(56, 12, 12), new Trailing(12, 26, 141, 418)));
		add(getJButton0(), new Constraints(new Leading(284, 152, 12, 12), new Trailing(12, 26, 141, 418)));
		add(getJPanel0(), new Constraints(new Leading(56, 380, 12, 12), new Leading(440, 143, 10, 10)));
		setSize(500, 700);
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(BorderFactory.createTitledBorder(null, "Chronomètre", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION, new Font("SansSerif",
					Font.BOLD, 12), new Color(59, 59, 59)));
			jPanel0.setLayout(new GroupLayout());
		}
		return jPanel0;
	}

	private JInternalFrame getJInternalFrame0() {
		if (jInternalFrame0 == null) {
			jInternalFrame0 = new JInternalFrame();
			jInternalFrame0.setVisible(true);
			jInternalFrame0.setOpaque(true);
			jInternalFrame0.setLayout(new GroupLayout());
		}
		return jInternalFrame0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Abandonner la séance");
		}
		return jButton1;
	}

	private JScrollPane getJScrollPane1() {
		if (jScrollPane1 == null) {
			jScrollPane1 = new JScrollPane();
			jScrollPane1.setViewportView(getJTextArea1());
		}
		return jScrollPane1;
	}

	private JTextArea getJTextArea1() {
		if (jTextArea1 == null) {
			jTextArea1 = new JTextArea();
			jTextArea1.setAutoscrolls(true);
		}
		return jTextArea1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			jScrollPane0.setViewportView(getJTextArea0());
		}
		return jScrollPane0;
	}

	private JTextArea getJTextArea0() {
		if (jTextArea0 == null) {
			jTextArea0 = new JTextArea();
			jTextArea0.setText("jTextArea0");
			jTextArea0.setAutoscrolls(true);
			jTextArea0.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		}
		return jTextArea0;
	}

	

	
	
//	public static JPanel getPanelAffichage() {
//		
//		try {
//			
//			try {
//				Class.forName("org.postgresql.Driver");
//			} catch (ClassNotFoundException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//	        System.out.println("Driver O.K.");
//
//	        String url = "jdbc:postgresql://gigondas:5432/battonh";
//		    String user = "battonh";
//		    String passwd = "battonh";
//		    Connection connexion = DriverManager.getConnection(url, user, passwd);
//	        
//	        java.sql.Statement instruction = connexion.createStatement();
//			ResultSet resultatcnx = instruction.executeQuery("Select * FROM exercice WHERE id_seance = 3");	
//			jPanelAffichage = new JPanel();
//	      	while (resultatcnx.next()) {
//	      		JLabel intituleNom = new JLabel("<html><p style=\"width: 340px; background-color: white; padding: 15px; margin-top: 10px;\">"+resultatcnx.getString("libelle_exercice")+"</p></html>");
//
//				jPanelAffichage.add(intituleNom);
//	      	}
//	        
//		}
//		catch(SQLException e2) 
//		{
//		
//			System.out.println("Erreur");
//			e2.printStackTrace();
//		}
//		return jPanelAffichage;
//	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("valider la séance");
		}
		return jButton0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("                                    Vous avez choisi la séance Test1");
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
