package Exercice2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		
		 Scanner clavier = new Scanner(System.in) ;
		 float saisie ;
		 float somme ;
		 int compteur ;
		 // Traitements
		 somme = 0 ;
		 compteur = 1 ;
		 while (compteur < 4 )
		 {
			 System.out.println("Saisir une note "+compteur+" : ");
			 saisie = clavier.nextFloat() ;
			 if (saisie >= 0 && saisie <= 20) 
			 {
		    	 compteur = compteur + 1 ;
				 somme = somme + saisie ;
			 } 
			 else 
			 {
				 System.out.println("Erreur de saisie");
			 }
			
		 }
		 
		 
		 float moy = somme / 3;
		 // Affichages
		 System.out.println("La moyenne des 3 notes est : " + moy);
		 
		 
		 if(0 <= moy && moy < 10)
		 {
			 System.out.println("Mention obtenue : collé");
		 }
		 else if(10 <= moy && moy < 12)
		 {
			 System.out.println("Mention obtenue : passable");
		 }
		 else if(12 <= moy && moy < 14)
		 {
			 System.out.println("Mention obtenue : assez Bien");
		 }
		 else if(14 <= moy && moy < 16)
		 {
			 System.out.println("Mention obtenue : bien");
		 }
		 else
		 {
			 System.out.println("Mention obtenue :  très bien");
		 }
		 
		 clavier.close();	
	 }


}
