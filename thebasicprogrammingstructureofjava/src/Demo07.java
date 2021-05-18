/**
 * @description:字符串
 * @author:
 * @time: 2021/5/18 22:10
 */
public class Demo07 {
    public static void main(String[] args) {
        //子串
        String greeting = "hello";
        String s = greeting.substring(0, 3);//hel
        System.out.println(s);
        System.out.println("==============================================");
//        拼接
        String expletive = "Expletive";
        String deleted = "deleted";
        String message = expletive + deleted;
        System.out.println(message);
        System.out.println("==============================================");

        int age = 13;
        String s1 = "PG" + age;
        System.out.println(s1);
        System.out.println("==============================================");

//        使用静态join方法
        String all = String.join("/", "S", "m", "l", "XL");
        System.out.println(all);
        System.out.println("==============================================");

//        java11中还增加了一个repeat方法
        String repeated = "java".repeat(3);//javajavajava
        System.out.println(repeated);
        System.out.println("==============================================");

        //不可变字符串
        String s2 = greeting.substring(0, 3) + "p!";
        System.out.println(s1);System.out.println("==============================================");

        //检测字符串是否相等
        boolean b = "hello".equals(greeting);//hello和greeting比较
        System.out.println(b);
        System.out.println("========================================================");

        //构建字符串
        StringBuilder stringBuilder = new StringBuilder("pony");
        stringBuilder.append("hello");
        stringBuilder.append("..world");
        String completedString = stringBuilder.toString();
        System.out.println(completedString);


    }
}
