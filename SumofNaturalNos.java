package ForLoop;

import java.util.Scanner;
public class SumofNaturalNos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = 0;

        for(int i = 1;i <= n;i++) {
            sum += i;
        }

        System.out.println("The sum of first " + n + " natural numbers is " + sum);
    }
}
