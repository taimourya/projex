package Exercice2;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) 
	{
		 Scanner clavier = new Scanner(System.in);
		 
		//index + 1 = numero du mois exemple "index 2 = Mars ; 2 + 1 = 3 ; Mars = mois 3 "
		String nomMois[] = {"Janvier", "F�vrier", "Mars", "Avril","Mai", "Juin", "Juillet"
							, "Ao�t", "Septembre", "Octobre", "Novembre", "D�cembre" };
		int nombreJour[] = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int mois, annee;
		
		System.out.println("Mois : ");
		mois = clavier.nextInt();
		System.out.println("Annee : ");
		annee = clavier.nextInt();
		

		
		
		for(int i = mois - 1; i<nomMois.length; i++)
		{
			System.out.print("nom du mois : " + nomMois[i] + " ; ");
			if(i != 1)
			{
				System.out.println("nombre de jour : " + nombreJour[i]);
			}
			else
			{
				int anneeBis = 0;
				if(annee % 400 == 0)
				{
					anneeBis = 1;
				}
				else if(annee % 100 == 0)
				{
					anneeBis = 1;
				}
				else if(annee % 4 == 0)
				{
					anneeBis = 1;
				}
				
				if(anneeBis == 1)
				{
					System.out.println("nombre de jour : 29");
				}
				else
				{
					System.out.println("nombre de jour : 28");
				}
			}
		}
		
		
		
		clavier.close();
	}

}
