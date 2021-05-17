/**
 * @description:常量和变量以及枚举
 * @author:
 * @time: 2021/5/17 22:28
 */
public class Demo04 {
    //常量
    public static final double a= 2.54;
    public static void main(String[] args) {
        //声明变量,声明的变量取名字采用驼峰原则
//        double salary;
        int vacationDays;
        long earthPopulation;
        boolean done;

        //变量初始化
/*
        System.out.println(vacationDays);//变量未赋值
*/
        vacationDays=12;
        System.out.println(vacationDays);
//        声明的变量尽可能靠近第一次使用的地方
        double salary = 65000.0;
        System.out.println(salary);

        System.out.println("================================================================");
        System.out.println("\n");

        System.out.println(" the end is : "+vacationDays+salary+a);

        System.out.println("================================================================");
        System.out.println("\n");

        //枚举
        Size a = Size.SMALL;
        Size b = Size.MEDIUM;
        Size c = Size.LARGE;
        Size d = Size.EXTRA_LARGE;
        System.out.println("a:"+a+"\n" +
                "b:"+b+"\n" +
                "c:"+c+"\n" +
                "d:"+d+"\n");

    }
    //枚举
    enum Size {SMALL,MEDIUM,LARGE,EXTRA_LARGE};

}
