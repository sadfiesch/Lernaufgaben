import java.util.Scanner;



public class PyramideForFor {

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
        for(int i = 0; i <= pyramidHight; i++){    
            for(int j = 0; j < i; j++){
                System.out.print(pyramidStone);
            }
            System.out.println("");

        }
    }
}
