package ForLoop;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        int num, reversed = 0, remainder, original;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = sc.nextInt();

        original = num;

        for (; num != 0; num /= 10) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

    }
}
