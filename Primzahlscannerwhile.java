import java.util.Scanner;
public class Primzahlscannerwhile {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Wähle eine nummer.");
        int zahl = sc.nextInt();
        sc.close();
        getPrimzahlen(zahl);
    }

    public static void getPrimzahlen(int zahl){

        int primZahl = 1;

        while (primZahl < zahl){
            boolean istPrimzahl = true;
            int modulaRechner = 2;
            while ( modulaRechner < primZahl){
                int resultat = primZahl % modulaRechner;
                if (resultat == 0){
                    istPrimzahl = false;
                }
                modulaRechner++;
            }
            if (istPrimzahl == true){
                System.out.println(primZahl);
            }
            primZahl++;
        }

    }
     
}

