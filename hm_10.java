import java.util.Scanner;

public class hm_10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("輸入華氏溫度: ");
        int num1=scn.nextInt();
        System.out.print("攝氏溫度為="+ ((num1-32)*5/9));
        scn.close();   



    }
}