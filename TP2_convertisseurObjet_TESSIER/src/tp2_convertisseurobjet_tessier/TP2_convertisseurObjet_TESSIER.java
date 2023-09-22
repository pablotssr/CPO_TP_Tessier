/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_tessier;

/**
 *
 * @author pablo
 */
public class TP2_convertisseurObjet_TESSIER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur conv = new Convertisseur();
        Convertisseur conv2 = new Convertisseur();
        
        conv.CelsiusVersKelvin(57);
        conv.CelsiusVersKelvin(68);
        conv.CelsiusVersKelvin(96);
        conv.KelvinVersFarenheit(452);
        
        conv2.KelvinVersFarenheit(750);
        for(int i =0; i<10;i++){
            conv2.FarenheitVersCelsius(5);
        }
        
        System.out.println(conv);
        System.out.println(conv2);
    }
    
}
