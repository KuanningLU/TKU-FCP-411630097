public class ch3_5 {
    public static void main(String[] args) {
        int i=java.lang.Integer.MAX_VALUE;
        
        System.out.println("i="+i);
        System.out.println("i="+(i+1));//會發生溢位
        System.out.println("i="+(i+2)); //自動型別轉換
        System.out.println("i="+(i+3));
    }
    
}
