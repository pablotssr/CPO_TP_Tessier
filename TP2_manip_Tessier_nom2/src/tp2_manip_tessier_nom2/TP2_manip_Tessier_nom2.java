/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_tessier_nom2;

/**
 *
 * @author pablo
 */
public class TP2_manip_Tessier_nom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        
       Tartiflette d = assiette1;
        assiette1 = assiette2;
        assiette2 = d;
        
        int[] mouss = new int[10];
        for(int i = 0;i<10;i++){
            int e;
            e = 44 * i;
            mouss[i] = e;
            System.out.println("La moussaka "+ i + " fait " + e + " calories");
        }
        System.out.println("nb de calories de Assiette 1 : " +
assiette1.nbCalories) ;        
        System.out.println("nb de calories de Assiette 2 : " +
assiette2.nbCalories) ;
System.out.println("nb de calories de Assiette 3 : " +
assiette3.nbCalories) ;
    }
    
}
