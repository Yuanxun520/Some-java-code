public class 打印二维数组 {
    public static void main(String[] args) {
        long[][] a = {
                {1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };
        System.out.println("===============");
        System.out.println("[");
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.printf("%d ",a[i][j]);
                if (j != a[i].length-1){
                    System.out.printf(", ");
                }
            }
            System.out.println();
        }
        System.out.println("]");
        System.out.println("===============");
    }
}
