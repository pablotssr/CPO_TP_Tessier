/*
 * conversion degrés

 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

double valeur;
int conv;
double k;  
//valeur degré
Scanner sc = new Scanner(System.in);
System.out.println("salut entrez une valeur");
valeur=sc.nextDouble();

Scanner sc2 = new Scanner(System.in);
System.out.println("saisir la conversion :");
System.out.println("1) celsisus vers kelvin");
System.out.println("2) kelvin vers celsius");
System.out.println("3) celsius vers farenheit");
System.out.println("4) farenheit vers celsius");
System.out.println("5) kelvin vers farenheit");
System.out.println("6) farenheit vers kelvin");
conv=sc2.nextInt();

if(conv==1){
k=CelsiusVersKelvin(valeur);
System.out.println(valeur + " degre celsius ça fait " + k + " degre kelvin");
}

if(conv==2){
k=KelvinVersCelsius(valeur);
System.out.println(valeur + " degre kelvin ça fait " + k + " degre celsius");
}

if(conv==3){
    k=CelsiusVersFarenheit(valeur);

System.out.println(valeur + " degre celsius ça fait " + k + " degre farenheit");
}

if(conv==4){
k=FarenheitVersCelsius(valeur);
System.out.println(valeur + " degre farenheit ça fait " + k + " degre celsius");
}

if(conv==5){
k=KelvinVersFarenheit(valeur);
System.out.println(valeur + " degre kelvin ça fait " + k + " degre farenheit");
}

if(conv==6){
k=FarenheitVersKelvin(valeur);
System.out.println(valeur + " degre farenheit ça fait " + k + " degre kelvin");
}


    }
    
    public static double CelsiusVersKelvin (double tCelsius){
        double val;  
        val=tCelsius+273.15;  
        return val;
    }
    public static double KelvinVersCelsius (double tKelvin){
        double val;  
        val=tKelvin-273.15;  
        return val;
    }
        public static double FarenheitVersCelsius (double tFarenheit){
        double val;  
        val=(tFarenheit-32)*5/9;  
        return val;
    }
        public static double CelsiusVersFarenheit (double tCelsius){
        double val;  
        val=(tCelsius*9/5)+32;  
        return val;
    }
        public static double KelvinVersFarenheit (double tKelvin2){
            double val;
            double res;
            val=KelvinVersCelsius(tKelvin2);
            res=CelsiusVersFarenheit(val);
            return res;
        }
        
       public static double FarenheitVersKelvin (double tFarenheit2){
            double val;
            double res;
            val=FarenheitVersCelsius(tFarenheit2);
            res=CelsiusVersKelvin(val);
            return res;
        }
}
