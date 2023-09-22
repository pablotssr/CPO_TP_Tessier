/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_tessier;

/**
 *
 * @author pablo
 */
public class TP2_Bieres_Tessier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        BouteilleBiere biereDeux = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        BouteilleBiere biereT = new BouteilleBiere("8.6",8.6,"Abbaye de Huitesix");
        BouteilleBiere biereQ = new BouteilleBiere("Atlas",7.9,"Gare de Carcassone");
                
        System.out.println(uneBiere);
        System.out.println(biereDeux);
        System.out.println(biereT);
        System.out.println(biereQ);      
    }
    
}
