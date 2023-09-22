/*
* tp addition
*/
package tp0_addition;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP0_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int nb; // nombre d'entiers à additionner
int result; // resultat
int ind; //indice
// initialisation
Scanner sc = new Scanner(System.in);
System.out.println("Entrer le nombre :");
nb=sc.nextInt();
result=1;
// addition des nb premiers entiers
ind=1;
while (ind< nb) {
 result=result+ind;
 ind++;
}
// affichage du resultat
System.out.println("la somme des " + nb + "entiers est:"
        + result);
    }
    
}
