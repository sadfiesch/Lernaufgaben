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
            int zahler = 2;
            while (zahler < primZahl){
                int resultat = primZahl % zahler;
                if (resultat == 0){
                    istPrimzahl = false;
                }
                zahler++;
            }
            if (istPrimzahl == true){
                System.out.println(primZahl);
            }
            primZahl++;
        }

    }
     
}

