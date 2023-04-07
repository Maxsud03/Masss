package sss;
public class SSS {
    public static void main(String[] args) {
         float initialLength = 54; // initial length in cm
        float finalLength = initialLength + 8*2; // final length after 8 months in cm
        float initialMass = 3.65f; // initial mass in kg
        float monthlyGrowth = 0.6f; // monthly growth rate in kg
        float finalMass = initialMass + 8*monthlyGrowth; // final mass after 8 months in kg
        
        System.out.println("Bolaning hozirgi bo'yi: " + finalLength + " sm");
        System.out.println("Bolaning hozirgi massasi: " + finalMass + " kg");
    }
    
}
