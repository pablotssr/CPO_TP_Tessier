/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_tessier;

/**
 *
 * @author pablo
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    public Personne(String unNom, String unPrenom){
        nom = unNom;
        prenom = unPrenom;
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    @Override
    public String toString(){
        return prenom + " " + nom;
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if(voiture_a_ajouter.proprio!=null){
        return false;
    } else if(nbVoitures == 3){
            return false;
        } else {
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprio = this;
        return true;
    }
    }
}
