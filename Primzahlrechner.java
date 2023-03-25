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

        int primZahlen = (zahl/2);
        for (int i = 2; i < primZahlen;i++){
            int primZahl = primZahlen % i;
            if (primZahl == 0){
            System.out.println("ja");
            }
            else {
                System.out.println("nei");
            }
        }

    }
     
}
