package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;


public class IHMInscriptionUser2 extends JFrame implements ActionListener  {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JRadioButton jRadioButton0;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JLabel jLabel1;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JButton jButton2;
	private JButton jButton1;
	private JButton jButton0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public IHMInscriptionUser2() {
		initComponents();
		
	}

	private void initComponents() {
		setTitle("GoForm");
		setLayout(new GroupLayout());
		add(getJRadioButton0(), new Constraints(new Leading(63, 10, 10), new Leading(112, 10, 10)));
		add(getJRadioButton1(), new Constraints(new Leading(63, 10, 10), new Leading(133, 10, 10)));
		add(getJRadioButton2(), new Constraints(new Leading(63, 10, 10), new Leading(154, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(45, 12, 12), new Leading(84, 12, 12)));
		add(getJRadioButton3(), new Constraints(new Leading(63, 12, 12), new Leading(261, 10, 10)));
		add(getJRadioButton4(), new Constraints(new Leading(63, 12, 12), new Leading(283, 10, 10)));
		add(getJRadioButton5(), new Constraints(new Leading(63, 12, 12), new Leading(303, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(45, 12, 12), new Leading(237, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(398, 10, 10), new Leading(655, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(299, 12, 12), new Leading(655, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(203, 12, 12), new Leading(655, 12, 12)));
		setSize(500, 700);
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Précédent");
		}
		return jButton0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Terminer");
		}
		return jButton1;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Annuler");
		}
		return jButton2;
	}

	private JRadioButton getJRadioButton5() {
		if (jRadioButton5 == null) {
			jRadioButton5 = new JRadioButton();
			jRadioButton5.setSelected(true);
			jRadioButton5.setText("Explosivité");
		}
		return jRadioButton5;
	}

	private JRadioButton getJRadioButton4() {
		if (jRadioButton4 == null) {
			jRadioButton4 = new JRadioButton();
			jRadioButton4.setSelected(true);
			jRadioButton4.setText("Endurence");
		}
		return jRadioButton4;
	}

	private JRadioButton getJRadioButton3() {
		if (jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setSelected(true);
			jRadioButton3.setText("Fitnesse");
		}
		return jRadioButton3;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Quelle entraînement souhaitez vous suivre ?");
		}
		return jLabel1;
	}

	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setSelected(true);
			jRadioButton2.setText("Une fois par mois");
		}
		return jRadioButton2;
	}

	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setSelected(true);
			jRadioButton1.setText("Une fois par semaine");
		}
		return jRadioButton1;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setSelected(true);
			jRadioButton0.setText("Plusieurs fois par semaine");
		}
		return jRadioButton0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("A quelle fréquence pratiquez vous une activité sportive :");
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
				IHMInscriptionUser2 frame = new IHMInscriptionUser2();
				frame.setDefaultCloseOperation(IHMInscriptionUser2.EXIT_ON_CLOSE);
				frame.setTitle("IHMInscriptionUser2");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}
