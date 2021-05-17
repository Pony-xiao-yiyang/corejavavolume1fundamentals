/**
 * @description:浮点类型
 * @author:
 * @time: 2021/5/17 22:13
 */
public class Demo03 {
    public static void main(String[] args) {
       float a1 = 3.40282347E+38F;
       float a2 = -3.40282347E+38F;
       double b1 = 1.79769313486231570E+308;
       double b2 = -1.79769313486231570E+308;
       double c1 = 0x1.0p-3;
       double c2 = Double.POSITIVE_INFINITY;
       double c3 = Double.NEGATIVE_INFINITY;
       double c4 = Double.NaN;

        System.out.println("a1:"+a1+"\n" +
                "a2:"+a2+"\n" +
                "b1:"+b1+"\n" +
                "b2:"+b2+"\n" +
                "c1:"+c1+"\n" +
                "c2:"+c2+"\n" +
                "c3:"+c3+"\n" +
                "c4:"+c4);
    }
}
