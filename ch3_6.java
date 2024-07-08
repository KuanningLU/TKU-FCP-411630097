public class ch3_6 {
    public static void main(String[] args) {
        int i=java.lang.Integer.MAX_VALUE;
        
        System.out.println("i="+i);
        System.out.println("i="+(i+1));//會發生溢位
        System.out.println("i="+(i+1L)); //自動型別轉換
        System.out.println("i+2="+((long)i+2));
    }
    
}
