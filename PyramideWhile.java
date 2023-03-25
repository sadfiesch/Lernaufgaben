import java.util.Scanner;



public class PyramideWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("How high do you want the Pyramid to be:");
        int pyramidHight = scan.nextInt();
        System.out.println("With waht do you want bild:");
        String pyramidStone = scan.next();
        scan.close();
        int i = 0;
        String stone = "";
        while (i < pyramidHight){
            stone = stone + pyramidStone;
            System.out.println(stone);
            i++;
        }
    }
}
