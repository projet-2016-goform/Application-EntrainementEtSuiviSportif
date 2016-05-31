package fr.iutvalence.info.dut.m2107.ihm;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class IHMChrono
{
	private static int heure=0,minute=0,seconde=0;
	public static void main(String[] args)
	{
		/* Le timer */
		int delais=1000;
		ActionListener tache_timer;

		/* création des composants */
		final JLabel Label1 = new JLabel(heure+":"+minute+":"+seconde); /* déclarer final car une classe interne va acceder à ce composant */
		final JButton debut = new JButton("Start");
		JButton fin = new JButton("Remise à zéro");


		/* Action réalisé par le timer */
		tache_timer= new ActionListener()
		{
			public void actionPerformed(ActionEvent e1)
			{
				seconde++;
				if(seconde==60)
				{
					seconde=0;
					minute++;
				}
				if(minute==60)
				{
					minute=0;
					heure++;
				}
				Label1.setText(heure+":"+minute+":"+seconde);/* rafraichir le label */
			}
		};
		/* instanciation du timer */
		final Timer timer1= new Timer(delais,tache_timer);

		/* Ajout des composants aux conteneurs avec formatage */
		IHMSceance.jPanel0.add(debut);
		IHMSceance.jPanel0.add(fin);
		Label1.setBorder(new EmptyBorder(10,135,10,10));

		/* Action provoqué par l'utilisateur */
		/* Lors du clic sur le bouton debut */
		debut.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String texte;
				texte=debut.getText();
				if(texte.compareTo("Start")==0)
				{
					debut.setText("Stop ");
					timer1.start();
				}
				else if(texte.compareTo("Stop ")==0)
				{
					debut.setText("Start");
					timer1.stop();
				}
			}
		});
		/* Lors du clic sur le bouton fin */
		fin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String texte;
				texte=debut.getText();
				if(texte.compareTo("Start")==0)
				{
					heure=0;
					minute=0;
					seconde=0;
					debut.setText("Start");
					Label1.setText(heure+":"+minute+":"+seconde);
				}
			}
		});
	}
}