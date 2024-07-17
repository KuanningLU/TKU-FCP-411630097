public class hm_18 {
    public static void main(String[] args) {
        int[][][] array3D = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
            {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
            {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
        

        System.out.println("每一層（z軸）的平均值：");
        for (int z = 0; z < array3D.length; z++) {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < array3D[z].length; i++) {
                for (int j = 0; j < array3D[z][i].length; j++) {
                    sum += array3D[z][i][j];
                    count++;
                }
            }
            double average = (double) sum / count;
            System.out.println("層" + (z+1) + "的平均值為：" + average);
        }
    }
}
