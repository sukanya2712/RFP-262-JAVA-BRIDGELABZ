package Operator_Programs;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x=sc.nextInt();
        System.out.println("Enter value of y: ");
        int y= sc.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("The Euclidean distance from ("+x+","+y+") to  (0, 0) is: " + distance);
    }
}
