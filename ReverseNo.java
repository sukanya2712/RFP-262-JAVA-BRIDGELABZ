package ForLoop;
import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int reversed = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("The reverse of the number is " + reversed);

    }
}
