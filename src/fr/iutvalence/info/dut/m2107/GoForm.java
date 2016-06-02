package fr.iutvalence.info.dut.m2107;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import fr.iutvalence.info.dut.m2107.test.SeanceTest;

class GoForm {


   public static void main (String[] args)
   {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("------ Que souhaitez vous faire ? ------ \n 1. Connection \n 2. Inscription");
	   int choix = sc.nextInt();
	   sc.nextLine();
	   if (choix == 1) {
		   System.out.println("Entrez vos identifiants :");
		   String mail = sc.nextLine();
		   String mdp = sc.nextLine();
		   Connexion connexion = new Connexion();
		   connexion.toString();
		   
		   System.out.println("--------------------- PROFIL ---------------------");
		   
		   String chaine = "";
		   String fichier ="conseils";	
			try{
				InputStream ips = new FileInputStream(fichier); 
				InputStreamReader ipsr = new InputStreamReader(ips);
				BufferedReader reader = new BufferedReader(ipsr);
				String ligne;
				
				while ((ligne = reader.readLine())!=null){
					System.out.println(ligne);
					chaine += ligne + "\n";
				}
				
				reader.close(); 
			}		
			catch (Exception e){
				System.out.println(e.toString());
			}
			
			Calendar calendar = Calendar.getInstance();
			Suivi suiviListe = new Suivi(calendar.getTime(), calendar.getTime());
			
			Seance seance = new SeanceTest();
			System.out.println("Exercices réalisés : " + seance.getNbExercice());
			seance.getLibelleExercice();
	   }
	   else if (choix == 2) {
		   
	   }
	   
		

		
   }
   
}