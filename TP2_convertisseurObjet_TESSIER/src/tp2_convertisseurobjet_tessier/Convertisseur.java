/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit  template
 */
package tp2_convertisseurobjet_tessier;
/**
 *
 * @author pablo
 */
public class Convertisseur {
    private int nbConversions;
    public Convertisseur (){
        nbConversions = 0;
    }
    @Override
    public String toString(){
        return "nb de conversion" + nbConversions;
    }
    public double CelsiusVersKelvin (double tCelsius){
        this.nbConversions++;
        double val;  
        val=tCelsius+273.15;  
        return val;
        
    }
    public double KelvinVersCelsius (double tKelvin){
        this.nbConversions++;
        double val;  
        val=tKelvin-273.15;  
        return val;
    }
    public double FarenheitVersCelsius (double tFarenheit){
        this.nbConversions++;
        double val;  
        val=(tFarenheit-32)*5/9;  
        return val;
    }
    public double CelsiusVersFarenheit (double tCelsius){
        this.nbConversions++;
        double val;  
        val=(tCelsius*9/5)+32;  
        return val;
    }
    
    
    public double KelvinVersFarenheit (double tKelvin2){
        this.nbConversions--;
        double val;
        double res;
        val=KelvinVersCelsius(tKelvin2);
        res=CelsiusVersFarenheit(val);
        return res;
    }  
    public double FarenheitVersKelvin (double tFarenheit2){
        this.nbConversions--;
        double val;
        double res;
        val=FarenheitVersCelsius(tFarenheit2);
        res=CelsiusVersKelvin(val);
        return res;
    }
}
