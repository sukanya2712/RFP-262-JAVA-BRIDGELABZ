package Java_Programs;

import java.util.Scanner;

public class FrequencyofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int[] visitedArray = new int[limit];

        int visited = -1;
        for (int i = 0; i < limit; i++) {
            if (visitedArray[i] != visited) {
                int count = 1;
                for (int j = i + 1; j < limit; j++) {
                    if (array[i] == array[j]) {
                        count++; // 2
                        visitedArray[j] = visited;
                    }
                }
                visitedArray[i] = count;
            }
        }
        System.out.println("**********************************");
        System.out.println("  Elements : Frequency");
        for (int i = 0; i < visitedArray.length; i++) {
            if (visitedArray[i] != visited)
                System.out.println("     " + array[i] + "     :     " + visitedArray[i]);
        }
    }
}
