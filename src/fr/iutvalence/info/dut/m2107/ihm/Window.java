package fr.iutvalence.info.dut.m2107.ihm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.dyno.visual.swing.editors.actions.AddEventAction;

import java.util.*;

import fr.iutvalence.info.dut.m2107.Utilisateur;
/**
 * Cr�ation de la fen�tre et des onglets � afficher.
 * 
 * @author HASSAINE ABDERRAHMANE
 *@version 1.0
 */

public class Window extends JFrame implements ActionListener{
	

    	
    

  

public static void main() {
//	Utilisateur affiche = new Utilisateur("prenom", "nom", "mail@gmail.com", "mdp", 24, 254, 56);
//	System.out.println(affiche.toString());	
	Color red = Color.decode("#c86560");
	Color blue = Color.decode("#38424c");
	Color grey = Color.decode("#c8ddf2");
	ImageIcon img = new ImageIcon("C:\\Users\\Maxiime\\git\\fr.iutvalence.info.dut.m2107\\src\\fr\\iutvalence\\info\\dut\\m2107\\ihm\\icon.png");
	
    /*Cr�ation de la fen�tre*/
    JFrame f = new JFrame("GoForm");
    f.setSize(500, 700);
	f.setResizable(false);
	f.setIconImage(img.getImage());
    
    /*Cr�ation de l'onglet*/
    JPanel pannel = new JPanel();	
    pannel.setBackground(blue);
    
    /*Cr�ation du button quitter*/
    JButton quitter = new JButton("Quitter");
        
    /*Position des onglets dans la fen�tre*/
    JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
    onglets.setBackground(grey);
    onglets.setFont(new Font("Sans Serif", Font.PLAIN, 12));
    
    /*Cr�ation de l'onglet 1 dans la fen�tre*/
    JPanel onglet1 = new JPanel();
    JLabel titreOnglet1 = new JLabel("Bienvenue");
    onglet1.add(titreOnglet1);
    onglet1.setPreferredSize(new Dimension(480, 600));
    onglets.addTab("Accueil", onglet1);
    onglet1.setBackground(red);
    
    /*Cr�ation de l'onglet 2 dans la fen�tre*/
    JPanel onglet2 = new JPanel();
    JLabel titreOnglet2 = new JLabel("R�sum� de vos informations");
    onglet2.add(titreOnglet2);
    onglets.addTab("Profil", onglet2);
    onglet2.setBackground(red);

    /*Cr�ation de l'onglet 3 dans la fen�tre*/
    JPanel onglet3 = new JPanel();
//    JLabel titreOnglet3 = new JLabel("Vos s�ances\n");
//    onglet3.add(titreOnglet3);
    onglets.addTab("Entra�nement", onglet3);
    onglet3.setBackground(red);

    /*Cr�ation de l'onglet 4 dans la fen�tre*/
    JPanel onglet4 = new JPanel();
    JLabel titreOnglet4 = new JLabel("Vos Statistiques");
    onglet4.add(titreOnglet4);
    onglets.addTab("Suivi", onglet4);
    onglet4.setBackground(red);

    /*Cr�ation de l'onglet 5 dans la fen�tre*/
    JPanel onglet5 = new JPanel();
    JLabel titreOnglet5 = new JLabel("Modifiez les param�tres");
    onglet5.add(titreOnglet5);
    onglets.addTab("R�glages", onglet5);
    onglet5.setBackground(red);
    
       
    
    JList sceanceGoform = new JList();
	
	DefaultListModel listeGoform = new DefaultListModel();
	listeGoform.addElement("<html><h1>sc�ance1</h1><html>");
	listeGoform.addElement("<html><h1>sc�ance1</h1><html>");
	listeGoform.addElement("<html><h1>sc�ance1</h1><html>");
	listeGoform.addElement("<html><h1>sc�ance1</h1><html>");
	listeGoform.addElement("<html><h1>sc�ance1</h1><html>");
	sceanceGoform.setModel(listeGoform);

	
	JList sceanceUser = new JList();
		
	DefaultListModel listeUser = new DefaultListModel();
	listeUser.addElement("<html><h1>sc�ance1</h1><html>");
	listeUser.addElement("<html><h1>sc�ance1</h1><html>");
	listeUser.addElement("<html><h1>sc�ance1</h1><html>");
	listeUser.addElement("<html><h1>sc�ance1</h1><html>");
	listeUser.addElement("<html><h1>sc�ance1</h1><html>");
	sceanceUser.setModel(listeUser);	
	
	
	
	
    
    /*Param�tres d'affichage*/
	onglet3.add(sceanceGoform);
	onglet3.add(sceanceUser);
	
    f.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
    onglets.setVisible(true);
    pannel.add(onglets);
    f.getContentPane().add(pannel);
    quitter.setVisible(true);
    pannel.add(quitter);
    
    onglet3.add(sceanceGoform);
    onglet3.add(new JScrollPane(sceanceGoform));
    
    onglet3.add(sceanceUser);
    onglet3.add(new JScrollPane(sceanceUser));
    
    f.setVisible(true); 
    
    
    quitter.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});
    
    	
    }





@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}