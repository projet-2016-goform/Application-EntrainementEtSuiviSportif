package fr.iutvalence.info.dut.m2107.ihm;
import java.awt.*;
import javax.swing.*;
/**
 * Création de la fenêtre et des onglets à afficher.
 * 
 * @author HASSAINE ABDERRAHMANE
 *@version 1.0
 */
@SuppressWarnings("serial")
public class Window extends WindowCloseButton{

  
public static void main(String[] args) {
	
    /*Création de la fenêtre*/
    JFrame f = new JFrame("GoForm");
    f.setSize(500, 700);
    
    /*Création de l'onglet*/
    JPanel pannel = new JPanel();											
    
    /*Création du button quitter*/
    JButton quitter = new JButton("Quitter");
        
    /*Position des onglets dans la fenêtre*/
    JTabbedPane onglets = new JTabbedPane(SwingConstants.TOP);
    
    /*Création de l'onglet 1 dans la fenêtre*/
    JPanel onglet1 = new JPanel();
    JLabel titreOnglet1 = new JLabel("Bienvenue");
    onglet1.add(titreOnglet1);
    onglet1.setPreferredSize(new Dimension(470, 580));
    onglets.addTab("Accueil", onglet1);
    
    /*Création de l'onglet 2 dans la fenêtre*/
    JPanel onglet2 = new JPanel();
    JLabel titreOnglet2 = new JLabel("Résumé de vos informatiions");
    onglet2.add(titreOnglet2);
    onglets.addTab("Profil", onglet2);

    /*Création de l'onglet 3 dans la fenêtre*/
    JPanel onglet3 = new JPanel();
    JLabel titreOnglet3 = new JLabel("Vos séances");
    onglet3.add(titreOnglet3);
    onglets.addTab("Entrainement", onglet3);

    /*Création de l'onglet 4 dans la fenêtre*/
    JPanel onglet4 = new JPanel();
    JLabel titreOnglet4 = new JLabel("Vos Statistiques");
    onglet4.add(titreOnglet4);
    onglets.addTab("Suivi", onglet4);

    /*Création de l'onglet 5 dans la fenêtre*/
    JPanel onglet5 = new JPanel();
    JLabel titreOnglet5 = new JLabel("Modifiez les paramètres");
    onglet5.add(titreOnglet5);
    onglets.addTab("Régages", onglet5);
    
    /*Paramètres d'affichage*/
    
    onglets.setVisible(true);
    pannel.add(onglets);
    f.getContentPane().add(pannel);
    f.setVisible(true); 
    
    quitter.setVisible(true);
    pannel.add(quitter);
    
    
    
    
    //System.exit(0);
    
    
    
   

  }
}