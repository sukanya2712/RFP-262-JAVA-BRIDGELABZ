package Java_Programs;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // check if elements at i and j are equal
                if (arr[i] == arr[j]) {
                    // print the duplicate element
                    System.out.print(arr[j] + " ");
                }
            }
        }

    }
}
