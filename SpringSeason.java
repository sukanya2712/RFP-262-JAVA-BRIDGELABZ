package Operator_Programs;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month no: ");
        int m=sc.nextInt();
        System.out.println("Enter day no: ");
        int d=sc.nextInt();

        boolean isSpring= ( (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) ||
                (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20) );

        System.out.println(isSpring);


    }
}
