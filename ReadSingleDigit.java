package IfElse_Statement_Programs;

import java.util.Scanner;

public class ReadSingleDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no: ");
        int number=sc.nextInt();

        if(number>10){
            System.out.println("PLZ , Enter a single digit no.");
        }else{
            String ans;
            if (number == 0) {
                ans = "Zero";
            } else if (number == 1) {
                ans = "One";
            } else if (number == 2) {
                ans = "Two";
            } else if (number == 3) {
                ans = "Three";
            } else if (number == 4) {
                ans = "Four";
            } else if (number == 5) {
                ans = "Five";
            } else if (number == 6) {
                ans = "Six";
            } else if (number == 7) {
                ans = "Seven";
            } else if (number == 8) {
                ans = "Eight";
            } else if (number == 9) {
                ans = "Nine";
            } else {
                ans = "Invalid input. Number must be a single digit.";
            }

            System.out.println(ans);


        }
    }
}
