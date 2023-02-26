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
                if (arr[i] == arr[j]) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[i] == arr[k]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                }
            }
        }

    }
}
