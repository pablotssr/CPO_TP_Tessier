/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        int nb2;
        int somme;
        int diff;
        int prod;
        int div;
        int reste;
        
        //premier entier
        Scanner sc = new Scanner(System.in);
        System.out.println("Premier entier :");
        nb=sc.nextInt();
        
        //deuxieme entier
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Deuxieme entier :");
        nb2=sc2.nextInt();
        
        System.out.println("le premier entier c'est " + nb + " et le deuxieme c'est " + nb2);
        
        //somme
        somme=nb+nb2;
        
        //diff avec correction si entier 1 < entier 2
        diff=nb-nb2;
        if(diff<0){
            diff=diff*-1;
        }
        
        //produit
        prod=nb*nb2;
        
        //division
        div=nb/nb2;
                
        //le truc que j'ai pas saisi
        reste=nb%nb2;
                
        System.out.println("le resultat c'est " + somme);
        System.out.println("la difference c'est " + diff);
        System.out.println("le produit c'est " + prod);
        System.out.println("le quotient c'est peut etre " + div);
        System.out.println("je sais pas " + reste);

    }
    
}
