import com.sun.tools.javac.Main;

import java.util.Date;
import java.util.Scanner;

/**
 * @description:
 * @author:
 * @time: 2021/5/31 20:40
 */
public class Demo10 {
    public static void main(String[] args) {
        //read inputs
        final Scanner in = new Scanner(System.in);

        System.out.println("how much money do you to retire");

        double goal = in.nextDouble();

        System.out.println("How much money will you contribute every year ?");

        double payment = in.nextDouble();

        System.out.println("Interest rate in %:");

        double interestRate = in.nextDouble();

        double balance = 0;

        int years = 0;

        while (balance < goal){
//            add this year's payment and interest
            balance += payment;

            double interest = balance * interestRate / 100;

            balance += interest;

            years++;

        }
    }
}
