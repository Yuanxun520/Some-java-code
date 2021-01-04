import java.util.Scanner;

public class 密码锁 {
    public static void main(String[] args) {
        System.out.println("欢迎使用冉古镇医院生产的密码锁，请输入6位数密码：");
        for (int i = 0; i < 3; i++){
            Scanner sca = new Scanner(System.in);
            String key = sca.next();
            if (key.equals("372923")){
                System.out.println("登录成功");
                break;
            }else {
                System.out.println("密码输入错误，你还有"+(2-i)+"次输入机会");
            }
        }


    }
}
