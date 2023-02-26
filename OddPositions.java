package Java_Programs;

import java.util.Scanner;

public class OddPositions {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements present on odd positions are: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
