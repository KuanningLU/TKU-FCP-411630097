public class hm_17 {
    public static void main(String[] args) {
        int[][][] array3D = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };
        
        int newValue = 10;
        int row = 1;
        int col = 0;
        int depth = 1;
        
        array3D[row][col][depth] = newValue;
        
        System.out.println("修改後的三維陣列：");
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
