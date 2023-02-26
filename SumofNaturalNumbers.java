package WhileLoop;

import java.util.Scanner;
public class SumofNaturalNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer: ");
        int n = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            i++;
        }

        System.out.println("The sum of first " + n + " natural numbers is " + sum);

    }
}
