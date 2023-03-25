import java.util.Scanner;



public class PyramideWhile {

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

        int counter = 0;
        String stone = "";
        while (counter < pyramidHight){
            stone = stone + pyramidStone;
            System.out.println(stone);
            counter++;
        }
    }
}
