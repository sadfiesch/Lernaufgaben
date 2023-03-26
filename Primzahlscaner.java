import java.util.Scanner;
public class Primzahlscaner {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Wäshle eine nummer.");
        int zahl = sc.nextInt();
        sc.close();
        getPrimzahlen(zahl);
    }

    public static void getPrimzahlen(int zahl){

        for (int i = 1; i < zahl ;i++){
            boolean istPrimzahl = true;
            for (int j = 2; j < i;j++){
               int resultat = i % j;
                if (resultat == 0){
                istPrimzahl = false;
                }            
            }
            if (istPrimzahl == true){
                System.out.println(i);
             } 
             
           
        }
    }
     
}

