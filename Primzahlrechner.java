import java.util.Scanner;
public class Primzahlrechner {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Wäshle eine nummer.");
        int zahl = sc.nextInt();
        sc.close();
        getPrimzahlen(zahl);
    }

    public static void getPrimzahlen(int zahl){

        boolean istPrimzahl = true;
        for (int i = 2; i < zahl / 2;i++){
            int resultat = zahl % i;
            if (resultat == 0){
               istPrimzahl = false;
            }            
        }
        if (istPrimzahl == true){
            System.out.println("ja");
        } 
        else {System.out.println("nei");
    }

    }
     
}
