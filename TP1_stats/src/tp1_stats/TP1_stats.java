/*
 * verifier distrib aléatoire
 */
package tp1_stats;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tableau
        int[] tableau = new int[6];
        
        //result
        int res;
        
        //pourcentage a la fin 
        double prct;
        
        //nb de repetitions
        int r;
        
        //nb choisi
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisir un nombre de repetitions");
        r=sc.nextInt();
        
        
        //boucle de r iterations
        for(int i = 0; i < r; i++){
            res = (int)(Math.random()*6);
            tableau[res]++;
        }
        
        //resultat entier
        System.out.println("résultats");
        for (int i = 0; i < tableau.length ;i++){
            System.out.println("face " + (i+1) + " : " + tableau[i]);
        }
        
        //resultat %
        System.out.println("résultats");
        for (int i = 0; i < tableau.length ;i++){
            prct = ((double) tableau[i]/r)*100;
            System.out.println("face " + (i+1) + " : " + prct + "%");
        }
    }
    
}
