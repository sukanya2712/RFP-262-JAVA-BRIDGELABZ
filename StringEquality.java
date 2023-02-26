package day1_problems;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string");
        String abc =sc.nextLine();
        System.out.println("Enter second string");
        String xyz=sc.nextLine();

        if(abc.equals(xyz)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
