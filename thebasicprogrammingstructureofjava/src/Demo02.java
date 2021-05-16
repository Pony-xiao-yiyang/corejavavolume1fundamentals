/**
 * @description:整数
 * @author:
 * @time: 2021/5/17 0:04
 */
public class Demo02 {
    public static void main(String[] args) {
        //刚刚超过20E
        int a1 = -2147483648;
        int a2 =2147483647;
        short b1 = -32768;
        short b2 = 32767;
        byte c1 = -128;
        byte c2 = 127;

        System.out.println( "a1:"+a1+"\n"+
                            "a2:"+a2+"\n"+
                            "b1:"+b1+"\n"+
                            "b2:"+b2+"\n"+
                            "c1:"+c1+"\n"+
                            "c2:"+c2+"\n");
    }
}
