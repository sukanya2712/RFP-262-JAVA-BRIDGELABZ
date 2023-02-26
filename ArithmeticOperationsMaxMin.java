package Operator_Programs;

import java.util.Scanner;

public class ArithmeticOperationsMaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int result1 = num1 + num2 * num3;
        int result2 = num3 + num1 / num2;
        int result3 = num1 % num2 + num3;
        int result4 = num1 * num2 + num3;

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);

        int max = result1;
        if (result2 > max) {
            max = result2;
        }
        if (result3 > max) {
            max = result3;
        }
        if (result4 > max) {
            max = result4;
        }
        System.out.println("The maximum number is: " + max);

        int minResult = Math.min(Math.min(result1, result2), Math.min(result3, result4));

        System.out.println("Minimum result: " + minResult);
    }
}
