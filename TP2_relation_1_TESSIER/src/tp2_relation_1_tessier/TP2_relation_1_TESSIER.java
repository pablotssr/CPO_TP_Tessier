/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_tessier;

/**
 *
 * @author pablo
 */
public class TP2_relation_1_TESSIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 540) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture une2007 = new Voiture ("multipla", "fiat", 1 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprio = bob;
        bob.liste_voitures[1] = uneAutreClio;
        bob.nbVoitures = 2;
        uneAutreClio.proprio = bob;
        
        reno.liste_voitures[0] = une2008;
        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 2;
        une2008.proprio = reno;
        uneMicra.proprio = reno;
        bob.ajouter_voiture(une2007);
        for (int i = 0; i<bob.liste_voitures.length;i++){
            System.out.println("la voiture "+i+" de bob est "+bob.liste_voitures[i]);
        }
        for (int i = 0; i<reno.liste_voitures.length;i++){
            System.out.println("la voiture "+i+" de reno est "+reno.liste_voitures[i]);
        }
       
    }
    
}
