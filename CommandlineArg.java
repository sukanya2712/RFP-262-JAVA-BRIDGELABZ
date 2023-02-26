package day1_problems;

import java.util.Scanner;

public class CommandlineArg {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        Scanner sc=new Scanner(System.in);

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch(NumberFormatException e){
                invalidCount++;
            }
        }

        System.out.println("Sum of valid integers: " + sum);

        if (invalidCount == 0) {
            System.out.println("All arguments were valid integers.");
        } else {
            System.out.println("Number of invalid arguments: " + invalidCount);
        }
    }
}
