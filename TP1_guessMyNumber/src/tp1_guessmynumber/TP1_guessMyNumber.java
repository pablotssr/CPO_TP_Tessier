/*
 * jeu guess my number
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //nombre du joueur
        int nbUser;
        
        //nombre du jeu
        int n = 0;
        
        //difficulté
        int diff;
        
        //condition 
        int w = 0;
        
        //compteur
        int compt = 0;
        
        //nombre du jeu
        Random generateurAleat = new Random();
        Random mentir = new Random();
        
        //choix de la difficulté
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Choisir une difficulté :");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        System.out.println("4) Cauchemar");
        diff = sc2.nextInt();
        
        //règles du jeu selon difficulté
        if(diff==1){
            System.out.println("Vous avez choisi le mode Facile.");
            System.out.println("Essais Illimités.");
            System.out.println("Nombre entre 0 et 25.");
            n= generateurAleat.nextInt(10);
        }
        
        if(diff==2){
            System.out.println("Vous avez choisi le mode Moyen.");
            System.out.println("30 essais.");
            System.out.println("Nombre entre 0 et 50.");
            n= generateurAleat.nextInt(50);
        }
        
        if(diff==3){
            System.out.println("Vous avez choisi le mode Difficile.");
            System.out.println("10 essais.");
            System.out.println("Nombre entre 0 et 100.");
            n= generateurAleat.nextInt(100);
        }
        
        if(diff==4){
            System.out.println("Vous avez choisi le mode Cauchemar.");
            System.out.println("10 essais.");
            System.out.println("Nombre entre 0 et 100.");
            System.out.println("Le jeu peut mentir.");
            n= generateurAleat.nextInt(100);
        }
        
       
        //jeu facile/moyen/difficile
        while(w==0&&diff!=4){
            Scanner sc = new Scanner(System.in);
            System.out.println("choisir un nouveau nombre");
            nbUser = sc.nextInt();
            compt++;
            if(nbUser<n){
                System.out.println("trop petit");
                System.out.println("Nombre d'essais : " + compt);
            }
            if(nbUser>n){
                System.out.println("trop grand");
                System.out.println("Nombre d'essais : " + compt);
            }
            if(nbUser==n){
                w=1;
                System.out.println("Bien joué le sang");
                System.out.println("Nombre d'essais total : " + compt);
            }  
            if(diff==2&&compt>29){
                w=2;
                System.out.println("C'est perdu le sang");
                System.out.println("Fallait trouver "+ n);
            }
            if(diff==3&&compt>9){
                w=2;
                System.out.println("C'est perdu le sang");
                System.out.println("Fallait trouver "+ n);
            }
    }
        //jeu cauchemar
        while(w==0&&diff==4){
            Scanner sc = new Scanner(System.in);
            System.out.println("choisir un nouveau nombre");
            nbUser = sc.nextInt();
            compt++;
            
            boolean lie = mentir.nextDouble() < 0.3;
            if(lie){
                if(nbUser<n){
                System.out.println("trop grand");
                System.out.println("Nombre d'essais : " + compt);
                }
                if(nbUser>n){
                System.out.println("trop petit");
                System.out.println("Nombre d'essais : " + compt);
                }
            } else {
            if(nbUser<n){
                System.out.println("trop petit");
                System.out.println("Nombre d'essais : " + compt);
            }
            if(nbUser>n){
                System.out.println("trop grand");
                System.out.println("Nombre d'essais : " + compt);
            }
            if(nbUser==n){
                w=1;
                System.out.println("Bien joué le sang");
                System.out.println("Nombre d'essais total : " + compt);
            }
            }
            if(compt>9){
                w=2;
                System.out.println("C'est perdu le sang");
                System.out.println("Fallait trouver "+ n);
            }
        }
    }
}