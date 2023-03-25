import java.util.Scanner;



public class PyramideFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("How high do you want the Pyramid to be:");
        int pyramidHight = scan.nextInt();
        System.out.println("With waht do you want bild:");
        String pyramidStone = scan.next();
        scan.close();
        pyramid (pyramidHight, pyramidStone);
    } 
    public static void pyramid (int pyramidHight, String pyramidStone){
        System.out.println();
        String pyramidNeu = "";

        for (int i = 0; i < pyramidHight; i++){            
            pyramidNeu = pyramidNeu + pyramidStone;
            System.out.println(pyramidNeu);
        }
    }
}
