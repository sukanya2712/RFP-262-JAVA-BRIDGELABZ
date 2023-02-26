package Java_Programs;

import java.util.Scanner;
public class PrintElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i]);
        }
    }
}
