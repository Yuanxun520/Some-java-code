public class 打印1000到2000所有的闰年 {
    public static void main(String[] args) {

        for (int i = 1000;i <= 2000;i++){
            if ((i%4 == 0) || (i%400 == 0) && (i%100 != 0)){
                System.out.printf("%d ", i);
            }
        }

    }
}
