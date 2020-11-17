package Exercice2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
/*
		 Scanner clavier = new Scanner(System.in);

		 int vie = 5;
		 int nombre;
		 
		 do
		 {
			 System.out.print("nombre : ");
			 nombre = clavier.nextInt();
			 vie--;
		 }while((nombre < 1 || nombre > 10) && vie != 0);

		 System.out.println("vie : " + vie);
		 if(vie > 0)
		 {
			 System.out.print("perdu");
		 }
		 else
		 {
			 System.out.print("bravo");
		 }*/

			 // Déclaration des variables
			 Scanner clavier = new Scanner(System.in);
			 int saisie ;
			 String message = "Entrer un nombre entier ?" ;
			 int compteur ;
			 // Traitements
			 compteur = 10 ;
			 int vie = 5;
			 int tst = 0;
			 while ( compteur > 0 )
			 {
				 System.out.println(message);
				 saisie = clavier.nextInt() ;
				 
				 if(saisie >= 1 && saisie <= 10)
				 {
					 tst = 1;
					 break;
				 }
				 else if(compteur == vie + 1)
				 {
					 tst = -1;
					 break;
				 }
				 
				 compteur--;
				 
			 }
			 
			 if(tst == 1)
			 {
				 System.out.println("bravo");
			 }
			 else
			 {
				 System.out.println("perdu");
			 }
			 
			 // Affichages
			 System.out.println("Vous ne me verrez jamais !!");
			 
			 clavier.close();
	
	 }


}
