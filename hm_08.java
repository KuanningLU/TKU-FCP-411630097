import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the your name:");
        String name=scn.next();
        System.out.print("Enter the your age:");
        int age=scn.nextInt();
        System.out.print("Enter your city:");
        String city=scn.next();
        System.out.print(name+", "+age+", "+city);
        scn.close();



    }
}
