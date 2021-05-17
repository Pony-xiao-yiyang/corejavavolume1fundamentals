/**
 * @description:1.数值之间的类型转换以及强制转换
 *              2.结合赋值和运算符
 *              3.自增和自减
 * @author:Adolf.Musk
 * @time: 2021/5/17 23:29
 */
public class Demo06 {
    public static void main(String[] args) {
        int n=123456789;
        float f = n;
        System.out.println(f);
        System.out.println("===============================================================");
        double x= 9.997;
        int nx = (int) x;
        System.out.println(nx);
        System.out.println("===============================================================");
        int nx1 = (int) Math.round(x);
        System.out.println(nx1);
        System.out.println("===============================================================");
        int a = 1;
        a += 4;//5
        a=a+4;//9
        System.out.println(a);
        System.out.println("===============================================================");
        int m = 7;
        int k = 7;
        int j = 2 * ++m;//现在j =16, m=8;先自加，在运算
        int z = 2*k++;//现在 z =14.k=8;先运算，在自加
        System.out.println(j);
        System.out.println(z);

    }
}
