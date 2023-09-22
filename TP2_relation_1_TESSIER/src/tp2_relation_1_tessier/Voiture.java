/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_tessier;

/**
 *
 * @author pablo
 */
public class Voiture {
    String modele;
    String marque;
    int puissanceCV;
    Personne proprio;
    public Voiture(String unModele,String uneMarque,int unePuissance){
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissance;
        proprio = null;
    }
    @Override
    public String toString(){
        return "une " + modele + " de chez " + marque + " qui a une puissance de " + puissanceCV + " chevaux";
    }
}
