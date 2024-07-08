import java.util.Scanner;

public class hm_09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        

        System.out.print("Enter the length of rectangle: ");
        int length=scn.nextInt();
        System.out.print("Enter the width of rectangle: ");
        int width=scn.nextInt();
        System.out.print("area="+ (length*width));
        scn.close();   



    }
}