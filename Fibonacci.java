public class Fibonacci {
    public static void main (String[]args){
    
    
        int zahl1 = 0;
        int zahl2 = 1;
        zahlenFolge(zahl1, zahl2);
    }

    public static void zahlenFolge (int zahl1, int zahl2){

        while (zahl1 < 100000){
            System.out.println(zahl1);
            zahl1 = (zahl1 + zahl2);
            System.out.println(zahl2);
            zahl2 = (zahl1 + zahl2);
        }

    }
}
