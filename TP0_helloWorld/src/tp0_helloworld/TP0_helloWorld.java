/*
* tp 1 yes 
*/
package tp0_helloworld;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP0_helloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
String prenom;
Scanner sc ;
sc = new Scanner (System.in) ;
System.out.println("Quel est votre prénom ?");
prenom = sc.nextLine();
System.out.println( "bonjour " + prenom);
    }
    
}
