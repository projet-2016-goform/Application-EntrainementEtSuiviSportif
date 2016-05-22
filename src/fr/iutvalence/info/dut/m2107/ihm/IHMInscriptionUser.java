package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class IHMInscriptionUser extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField jTextField0;
	private JComboBox jComboBox0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JSlider jSlider0;
	private JLabel jLabel3;
	private JSlider jSlider1;
	private JLabel jLabel4;
	private JSlider jSlider2;
	private JButton jButton0;
	private JButton jButton1;
	private JScrollPane jScrollPane0;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JProgressBar jProgressBar0;
	private JLabel jLabel7;
	private JScrollPane jScrollPane1;
	private JLabel jLabel8;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	
	public IHMInscriptionUser() {
		initComponents();
	}

	private void initComponents() {
		
		setTitle("GoForm");
		setLayout(new GroupLayout());
		add(getJTextField0(), new Constraints(new Leading(113, 10, 10), new Leading(40, -8, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(398, 10, 10), new Leading(660, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(289, 10, 10), new Leading(660, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(49, 12, 12), new Leading(142, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(49, 12, 12), new Leading(184, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(49, 12, 12), new Leading(246, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(49, 12, 12), new Leading(308, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(49, 12, 12), new Leading(370, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(49, 12, 12), new Leading(466, 10, 10)));
		add(getJSlider0(), new Constraints(new Leading(49, 414, 12, 12), new Leading(212, 12, 12)));
		add(getJSlider1(), new Constraints(new Leading(49, 414, 12, 12), new Leading(274, 12, 12)));
		add(getJSlider2(), new Constraints(new Leading(49, 414, 12, 12), new Leading(336, 12, 12)));
		add(getJProgressBar0(), new Constraints(new Leading(49, 414, 12, 12), new Leading(404, 17, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(49, 12, 12), new Leading(35, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(49, 12, 12), new Leading(114, 12, 12)));
		add(getJLabel8(), new Constraints(new Leading(49, 414, 12, 12), new Leading(35, 63, 10, 10)));
		setSize(500, 700);
		jButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("<html>Veuillez renseigner les champs suivant afin de vous inscrire aux différents programmes d'entraînements :</html>");
		}
		return jLabel8;
	}

	private JProgressBar getJProgressBar0() {
		if (jProgressBar0 == null) {
			jProgressBar0 = new JProgressBar();
			jProgressBar0.setString("0 %");
		}
		return jProgressBar0;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("IMC* : Indice de masse corporelle.");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("Votre IMC* est de :");
		}
		return jLabel5;
	}

	

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Suivant");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Annuler");
		}
		return jButton0;
		
	}
	

	private JSlider getJSlider2() {
		if (jSlider2 == null) {
			jSlider2 = new JSlider();
		}
		return jSlider2;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Votre âge :");
		}
		return jLabel4;
	}

	private JSlider getJSlider1() {
		if (jSlider1 == null) {
			jSlider1 = new JSlider();
		}
		return jSlider1;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Votre taille :");
		}
		return jLabel3;
	}

	private JSlider getJSlider0() {
		if (jSlider0 == null) {
			jSlider0 = new JSlider();
		}
		return jSlider0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Votre poids :");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Votre sexe :");
		}
		return jLabel0;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "Femme", "Homme"}));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		}
		return jComboBox0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("jTextField0");
		}
		return jTextField0;
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
				
				IHMInscriptionUser frame = new IHMInscriptionUser();
				frame.setDefaultCloseOperation(IHMInscriptionUser.EXIT_ON_CLOSE);
				frame.setTitle("IHMIscriptionUser");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
	}
	
}
