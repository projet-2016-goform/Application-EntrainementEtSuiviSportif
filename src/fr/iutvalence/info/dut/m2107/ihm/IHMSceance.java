package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.function.IntUnaryOperator;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

//VS4E -- DO NOT REMOVE THIS LINE!
public class IHMSceance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	//private static JPanel jPanelAffichage;
	private JButton jButton0;
	private JPanel jP;
	private JScrollPane jScrollPane1;
	private JButton jButton1;
	static JPanel jPanel0;
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

	

	
//	public static JPanel getPanelAffichage() {
//		

//		return jPanelAffichage;
//	}

	private JPanel getJTextArea1() {
		if (jP == null) {
			jP = new JPanel();
			jP.setBackground(new Color(214, 217, 223));
			//jP.setEditable(false);
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
		}
		return jP;
	}

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
