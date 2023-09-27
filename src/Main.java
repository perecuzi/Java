import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        System.out.println("PRINTING STARS RIGHT ANGLED TRIANGLE");
        System.out.println("Enter Height of Stars >>> ");
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int i = 0;
        int k = 0;
        for(i=height; i>=0; i--){
            for(k=0; k<=i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}