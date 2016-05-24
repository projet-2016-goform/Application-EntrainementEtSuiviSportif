package fr.iutvalence.info.dut.m2107;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;

class GoForm {
   public static void main (String[] args)
   {
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
		}
   
}