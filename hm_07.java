import java.util.Scanner;
public class hm_07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double pi=3.14159;

        System.out.print("Enter the radius of circle: ");
        double radius=scn.nextDouble();
        System.out.print("area="+ (radius*2*pi));
        scn.close();


        
    }
}
