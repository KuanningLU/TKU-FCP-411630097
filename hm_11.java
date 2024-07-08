import java.util.Scanner;

public class hm_11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        double pi=3.14159;

        System.out.print("商品1價格: ");
        int n1=scn.nextInt();
        System.out.print("商品2價格: ");
        int n2=scn.nextInt();
        System.out.print("商品3價格: ");
        int n3=scn.nextInt();
        System.out.print("總價="+(n1+n2+n3));
        scn.close();   



    }
}