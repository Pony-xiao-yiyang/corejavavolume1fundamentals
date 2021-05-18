import javax.naming.Name;

/**
 *
 *@description: 格式化输出
 *@author:
 *@time: 2021/5/18 23:27
 */public class Demo09 {
    public static void main(String[] args) {
        double x = 10000.0 / 3.0;
        System.out.println(x);
        System.out.printf("%8.2f",x);
        System.out.println("\n"+"=====================================");

        System.out.printf("%,2f",20000.0/3.0);
    }
}
